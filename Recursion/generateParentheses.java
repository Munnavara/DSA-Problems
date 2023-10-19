package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public static void main(String[] args) {
        int n = 3;
        helperClass hc = new helperClass();
        System.out.println(hc.generateParenthesis(n));
    }
}

class helperClass {
    public static List<String> generateParenthesis(int n) {
        return helper(n, n, n, "", new ArrayList<>());
    }

    public static List<String> helper(int l, int n, int r, String s, List<String> ans) {
        System.out.println(s);
        if (l == 0 && r == 0) {
            ans.add(s);
            System.out.println(s);
            return ans;
        }
        if (l > 0) {
            helper(l - 1, n, r, s + '(', ans);
        }
        if (r > l) {
            helper(l, n, r - 1, s + ')', ans);
        }
        /*
         * else if
         * 
         */
        return ans;
    }
}
