package recursion;

public class checkArrayDecending {
    public static void main(String[] args) {
        int arr[] = { 200, 150, 90, 32, 21, 6 };
        int size = arr.length;

        checkArrayDecending check = new checkArrayDecending();

        boolean result = check.checkArr(arr, size, 0);
        System.out.println(result);
    }

    boolean checkArr(int arr[], int size, int i) {
        if (i >= size - 1) {
            return true;
        }

        if (arr[i] < arr[i + 1]) {
            return false;
        }

        return checkArr(arr, size, i + 1);
    }
}
