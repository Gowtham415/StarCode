package interviewprep;
//Develop a program to count the occurrences of a specific word in a given paragraph.
public class Q55_WordOccurrences {
	public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. Sample paragraph for testing.";
        String targetWord = "sample";
        int occurrences = countOccurrences(paragraph, targetWord);
        System.out.println("Occurrences: " + occurrences);
    }

    public static int countOccurrences(String text, String target) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }
}
