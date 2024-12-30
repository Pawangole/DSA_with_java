package Queue;

class CustomQueue {
    private int[] arr;
    private int n;
    private int front;
    private int rear;

    public CustomQueue(int size) {
        arr = new int[size];
        n = size;
        front = -1;
        rear = -1;
    }

    public void push(int val) {
        if (rear == n - 1) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            //inserting first element;
            rear++;
            front++;
            arr[rear] = val;
        } else {
            //normal flow
            rear++;
            arr[rear] = val;
        }
    }

    public void pop() {
        if (front == -1 && rear == -1) {
            //queue is empty
            System.out.println("Underflow");
        } else if (front == rear) {
            //single element
            arr[rear] = -1;
            front = -1;
            rear = -1;
        } else {
            //normal flow
            arr[front] = -1;
            front++;
        }
    }

    public int getFront() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1; // Return a default value when queue is empty
        } else {
            return arr[front];
        }
    }

    public int getRear() {
        // HW
        if (rear == -1) {
            System.out.println("Queue is empty");
            return -1; // Return a default value when queue is empty
        } else {
            return arr[rear];
        }
    }

    public int getSize() {
        //number of elements inside a queue
        if (front == -1 && rear == -1) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }
}

public class implementQueue {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println(q.getSize());
        q.push(40);
        System.out.println(q.getFront());
        q.push(100);
        System.out.println(q.isEmpty());

        q.pop();
        System.out.println(q.getSize());
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        System.out.println(q.getSize());
        q.pop();
    }
}
