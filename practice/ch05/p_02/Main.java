package practice.ch05.p_02;

import java.util.*;

public class Main {
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else if(c == ')') stack.pop();
            else {
                if(stack.isEmpty()) sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        System.out.print(solution(str));
    }
}