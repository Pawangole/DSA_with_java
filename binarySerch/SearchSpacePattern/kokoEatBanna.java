package binarySerch.SearchSpacePattern;

public class kokoEatBanna {
    boolean canEatAllBananas(int[] piles, int h, int k) {
        double totalHours = 0;

        // Calculate the total hours needed to eat all bananas at speed k
        for (int i = 0; i < piles.length; i++) {
            totalHours += Math.ceil(piles[i] / (double) k);
        }

        // Return true if the total hours are less than or equal to h
        return totalHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = Integer.MIN_VALUE;

        // Find the maximum number of bananas in any pile
        for (int i = 0; i < piles.length; i++) {
            maxElement = Math.max(maxElement, piles[i]);
        }

        int start = 1; // Minimum possible speed should be 1, not 0
        int end = maxElement;
        int ans = maxElement;

        // Binary search to find the minimum eating speed
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int k = mid;

            // Check if Koko can eat all bananas at speed k within h hours
            if (canEatAllBananas(piles, h, k)) {
                ans = k; // Update the answer
                end = mid - 1; // Try to find a smaller speed
            } else {
                start = mid + 1; // Increase the speed
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        kokoEatBanna solution = new kokoEatBanna();

        // Test case 1
        int[] piles1 = { 3, 6, 7, 11 };
        int h1 = 8;
        int result1 = solution.minEatingSpeed(piles1, h1);
        System.out.println("Minimum eating speed for test case 1: " + result1); // Expected output: 4

        // Test case 2
        int[] piles2 = { 30, 11, 23, 4, 20 };
        int h2 = 5;
        int result2 = solution.minEatingSpeed(piles2, h2);
        System.out.println("Minimum eating speed for test case 2: " + result2); // Expected output: 30

        // Test case 3
        int[] piles3 = { 30, 11, 23, 4, 20 };
        int h3 = 6;
        int result3 = solution.minEatingSpeed(piles3, h3);
        System.out.println("Minimum eating speed for test case 3: " + result3); // Expected output: 23
    }

}
