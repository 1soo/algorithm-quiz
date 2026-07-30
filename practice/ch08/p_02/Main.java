package practice.ch08.p_02;

import java.util.*;

public class Main {
    static int c, n;
    static int[] arr;

    public static int dfs(int idx, int sum) {
        if (sum > c)
            return 0;
        if (idx == n)
            return sum;

        return Math.max(dfs(idx + 1, sum + arr[idx]), dfs(idx + 1, sum));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(dfs(0, 0));
    }
}