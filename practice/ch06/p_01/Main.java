package practice.ch06.p_01;

import java.util.*;

public class Main {
    public static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            int idx = i;
            for(int j = i; j < n; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
            
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