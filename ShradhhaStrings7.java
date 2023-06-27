import java.util.LinkedHashSet;

public class DuplicateCharacterRemover {
    public static String removeDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters while removing duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Add the character to the set (duplicates will be automatically removed)
            set.add(str.charAt(i));
        }

        // Construct the modified string without duplicate characters
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String modifiedString = removeDuplicates(input);

        System.out.println("Modified String: " + modifiedString);
    }
}