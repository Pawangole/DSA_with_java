package functions;

import java.util.Scanner;

public class areaOfCirrcle {
    long pi = 0;

    public static double areaOfCirrcle(double redius) {
        double PI = 3.14;
        double area = PI * redius * redius;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter redius of circle");
        double redius = sc.nextDouble();
        double totalArea = areaOfCirrcle(redius);
        System.out.println(totalArea);
        sc.close();
    }
}
