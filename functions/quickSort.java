package functions;

public class quickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low >= high)
            return;
        int pivot = high;
        int i = low - 1;
        int j = low;

        while (j < pivot) {
            if (arr[j] <= arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 2, 6, 1, 4 };
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        for (int i = 0; i <= high; i++) {
            System.out.println(arr[i]);
        }

    }

}
