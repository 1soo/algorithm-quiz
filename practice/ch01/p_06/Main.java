package practice.ch01.p_06;

import java.util.*;

public class Main {
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) answer.append(str.charAt(i));
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}