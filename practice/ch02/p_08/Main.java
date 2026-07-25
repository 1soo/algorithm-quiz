package practice.ch02.p_08;

import java.util.*;

public class Main {
    public static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        
        Map <Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        int cnt = 1, prev = -1;

        for(int i = n - 1; i >= 0; i--) {
            if(tmp[i] == prev) continue;

            List<Integer> list = map.get(tmp[i]);
            for(int idx : list) arr[idx] = cnt;
            cnt += list.size();
            prev = tmp[i];
        }

        for(int i = 0; i < n; i++) {
            if(i > 0) sb.append(" ");
            sb.append(arr[i]);
        }

        return sb.toString();
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