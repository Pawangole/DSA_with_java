package Strings;

public class palindrome {
    public boolean isPalindrome(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            if (s[i] == s[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] name = "pawap".toCharArray();
        palindrome bol = new palindrome();
        if (bol.isPalindrome(name)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
