package practice.ch01.p_10;

import java.util.*;

public class Main {
    public static String solution (String str) {
        String[] strArr = str.split(" ");
        
        String s = strArr[0];
        char t = strArr[1].charAt(0);
        int[] result = new int[s.length()];

        int l = s.length(), r = s.length();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                l = 0;
            }else if(result[i] > ++l || result[i] == 0) {
                result[i] = l;
            }

            int rp = s.length() - i - 1;
            if (s.charAt(rp) == t) {
                r = 0;
            }else if(result[rp] > ++r || result[rp] == 0) {
                result[rp] = r;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            sb.append(result[i]);
            if(i < s.length() - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}