package practice.ch04.p_02;

import java.util.*;

public class Main {
    public static char solution(int n, String str) {
        int[] arr = new int[5];
        for(char c : str.toCharArray()) {
            arr[c - 'A']++;
        }

        int max = 0, idx = 0;
        for(int i = 0; i < 5; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        return (char)('A' + idx);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        System.out.print(solution(n, str));
    }
}