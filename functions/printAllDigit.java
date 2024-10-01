package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class printAllDigit {

    public static void allDigit(int num) {
        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        allDigit(num);

    }
}
