package practice.ch08.p_17;

import java.util.*;

public class Main {

    static int n, m;
    static int[] arr, show;

    public static void dfs(int l, int s) {
        if(l == m) {
            for(int x : show) System.out.print(x + " ");
            System.out.println();
        }else {
            for(int i = s; i <= n; i++) {
                show[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }
    

    public static void solution() {
        show = new int[m];

        dfs(0, 1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        solution();
    }
}