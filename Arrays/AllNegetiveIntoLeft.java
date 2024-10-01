package Arrays;

import java.util.Arrays;

public class AllNegetiveIntoLeft {
    int[] negetiveinleft(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;
            } else if (arr[j] > 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -3, 2, -9, 2, 7 };
        int n = 7;
        AllNegetiveIntoLeft nums = new AllNegetiveIntoLeft();

        int ans[] = nums.negetiveinleft(arr, n);
        System.out.println(Arrays.toString(ans));
    }

}
