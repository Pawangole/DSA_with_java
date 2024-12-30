package oops;

public class Student {
    int rollNumber;
    float marks;
    String name;

    // non-perameter constructor
    Student() {
        this.rollNumber = 24;
        this.marks = 86.93f;
        this.name = "pawan";

    }

    // Constructor inside constructor
    Student(String othername) {
        this(8723, 88.98f, "mayank");
    }

    // Perameter constructor
    Student(int rollNumber, float marks, String name) {
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.name = name;
    }
}
