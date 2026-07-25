package practice.ch04.p_05;

import java.util.*;

public class Main {
    public static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int l = j + 1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : tSet) {
            cnt++;
            if(cnt == k) return x;
        }
        return -1;
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