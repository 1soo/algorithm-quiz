package practice.ch02.p_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prev = in.nextInt();
        StringBuilder result = new StringBuilder(String.valueOf(prev));

        for (int i = 0; i < n - 1; i++) {
            int now = in.nextInt();
            if(now > prev) result.append(" ").append(String.valueOf(now));
            prev = now;
        }

        System.out.println(result);
    }
}