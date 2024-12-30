package Queue;

import java.util.*;

class Solution {
    public int maxMinSumSlidingWindow(int[] nums, int k) {
        // Initialize two deques for tracking indices of max and min elements in the window
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int totalSum = 0;  // To accumulate the sum of max + min for each window

        // Process the first window
        for (int i = 0; i < k; i++) {
            // Remove smaller elements for max deque
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[i]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(i);

            // Remove larger elements for min deque
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[i]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(i);
        }

        // Add the result for the first window
        totalSum += nums[maxDeque.peekFirst()] + nums[minDeque.peekFirst()];

        // Process the remaining windows
        for (int i = k; i < nums.length; i++) {
            // Remove elements outside the current window from deques
            if (!maxDeque.isEmpty() && maxDeque.peekFirst() <= i - k) {
                maxDeque.pollFirst();
            }
            if (!minDeque.isEmpty() && minDeque.peekFirst() <= i - k) {
                minDeque.pollFirst();
            }

            // Add the current element in the deques
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[i]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(i);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[i]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(i);

            // Sum max and min of the current window
            totalSum += nums[maxDeque.peekFirst()] + nums[minDeque.peekFirst()];
        }

        return totalSum;
    }
}

public class maxMinSunSlidingWindow {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k = 4;
        System.out.println("Sum of max and min of each window: " + sol.maxMinSumSlidingWindow(arr, k));
    }
}
