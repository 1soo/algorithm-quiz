package practice.ch01.p_05;

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        char[] answer = str.toCharArray();
        int lt = 0, rt = answer.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(answer[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(answer[rt])) {
                rt--;
            } else {
                char tmp = answer[lt];
                answer[lt] = answer[rt];
                answer[rt] = tmp;

                lt++;
                rt--;
            }
        }
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}