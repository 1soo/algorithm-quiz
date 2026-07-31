package practice.ch08.p_07;

import java.util.*;

public class Main {
    static int[][] memo;

    public static int dfs(int n, int r) {
        if (memo[n][r] > 0)
            return memo[n][r];

        if (n == r || r == 0)
            return 1;
        else
            return memo[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        memo = new int[n + 1][r + 1];

        System.out.println(dfs(n, r));
    }
}