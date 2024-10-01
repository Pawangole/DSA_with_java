package patterns;

import java.util.Scanner;

public class invertedFullPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.err.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.err.print("* ");
            }
            System.out.println();
        }
    }

}
