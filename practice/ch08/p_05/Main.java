package practice.ch08.p_05;

import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;

    public static int dfs(int sum, int cnt) {
        if (sum == m)
            return cnt;
        else {
            for (int i = n - 1; i >= 0; i--) {
                if (sum + arr[i] <= m) {
                    return dfs(sum + arr[i], cnt + 1);
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        m = in.nextInt();

        System.out.println(dfs(0, 0));
    }
}