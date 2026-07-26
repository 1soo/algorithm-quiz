package practice.ch08.p_12;

import java.util.*;

public class Main {
    public static int solution(int m, int n, int[][] arr) {
        Queue<int[]> q = new LinkedList<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] != 0) {
                    cnt++;
                    if(arr[i][j] == 1) q.offer(new int[]{i, j});
                }
            }
        }

        if(cnt == m * n) return 0;

        int days = -1;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] pos = q.poll();
                int y = pos[0], x = pos[1];
                
                if(y > 0 && arr[y - 1][x] == 0) {
                    q.offer(new int[]{y - 1, x});
                    arr[y - 1][x] = 1;
                    cnt++;
                }

                if(y < n - 1 && arr[y + 1][x] == 0) {
                    q.offer(new int[]{y + 1, x});
                    arr[y + 1][x] = 1;
                    cnt++;
                }

                if(x > 0 && arr[y][x - 1] == 0) {
                    q.offer(new int[]{y, x - 1});
                    arr[y][x - 1] = 1;
                    cnt++;
                }

                if(x < m - 1 && arr[y][x + 1] == 0) {
                    q.offer(new int[]{y, x + 1});
                    arr[y][x + 1] = 1;
                    cnt++;
                }
            }
            days++;
        }
        return cnt != m * n ? -1 : days;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int [n][m];
        
        for(int i= 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
            
        System.out.println(solution(m, n, arr));
    }
}