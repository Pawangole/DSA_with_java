package Arrays;

import java.util.Scanner;

public class nameArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String name[] = new String[size];
        for (int i = 0; i < size; i++) {
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}
