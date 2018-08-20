package canard.tool;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderTool {
	public static String readFile(String filePath){
		String text = "";
		try {
			//Reads the whole file
			text = new String(Files.readAllBytes(Paths.get(filePath)), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
}
