package recursion;


public class InversionCount {
    public static void main(String[] args) {
        int arr[] = { 10, 80, 110, 90, 50, 30, 40, 20 };
        int size = arr.length;
        int count = mergeSort(arr, 0, size - 1);
        System.out.println("Number of inversions: " + count);
    }

    static int mergeSort(int arr[], int s, int e) {
        if (s >= e) {
            return 0;
        }
        int mid = (s + e) / 2;
        int count = 0;
        count += mergeSort(arr, s, mid);
        count += mergeSort(arr, mid + 1, e);
        count += merge(arr, s, e, mid);
        return count;
    }

    static int merge(int arr[], int s, int e, int mid) {
        int leftLength = mid - s + 1;
        int rightLength = e - mid;

        int[] leftArr = new int[leftLength];
        int[] rightArr = new int[rightLength];
        int count = 0;

        for (int i = 0; i < leftLength; i++) {
            leftArr[i] = arr[s + i];
        }
        for (int i = 0; i < rightLength; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = s;
        while (i < leftLength && j < rightLength) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
                count += (leftLength - i); // All remaining elements in leftArr will be greater than rightArr[j]
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        return count;
    }
}

