package practice.ch08.p_10;

import java.util.*;

public class Main {
    static int n, answer;
    static int[] dy = { -1, 0, 1, 0 }, dx = { 0, 1, 0, -1 };
    static int[][] miro;

    public static void dfs(int y, int x) {
        if (y == n - 1 && x == n - 1) {
            answer++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int py = y + dy[i], px = x + dx[i];
            if (py >= 0 && px >= 0 && py < n && px < n && miro[py][px] == 0) {
                miro[py][px] = 1;
                dfs(py, px);
                miro[py][px] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = 7;
        miro = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                miro[i][j] = in.nextInt();
            }
        }

        miro[0][0] = 1;

        dfs(0, 0);
        System.out.println(answer);
    }
}