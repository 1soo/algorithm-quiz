package practice.ch10.p_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] dy = new int[m + 1];
        for(int i = 0; i < n; i++) {
            int s = in.nextInt();
            int t = in.nextInt();

            for(int j = m; j >= t; j--) {
                if(dy[j - t] + s > dy[j]) dy[j] = dy[j - t] + s;
            }
        }

        System.out.println(dy[m]);
    }
}