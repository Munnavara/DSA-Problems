package Stack;

/* https://www.youtube.com/watch?v=Du881K7Jtk8
Using stack
iterating from last element - check if there are any eleements lesser
than that in the stack and put that in stack
take the top most element and assign the answer

if smaller elements in stack, remove till smaller elememts are removed 

 * 
 */
import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        int[] ans = nge(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nge(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for (int i = (2 * n - 1); i >= 0; i--) {
            int num = arr[i % n];
            while (!s.isEmpty() && s.peek() <= num) {
                s.pop();
            }
            if (!s.isEmpty())
                ans[i % n] = s.peek();
            else
                ans[i % n] = -1;
            s.push(num);
        }
        return ans;
    }
}
