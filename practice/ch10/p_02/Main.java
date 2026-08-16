package practice.ch10.p_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] dy = new int[n];
        dy[0] = 1;
        dy[1] = 2;

        for (int i = 2; i < n; i++)
            dy[i] = dy[i - 1] + dy[i - 2];

        System.out.println(dy[n - 1]);
    }
}