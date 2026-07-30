package practice.ch08.p_03;

import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr;

    public static int dfs(int idx, int score, int time) {
        if (idx == n)
            return score;

        if (time + arr[idx][1] > m)
            return dfs(idx + 1, score, time);
        else
            return Math.max(dfs(idx + 1, score + arr[idx][0], time + arr[idx][1]), dfs(idx + 1, score, time));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        System.out.println(dfs(0, 0, 0));
    }
}