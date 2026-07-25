package practice.ch05.p_08;

import java.util.*;

public class Main {
    public static int solution(int n, int m, int[] arr) {
        int idx = m, cnt = 0;

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            q.offer(arr[i]);
        }

        while(true) {
            int now = q.poll();
            boolean flag = true;

            for(int severity : q) {
                if(severity > now) {
                    q.offer(now); 
                    flag = false;
                    break;
                }
            }

            if(flag) {
                cnt++;
                if(idx == 0) break;
            }

            idx--;
            if(idx == -1) idx = q.size() - 1;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, m, arr));
    }
}