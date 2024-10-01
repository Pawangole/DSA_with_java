package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printAllSubarrays(arr);
    }

    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        // Outer loop picks the starting element
        for (int start = 0; start < n; start++) {
            // Inner loop picks the ending element
            for (int end = start; end < n; end++) {
                // Print subarray between start and end
                printSubarray(arr, start, end);
            }
        }
    }

    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

