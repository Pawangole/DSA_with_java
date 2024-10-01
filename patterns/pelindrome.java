package patterns;

import java.util.Scanner;

class Pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int reverseNumber = 0;
        while (temp > 0) {
            reverseNumber = reverseNumber * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (number == reverseNumber) {
            System.out.println("Given number is Pelindrome");
        } else {
            System.out.println("Given number is not a pelindrome");
        }
    }
}