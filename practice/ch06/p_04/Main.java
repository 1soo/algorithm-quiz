package practice.ch06.p_04;

import java.util.*;

public class Main {
    public static String solution(int s, int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        
        List<Integer> list = new ArrayList<>(s);
        for(int i = 0; i < s; i++) {
            list.add(0);
        }

        for(int i = 0; i < n; i++) {
            if(!list.contains(arr[i])) {
                list.add(0, arr[i]);
                list.remove(s);
            } else {
                int idx = list.indexOf(arr[i]);
                if(idx != 0) {
                    list.remove(idx);
                    list.add(0, arr[i]);
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(i > 0) sb.append(" ");
            sb.append(list.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(s, n, arr));
    }
}