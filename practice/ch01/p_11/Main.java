package practice.ch01.p_11;

import java.util.*;

public class Main {
    public static String solution (String str) {
        char c = str.charAt(0);
        int cnt = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(c);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) cnt++;
            else {
                if(cnt != 1) sb.append(cnt);
                cnt = 1;

                c = str.charAt(i);
                sb.append(c);
            }
        }

        if(cnt != 1) sb.append(cnt);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}