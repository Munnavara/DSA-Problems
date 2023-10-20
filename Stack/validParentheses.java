import java.util.*;

public class validParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        if (n > 0)
            st.push(s.charAt(n - 1));
        int i = n - 2;
        while (i >= 0) {
            if (s.charAt(i) == '(' && !st.isEmpty() && st.peek() == ')') {
                st.pop();
                i--;
            } else if (s.charAt(i) == '{' && !st.isEmpty() && st.peek() == '}') {
                st.pop();
                i--;
            } else if (s.charAt(i) == '[' && !st.isEmpty() && st.peek() == ']') {
                st.pop();
                i--;
            } else {
                st.push(s.charAt(i));
                i--;
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}