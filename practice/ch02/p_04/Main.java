package practice.ch02.p_04;

import java.util.*;

public class Main {
    public static String solution(int n, int[] a, int[] b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) {
                sb.append("D");
            }else if(a[i] == 3) {
                sb.append(b[i] == 1 ? "B" : "A");
            }else if(b[i] == 3) {
                sb.append(a[i] == 1 ? "A" : "B");
            }else {
                sb.append(a[i] > b[i] ? "A" : "B");
            }
            sb.append("\n");
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n], b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        System.out.print(solution(n, a, b));
    }
}