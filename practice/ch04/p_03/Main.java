package practice.ch04.p_03;

import java.util.*;

public class Main {
    public static String solution(int n, int k, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        int lt = 0, cnt = 0;
        for(int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            cnt++;

            if(cnt == k) {
                if(sb.length() > 0) sb.append(" ");
                sb.append(map.size());

                map.put(arr[lt], map.get(arr[lt]) - 1); 
                if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
                
                cnt--;
                lt++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, k, arr));
    }
}