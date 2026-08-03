package practice.ch08.p_12;

import java.util.*;

public class Main {
    static class Point {
        int y;
        int x;

        Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static int bfs(int n, int m, int[][] box, Queue<Point> q) {
        int[] dy = { -1, 0, 1, 0 }, dx = { 0, 1, 0, -1 };
        int days = -1;

        do {
            days++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point p = q.poll();

                for (int j = 0; j < 4; j++) {
                    int py = p.y + dy[j], px = p.x + dx[j];
                    if (py >= 0 && px >= 0 && py < n && px < m && box[py][px] == 0) {
                        box[py][px] = 1;
                        q.offer(new Point(py, px));
                    }
                }
            }
        } while (!q.isEmpty());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0)
                    return -1;
            }
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] box = new int[n][m];

        Queue<Point> q = new LinkedList<>();

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = in.nextInt();
                if (box[i][j] == 1)
                    q.offer(new Point(i, j));
                else if (box[i][j] == 0)
                    flag = true;
            }
        }
        if (flag)
            System.out.println(bfs(n, m, box, q));
        else
            System.out.println(0);

    }
}