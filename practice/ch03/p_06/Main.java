package practice.ch03.p_06;

import java.util.*;

public class Main {
    public static int solution(int n, int k, int[] arr) {
        int max = 0, lt = 0, cnt = 0;

        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }

            max = Math.max(max, rt - lt + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, k, arr));
    }
}