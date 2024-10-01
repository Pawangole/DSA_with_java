package patterns;

import java.util.Scanner;

public class numericPelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j < n - i - 1; j++) {
                System.err.print(" ");
            }
            for (int j = n - i; j <= n; j++) {
                System.err.print(a);
                a++;
            }
            a = a - 2;
            for (int j = 0; j < i; j++) {
                System.err.print(a);
                a--;
            }

            System.out.println();
        }
    }
}
