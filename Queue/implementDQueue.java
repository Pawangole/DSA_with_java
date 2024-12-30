package Queue;

class CustomDQueue {
    private int[] arr;
    private int n;
    private int front;
    private int rear;

    public CustomDQueue(int size) {
        this.n = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void pushFront(int val) {
        if (front == 0) {
            // No space on the left side to insert
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            // Queue was empty, inserting the first element
            front++;
            rear++;
            arr[front] = val;
        } else {
            // Normal flow
            front--;
            arr[front] = val;
        }
    }

    public void popBack() {
        if (front == -1 && rear == -1) {
            // Queue is already empty, nothing to pop
            System.out.println("Underflow");
        } else if (front == rear) {
            // Queue has only one element, will be empty after removal
            arr[rear] = -1;
            front = -1;
            rear = -1;
        } else {
            // Normal flow
            arr[rear] = -1;
            rear--;
        }
    }

    public void pushBack(int val) {
        if (rear == n - 1) {
            // No space on the right side to insert
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            // Inserting the first element
            rear++;
            front++;
            arr[rear] = val;
        } else {
            // Normal flow
            rear++;
            arr[rear] = val;
        }
    }

    public void popFront() {
        if (front == -1 && rear == -1) {
            // Queue is empty
            System.out.println("Underflow");
        } else if (front == rear) {
            // Single element, will be empty after removal
            arr[front] = -1;
            front = -1;
            rear = -1;
        } else {
            // Normal flow
            arr[front] = -1;
            front++;
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
 * implementDQueue
 */
public class implementDQueue {
    public static void main(String[] args) {
        CustomDQueue dq = new CustomDQueue(5);

        dq.pushFront(10);
        dq.print();
        dq.pushFront(20);
        dq.print();
        dq.pushBack(15);
        dq.print();
        dq.pushBack(35);
        dq.print();
        dq.pushFront(100);
        dq.print();
        dq.popFront();
        dq.print();
        dq.popFront();
        dq.print();
        dq.popFront();
        dq.print();
        dq.popFront();
        dq.print();
    }
    
}
   

