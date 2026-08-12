package practice.ch09.p_01;

import java.util.*;

public class Main {
    static class Entry {
        int white, black;

        Entry(int white, int black) {
            this.white = white;
            this.black = black;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Entry> entries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int white = in.nextInt();
            int black = in.nextInt();
            entries.add(new Entry(white, black));
        }

        entries.sort((a, b) -> b.white - a.white);
        int answer = 0, max_black = Integer.MIN_VALUE;

        for (Entry entry : entries) {
            if (entry.black > max_black) {
                answer++;
                max_black = entry.black;
            }
        }

        System.out.println(answer);
    }
}