package practice.ch05.p_04;

import java.util.*;

public class Main {
    public static int calculate(char op, int num1, int num2) {
        if(op == '+') return num1 + num2;
        else if(op == '-') return num1 - num2;
        else if(op == '*') return num1 * num2;
        else return num1 / num2;
    }

    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if('0' <= c && c <= '9') stack.push(c - '0');
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(calculate(c, num1, num2));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.print(solution(str));
    }
}