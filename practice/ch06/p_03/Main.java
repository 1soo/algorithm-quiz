package practice.ch06.p_03;

import java.util.*;

public class Main {
    public static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }else break;
            }
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