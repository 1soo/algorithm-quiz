package practice.ch08.p_04;

import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;

    public static void dfs(int len) {
        if (len == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[len] = i;
                dfs(len + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        arr = new int[m];

        dfs(0);
    }
}