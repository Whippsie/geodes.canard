package canard.tool;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.osgi.util.NLS;

import canard.Block;
import canard.CanardFactory;
import canard.CanardModel;
import canard.Rel;
import canard.Topic;

public class CanardTool {
	public static final String INPUTLAUNCH = "input/master.launch";
	public static final String OUTPUTFILE =  "output/outmastergroupby.canard";
	public static int uniqueID = 0;
	private static CanardModel model;
	private static CanardFactory factory;
	
	private static Block makeBlock(String name, CanardFactory factory){
		//TODO: Not sure of this code, should use array or map to dynamically modify the name of the variables
		//https://stackoverflow.com/questions/2711067/how-do-i-dynamically-name-objects-in-java
		Block b1 = factory.createBlock();
		b1.setName(name);
		return b1;
	}
	private static String readFile(){
		String text = "";
		try {
			//Reads the whole file
			text = new String(Files.readAllBytes(Paths.get(INPUTLAUNCH)), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
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
	
	static ArrayList<String> nodes = new ArrayList<String>();
	private static void exeInclude(String text){

		//Does not consider the end bracket of include </include>
				String wordToFind = "<include";
				Pattern word = Pattern.compile(wordToFind);
				Matcher match = word.matcher(text);
				

				while (match.find()) {
					//Finds the end of the line
				     int endInclude = text.indexOf('>',match.end());
				     if (!checkComment(text,match.start())){
					     String temp = text.substring(match.start()+1, endInclude);
					     
					     //Reverse search from the end to get the node's name
					     int nodePos = temp.lastIndexOf("/");
					     if (nodePos == temp.length()-1){
					    	 //We have a / at the end, probably the machine file
					    	 continue;
					     }
					     String node = temp.substring(nodePos+1,(endInclude-1)-match.start()-1);
					     node = node.replace(".launch", "");
					     
					     System.out.println("node : " +node);
					     //nodes.add(node.replace(".launch", ""));
						 model.getBlocks().add(makeBlock(node,factory));
				     }
				}
	}
	
	private static void nodesFromLaunch(){

		String text = readFile();
		
		getGroups(text);
		
		
	}
	private static void incrementID(){
		uniqueID+=1;
	}
	
	private static Topic makeRel(String from){
		String[] nodeTopic = from.split("/");
	     
	     //TODO : decide what to do with the $
	     for (int i =0; i<nodeTopic.length;i++){
	    	 if (nodeTopic[i].contains("$")){
	    		 return null;
	    	 }
	     }
	    Block bfrom = getBlockFromName(nodeTopic[0]);
	     
	     //Pour gerer le cas ou un noeud pas include, mais remap
	     if (bfrom == null && nodeTopic[0].contains("node")){
	    	 bfrom = makeBlock(nodeTopic[0],factory);
	     }
	     
	     Topic tfrom = null;
	     //TODO : Else, On a un remap sans node, quoi faire?
	     if (nodeTopic.length != 1){
		     tfrom = factory.createTopic();
		     tfrom.setName(nodeTopic[1]);
		     incrementID();
		     tfrom.setUniqueID(uniqueID);
		     bfrom.getTopics().add(tfrom);
	     }
	     
	     return tfrom;

	     
	}
	private static boolean checkComment(String text, int pos){
		String comment = "<!--";
		String textval = "";
		for (int i = comment.length() ; i > 0 ; i--){
			textval += text.charAt(pos-i);
		}
		if(textval.contentEquals(comment)){
			return true;
		}
		return false;
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
			 if (!checkComment(text,match.start())){
			     String temp = text.substring(match.start()+1, endInclude);
				 String from = "from=\"";
				 String to = "to=\"";
				 
			     int fromPos = temp.indexOf(from);
			     int toPos = temp.indexOf(to);
			     
			     from = temp.substring(fromPos+6,toPos-2);
	
			     Topic tfrom = makeRel(from);
			     
			     int endPos = temp.lastIndexOf("\"");
			     to = temp.substring(toPos+4,endPos);
	
			     Topic tto = makeRel(to);
	
			     if (tfrom != null && tto != null){
				     System.out.println("from : "+from);
				     System.out.println(" to : " + to);
				     Rel r1 = factory.createRel();
			    	 r1.setSrc(tfrom);
				     r1.setTgt(tto);
				     model.getLinks().add(r1);
			     }
			 }

		}
		
	}
	private static Block getBlockFromName(String name){
		EList<Block> listBlock = model.getBlocks();
		for (Block b : listBlock){
			if (b.getName().matches(name)){
				return b;
			}
		}
		return null;
		
	}
	

	public static void main(String[] args) throws IOException {
		factory = CanardFactory.eINSTANCE;
		model = factory.createCanardModel();
		
		//Create blocks
		nodesFromLaunch();


		//Create relations
		//relationsFromLaunch();
		
		
		XMIExporter.export(model, OUTPUTFILE);


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
		resource.getContents().add(model);
		// Add the initial model object to the contents.
		//
		EObject rootObject = model;
		/*
	
		if (rootObject != null) {
		  resource.getContents().add(rootObject);
		}
*/
		// Create the diagram
		//
		/*
		Diagram diagram = ViewService.createDiagram(rootObject,
				CanardModelEditPart.MODEL_ID,
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
