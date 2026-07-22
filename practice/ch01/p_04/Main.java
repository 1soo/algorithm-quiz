package practice.ch01.p_04;

import java.util.Scanner;

public class Main {
    public static String[] solution(int cnt, String[] strArr) {
        String[] answer = new String[cnt];

        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            char[] charArr = strArr[i].toCharArray();

            for (int j = 0; j < len; j++) {
                if (j >= len / 2)
                    break;

                char tmp = charArr[j];
                charArr[j] = charArr[len - j - 1];
                charArr[len - j - 1] = tmp;
            }

            answer[i] = String.valueOf(charArr);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();

        String[] strArr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            strArr[i] = in.next();
        }

        for (String arr : solution(cnt, strArr)) {
            System.out.println(arr);
        }
    }
}