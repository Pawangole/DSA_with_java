package functions;

import java.util.Scanner;

public class primenumberOneToN {

    public static void allPrime(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to prime");
        int num = sc.nextInt();
        allPrime(num);
    }
}
