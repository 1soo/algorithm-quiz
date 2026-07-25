package practice.ch06.p_06;

import java.util.*;

public class Main {
    public static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for(int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) {
                if(sb.length() > 0) {
                    sb.append(" ").append(i + 1);
                }else {
                    sb.append(i + 1);
                }
            }
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