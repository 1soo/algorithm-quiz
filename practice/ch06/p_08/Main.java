package practice.ch06.p_08;

import java.util.*;

public class Main {
    public static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        
        int lt = 0, rt = n - 1;

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) return mid + 1;
            else if(arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        
        return Arrays.binarySearch(arr, m) + 1;
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