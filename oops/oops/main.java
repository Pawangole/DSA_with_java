package oops;


public class main {
    public static void main(String[] args) {
        System.out.println("Non-perameterized constructor");
        Student pawan = new Student();
        System.out.println(pawan.rollNumber);
        System.out.println(pawan.marks);
        System.out.println(pawan.name);
        System.out.println("=======================");
        Student pawangole = new Student(64, 94.78f, "pawan gole");
        System.out.println("Perameterized constructor");
        System.out.println(pawangole.rollNumber);
        System.out.println(pawangole.marks);
        System.out.println(pawangole.name);
        System.out.println("=======================");
        System.out.println("Constructor inside constructor");
        Student othername = new Student("mayank");
        System.out.println(othername.rollNumber);
        System.out.println(othername.marks);
        System.out.println(othername.name);

    }

}
