// package recursion;

// public class SearchInArray {
// public static void main(String[] args) {
// int arr[] = { 20, 21, 30, 31, 50, 51 };
// int size = arr.length;
// int target = 31;
// SearchInArray SA = new SearchInArray();
// SA.searchTarget(arr, size, target, 0);
// // System.out.println(ans);

// }

// void searchTarget(int arr[], int n, int target, int index) {
// if (index >= n) {
// return;
// }
// searchTarget(arr, n, target, index + 1);
// if (arr[index] == target) {
// System.out.println("target found at index:" + index);

// }

// }
// }

// package recursion;

// public class SearchInArray {
// public static void main(String[] args) {
// int arr[] = { 20, 21, 30, 31, 50, 51 };
// int size = arr.length;
// int target = 310;
// SearchInArray SA = new SearchInArray();
// boolean ans = SA.searchTarget(arr, size, target, 0);
// System.out.println(ans);

// }

// boolean searchTarget(int arr[], int n, int target, int index) {
// if (index >= n) {
// return false;
// }
// searchTarget(arr, n, target, index + 1);
// if (arr[index] == target) {
// return true;
// }
// boolean ans = searchTarget(arr, n, target, index + 1);
// return ans;

// }
// }
