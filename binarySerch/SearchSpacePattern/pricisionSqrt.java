package binarySerch.SearchSpacePattern;

public class pricisionSqrt {
    public double sqrt(int n) {
        double start = 0;
        double end = n;

        double ans = 0;

        while ((end - start) > 0.00000000001) {
            double mid = start + (end - start) / 2;
            double sqrt = mid * mid;

            if (sqrt <= n) {
                ans = mid;
                start = mid;
            } else {
                end = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int dividend = 63;

        pricisionSqrt sqrt = new pricisionSqrt();
        double ans = sqrt.sqrt(dividend);
        System.out.printf("Square root of %d is approximately %.13f\n", dividend, ans);
    }
}
