package practice.ch01.p_12;

import java.util.*;

public class Main {
    public static String solution (int num, String str) {
        StringBuilder sb = new StringBuilder(num);
        str = str.replace('#', '1').replace('*', '0');

        for (int i = 0; i < num; i++) {
            sb.append((char) Integer.parseInt(str.substring(i * 7, (i + 1) * 7), 2));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        System.out.println(solution(num, str));
    }
}