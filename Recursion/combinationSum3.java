package Recursion;

import java.util.*;

public class combinationSum3 {
    public static List<List<Integer>> combinationSum(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k, n, 0, 1, new ArrayList<>(), ans);
        return ans;
    }

    public static void helper(int k, int n, int sum, int ind, List<Integer> p,
            List<List<Integer>> ans) {

        if (k == 0) {
            if (sum == n) {
                ans.add(new ArrayList<>(p));
            }
            return;
        }
        if (ind == 10) {
            return;
        }
        if ((sum + ind) <= n) {
            p.add(ind);
            helper(k - 1, n, sum + ind, ind + 1, p, ans);
            p.remove(p.size() - 1);
        }
        helper(k, n, sum, ind + 1, p, ans);
    }
    // public static List<List<Integer>> combinationSum(int k, int n) {
    // List<List<Integer>> ans = new ArrayList<>();
    // combination(ans, new ArrayList<Integer>(), k, 1, n);
    // return ans;
    // }

    // private static void combination(List<List<Integer>> ans, List<Integer> comb,
    // int k, int start, int n) {
    // if (comb.size() == k && n == 0) {
    // List<Integer> li = new ArrayList<Integer>(comb);
    // ans.add(li);
    // return;
    // }
    // for (int i = start; i <= 9; i++) {
    // comb.add(i);
    // combination(ans, comb, k, i + 1, n - i);
    // comb.remove(comb.size() - 1);
    // }
    // }

    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum(3, 7);
        System.out.println(ans);
    }
}