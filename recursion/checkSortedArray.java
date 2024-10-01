package recursion;

public class checkSortedArray {
    public static void main(String[] args) {
        int arr[] = { 200, 40, 90, 320, 600, 610 };
        int size = arr.length;

        checkSortedArray check = new checkSortedArray();

        boolean result = check.checkArr(arr, size, 0);
        System.out.println(result);
    }

    boolean checkArr(int arr[], int size, int i) {
        if (i >= size - 1) {
            return true; // Base case: If we have reached the last element, the array is sorted
        }

        if (arr[i] > arr[i + 1]) {
            return false; // If any element is greater than the next element, the array is not sorted
        }

        return checkArr(arr, size, i + 1); // Recursive call to check the next pair
    }
}
