package functions;

import java.util.Scanner;

public class countSetBit {
    public static int setBit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int setBit = setBit(num);
        System.out.println(setBit);
        sc.close();
    }
}
