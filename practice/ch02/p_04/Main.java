package practice.ch02.p_04;

import java.util.*;

public class Main {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int first = 1, second = 1;

        sb.append(first).append(" ").append(second);

        for (int i = 3; i <= n; i++) {
            int tmp = second;
            second = first + second;
            first = tmp;
            sb.append(" ").append(second);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print(solution(n));
    }
}