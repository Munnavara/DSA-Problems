package Recursion;

// import java.util.*;

public class printN {
    public static void n_print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        n_print(n - 1);
        System.out.println(n);
    }

    public static void main(String args[]) {
        int n = 4;
        n_print(n);
    }
}