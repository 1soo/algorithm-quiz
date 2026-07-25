package practice.ch05.p_06;

import java.util.*;

public class Main {
    public static int solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while(q.size() > 1) {
            for(int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            q.poll();
        }

        return q.poll();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.print(solution(n, k));
    }
}