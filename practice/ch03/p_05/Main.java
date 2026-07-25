package practice.ch03.p_05;

import java.util.*;

public class Main {
    public static int solution(int n) {
        int answer = 0, sum = 0, lt = 1;

        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if (sum == n) answer++;

            while (sum >= n) {
                sum -= lt++;
                if(sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print(solution(n));
    }
}