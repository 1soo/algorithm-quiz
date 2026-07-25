package practice.ch06.p_10;

import java.util.*;

public class Main {
    public static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[0], rt = arr[n - 1];

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n, c, arr));
    }
}