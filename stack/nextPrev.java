package stack;


import java.util.Stack;
import java.util.Vector;

public class nextPrev {

    public static void nextSmallerElement(int[] arr, int n, Vector<Integer> ans) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int element = arr[i];
            while (!s.isEmpty() && s.peek() >= element) {
                s.pop();
            }
            //jab main yaha pohocha, iska mtlb, stack top pr koi chooota elemnet
            //aa chuka h, usko answer me store karlo
            ans.add(s.peek());
            //baaki element ko stack me push toh krna hi h
            s.push(element);
        }
    }

    public static void prevSmallerElement(int[] arr, int n, Vector<Integer> ans) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        //fark sirf ioss wale loop ka h
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            while (!s.isEmpty() && s.peek() > element) {
                s.pop();
            }
            //yaha agye mtlb stack top koi chotta element h
            ans.add(s.peek());
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        //input 
        int[] arr = {8, 4, 6, 2, 3};
        int n = 5;

        Vector<Integer> ans = new Vector<>();

        prevSmallerElement(arr, n, ans);
        //reverse(ans.begin(), ans.end());
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

