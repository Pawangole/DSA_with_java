package Queue;

class DeCircularQueue {
    private int[] arr;
    private int n;
    private int front;
    private int rear;

    public DeCircularQueue(int size) {
        this.n = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void pushFront(int val) {
        // 4 cases: Overflow, first element, circular nature, normal flow
        if ((front == 0 && rear == n - 1) || (rear == front - 1)) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[front] = val;
        } else if (front == 0 && rear != n - 1) {
            // Circular case
            front = n - 1;
            arr[front] = val;
        } else {
            // Normal case
            front--;
            arr[front] = val;
        }
    }

    public void pushBack(int val) {
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

    public void popFront() {
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

    public void popBack() {
        // 4 cases: Underflow, single element, circular nature, normal flow
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            // Single element
            arr[front] = -1;
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            // Circular case
            arr[rear] = -1;
            rear = n - 1;
        } else {
            // Normal case
            arr[rear] = -1;
            rear--;
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/**
 * implementDeCircularQueue
 */
public class implementDeCircularQueue {

    public static void main(String[] args) {
        DeCircularQueue q = new DeCircularQueue(5);

        q.pushFront(10);
        q.print();
        q.pushFront(20);
        q.print();
        q.pushBack(30);
        q.print();
        q.pushBack(40);
        q.print();
        q.pushBack(50);
        q.print();
        q.pushFront(60); // Overflow case
        q.print();
        q.popFront();
        q.print();
        q.popFront();
        q.print();
        q.popFront();
        q.print();
        q.popBack();
        q.print();
        q.popFront();
        q.print();
        q.popFront();
        q.print(); // Underflow case
    }
}
