package recursion;

public class BinarySearchInArray {
    public static void main(String[] args) {
        int arr[] = { 20, 40, 90, 320, 600, 610 };
        int start = 0;
        int end = arr.length - 1;
        int target = 320;

        BinarySearchInArray bs = new BinarySearchInArray();
        int ans = bs.binarySearch(arr, start, end, target);
        System.out.println(ans);
    }

    int binarySearch(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1; // Target not found
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target); // Search in the left half
        } else {
            return binarySearch(arr, mid + 1, end, target); // Search in the right half
        }
    }
}
