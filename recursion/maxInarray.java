package recursion;

public class maxInarray {
    public static void main(String[] args) {
        int arr[] = { 20, 21, 30, 31, 50, 51 };
        int size = arr.length;

        maxInarray mx = new maxInarray();
        int max = mx.maxArr(arr, size, 0);
        System.out.println("Maximum value in the array is: " + max);
    }

    int maxArr(int arr[], int n, int i) {

        if (i >= n) {
            return Integer.MIN_VALUE;
        }

        int maxInRest = maxArr(arr, n, i + 1);

        return Math.max(arr[i], maxInRest);
    }
}
