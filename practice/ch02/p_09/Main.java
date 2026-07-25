package practice.ch02.p_09;

import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        int leftsum = 0, rightsum = 0;
        for(int i = 0; i < n; i++) {
            int rowsum = 0, colsum = 0;
            for(int j = 0; j < n; j++) {
                rowsum += arr[i][j];
                colsum += arr[j][i];

                if(i == j) leftsum += arr[i][j];
                if(i == n - j - 1) rightsum += arr[i][j];
            }
            max = Math.max(max, Math.max(rowsum, colsum));
        }

        return Math.max(max, Math.max(leftsum, rightsum));
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

        System.out.print(solution(n, arr));
    }
}