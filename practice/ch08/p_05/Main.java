package practice.ch08.p_05;

import java.util.*;

public class Main {
    static int n, result = Integer.MAX_VALUE;
    static int[] arr;

    public static void dfs(int mod, int cnt) {
        for (int i = 0; i < n; i++) {
            if (arr[i] <= mod) {
                int tmp_mod = mod % arr[i];
                int tmp_cnt = cnt + mod / arr[i];

                if (tmp_mod == 0)
                    result = Math.min(result, tmp_cnt);
                else
                    dfs(tmp_mod, tmp_cnt);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        dfs(m, 0);
        System.out.println(result);
    }
}