package practice.ch08.p_11;

import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        int answer = 0;
        
        while(!q.isEmpty()) {
            int len = q.size();

            for(int i = 0; i < len; i++) {
                int[] pos = q.poll();
                if(pos[0] == n - 1 && pos[1] == n - 1) return answer;

                arr[pos[0]][pos[1]] = 1;
                if(pos[0] > 0 && arr[pos[0] - 1][pos[1]] != 1) q.offer(new int[]{pos[0] - 1, pos[1]});
                if(pos[0] < n - 1 && arr[pos[0] + 1][pos[1]] != 1) q.offer(new int[]{pos[0] + 1, pos[1]});
                if(pos[1] > 0 && arr[pos[0]][pos[1] - 1] != 1) q.offer(new int[]{pos[0], pos[1] - 1});
                if(pos[1] < n - 1 && arr[pos[0]][pos[1] + 1] != 1) q.offer(new int[]{pos[0], pos[1] + 1});
            }
            answer++;
        }

        return -1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 7;
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(solution(n, arr));
    }
}