package canard.tool;

import org.eclipse.emf.common.util.EList;

import canard.Block;
import canard.CanardFactory;
import canard.CanardModel;
import canard.Topic;

public class CanardHelper {
	public static CanardModel model;
	public static CanardFactory factory;
	
	public static void initModel(){
		CanardHelper.factory = CanardFactory.eINSTANCE;
		model = factory.createCanardModel();
	}
	public static Topic getTopicFromName(String name, Block b){
		for (Topic top : b.getTopics()){
			if (top.getName().equals(name)){
				return top;
			}
		}
	return null;
	}
	
	public static String getTopicNameFromLine(String line){
		String[] nodeTopic = line.split("/");
	     
	     //TODO : decide what to do with the $
	     for (int i =0; i<nodeTopic.length;i++){
	    	 if (nodeTopic[i].contains("$")){
	    		 return null;
	    	 }
	     }
	     String val = "";
	     if (nodeTopic.length > 2){
	    	 return StringUtils.concat(nodeTopic);
	     }else{
	    	 return nodeTopic[1];
	     }
	}
	
	public static Block getBlockFromName(String name){
		EList<Block> listBlock = model.getBlocks();
		for (Block b : listBlock){
			if (b.getName().matches(name)){
				return b;
			}
		}
		return null;
		
	}
}
