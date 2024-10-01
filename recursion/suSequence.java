package recursion;

public class suSequence {

    public static void main(String[] args) {
        String input = "abcd";
        generateSubsequences(input, "", 0);
    }

    // Recursive method to generate subsequences
    public static void generateSubsequences(String input, String output, int index) {
        // Base case: if the current index is equal to the length of the input string
        if (index == input.length()) {
            // Print the current subsequence
            System.out.println(output);
            return;
        }

        // Exclude the current character and proceed to the next character
        generateSubsequences(input, output, index + 1);

        // Include the current character and proceed to the next character
        generateSubsequences(input, output + input.charAt(index), index + 1);
    }
}
