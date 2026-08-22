package practice.ch10.p_06;

import java.util.*;

public class Main {
    static class S{
        int score, time;

        S (int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        S[] arr = new S[n];
        int[][] dy = new int[n][m + 1];

        for(int i = 0; i < n; i++) {
            int score = in.nextInt();
            int time = in.nextInt();
            arr[i] = new S(score, time);
        }

        for(int i = arr[0].time; i <= m; i++) {
            dy[0][i] = arr[0].score;
        }

        for(int i = 1; i < n; i++) {
            for(int j = arr[i].time; j <= m; j++) {
                int max = 0;
                for(int k = 0; k < i; k++) {
                    int temp = dy[k][j - arr[i].time];
                    if(temp > max) max = temp;
                }
                dy[i][j] = max + arr[i].score;
            }
        }

        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(dy[i][m] > answer) answer = dy[i][m];
        }
        System.out.println(answer);
    }
}