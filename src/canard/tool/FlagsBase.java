package canard.tool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import canard.CanardFactory;
import canard.CanardModel;
import canard.Flag;

public class FlagsBase {
	static Map<String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>();
	public static final String INPUTFLAGS = "input/flags.txt";
	private static String[] formatArg(String line){
		line = line.replace("\t", "");
		line = line.replace("\"/>", "\" />"); //Add space if absent for splitting
		String[] parts = line.split(" ");
		return parts;
	}
	
	//search is either name= or value=
	public static String getArgInfo(String line, String search){
		String[] parts = formatArg(line);
		String flagInfo = "";
		for (int i=0; i<parts.length;i++){
			if (parts[i].contains(search)){
				flagInfo = parts[i].replace(search,"");
				flagInfo = flagInfo.replaceAll("\"", "");
			}
		}
		return flagInfo;
	}
	
	public static void generateFlags(CanardFactory factory,CanardModel model){
		initDict();		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					INPUTFLAGS));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				String flagname = getArgInfo(line, "name=");
				String category = findCategory(flagname);
				Flag catFlag = getFlagByName(category, model);
				if (catFlag == null){
					//Category doesn't exist yet, must create it
					catFlag = makeFlag(category, factory, true);
					model.getFlags().add(catFlag);
				}
				
				//Create arg flag
				Flag currFlag = makeFlag(flagname, factory, false);
				
				//Add flags to the model
				model.getFlags().add(currFlag);
				
				//Link category and flag
				catFlag.getChild().add(currFlag);
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Flag getFlagByName(String flagName,CanardModel model){
		for (Flag f : model.getFlags()){
			if (f.getName().equals(flagName)){
				return f;
			}
			for (Flag child : f.getChild()){
				if (child.getName().equals(flagName)){
					return child;
				}
			}
		}
		return null;
	}
	private static String findCategory(String arg){
		String category = "Undefined";
		for (Map.Entry<String, ArrayList<String>> entry : dict.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> value = entry.getValue();
		    for (String v : value){
			    if (arg.contains(v)){
			    	return key;
			    }	
		    }

		}
		return category;
	}
	private static void initDict(){
		int i = 0;
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(Arrays.asList("camera","localization","navigation","avoidance","lane_following","apriltags","joystick","intersectiontype", "coordination", "visualization",
				"wheels", "anti_instagram", "LED", "map_name", "verbose"));
		
		dict.put("Camera",new ArrayList<String>());
		dict.get("Camera").add(temp.get(i));
		i++;
		
		dict.put("Localization",new ArrayList<String>());
		dict.get("Localization").add(temp.get(i));
		i++;
		
		dict.put("Navigation",new ArrayList<String>());
		dict.get("Navigation").add(temp.get(i));
		i++;
		
		dict.put("Avoidance",new ArrayList<String>());
		dict.get("Avoidance").add(temp.get(i));
		i++;
		
		dict.put("LaneFollowing",new ArrayList<String>());
		dict.get("LaneFollowing").add(temp.get(i));
		i++;
		
		dict.put("Apriltags",new ArrayList<String>());
		dict.get("Apriltags").add(temp.get(i));
		i++;
		
		dict.put("Control",new ArrayList<String>());
		dict.get("Control").add(temp.get(i));
		i++;
		dict.get("Control").add(temp.get(i));
		i++;
		dict.get("Control").add(temp.get(i));
		i++;
		dict.get("Control").add(temp.get(i));
		i++;
		
		dict.put("Specific",new ArrayList<String>());
		dict.get("Specific").add(temp.get(i));
		i++;
		dict.get("Specific").add(temp.get(i));
		i++;
		dict.get("Specific").add(temp.get(i));
		i++;
		dict.get("Specific").add(temp.get(i));
		i++;
		dict.get("Specific").add(temp.get(i));
		i++;

	}
	private static Flag makeFlag(String flagName,CanardFactory factory, boolean abstractVal){
		Flag f1 = factory.createFlag();
		//String search = "name=\"";
		//int posArg = line.indexOf(search) + search.length();
		
		//Fetch the beginning of the argument name until the second " found in the line
		//String name = line.substring(posArg,line.indexOf("\"",posArg));
		f1.setName(flagName);
		f1.setIsAbstract(abstractVal);
		//TODO: Complete this
		//if (line.contains("true") || line.contains("false")){
			//f1.setValue(boolean);
		//}
		
		//f1.setisAbstract(AbstractVal);
		return f1;
	}

	
	private static void compareDemo(String demoName, String text){
		//Comment faire le lien avec UI sans tout recoder..? Peut comparer 2 structures EObject?
	}
	
}
