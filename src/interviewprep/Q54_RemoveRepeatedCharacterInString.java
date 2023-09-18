package interviewprep;

public class Q54_RemoveRepeatedCharacterInString {
	 public static void main(String[] args) {
	        String input = "programming";
	        String result = removeDuplicates(input);
	        System.out.println(result);
	    }

	    public static String removeDuplicates(String str) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
	                result.append(str.charAt(i));
	            }
	        }
	        return result.toString();
	    }

}
