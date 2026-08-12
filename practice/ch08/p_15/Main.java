package practice.ch08.p_15;

import java.util.*;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static int[] pm;
    static int[][] dist_map;
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

        public String toString() {
            return "(" + this.y + "," + this.x + ")";
        }
    }

    public static void combination(int len, int idx) {
        if (len == m) {
            int city_dist = 0;
            for (int i = 0; i < houses.size(); i++) {
                int house_dist = Integer.MAX_VALUE;
                for (int j = 0; j < m; j++) {
                    if (dist_map[i][pm[j]] == 0)
                        dist_map[i][pm[j]] = houses.get(i).calc(pizzas.get(pm[j]));
                    house_dist = Math.min(house_dist, dist_map[i][pm[j]]);
                }
                city_dist += house_dist;
            }
            answer = Math.min(answer, city_dist);
        } else {
            for (int i = idx; i < pizzas.size(); i++) {
                pm[len] = i;
                combination(len + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];

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

        dist_map = new int[houses.size()][pizzas.size()];
        combination(0, 0);

        System.out.println(answer);
    }
}