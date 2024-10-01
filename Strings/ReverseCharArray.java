package Strings;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] name = "pawa".toCharArray();
        // int j = name.length - 1;
        // int i = 0;
        // while (i <= j) {
        // char temp = name[i];
        // name[i] = name[j];
        // name[j] = temp;
        // i++;
        // j--;
        // }
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.println(name[i]);
        }

    }
}
