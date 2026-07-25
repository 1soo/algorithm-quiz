package practice.ch06.p_07;

import java.util.*;

public class Main {
    public static String solution(int n, int[][] arr) {
        StringBuilder sb = new StringBuilder();

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        list.sort((a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        for(int[] tmp : list) {
            sb.append(tmp[0]).append(" ").append(tmp[1]).append("\n");
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        System.out.print(solution(n, arr));
    }
}