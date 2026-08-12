package practice.ch09.p_02;

import java.util.*;

public class Main {
    static class Meeting {
        int start, end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            meetings.add(new Meeting(start, end));
        }

        meetings.sort((a, b) -> {
            if (a.end != b.end)
                return a.end - b.end;
            return a.start - b.start;
        });

        int prev_end = 0, answer = 0;
        for (int i = 0; i < n; i++) {
            Meeting now = meetings.get(i);
            if (now.start >= prev_end) {
                prev_end = now.end;
                answer++;
            }
        }

        System.out.println(answer);
    }
}