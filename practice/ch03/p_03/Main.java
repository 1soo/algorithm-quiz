package practice.ch03.p_03;

import java.util.*;

public class Main {
    public static int solution(int n, int duration, int[] arr) {
        int max = 0;
        for(int i = 0; i < duration; i++) {
            max += arr[i];
        }

        int prevSum = max;
        for(int i = 0; i < n - duration; i++) {
            prevSum = prevSum - arr[i] + arr[i + duration];
            max = Math.max(max, prevSum);
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int duration = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, duration, arr));
    }
}