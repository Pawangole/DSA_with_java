package Arrays;

import java.util.Scanner;

public class accending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean isAccending = true;
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] < number[i + 1]) {
                isAccending = true;
            } else {
                isAccending = false;
            }
        }
        if (isAccending) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
