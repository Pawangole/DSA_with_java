package recursion;

public class printDigit {
    public static void main(String[] args) {
        int num = 432;
        printDigit digit = new printDigit();
        digit.Digit(num);
    }

    void Digit(int n) {
        if (n == 0) {
            return;
        }
        int ans = n % 10;
        Digit(n / 10);
        System.out.println(ans);
    }
}
