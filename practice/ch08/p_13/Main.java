package practice.ch08.p_13;

import java.util.*;

public class Main {
    static boolean[][] checked;
    
    public static boolean bfs(int count, int n, int[][] arr) {
        boolean flag = false;
        int[] start = new int[2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!checked[i][j] && arr[i][j] == 1) {
                    start[0] = i;
                    start[1] = j;
                    checked[i][j] = true;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }

        if(!flag) return flag;

        Queue<int[]> q = new LinkedList<>();
        q.offer(start);

        int[][] dir = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        
        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                int[] point = q.poll();

                for(int j = 0; j < 8; j++) {
                    int dy = point[0] + dir[j][0];
                    int dx = point[1] + dir[j][1];

                    if(dx >= 0 && dy >= 0 && dx < n && dy < n && !checked[dy][dx] && arr[dy][dx] == 1) {
                        checked[dy][dx] = true;
                        arr[dy][dx] = count;
                        q.offer(new int[]{dy, dx});
                    }
                }
            }
        }

        return flag;
    }
    
    public static int solution(int n, int[][] arr) {
        int count = 0;
        checked = new boolean[n][n];
        
        while(bfs(++count, n, arr)) {}

        return count - 1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(solution(n, arr));
    }
}