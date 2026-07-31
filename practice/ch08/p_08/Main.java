package practice.ch08.p_08;

import java.util.*;

public class Main {
    static int n, f;
    static int[] arr;
    static boolean[] flag;

    static int[] comb;
    static int[][] comb_cache;

    static boolean finish;

    static String answer;

    public static void dfs(int len, int sum) {
        if (finish)
            return;

        if (len == n) {
            if (sum == f) {
                StringBuilder sb = new StringBuilder(String.valueOf(arr[0]));
                for (int i = 1; i < n; i++) {
                    sb.append(" ").append(arr[i]);
                }
                answer = sb.toString();
                finish = true;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int value = sum + (i + 1) * comb[len];
                if (!flag[i] && value <= f) {
                    flag[i] = true;
                    arr[len] = i + 1;
                    dfs(len + 1, value);
                    flag[i] = false;
                }
            }
        }
    }

    public static int combination(int n, int r) {
        if (comb_cache[n][r] > 0)
            return comb_cache[n][r];

        if (n == r || r == 0)
            return 1;
        else
            return comb_cache[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();

        arr = new int[n];
        flag = new boolean[n];

        comb = new int[n];
        comb_cache = new int[n][n];

        for (int i = 0; i < n; i++) {
            comb[i] = combination(n - 1, i);
        }

        dfs(0, 0);

        System.out.print(answer);
    }
}