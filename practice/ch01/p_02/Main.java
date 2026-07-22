package practice.ch01.p_02;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        char[] chArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            chArr[i] += str.charAt(i) > 96 ? -32 : 32;
        }

        return String.valueOf(chArr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}