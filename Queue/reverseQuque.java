package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQuque {
    
    // Iterative method to reverse the queue
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            int element = q.poll();
            st.push(element);
        }
        // ab tak saare queue k element stack k andar push hogye honge

        // ab stack se element jab bahar nilakenge, toh vo reverse hogye honge
        // unn reversed elemnt ko queue me insert krdenge 
        while (!st.isEmpty()) {
            int element = st.pop();
            q.offer(element);
        }
    }

    // Recursive method to reverse the queue
    public static void reverseQueueRec(Queue<Integer> q) {
        // base case
        if (q.isEmpty()) {
            return;
        }
        // 1 case main solve krunga 
        int frontElement = q.poll();
        // baaki recursion ki h 
        reverseQueueRec(q);
        // backtracking 
        q.offer(frontElement);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        //reverseQueueRec(q);
        reverseQueue(q);

        // print all element inside queue
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
