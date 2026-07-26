package practice.ch08.p_01;

import java.util.*;

public class Main {

    static int sum;

    public static boolean dfs(int n, int[] arr, int idx){
        if(idx == n) return sum == 0;

        sum += arr[idx];
        boolean result1 = dfs(n, arr, idx + 1);
        sum -= 2 * arr[idx];
        boolean result2 = dfs(n, arr, idx + 1);
        sum += arr[idx];
        return result1 || result2;
    }

    public static String solution(int n, int[] arr) {  
        return dfs(n, arr, 0) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, arr));
    }
}