package practice.ch02.p_06;

import java.util.*;

public class Main {
    public static String solution(int n, int[] arr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
            int num = Integer.valueOf(sb.reverse().toString());
            if (num == 1)
                continue;

            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                if (answer.length() > 0)
                    answer.append(" ");
                answer.append(num);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, arr));
    }
}