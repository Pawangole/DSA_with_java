package functions;

import java.util.Scanner;

public class prime {
    public static boolean checkPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check prime");
        int num = sc.nextInt();
        boolean ans = checkPrime(num);
        if (ans) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }
}
