package stack;
import java.util.Stack;

public class javaStack {
    public static void main(String[] args) {
        // Creation
        Stack<Integer> s = new Stack<>();
        
        // Insertion
        s.push(10);
        s.push(20);
        s.push(30);
        
        // Size
        System.out.println(s.size());
        
        // Check empty or not
        System.out.println(s.isEmpty());
        
        // Peek
        System.out.println(s.peek());
        
        // Removal
        s.pop();
        System.out.println(s.peek());
    }
}
