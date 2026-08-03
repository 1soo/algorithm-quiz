package practice.ch08.p_14;

import java.util.*;

public class Main {
    static int n;
    static int[] dy = { 1, 1, 0, -1, -1, -1, 0, 1 }, dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
    static int[][] map;

    static class Point {
        int y;
        int x;

        Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void bfs(int y, int x) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(y, x));

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point p = q.poll();
                for (int j = 0; j < 8; j++) {
                    int py = p.y + dy[j], px = p.x + dx[j];
                    if (py >= 0 && px >= 0 && py < n && px < n && map[py][px] == 1) {
                        map[py][px] = 0;
                        q.offer(new Point(py, px));
                    }
                }
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

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    bfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }
}