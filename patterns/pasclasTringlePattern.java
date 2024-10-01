package patterns;

import java.util.Scanner;

public class pasclasTringlePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(val + " ");
                val = val * (i - j) / j;
            }
            System.err.println();
        }
    }

}
