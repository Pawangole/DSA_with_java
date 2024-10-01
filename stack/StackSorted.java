package stack;

import java.util.Stack;

public class StackSorted {
    
    public static boolean checkSorted(Stack<Integer> s, int element1) {
        // Base case
        if (s.isEmpty()) {
            // iska mtlb, k stack poora compare ho chuka h, and poora sorted hau 
            return true;
        }

        // 1 case solve krna h 
        int element2 = s.peek();
        s.pop();
        if (element2 < element1) {
            // iska mtlb aage check kr skte h 
            boolean aageKaAns = checkSorted(s, element2);
            s.push(element2);
            return aageKaAns;
        } else {
            // iska mtlb sorted hi nahi h, aage check krne ki need hi nahi h 
            return false;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(5);
        s.push(40);
        s.push(50);

        int element1 = Integer.MAX_VALUE;
        System.out.println(checkSorted(s, element1));
    }
}
