package functions;

import java.util.Scanner;

public class setKthBit {
    public static int kthBIt(int n, int k) {
        return n | 1 << k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter kth bit");
        int k = sc.nextInt();
        int number = kthBIt(n, k);
        System.out.println("number after shift kth bit: " + number);
    }
}
