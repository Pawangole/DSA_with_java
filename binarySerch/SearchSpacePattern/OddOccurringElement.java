package binarySerch.SearchSpacePattern;

public class OddOccurringElement {
    public int oddOccurringElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the start is equal to the end, the odd element is found
            if (start == end) {
                return start;
            }

            // Check if mid is the odd occurring element
            if ((mid > 0 && arr[mid] != arr[mid - 1]) && (mid < arr.length - 1 && arr[mid] != arr[mid + 1])) {
                return mid;
            }

            // If mid is part of a pair starting at mid-1
            if (mid > 0 && arr[mid] == arr[mid - 1]) {
                int indexOffirst = mid - 1;
                if (indexOffirst % 2 == 0) {
                    // Move to the right
                    start = mid + 1;
                } else {
                    // Move to the left
                    end = mid - 2;
                }
            }
            // If mid is part of a pair starting at mid
            else if (mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {
                int indexOffirst = mid;
                if (indexOffirst % 2 == 0) {
                    // Move to the right
                    start = mid + 2;
                } else {
                    // Move to the left
                    end = mid - 1;
                }
            }
        }
        return -1; // If no odd occurring element is found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };

        OddOccurringElement element = new OddOccurringElement();
        int ans = element.oddOccurringElement(arr);
        System.out.println(ans);
    }
}
