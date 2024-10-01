package stack;

// public class reverseStack {
    
// }
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String name = "amitwala";

        // Insertion of characters into the stack
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            s.push(ch);
        }

        // Retrieval of characters from the stack
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }

        System.out.println();
    }
}
