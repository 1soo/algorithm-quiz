package practice.ch05.p_05;

import java.util.*;

public class Main {
    public static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        char before = 0;

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                answer +=  before == '(' ? stack.size() : 1;
            }
            before = c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(solution(str));
    }
}