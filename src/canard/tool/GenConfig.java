package canard.tool;

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
	public static final String INPUTCONFIG = "input/LocalizationModified.launch";
	
	public static void genConfig(CanardModel model, CanardFactory factory){
		Configuration testconfig = factory.createConfiguration();
		EMap<Flag, String> flags = testconfig.getConfigflags();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					INPUTCONFIG));
			String line = reader.readLine();
			while (line != null) {
				line = reader.readLine();
				//Launch bug sans cette ligne
				if (line != null){
					String argName = FlagsBase.getArgInfo(line,"name=");
					String argValue = FlagsBase.getArgInfo(line,"value=");
					if (!argName.equals("")&& !argValue.equals("")){
						Flag f = FlagsBase.getFlagByName(argName, model);
						flags.put(f,argValue);
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		testconfig.getConfigflags().addAll(flags);
		model.getConfigurations().add(testconfig);
	}
}
