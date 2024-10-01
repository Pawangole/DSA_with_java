package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseint {
    public static ArrayList<Integer> revese(int n) {
        ArrayList<Integer> rev = new ArrayList<>();

        while (n != 0) {
            rev.add(n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList reverseNumber = revese(n);
        System.out.println(reverseNumber);
    }
}
