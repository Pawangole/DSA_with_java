package stack;

public class twoStack {
    private int[] arr;
    private int size;
    private int top1;
    private int top2;

    // Constructor to initialize the stack with a given capacity
    public twoStack(int capacity) {
        arr = new int[capacity];
        size = capacity;
        top1 = -1;
        top2 = size;
    }

    // Push method for the first stack
    public void push1(int value) {
        if (top2 - top1 == 1) {
            // No space to insert an element in stack1
            System.out.println("Stack Overflow");
        } else {
            // Insert the value in stack1
            top1++;
            arr[top1] = value;
        }
    }

    // Push method for the second stack
    public void push2(int value) {
        if (top2 - top1 == 1) {
            // No space to insert an element in stack2
            System.out.println("Stack Overflow");
        } else {
            // Insert the value in stack2
            top2--;
            arr[top2] = value;
        }
    }

    // Pop method for the first stack
    public void pop1() {
        if (top1 == -1) {
            // Stack1 is empty
            System.out.println("Stack Underflow");
        } else {
            // Remove the top element from stack1
            arr[top1] = 0;
            top1--;
        }
    }

    // Pop method for the second stack
    public void pop2() {
        if (top2 == size) {
            // Stack2 is empty
            System.out.println("Stack Underflow");
        } else {
            // Remove the top element from stack2
            arr[top2] = 0;
            top2++;
        }
    }

    // Method to print the elements of the array and the top positions of the two stacks
    public void print() {
        System.out.println("Top1: " + top1);
        System.out.println("Top2: " + top2);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        twoStack s = new twoStack(5);
        s.push1(10);
        s.print();
        s.push2(90);
        s.print();
        s.push2(80);
        s.print();
        s.pop1();
        s.print();
        s.push2(90);
        s.print();
        s.push2(80);
        s.print();
        s.push2(80);  // This will trigger Stack Overflow
        s.print();
        s.push1(80);  // This will trigger Stack Overflow
        s.print();
    }
}
