package Recursion;

import java.util.*;

public class subsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> up = new ArrayList<Integer>();
        for (int num : nums) {
            up.add(num);
        }
        per(new ArrayList<>(), up, ans, 0);
        return ans;
    }

    public static void per(List<Integer> p, List<Integer> up, List<List<Integer>> ans, int i) {
        if (i == up.size()) {
            ans.add(new ArrayList<>(p));
            return;
        }
        int num = up.get(i);
        p.add(num);
        per(p, up, ans, i + 1);
        p.remove(p.size() - 1);
        per(p, up, ans, i + 1);

    }
}
