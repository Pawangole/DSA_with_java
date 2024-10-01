package binarySerch.SearchSpacePattern;

public class Sqrt {
    public int sqrt(int dividend, int divisor) {
        int start = 0;
        int end = dividend;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid * divisor) <= dividend) {
                ans = mid;
                start = mid + 1;
            } else if ((mid * divisor) > dividend) {
                end = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int dividend = 13;
        int divisor = 3;

        Sqrt sqrt = new Sqrt();
        int ans = sqrt.sqrt(dividend, divisor);
        System.out.println("The result is: " + ans);
    }
}
