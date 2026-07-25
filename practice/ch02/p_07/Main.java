package practice.ch02.p_07;

import java.util.*;

public class Main {
    public static int solution(int n, int[] arr) {
        int sum = 0, now = 0;

        for(int i = 0; i < n; i++) {
            now = arr[i] * (now + arr[i]);
            sum += now;
        }

        return sum;
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