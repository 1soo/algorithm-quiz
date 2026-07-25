package practice.ch02.p_11;

import java.util.*;

public class Main {
    public static int solution(int n, int grade, int[][] arr) {
        boolean[][] flag = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < grade; j++) {
                int num = arr[i][j];
                for (int k = i + 1; k < n; k++) {
                    if(num == arr[k][j]) {
                        flag[i][k] = flag[k][i] = true;
                    }
                }
            }
        }

        int idx = -1, max = -1;
        for(int i = 0; i < n; i++) {
           int sum = 0;
           for(int j = 0; j < n; j++) {
               if(flag[i][j]) sum++;
           }
           if(sum > max) {
               idx = i;
               max = sum;
           }
        }

        return idx + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grade = 5;

        int[][] arr = new int[n][grade];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < grade; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(solution(n, grade, arr));
    }
}