package ca.umontreal.iro.geodes.canard.tool;

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
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.internal.util.Log;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.osgi.util.NLS;

import ca.umontreal.iro.geodes.canard.Block;
import ca.umontreal.iro.geodes.canard.CanardFactory;
import ca.umontreal.iro.geodes.canard.CanardModel;
import ca.umontreal.iro.geodes.canard.Rel;
import canard.diagram.edit.parts.CanardModelEditPart;
import canard.diagram.part.CanardDiagramEditorPlugin;
import canard.diagram.part.CanardDiagramEditorUtil;
import canard.diagram.part.CanardNewDiagramFileWizard;
import canard.diagram.part.Messages;

public class CanardTool {
	public static final String INPUTLAUNCH = "input/joystick.launch";
	public static final String OUTPUTFILE =  "output/out.canard";
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
	private static ArrayList<String> nodesFromLaunch(){
		ArrayList nodes = new ArrayList<String>();
		String text = readFile();
		
		//Does not consider the end bracket of include </include>
		String wordToFind = "<include";
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);
		

		while (match.find()) {
			//Finds the end of the line
		     int endInclude = text.indexOf('>',match.end());
		     String temp = text.substring(match.start()+1, endInclude);
		     
		     //Reverse search from the end to get the node's name
		     int nodePos = temp.lastIndexOf("/");
		     if (nodePos == temp.length()-1){
		    	 //We have a / at the end, probably the machine file
		    	 continue;
		     }
		     String node = temp.substring(nodePos+1,(endInclude-1)-match.start()-1);
		     nodes.add(node.replace(".launch", ""));
		}
		return nodes;
		
	}
	private static void relationsFromLaunch(CanardFactory factory){
		
		String text = readFile();
		
		//Doublon, to refactor
		String wordToFind = "remap";
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);
		
		while (match.find()) {
			 //Finds the end of the line
		     int endInclude = text.indexOf('>',match.end());
		     String temp = text.substring(match.start()+1, endInclude);
		     
			 String from = "from=\"";
			 String to = "to=\"";
			 
		     int fromPos = temp.indexOf(from);
		     int toPos = temp.indexOf(to);
		     
		     from = temp.substring(fromPos+6,toPos-3);
		     System.out.println(from);
		     
		     String[] nodeTopic = from.split("/");
		     Block bfrom = getBlockFromName(nodeTopic[0]);
		     
		     to = temp.substring(toPos+4,endInclude-match.start()-3);
		     System.out.println(to);
		     
		     nodeTopic = to.split("/");
		     Block bto = getBlockFromName(nodeTopic[0]);
		     
		     //TODO: Ajouter un nom a la relation pour savoir quel topic de chaque cote
		     
		     Rel r1 = factory.createRel();
		     r1.setSrc(bfrom);
		     r1.setTgt(bto);
		     
		     model.getLinks().add(r1);
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
	
	private static CanardModel model;
	public static void main(String[] args) throws IOException {
		CanardFactory factory = CanardFactory.eINSTANCE;
		model = factory.createCanardModel();
		
		//Create blocks
		ArrayList<String> nodes = nodesFromLaunch();
		for (String n : nodes){
			System.out.println(n);
			model.getBlocks().add(makeBlock(n,factory));
		}

		//Create relations
		relationsFromLaunch(factory);
		
		
		XmiExporter.export(model, OUTPUTFILE);


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
		Diagram diagram = ViewService.createDiagram(rootObject,
				CanardModelEditPart.MODEL_ID,
				CanardDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		if (diagram != null) {
		  resource.getContents().add(diagram);
		  diagram.setName(fileURI.lastSegment());
		  diagram.setElement(rootObject);
		}


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
