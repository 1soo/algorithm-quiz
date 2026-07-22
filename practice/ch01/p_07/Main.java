package practice.ch01.p_07;

import java.util.*;

public class Main {
    public static String solution (String str) {
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        return str1.equalsIgnoreCase(str2) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}