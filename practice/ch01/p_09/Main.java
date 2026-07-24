package practice.ch01.p_09;

import java.util.*;

public class Main {
    public static int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}