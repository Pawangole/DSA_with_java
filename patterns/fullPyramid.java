package patterns;

import java.util.Scanner;

public class fullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // *
            for (int j = 0; j < i; j++) {
                System.err.print("* ");
            }
            System.err.println();
        }

    }
}
