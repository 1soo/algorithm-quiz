package practice.ch08.p_02;

import java.util.*;

public class Main {
    public static int dfs(int c, int n, int[] arr, int idx, int sum) {
        if(idx == n) return sum;

        if(sum + arr[idx] <= c) return Math.max(dfs(c, n, arr, idx + 1, sum + arr[idx]), dfs(c, n, arr, idx + 1, sum));
        else return dfs(c, n, arr, idx + 1, sum);
    }

    public static int solution(int c, int n, int[] arr) {
        return dfs(c, n, arr, 0, 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int c = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(c, n, arr));
    }
}