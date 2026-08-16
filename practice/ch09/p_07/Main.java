package practice.ch09.p_07;

import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        int v1, v2, dist;

        Edge(int v1, int v2, int dist) {
            this.v1 = v1;
            this.v2 = v2;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge o) {
            return this.dist - o.dist;
        }
    }

    public static int find(int v, int[] uv) {
        if (uv[v] == v)
            return v;
        else
            return uv[v] = find(uv[v], uv);
    }

    public static boolean union(int v1, int v2, int[] uv) {
        int fv1 = find(v1, uv);
        int fv2 = find(v2, uv);
        if (fv1 != fv2) {
            uv[fv1] = uv[fv2];
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] uv = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            uv[i] = i;
        }

        Queue<Edge> q = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int dist = in.nextInt();

            q.offer(new Edge(v1, v2, dist));
        }

        int sum = 0, cnt = 0;
        while (!q.isEmpty()) {
            Edge edge = q.poll();
            if (union(edge.v1, edge.v2, uv)) {
                sum += edge.dist;

                if (++cnt == n - 1)
                    break;
            }
        }

        System.out.println(sum);
    }
}