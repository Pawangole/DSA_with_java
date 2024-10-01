package recursion;

public class lastocc {
    //left to right
     public static void main(String[] args) {
    //     String name = "avbelgleggef";
    //     char x = 'f';
    //     char ch[] = name.toCharArray();
    //     int i = 0;

    //     int index = fun(ch, x, i);
    //     System.out.print(index);
    // }

    // static int fun(char ch[], char x, int i) {
    //     if (i >= ch.length) {
    //         return -1; // Base case: return -1 if the end of the array is reached
    //     }
        
    //     // Recursively call the function for the next index
    //     int index = fun(ch, x, i + 1);

    //     // If the character matches and no later match was found, update the index
    //     if (ch[i] == x && index == -1) {
    //         return i;
    //     }

    //     return index;
    // }


    //right to left
    String name = "avbelgleggef";
    char x = 'e'; // character literal
    char[] ch = name.toCharArray();
    int i = ch.length - 1;

    fun(ch, x, i);
}

static void fun(char[] ch, char x, int i) {
    if (i < 0) {
        return; // base condition
    }
    if (ch[i] == x) {
        System.out.println(i);
        return; // exit the method once the character is found
    }
    fun(ch, x, i - 1); // recursive call
}
}
