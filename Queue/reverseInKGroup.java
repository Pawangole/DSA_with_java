package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseInKGroup {

    public static void reverseInKGroup(Queue<Integer> q, int k, int count) {
        if (count >= k) {
            // toh toh main pkka reverse krunga
            Stack<Integer> s = new Stack<>();
            // fetch k elements from queue, insert in stack
            for (int i = 0; i < k; i++) {
                int element = q.poll();
                s.push(element);
            }
            // fetch k elements from stack and insert in queue
            for (int i = 0; i < k; i++) {
                int element = s.pop();
                q.offer(element);
            }
            // 1 case maine solve krlia h
            // baaaki recursion sambhal lega
            reverseInKGroup(q, k, count - k);
        } else {
            // count < k
            // iska mtlab as it is queue k front se
            // uthakar queue k end me in elemnts ko insert krna h
            for (int i = 0; i < count; i++) {
                int element = q.poll();
                q.offer(element);
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);
        q.offer(90);
        q.offer(100);
        q.offer(110);

        int k = 3;
        int count = q.size();
        // count -> it tracks the number of elements to reverse

        reverseInKGroup(q, k, count);

        // printing
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
