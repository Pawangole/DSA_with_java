package Strings;

public class changesCase {
    public static void main(String[] args) {
        char[] name = "pawan".toCharArray();

        for (int i = 0; i < name.length; i++) {
            char ch = name[i];
            ch = (char) (ch - 'a' + 'A');
            name[i] = ch;

        }
        System.out.println(name);
    }
}
