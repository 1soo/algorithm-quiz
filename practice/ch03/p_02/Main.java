package practice.ch03.p_02;

import java.util.*;

public class Main {
    public static String solution(int n1, int[] arr1, int n2, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while (p1 < n1 && p2 < n2) {
            if(arr1[p1] == arr2[p2]) {
                if(sb.length() > 0) sb.append(" ");
                sb.append(arr1[p1]);
                p1++;
                p2++; 
            }else if(arr1[p1] > arr2[p2]) {
                p2++;
            }else {
                p1++;
            }
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