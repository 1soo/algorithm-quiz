package practice.ch05.p_07;

import java.util.*;

public class Main {
    public static String solution(String s1, String s2) {
        Queue<Character> q = new LinkedList<>();
        for(char c : s1.toCharArray()) q.offer(c);

        for(char c : s2.toCharArray()) {
            if(q.contains(c)) if(q.poll() != c) return "NO";
        }
        
        return q.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.print(solution(s1, s2));
    }
}