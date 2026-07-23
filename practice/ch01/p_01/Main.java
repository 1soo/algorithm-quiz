package practice.ch01.p_01;

import java.util.Scanner;

public class Main {
    public static int solution(String str, char c) {
        int answer = 0;

        for (char n : str.toCharArray()) {
            if (c == n)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        char c = Character.toLowerCase(in.next().charAt(0));

        System.out.println(solution(str, c));
    }
}