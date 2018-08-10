package canard.tool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import canard.CanardFactory;
import canard.CanardModel;
import canard.Flag;

public class FlagsBase {
	public static final String INPUTFLAGS = "input/flags.txt";
	private static String readFile(CanardFactory factory,CanardModel model){
		String text = "";
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					INPUTFLAGS));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				Flag currFlag = makeFlag(line, factory);
				//model.getFlags().add(currFlag); Need to gen model before being able to call this
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
	
	private static Flag makeFlag(String line,CanardFactory factory){
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
		
		//f1.setisAbstract("false");
		return f1;
	}
	
}
