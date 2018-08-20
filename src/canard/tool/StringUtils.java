package canard.tool;

public class StringUtils {
	public static String concat(String[] toConcat){
		String result = "";
		for (int i=1;i<toConcat.length;i++){
			result += toConcat[i] + "/";
		}
		return result.substring(0,result.length()-1);
	}
	
	
	public static boolean checkComment(String line, int pos){
		String comment = "<!--";
		String textval = "";
		for (int i = comment.length() ; i > 0 ; i--){
			textval += line.charAt(pos-i);
		}
		if(textval.contentEquals(comment)){
			return true;
		}
		return false;
	}
}
