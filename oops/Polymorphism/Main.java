package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2, 3));
//        System.out.println(c.add(2, 3, 4));
//        System.out.println(c.add(2,3, 4,5.6));


        // Runtime Polymorphism
        // upcasting
//        Circle c = new Circle();
//        doDrawingStuff(c);
//
        Rect r = new Rect();
        doDrawingStuff(r);
//
//        Shape s = new Shape();
//        doDrawingStuff(s);

        // downcasting
//        Circle c = new Circle();
//        doDrawingStuff(c);

//        Rect r = new Rect();
//        doDrawingStuff(r);
    }

    public static void doDrawingStuff(Shape s){
        s.draw(); // polymorphic

//        Circle c = (Circle)s; // downcasting
//        c.personal();
    }
}
