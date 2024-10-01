package functions;

import java.util.Scanner;

public class factorial {
    public static int fac(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int fac = fac(n);
        System.out.println(fac);
    }
}
