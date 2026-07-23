package practice.ch02.p_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = 0, max = 0;

        for (int i = 0; i < n; i++) {
            int now = in.nextInt();
            if(now > max) {
                result++;
                max = now;
            }
        }

        System.out.print(result);
    }
}