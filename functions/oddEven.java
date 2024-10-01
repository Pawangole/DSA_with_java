package functions;

import java.util.Scanner;

public class oddEven {
    public static void oddEven(int n) {

        if ((n & 1) == 0) {
            System.out.println("Given Number is even");
        } else {
            System.out.println("given Number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddEven(n);
    }
}
