package Queue;
import java.util.*;

public class Queue {
    public static void main(String[] args) {
             //douly-ended queue 
             Deque<Integer> dq = new LinkedList<>();
             //insertion
             dq.addFirst(10);
             //10
             dq.addFirst(30);
             //10 30
             dq.addFirst(50);
             //10 30 50
             dq.addLast(70);
             ///70 10 30 50;
             dq.addLast(100);
             //100 70 10 30 50
             System.out.println(dq.size());
             System.out.println(dq.isEmpty());
             System.out.println(dq.peekFirst());
             System.out.println(dq.peekLast());
     
             //removal;
             dq.removeFirst();
             System.out.println(dq.peekFirst());
             dq.removeLast();
             System.out.println(dq.peekLast());
     
     
             // Queue<Integer> q = new LinkedList<>();
             // //insertion
             // q.add(10);
             // q.add(20);
             // q.add(30);
             // q.add(40);
             // //front 
             // System.out.println(q.peek());
             // //removal 
             // q.remove();
             // System.out.println(q.peek());
             // //size
             // System.out.println(q.size());
             // //empty
             // System.out.println(q.isEmpty());
             // //rear element
             // System.out.println(((LinkedList<Integer>)q).peekLast());
     
             //printing
             // while(!q.isEmpty()) {
             //   System.out.print(q.peek() + " ");
             //   q.remove();
             // }
     
         }
     
}



   