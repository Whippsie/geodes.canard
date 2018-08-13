package canard.tool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import canard.CanardFactory;
import canard.CanardModel;
import canard.Flag;

public class FlagsBase {
	static Map<String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>();
	public static final String INPUTFLAGS = "input/flags.txt";
	private static String readFile(CanardFactory factory,CanardModel model){
		initDict();
		String text = "";
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					INPUTFLAGS));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = line.replace("\t", "");
				String[] parts = line.split(" ");
				String flagname = "";
				for (int i=0; i<parts.length;i++){
					if (parts[i].contains("name")){
						flagname = parts[i].replace("name=","");
						flagname = flagname.replaceAll("\"", "");
					}
				}
				String category = findCategory(flagname);
				if (!checkFlagExists(category, model)){
					Flag currFlag = makeFlag(line, factory, true);
				}else{
					Flag currFlag = makeFlag(line, factory, false);
				}
				//Sinon doit verifier lors de la ligne si elle appartient a une category via un dictionnaire
				if (line.contains("<category")){
					Flag currFlag = makeFlag(line, factory, true);
				}else if (line.contains("</category")){
					//Inserer les flags sous la categorie juska la fin de la category
				}else{
					Flag currFlag = makeFlag(line, factory, false);
				//model.getFlags().add(currFlag); Need to gen model before being able to call this
				}
					// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
	private static boolean checkFlagExists(String category,CanardModel model){
		boolean exists = false;
		
		return exists;
	}
	private static String findCategory(String arg){
		String category = "Undefined";
		for (Map.Entry<String, ArrayList<String>> entry : dict.entrySet()) {
		    String key = entry.getKey();
		    ArrayList<String> value = entry.getValue();
		    if (value.equals(arg)){
		    	return key;
		    }
		}
		return category;
	}
	private static void initDict(){
		int i = 0;
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(Arrays.asList("/camera/","localization","navigation","avoidance","lane_following","apriltags","joystick","intersectiontype", "coordination", "visualization",
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
	private static Flag makeFlag(String line,CanardFactory factory, boolean AbstractVal){
		Flag f1 = factory.createFlag();
		String search = "name=\"";
		int posArg = line.indexOf(search) + search.length();
		
		//Fetch the beginning of the argument name until the second " found in the line
		String name = line.substring(posArg,line.indexOf("\"",posArg));
		f1.setName(name);

		//TODO: Complete this
		if (line.contains("true") || line.contains("false")){
			//f1.setValue(boolean);
		}
		
		//f1.setisAbstract(AbstractVal);
		return f1;
	}
	
	private static void compareDemo(String demoName, String text){
		//Comment faire le lien avec UI sans tout recoder..? Peut comparer 2 structures EObject?
	}
	
}
