package Recursion;

import java.util.*;

public class permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = permute(arr);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> up = new ArrayList<Integer>();
        for (int num : nums) {
            up.add(num);
        }
        ans = per(new ArrayList<>(), up, ans, nums.length);
        return ans;
    }

    public static List<List<Integer>> per(List<Integer> p, List<Integer> up, List<List<Integer>> ans, int n) {
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        int num = up.get(0);
        for (int i = 0; i <= p.size(); i++) {
            List<Integer> f = p.subList(0, i);
            List<Integer> s = p.subList(i, p.size());
            f.add(num);
            for (int x : s)
                f.add(x);
            per(f, up.subList(i, p.size()), ans, n);
        }
        return ans;
    }
}
