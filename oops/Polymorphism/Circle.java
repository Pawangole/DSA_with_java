package Polymorphism;

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle drawing...");
    }

    public void personal(){
        System.out.println("PErsonal method of Circle...");
    }
}
