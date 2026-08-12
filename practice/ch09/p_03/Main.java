package practice.ch09.p_03;

import java.util.*;

public class Main {
    static class Info {
        int time;
        char state;

        Info(int time, char state) {
            this.time = time;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Info> infos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            infos.add(new Info(in.nextInt(), 's'));
            infos.add(new Info(in.nextInt(), 'e'));
        }

        infos.sort((a, b) -> {
            if (a.time == b.time)
                return a.state - b.state;
            return a.time - b.time;
        });

        int cnt = 0, answer = 0;
        for (Info info : infos) {
            if (info.state == 's')
                cnt++;
            else
                cnt--;
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
