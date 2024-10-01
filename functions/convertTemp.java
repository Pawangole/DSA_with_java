package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class convertTemp {
    public static ArrayList<Double> tempConvert(double celsius) {
        ArrayList<Double> list = new ArrayList<>();
        double kelvin = celsius + 273.15;
        double fehnerheit = celsius * 1.80 + 32;
        list.add(kelvin);
        list.add(fehnerheit);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in celsius");
        double celsius = sc.nextDouble();
        ArrayList<Double> result = tempConvert(celsius);
        System.out.println(result);

    }
}
