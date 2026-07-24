package practice.ch01.p_08;

import java.util.*;

public class Main {
    public static String solution(String str) {
        int lt = 0, rt = str.length() - 1;
        boolean isLt = true;
        str = str.toLowerCase();

        while (lt < rt) {
            if (!Character.isAlphabetic(str.charAt(lt))) {
                isLt = true;
                lt++;
            } else if (!Character.isAlphabetic(str.charAt(rt))) {
                isLt = false;
                rt--;
            } else {
                if (str.charAt(lt) != str.charAt(rt))
                    return "NO";
                lt++;
                rt--;
                isLt = true;
            }
        }

        return isLt ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}