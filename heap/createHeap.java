package heap;


import java.util.Arrays;

class createHeap {
    int[] arr;
    int capacity;
    int index;

    createHeap(int n) {
        this.capacity = n;
        arr = new int[n];
        index = 0;
    }

    void printHeap() {
        for (int i = 1; i < capacity; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void insert(int val) {
        if (index == capacity - 1) {
            System.out.println("Overflow");
            return;
        }

        // If space is available
        index++;
        arr[index] = val;
        System.out.println("Placing " + val + " at index: " + index);

        // Now put val at the right position by comparing with the parent node
        int i = index;
        while (i > 1) {
            int parentIndex = i / 2;

            if (arr[parentIndex] < arr[i]) {
                // Swap with parent if parent is smaller
                swap(parentIndex, i);
                i = parentIndex;
            } else {
                // Parent is already larger, no need to do anything
                break;
            }
        }
    }

    void deleteFromHeap() {
        // Replace the root with the last element
        swap(1, index);
        // Decrease the size
        index--;
        // Heapify the root element
        heapify(arr, index, 1);
    }

    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int[] arr, int n, int currIndex) {
        int i = currIndex;
        int leftIndex = 2 * i;
        int rightIndex = 2 * i + 1;

        int largestKaIndex = i;

        // Check for the left child
        if (leftIndex < n && arr[leftIndex] > arr[largestKaIndex]) {
            largestKaIndex = leftIndex;
        }

        // Check for the right child
        if (rightIndex < n && arr[rightIndex] > arr[largestKaIndex]) {
            largestKaIndex = rightIndex;
        }

        // If largest is not the current node, swap it
        if (largestKaIndex != i) {
            System.out.println("Replacing " + arr[i] + " with " + arr[largestKaIndex]);
            int temp = arr[i];
            arr[i] = arr[largestKaIndex];
            arr[largestKaIndex] = temp;
            heapify(arr, n, largestKaIndex);
        }
    }

    static void buildHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapSort(int[] arr, int n) {
        while (n > 1) {
            // Swap root with the last element
            int temp = arr[1];
            arr[1] = arr[n - 1];
            arr[n - 1] = temp;
            // Decrease size of the heap
            n--;
            // Heapify the root element
            heapify(arr, n, 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 10, 20, 30, 40, 50}; // -1 is used as a placeholder for 0 index
        int n = arr.length;

        buildHeap(arr, n);
        System.out.println("\nPrinting heap:");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        heapSort(arr, n);

        System.out.println("\nPrinting heap after heap sort:");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
