package practice.ch07.p_01;

import java.util.*;

public class Main {
    public static int solution(int s, int e) {
        Queue<Integer> q = new LinkedList<>();        
        int[] moves = {1, -1, 5};

        boolean[] flag = new boolean[10001];
        flag[s] = true;
        q.offer(s);
        int step = 0;

        while(!q.isEmpty()) {
            int len = q.size();
            for(int i= 0; i < len; i++) {
                int pos = q.poll();
                
                for(int j = 0; j < 3; j++) {
                    int point = pos + moves[j];
                    if (point == e) return step + 1;

                    if(point > 0 && point <= 10000 && !flag[point]) {
                        flag[point] = true;
                        q.offer(point);
                    }
                }
            }
            step++;
        }        
        
        return step;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int s = in.nextInt();
        int e = in.nextInt();

        System.out.print(solution(s, e));
    }
}