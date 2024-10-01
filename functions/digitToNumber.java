package functions;

import java.util.Scanner;

public class digitToNumber {
    public static int toNumber(int numOfDigit) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < numOfDigit; i++) {
            System.out.println("Enter digit");
            int digit = sc.nextInt();
            number = number * 10 + digit;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of digit");
        int numOfDigit = sc.nextInt();
        int ans = toNumber(numOfDigit);
        System.out.println(ans);

    }
}
