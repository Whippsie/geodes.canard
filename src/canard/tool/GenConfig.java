package canard.tool;
import canard.tool.CanardTool;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.emf.common.util.EMap;

import canard.CanardFactory;
import canard.CanardModel;
import canard.Configuration;
import canard.Flag;
import canard.tool.FlagsBase;
public class GenConfig {
	
	public static Configuration genConfigText(String text){
		Configuration config = CanardHelper.factory.createConfiguration();
		adaptConfig(text, config);
		CanardHelper.model.getConfigurations().add(config);
		return config;
	}
	

	public static void adaptConfig(String text, Configuration config){
		String[] lines = splitLines(text);
		EMap<Flag, String> flags = config.getConfigflags();
		
		//For every line
		for (int i=0 ; i < lines.length ; i++){
			String argName = FlagsBase.getArgInfo(lines[i],"name=");
			String argValue = "";
			if (lines[i].contains("value=")){
				argValue = FlagsBase.getArgInfo(lines[i],"value=");
			}else if(lines[i].contains("default=")){
				argValue = FlagsBase.getArgInfo(lines[i],"default=");
			}

			//Both information fetched
			if (!argName.equals("") && !argValue.equals("")){
				
				//Check if flag exists
				Flag f = FlagsBase.getFlagByName(argName);
				if (f == null){
					FlagsBase.generateFlagsText(lines[i]);
					f = FlagsBase.getFlagByName(argName);
				}
				flags.put(f,argValue);
			}
			config.getConfigflags().putAll(flags);

		}
	}
	public static String[] splitLines(String text){
		return text.split("\n");
	}
}
