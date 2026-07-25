package practice.ch03.p_01;

import java.util.*;

public class Main {
    public static String solution(int n1, int[] arr1, int n2, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        int idx1 = 0, idx2 = 0;
        while(idx1 != n1 || idx2 != n2) {
            if(idx1 == n1 || arr1[idx1] > arr2[idx2]) {
                sb.append(arr2[idx2++]);
            }else if(idx2 == n2 || arr1[idx1] <= arr2[idx2]){
                sb.append(arr1[idx1++]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.print(solution(n1, arr1, n2, arr2));
    }
}