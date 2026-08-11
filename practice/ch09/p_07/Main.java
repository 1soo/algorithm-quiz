package practice.ch09.p_07;

import java.util.*;

public class Main {
    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if(ra != rb) unf[ra] = rb;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        unf = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        
        for(int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            union(a, b);
        }

        int v1 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println(find(v1) == find(v2) ? "YES" : "NO");
    }
}