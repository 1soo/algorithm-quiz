package practice.ch04.p_02;

import java.util.*;

public class Main {
    public static String solution(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) - 1);
        }
        
        for(char c : map.keySet()) {
            if(map.get(c) != 0) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.print(solution(str1, str2));
    }
}