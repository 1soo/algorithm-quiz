package practice.ch04.p_04;

import java.util.*;

public class Main {
    public static int solution(String s, String t) {
        int answer = 0, k = t.length();
        Map<Character, Integer> map = new HashMap<>(k);

        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int lt = 0, cnt = 0;
        for(int rt = 0; rt < s.length(); rt++) {
            char c = s.charAt(rt);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                cnt++;

                if(cnt == k) {
                    boolean flag = true;
                    for(int num : map.values()) {
                        if(num != 0) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer++;
                    
                    map.put(s.charAt(lt), map.get(s.charAt(lt)) + 1);
                    lt++;
                    cnt--;
                }
            } else {
                for(int i = lt; i < rt; i++) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    lt++;
                }
                lt = rt + 1;
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        System.out.print(solution(s, t));
    }
}