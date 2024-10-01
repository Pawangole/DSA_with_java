package stack;

import java.util.Stack;

public class printMiddle {
    
    public static void printMiddle(Stack<Integer> s, int count) {
        // Base case
        if (count == 0) {
            System.out.println(s.peek());
            return;
        }

        // Solve one case
        int topElement = s.peek();
        s.pop();
        count--;

        // Recursive call
        printMiddle(s, count);

        // Backtrack
        s.push(topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        int count = s.size() / 2;
        printMiddle(s, count);
    }
}
