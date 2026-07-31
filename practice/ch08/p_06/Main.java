package practice.ch08.p_06;

import java.util.*;

public class Main {
    static int n, m;
    static int[] arr, pm;
    static boolean[] checked;

    public static void dfs(int len) {
        for (int i = 0; i < n; i++) {
            if (len < m && !checked[i]) {
                pm[len] = arr[i];
                checked[i] = true;

                if (len + 1 == m) {
                    for (int j = 0; j < m; j++)
                        System.out.print(pm[j] + " ");
                    System.out.println();
                } else {
                    dfs(len + 1);
                }

                checked[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n];
        checked = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        pm = new int[m];

        dfs(0);
    }
}