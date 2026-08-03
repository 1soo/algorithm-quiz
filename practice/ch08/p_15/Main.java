package practice.ch08.p_15;

import java.util.*;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static List<Point> houses = new ArrayList<>(), pizzas = new ArrayList<>();

    static class Point {
        int y, x;

        Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        public int calc(Point point) {
            return Math.abs(point.y - this.y) + Math.abs(point.x - this.x);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
                if (map[i][j] == 1)
                    houses.add(new Point(i, j));
                else if (map[i][j] == 2)
                    pizzas.add(new Point(i, j));
            }
        }

        System.out.println(answer);
    }
}