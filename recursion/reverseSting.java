package recursion;

public class reverseSting {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        char[] charArray = str.toCharArray();
        
      
        int left = 0;
        int right = charArray.length - 1;

       reverse(charArray, left, right);
         // Print the reversed char array as a string
         String reversedString = new String(charArray);
         System.out.println("Reversed string: " + reversedString);
    }

    private static void reverse(char[] charArray, int left, int right) {
        if(left>=right){
            return;
        }
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        reverse(charArray, left+1, right-1);
        
        
    }
}
