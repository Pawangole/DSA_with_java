package functions;

import java.util.Scanner;

public class kmToMIles {
    public static double kmToMIle(double km) {
        double _1kmmiles = 0.621371;
        double miles = km * _1kmmiles;
        return miles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = kmToMIle(km);
        System.out.println(miles);
        ;
    }
}
