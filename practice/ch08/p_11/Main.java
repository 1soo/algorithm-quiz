package practice.ch08.p_11;

import java.util.*;

public class Main {
    static int n;
    static int[] dy = { -1, 0, 1, 0 }, dx = { 0, 1, 0, -1 };
    static int[][] miro;

    public static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        int answer = 0;
        q.offer(new int[] { 0, 0 });

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] point = q.poll();

                for (int j = 0; j < 4; j++) {
                    int py = point[0] + dy[j], px = point[1] + dx[j];
                    if (py == n - 1 && px == n - 1)
                        return answer + 1;
                    else if (py >= 0 && px >= 0 && py < n && px < n && miro[py][px] == 0) {
                        miro[py][px] = 2;
                        q.offer(new int[] { py, px });
                    }
                }
            }
            answer++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = 7;
        miro = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                miro[i][j] = in.nextInt();
            }
        }
        miro[0][0] = 1;
        System.out.println(bfs());
    }
}