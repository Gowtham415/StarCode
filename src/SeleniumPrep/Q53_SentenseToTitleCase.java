package SeleniumPrep;
//Question: Create a program that converts a sentence to title case (capitalize the first letter of each word).
public class Q53_SentenseToTitleCase {
	   public static void main(String[] args) {
	        String sentence = "this is a sample sentence for title casing.";
	        String titleCased = convertToTitleCase(sentence);
	        System.out.println(titleCased);
	    }

	    public static String convertToTitleCase(String input) {
	        String[] words = input.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

}
