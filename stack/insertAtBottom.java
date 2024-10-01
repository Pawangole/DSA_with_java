package stack;

// public class insertAtBottom {
    
// }
import java.util.Stack;

public class insertAtBottom {

    // Function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> s, int value) {
        // base case
        if (s.isEmpty()) {
            s.push(value);
            return;
        }

        // 1 case hum krenge and baaki recursion karega
        int topElement = s.pop();

        // baaki recursion
        insertAtBottom(s, value);

        // backtrack
        s.push(topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        int value = 13;

        insertAtBottom(s, value);

        // traverse
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
}
