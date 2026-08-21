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

        for(int i = 0; i < n; i++) {
            dy[arr[i]] = 1;
            for(int j = arr[i] + 1; j <= m; j++) {
                
            }
        }

    }
}

/*
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
0 0 1 2 2 3 3 4 4 5 5  6  6  7  7  8
0 0 0 0 0 1 2 2 3 3 2  3  3  4  4  3
*/