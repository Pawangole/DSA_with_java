package binarySerch.exponatial;

public class search {
    int bs(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    int exsearch(int arr[], int n, int target) {
        if (arr[0] == target)
            return 0;
        int i = 1;
        while (arr[i] <= target) {
            if (arr[i] <= target) {
                i = i * 2;
            }
        }
        return bs(arr, i / 2, Math.min(i, (n - 1)), target);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 8, 10, 23, 43, 45, 67, 88, 89 };
        int n = arr.length;
        int target = 43;

        search s = new search();
        int ans = s.exsearch(arr, n, target);
        System.out.println(ans);
    }
}