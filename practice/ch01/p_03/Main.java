package practice.ch01.p_03;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        int pos = 0, length = 0;
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > length) {
                pos = i;
                length = strArr[i].length();
            }
        }
        return strArr[pos];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}