package stack;

import java.util.Stack;

public class StackSortedInsert {

    // Function to insert value into the stack while maintaining sorted order
    public static void sortedInsert(Stack<Integer> s, int val) {
        // Base case
        if (s.isEmpty() || s.peek() < val) {
            s.push(val);
            return;
        }

        // Store the top element and remove it
        int topE = s.peek();
        s.pop();

        // Recursive call to insert the value in the correct position
        sortedInsert(s, val);

        // Push the stored element back onto the stack
        s.push(topE);
    }

    // Function to print the elements of the stack
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Uncomment these lines to add elements to the stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        int val = 23;

        sortedInsert(s, val);

        print(s);
    }
}
