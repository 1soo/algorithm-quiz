package practice.ch09.p_05;

import java.util.*;

public class Main {

    static class Edge implements Comparable<Edge> {
        int dst, val;

        Edge(int dst, int val) {
            this.dst = dst;
            this.val = val;
        }

        @Override
        public int compareTo(Edge o) {
            return this.val - o.val;
        }
    }

    public static int[] solution(int n, List<List<Edge>> graph) {
        Queue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(0, 0));

        int[] dist = new int[n];
        for (int i = 1; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;

        while (!queue.isEmpty()) {
            Edge edge = queue.poll();

            if (dist[edge.dst] < edge.val)
                continue;

            for (Edge next : graph.get(edge.dst)) {
                if (dist[next.dst] > dist[edge.dst] + next.val) {
                    dist[next.dst] = dist[edge.dst] + next.val;
                    queue.offer(next);
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int src = in.nextInt();
            int dst = in.nextInt();
            int val = in.nextInt();
            graph.get(src - 1).add(new Edge(dst - 1, val));
        }

        int[] result = solution(n, graph);

        for (int i = 1; i < n; i++) {
            System.out.println((i + 1) + " : " + (result[i] == Integer.MAX_VALUE ? "impossible" : result[i]));
        }

    }
}