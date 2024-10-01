package recursion;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printAllSubarrays(arr, 0, 0);
    }

    public static void printAllSubarrays(int[] arr, int start, int end) {
        // Base case: If end has reached the length of the array
        if (end == arr.length) {
            return;
        }
        // If start is greater than end, reset start to 0 and increment end
        else if (start > end) {
            printAllSubarrays(arr, 0, end + 1);
        }
        // Print the subarray and move the start index
        else {
            printSubarray(arr, start, end);
            printAllSubarrays(arr, start + 1, end);
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

