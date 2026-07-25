package practice.ch05.p_01;

import java.util.*;

public class Main {
    public static String solution(String str) {
        int result = 0;
        for(char c : str.toCharArray()) {
            result += c == '(' ? 1 : -1;
            if(result == -1) return "NO";
        }

        return result == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(solution(str));
    }
}