package practice.ch10.p_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] dy = new int[m + 1];
        for(int i = 1; i <= m; i++) {
            dy[i]  = m + 1;
        }

        for(int i = 0; i < n; i++) {
            dy[arr[i]] = 1;
            for(int j = arr[i] + 1; j <= m; j++) {
                int val = dy[j - arr[i]] + 1;
                if(val < dy[j]) dy[j] = val;
            }
        }

        System.out.println(dy[m]);
    }
}