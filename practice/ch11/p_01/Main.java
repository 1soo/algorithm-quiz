package practice.ch11.p_01;

import java.util.*;

public class Main {
    static int m, n;
    static int[] dy = {1, 0, -1, 0}, dx = {0, 1, 0, -1};
    static int[][] table;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        int k = in.nextInt();

        table = new int[m][n];

        for(int i1 = 0; i1 < k; i1++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            for(int i2 = x1; i2 < x2; i2++) {
                for(int i3 = y1; i3 < y2; i3++) {
                    table[i3][i2] = 1;
                }
            }
        }

        List<Integer> s = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(table[i][j] == 0) {
                    table[i][j] = 1;
                    s.add(dfs(1, i, j));
                }
            }
        }

        System.out.println(s.size());
        s.sort(Comparator.naturalOrder());
        for(int num : s) {
            System.out.print(num + " ");
        }
    }

    public static int dfs(int cnt, int y, int x) {
        int rv = cnt;

        for(int i = 0; i < 4; i++) {
            int py = y + dy[i], px = x + dx[i];
            if(py >= 0 && px >= 0 && py < m && px < n && table[py][px] == 0) {
                table[py][px] = 1;
                rv += dfs(1, py, px);
            }
        }

        return rv;
    }
}