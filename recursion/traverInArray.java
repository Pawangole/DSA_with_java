package recursion;

public class traverInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 9, 23, 43, 42, 5, 91 };
        int n = arr.length;
        traverInArray arrTravers = new traverInArray();
        arrTravers.traverInAllArray(arr, n, 0);

    }

    void traverInAllArray(int arr[], int n, int i) {
        if (i >= n) {
            return;
        }
        // for printitnh array in correct order
        System.out.println(arr[i]);
        traverInAllArray(arr, n, i + 1);

        // for printitnh array in reverse order

        // traverInAllArray(arr, n, i + 1);
        // System.out.println(arr[i]);

    }
}
