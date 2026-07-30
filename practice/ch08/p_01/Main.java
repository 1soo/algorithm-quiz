package practice.ch08.p_01;

import java.util.*;

public class Main {

    static int n;
    static int[] arr;
    static int cnt = 0;

    public static boolean solution(int sum, int idx) {
        if (idx == n)
            return sum == 0;

        return solution(sum + arr[idx], idx + 1) || solution(sum - arr[idx], idx + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(0, 0) ? "YES" : "NO");
    }
}