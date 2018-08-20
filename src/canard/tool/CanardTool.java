package canard.tool;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import canard.Block;
import canard.CanardFactory;
import canard.CanardModel;
import canard.Configuration;
import canard.Flag;
import canard.Rel;
import canard.Topic;
public class CanardTool {
	public static final String INPUTLAUNCH = "input/demo.launch";
	public static final String OUTPUTFILE =  "output/demolive.canard";
	public static final String UILAUNCH = "input/Test.launch";
	public static int uniqueID = 0;

	private static Block makeBlock(String name){
		//https://stackoverflow.com/questions/2711067/how-do-i-dynamically-name-objects-in-java
		Block b1 = CanardHelper.factory.createBlock();
		b1.setName(name);
		return b1;
	}

	
	//http://www.java2s.com/Tutorial/Java/0040__Data-Type/Getstheminimumofthreeintvalues.htm
	public static int minimum(int a, int b, int c) {
	      if (b < a) {
	          a = b;
	      }
	      if (c < a) {
	          a = c;
	      }
	      return a;
	}
	
	private static void getGroupsV2(String text, Configuration config){
		int posIncl = text.indexOf("<include");
		int posGroup = text.indexOf("<group");
		int posRemap = text.indexOf("<remap");
		int posArg = text.indexOf("<arg");
		
		int firstMin = minimum (posIncl, posGroup, posRemap);
		if (config == null){
			//On coupe le texte pour gérer les args seulement
			String argText = text.substring(posArg,firstMin-1);
			config = GenConfig.genConfigText(argText);
			GenConfig.adaptConfig(canard.tool.FileReaderTool.readFile(UILAUNCH), config);
		}
		//Si on a des args avant tout autre élément
		if (posArg < firstMin){
			//TODO : Faire des choses

		}
		//Si on a des include ou des remap avant les group
		//Ou que carrement pas de groupe
		if (firstMin < posGroup || posGroup < 0){
			String tempText = text;
			if (posGroup >= 0){
				tempText = text.substring(0,posGroup);
			}
			//On les exécute d'abord
			exeInclude(tempText);
			relationsFromLaunch(tempText);
		}
		String wordToFind = "group";
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);
		int cptGroup = 0 ;
		int totalGroups = 0;
		int debutGroupe = -1 ;
		while (match.find()) {
			if (debutGroupe == -1){
				debutGroupe = match.start()-1;
			}
			if (text.charAt(match.start()-1) == '<'){
				//On ouvre un groupe
				cptGroup ++;
				totalGroups ++;
			}else{
				//On ferme un groupe
				cptGroup --;
			}
			if (cptGroup == 0){
				//On ferme un groupe premier niveau
				//On va gérer les noeuds dans le groupe via la position
				int finGroupe = match.end()+1;
				String groupText = text.substring(debutGroupe,finGroupe);

				//Doit verifier si l'argument est valide
				int posiArg = groupText.indexOf("arg");
				posiArg += 4; //$(arg camera)">
				int posEndArg = groupText.indexOf(">");
				String arg = groupText.substring(posiArg,posEndArg-2);

				Flag f = FlagsBase.getFlagByName(arg);
				EMap<Flag,String> mapping = config.getConfigflags();
				
				//Si, dans cette config, l'argument vaut vrai
				//On exécute le group if
				String test = mapping.get(f);
				if (mapping.get(f).equals("true")){
					String subgroupText = text.substring(debutGroupe+posEndArg,finGroupe-8);
					//Si aucun groupe on a déjà exécuté les nodes et remap
					if (totalGroups == 0){
						return;
					}else{
						getGroupsV2(subgroupText, config);
						totalGroups = 0;
						debutGroupe = -1;
					}
				}else{
					debutGroupe = -1;
				}
			}
		}
	}
	
	static ArrayList<String> nodes = new ArrayList<String>();
	private static void exeInclude(String text){

		//Does not consider the end bracket of include </include>
				String wordToFind = "<include";
				Pattern word = Pattern.compile(wordToFind);
				Matcher match = word.matcher(text);
				

				while (match.find()) {
					//Finds the end of the line
				     int endInclude = text.indexOf('>',match.end());
				     if (!StringUtils.checkComment(text,match.start())){
					     String temp = text.substring(match.start()+1, endInclude);
					     
					     //Reverse search from the end to get the node's name
					     int nodePos = temp.lastIndexOf("/");
					     if (nodePos == temp.length()-1){
					    	 //We have a / at the end, probably the machine file
					    	 continue;
					     }
					     String node = temp.substring(nodePos+1,(endInclude-1)-match.start()-1);
					     node = node.replace(".launch", "");
					     node = node.replace("\"", "");
					     if(node.equals("joy_node")){
					    	 System.out.println("on est in");
					     }
					     //nodes.add(node.replace(".launch", ""));
					     if (CanardHelper.getBlockFromName(node)==null){
					    	 System.out.println("node : " +node);
					    	 CanardHelper.model.getBlocks().add(makeBlock(node));
					     }
						 

				     }
				}
	}
	

	private static void incrementID(){
		uniqueID+=1;
	}
	
	//0 topic, 1 bad topic
	private static Topic linkTopicToBlock(String line, int topicType){
		String[] lineSplit = line.split("/");
	    Block currBlock = CanardHelper.getBlockFromName(lineSplit[0]);
	     
	     //Pour gerer le cas ou un noeud pas include, mais remap
	     if (currBlock == null && lineSplit[0].contains("node")){
	    	 currBlock = makeBlock(lineSplit[0]);
	     }
	     
	     Topic currTopic = null;
	     //TODO : Else, On a un remap sans node, quoi faire?
	     if (lineSplit.length != 1){
	    	 //Ici peut vouloir concat au cas où on a /image/compressed, le topic est compressed ou image/compressed?
	    	 String topicName = CanardHelper.getTopicNameFromLine(line);
	    	 currTopic = CanardHelper.getTopicFromName(topicName,currBlock);
		     if (currTopic == null){
		    	 
		    	 if (topicType == 0){
		    		 currTopic = CanardHelper.factory.createTopic();
		    	 }else{
		    		 currTopic = CanardHelper.factory.createBadTopic();
		    	 }
			     currTopic.setName(topicName);
			     incrementID();
			     currTopic.setUniqueID(uniqueID);
		     }
		     currBlock.getTopics().add(currTopic);
	     }
	     
	     return currTopic;
	}



	
	private static void relationsFromLaunch(String text){
			
		//Doublon, to refactor
		String wordToFind = "<remap";
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);
		
		while (match.find()) {

			 //Finds the end of the line
		     int endInclude = text.indexOf('>',match.end());

		     //Do not take the line into account if it's a comment
			 if (!StringUtils.checkComment(text,match.start())){
			     String temp = text.substring(match.start()+1, endInclude);
				 String from = "from=\"";
				 String to = "to=\"";
				 
			     int fromPos = temp.indexOf(from);
			     int toPos = temp.indexOf(to);
			     
			     from = temp.substring(fromPos+6,toPos-2);
			     from = from.replace("\"", "");
			     int endPos = temp.lastIndexOf("\"");
			     to = temp.substring(toPos+4,endPos);
			     to = to.replace("\"", "");
			     
			     String nametfrom = CanardHelper.getTopicNameFromLine(from);
			     String nametto = CanardHelper.getTopicNameFromLine(to);
			     
			     Topic tfrom = null;
			     Topic tto = null;
			     if (!nametfrom.equals(nametto)){
				     tfrom = linkTopicToBlock(from,1);
				     tto = linkTopicToBlock(to,1);
			     }else{
				     tfrom = linkTopicToBlock(from,0);
				     tto = linkTopicToBlock(to,0);
			     }

	
			     if (tfrom != null && tto != null){
				     System.out.println("from : "+from);
				     System.out.println(" to : " + to);
				     Rel r1 = CanardHelper.factory.createRel();
			    	 r1.setSrc(tfrom);
				     r1.setTgt(tto);
				     CanardHelper.model.getLinks().add(r1);
			     }
			 }

		}
		
	}


	

	public static void main(String[] args) throws IOException {
		CanardHelper.initModel();
		String text = FileReaderTool.readFile(INPUTLAUNCH);
		getGroupsV2(text,null);


		//Create relations
		//relationsFromLaunch();
		
		//GenConfig.genConfig(model, factory);
		XMIExporter.export(CanardHelper.model, OUTPUTFILE);


		//URI diagUri = URI.createFileURI("output/out.canard");
		// Create a resource set
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(OUTPUTFILE).getAbsolutePath());
		// Get the URI of the model file.
		//

		// Create a resource for this file.
		//
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(CanardHelper.model);
		// Add the initial model object to the contents.
		//
		EObject rootObject = CanardHelper.model;
		/*
	
		if (rootObject != null) {
		  resource.getContents().add(rootObject);
		}
*/
		// Create the diagram
		//
		/*
		Diagram diagram = ViewService.createDiagram(rootObject,
				CanardCanardHelper.modelEditPart.MODEL_ID,
				CanardDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		if (diagram != null) {
		  resource.getContents().add(diagram);
		  diagram.setName(fileURI.lastSegment());
		  diagram.setElement(rootObject);
		}
*/

	}
}
	/*
	public static void main(String[] args) {
		CanardFactory factory = CanardFactory.eINSTANCE;
		CanardModel model = factory.createCanardModel();
		Block b1 = factory.createBlock();
		b1.setName("b1");
		model.getBlocks().add(b1);
		XmiExporter.export(model, "output/out.canard");
		URI diagUri = URI.createFileURI("output/out.canard");
		/*
		Diagram diagram = ViewService.createDiagram(model,
				CanardModelEditPart.MODEL_ID,
				CanardDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource diagramResource = resourceSet.createResource(URI.createFileURI("output/out.canard_diagram"));
		diagramResource.getContents().add(diagram);
        try {
            // Create a resource set
            //
            ResourceSet resourceSet = new ResourceSetImpl();
            // Get the URI of the model file.
            //
            // Create a resource for this file.
            //
            Resource resource = resourceSet.createResource(diagUri);
            // Add the initial model object to the contents.
            //
            EObject rootObject = model;
            if (rootObject != null) {
              resource.getContents().add(rootObject);
            }
            // Create the diagram
            //
            Diagram diagram = ViewService.createDiagram(rootObject,
            		CanardModelEditPart.MODEL_ID,
    				CanardDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
            if (diagram != null) {
              resource.getContents().add(diagram);
              diagram.setName(diagUri.lastSegment());
              diagram.setElement(rootObject);
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		EObject diagramRoot = null;
		try {
			ResourceSet resourceSet = editingDomain.getResourceSet();
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			CanardDiagramEditorPlugin.getInstance().logError("Unable to load resource: " + diagUri, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(), Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}*/
		//Wizard wizard = new CanardNewDiagramFileWizard(diagUri, diagramRoot, editingDomain);
		//wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle, CanardModelEditPart.MODEL_ID));
		//CanardDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
		/*
	    Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
	    diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
	    diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
	    diagram.setElement(model); //your EObject that should be referenced to this diagram (probably an ecore file)
	    diagram.setType("Ecore");
		//ResourceSet resourceSet = new ResourceSetImpl();
	    Resource diagramResource = ResourceSet.createResource(diagUri);
	    diagramResource.getContents().add(d);
	    */
/*
		Resource resource = new GMFResource(uri);
		resource.getContents().add(model);
		try {
			Map options = new HashMap();
			options.put(XMIResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
			resource.save(options);
			Diagram diagram = ViewService.createDiagram(model,"Canard", null);
			diagram.setElement(model);
			diagram.setName("canard");
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource diagramResource = resourceSet.createResource(URI.createFileURI("output/out.canard_diagram"));
			diagramResource.getContents().add(diagram);
			diagramResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	*/
/*
private static void getGroups(String text){
	int posIncl = text.indexOf("<include");
	int posGroup = text.indexOf("<group");
	int posRemap = text.indexOf("<remap");
	if (posIncl < posGroup || posRemap < posGroup){
		String tempText = text.substring(0,posGroup);
		exeInclude(tempText);
		relationsFromLaunch(tempText);
	}
	String wordToFind = "group";
	Pattern word = Pattern.compile(wordToFind);
	Matcher match = word.matcher(text);
	int cptGroup = 0 ;
	int totalGroups = 0;
	int debutGroupe = -1 ;
	while (match.find()) {
		if (debutGroupe == -1){
			debutGroupe = match.start()-1;
		}
		if (text.charAt(match.start()-1) == '<'){
			//On ouvre un groupe
			cptGroup ++;
			totalGroups ++;
		}else{
			//On ferme un groupe
			cptGroup --;
		}
		if (cptGroup == 0){
			//On ferme un groupe premier niveau
			//On va gérer les noeuds dans le groupe via la position
			int finGroupe = match.end()+1;
			String groupText = text.substring(debutGroupe,finGroupe);
			
			//Doit verifier si l'argument est valide
			int posArg = groupText.indexOf("arg");
			posArg += 4; //$(arg camera)">
			int posEndArg = groupText.indexOf(">");
			String arg = groupText.substring(posArg,posEndArg-2); 
			//TODO: Faire verification de l'argument ici
			if (true){
				String subgroupText = text.substring(debutGroupe+posEndArg,finGroupe-8);
				if (totalGroups == 0){
					return;
				}else if (totalGroups == 1){
					//Execute le include
					exeInclude(subgroupText);
					relationsFromLaunch(subgroupText);
					debutGroupe = -1;
					totalGroups = 0;
				} else{
					//Rappel recursivement la fonction
					//Doit enlever le premier et dernier group
					//debutGroupe = <, ajoute la longueur de la ligne
					//finGroupe = >, soustrait la longueur de la ligne
					getGroups(subgroupText);
					totalGroups = 0;
					debutGroupe = -1;
				}
			}
		}
	}
}
*/
