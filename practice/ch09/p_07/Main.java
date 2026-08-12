package practice.ch09.p_07;

import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        int node, dist;

        Edge(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge o) {
            return this.dist - o.dist;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Queue<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new PriorityQueue<>());
        }

        for (int i = 0; i < m; i++) {
            int start = in.nextInt();
            int node = in.nextInt();
            int dist = in.nextInt();
            graph.get(start).offer(new Edge(node, dist));
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!graph.get(i).isEmpty())
                sum += graph.get(i).poll().dist;
        }
        System.out.println(sum);
    }
}