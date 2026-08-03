package practice.ch08.p_09;

import java.util.*;

public class Main {
    static int n, m;
    static int[] pm;

    public static void dfs(int len, int idx) {
        if (len == m) {
            for (int i = 0; i < m; i++) {
                if (i > 0)
                    System.out.print(" ");
                System.out.print(pm[i]);
            }
            System.out.println();
        } else {
            for (int i = idx; i <= n; i++) {
                pm[len] = i;
                dfs(len + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        pm = new int[m];

        dfs(0, 1);
    }
}