package practice.ch08.p_13;

import java.util.*;

public class Main {
    static int n;
    static int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 }, dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
    static int[][] map;

    public static void dfs(int y, int x) {
        for (int i = 0; i < 8; i++) {
            int py = y + dy[i], px = x + dx[i];
            if (py >= 0 && px >= 0 && py < n && px < n && map[py][px] == 1) {
                map[py][px] = 0;
                dfs(py, px);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(cnt);
    }
}