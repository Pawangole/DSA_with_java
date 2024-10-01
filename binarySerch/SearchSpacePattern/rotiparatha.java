package binarySerch.SearchSpacePattern;

import java.util.Scanner;

public class rotiparatha {

    // Function to check if it is possible to cook `P` pratas in `mid` minutes
    public static boolean canCookPratas(int P, int[] ranks, int L, int mid) {
        int totalPratas = 0;

        // Loop through each cook's rank
        for (int i = 0; i < L; i++) {
            int time = 0;
            int k = 1;

            // Calculate number of pratas a cook can make in `mid` minutes
            while (time + k * ranks[i] <= mid) {
                time += k * ranks[i];
                totalPratas++;
                k++;

                // If total pratas cooked is greater than or equal to required pratas, return
                // true
                if (totalPratas >= P) {
                    return true;
                }
            }
        }

        // Check if total pratas cooked is sufficient
        return totalPratas >= P;
    }

    public static int minTimeToCookPratas(int P, int L, int[] ranks) {
        int left = 0;
        int right = 100000000; // Set a high initial upper bound for binary search
        int result = right;

        // Binary search for minimum time
        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if we can cook P pratas in `mid` minutes
            if (canCookPratas(P, ranks, L, mid)) {
                result = mid; // Update result if it is possible
                right = mid - 1; // Try for a smaller time
            } else {
                left = mid + 1; // Increase the time
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int t = 0; t < testCases; t++) {
            int P = sc.nextInt();
            int L = sc.nextInt();
            int[] ranks = new int[L];

            for (int i = 0; i < L; i++) {
                ranks[i] = sc.nextInt();
            }

            int result = minTimeToCookPratas(P, L, ranks);
            System.out.println(result);
        }

        sc.close();
    }
}
