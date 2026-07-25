package practice.ch02.p_10;

import java.util.*;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                int num = arr[i][j];
                if(num > arr[i - 1][j]
                    && num > arr[i + 1][j]
                    && num > arr[i][j - 1]
                    && num > arr[i][j + 1]
                ) answer++;
                
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n + 2][n + 2];
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(solution(n, arr));
    }
}