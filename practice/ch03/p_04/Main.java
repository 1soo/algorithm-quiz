package practice.ch03.p_04;

import java.util.*;

public class Main {
    public static int solution(int n, int target, int[] arr) {
        int cnt = 0;
        int lt = 0, sum = 0;

        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == target) cnt++;

            while(sum >= target) {
                sum -= arr[lt++];
                if(sum == target) cnt++;
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, target, arr));
    }
}