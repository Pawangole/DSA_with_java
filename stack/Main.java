package stack;

class Stack {
    private int[] arr;
    private int size;
    private int top;

    // Constructor to initialize the stack with a given capacity
    public Stack(int capacity) {
        arr = new int[capacity];
        size = capacity;
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int val) {
        if (top == size - 1) {
            // Stack is already full, overflow condition
            System.out.println("Stack Overflow");
        } else {
            // Normal case, increment top and add value to the stack
            top++;
            arr[top] = val;
        }
    }

    // Pop method to remove the top element from the stack
    public void pop() {
        if (top == -1) {
            // Stack is empty, underflow condition
            System.out.println("Stack Underflow");
        } else {
            // Normal case, remove the top element
            arr[top] = 0;
            top--;
        }
    }

    // Method to get the current size of the stack
    public int getSize() {
        return top + 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the top element of the stack
    public int getTop() {
        if (top == -1) {
            System.out.println("There is no element at the top, as the stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to print the elements of the stack
    public void print() {
        System.out.println("Printing Stack:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Stack of initial size 5
        Stack s = new Stack(5);
        s.print();
        s.push(10);
        s.print();
        s.push(20);
        s.print();
        s.push(30);
        s.print();
        s.push(40);
        s.print();
        s.push(50);
        s.print();
        s.push(60);  // This will trigger Stack Overflow
        s.print();

        System.out.println("Top element: " + s.getTop());
        System.out.println("Current stack size: " + s.getSize());
        System.out.println("Is the stack empty? " + s.isEmpty());

        // Popping elements from the stack
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();  // This will trigger Stack Underflow
        System.out.println("Final stack size: " + s.getSize());
    }
}

