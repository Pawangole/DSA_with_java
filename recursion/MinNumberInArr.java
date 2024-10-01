package recursion;

public class MinNumberInArr {
    public static void main(String[] args) {
        int arr[] = { 20, 4, 9, 32, 64, 61 };
        int size = arr.length;
        int index = 0;
        int ans = Integer.MAX_VALUE;
        MinNumberInArr min = new MinNumberInArr();
        int finalAns = min.findMin(arr, size, index, ans);
        System.out.println(finalAns);
    }

    int findMin(int arr[], int size, int index, int ans) {

        if (index == size) {
            return ans;
        }
        ans = Math.min(ans, arr[index]);
        return findMin(arr, size, index + 1, ans);
    }

}