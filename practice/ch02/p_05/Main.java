package practice.ch02.p_05;

import java.util.*;

public class Main {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0)
                answer++;
            for (int j = i; j <= n; j = j + i)
                arr[j] = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print(solution(n));
    }
}