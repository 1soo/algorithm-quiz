package practice.ch08.p_16;

import java.util.*;

public class Main {

    static int n, m;
    static int[] arr, chk, show;

    public static void dfs(int len) {
        if(len == m) {
            for(int x : show) System.out.print(x + " ");
            System.out.println();
        }else {
            for(int i= 0; i < n; i++) {
                if(chk[i] == 0){
                    chk[i] = 1;
                    show[len] = arr[i];
                    dfs(len + 1);
                    chk[i] = 0;
                }
            }
        }
    }

    public static void solution() {
        chk = new int[n];
        show = new int[m];

        dfs(0);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        solution();
    }
}