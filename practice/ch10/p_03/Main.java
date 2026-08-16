package practice.ch10.p_03;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), global_max = 1;

        int[] arr = new int[n];
        int[] dy = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            dy[i] = 1;
        }

        int arr_max = arr[n - 1];
    
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > arr_max) {
                arr_max = arr[i];
                continue;
            }

            for(int j = i + 1; j < n; j++) {
                if(arr[i] < arr[j] && dy[j] + 1 > dy[i]) {
                    dy[i] = dy[j] + 1;
                    if(dy[i] > global_max) global_max = dy[i];
                }
            }
        }

        System.out.println(global_max);
    }
}