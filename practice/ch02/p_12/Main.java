package practice.ch02.p_12;

import java.util.*;

public class Main {

    public static boolean isSuper(int src, int dst, int cnt, int n, int[][] arr) {
        for(int k = 1; k < cnt; k++) {
            for(int l = 0; l < n; l++) {
                if(arr[k][l] == src) break;
                else if (arr[k][l] == dst) return false;
            }
        }
        return true;
    }

    public static int solution(int cnt, int n, int[][] arr) {
        int answer = 0;

        for(int i = 0; i < n - 1; i++) {
            int man = arr[0][i];
            for(int j = i + 1; j < n; j++) {
                if(isSuper(man, arr[0][j], cnt, n, arr)) answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = in.nextInt();

        int[][] arr = new int[cnt][n];
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(solution(cnt, n, arr));
    }
}