package Queue;

class CircularQueue {
    private int[] arr;
    private int n;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        this.n = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void push(int val) {
        // 4 cases: Overflow, first element, circular nature, normal flow
        if ((front == 0 && rear == n - 1) || (rear == front - 1)) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[rear] = val;
        } else if (rear == n - 1 && front != 0) {
            // Circular nature
            rear = 0;
            arr[rear] = val;
        } else {
            // Normal flow
            rear++;
            arr[rear] = val;
        }
    }

    public void pop() {
        // 4 cases: Underflow, single element, circular nature, normal flow
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            // Single element
            arr[front] = -1;
            front = -1;
            rear = -1;
        } else if (front == n - 1) {
            // Circular nature
            arr[front] = -1;
            front = 0;
        } else {
            // Normal case
            arr[front] = -1;
            front++;
        }
    }

    public int getFront() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        } else {
            return arr[front];
        }
    }

    public int getSize() {
        if (front == -1 && rear == -1) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return n - front + rear + 1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/**
 * InnerimplementCircularQueue
 */
public class implementCircularQueue {

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.push(10);
        q.print();
        q.push(20);
        q.print();
        q.push(30);
        q.print();
        q.push(40);
        q.print();
        q.push(50);
        q.print();
        q.push(60); // Overflow case
        q.print();
        q.pop();
        q.print();
        q.pop();
        q.print();
        q.push(100);
        q.print();
        q.push(101);
        q.print();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.getFront());
    }
}
