package practice.ch08.p_04;

import java.util.*;

public class Main {
    public static int dfs(int n, int m, int[][] arr, int score, int idx) {
        if(idx == n) return score;

        if(m - arr[idx][1] >= 0) return Math.max(dfs(n, m - arr[idx][1], arr, score + arr[idx][0], idx + 1), 
                                       dfs(n, m, arr, score, idx + 1));
        else return dfs(n, m, arr, score, idx + 1);
    }
    
    public static int solution(int n, int m, int[][] arr) {
        return dfs(n, m, arr, 0, 0);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        
        System.out.println(solution(n, m, arr));
    }
}