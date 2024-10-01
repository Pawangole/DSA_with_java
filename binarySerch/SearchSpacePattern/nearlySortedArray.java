package binarySerch.SearchSpacePattern;

public class nearlySortedArray {
    public int findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid + 1] == target) {
                return mid + 1;
            }
            if (arr[mid - 1] == target) {
                return mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 2;

            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 40, 20, 50, 80, 70 };
        int target = 10;
        nearlySortedArray find = new nearlySortedArray();
        int ans = find.findTarget(arr, target);
        System.out.println(ans);
    }
}
