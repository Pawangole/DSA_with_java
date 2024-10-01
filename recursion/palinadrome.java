package recursion;

public class palinadrome {
    public static void main(String[] args) {
        String str = "raceacar";
        int i = 0;
        int j = str.length() - 1;
        palinadrome isPalinadrome = new palinadrome();
        boolean ans = isPalinadrome.check(str, i, j);
        System.out.println(ans);
    }

    boolean check(String str, int i, int j) {
        // Skip non-alphanumeric characters
        while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
            i++;
        }
        while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
            j--;
        }

        if (i >= j) {
            return true;
        }

        if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
            return false;
        }

        return check(str, i + 1, j - 1);
    }
}
