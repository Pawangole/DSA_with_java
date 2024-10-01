package recursion;

import java.util.ArrayList;

public class allEvenInArray {
    public static void main(String[] args) {
        int arr[] = { 20, 21, 30, 31, 50, 51 };
        int size = arr.length;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        allEvenInArray even = new allEvenInArray();

        even.evenNum(arr, size, index, list);
        System.out.println(list);

    }

    void evenNum(int arr[], int size, int index, ArrayList list) {

        if (index == size) {
            return;
        }
        if ((arr[index] & 1) == 0) {
            list.add(arr[index]);
        }
        evenNum(arr, size, index + 1, list);
    }
}
