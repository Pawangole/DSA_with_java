import java.util.Scanner;

public class perimeterOfTringle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int perimeter = a + b + c;
        System.out.println(perimeter);
    }
}
