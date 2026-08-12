package practice.ch09.p_04;

import java.util.*;

public class Main {
    static class Request {
        int pay, date;

        Request(int pay, int date) {
            this.pay = pay;
            this.date = date;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Request> requests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pay = in.nextInt();
            int date = in.nextInt();
            requests.add(new Request(pay, date));
        }
        requests.sort((a, b) -> a.date - b.date);

        Queue<Integer> queue = new PriorityQueue<>();
        int answer = 0;

        for (Request rq : requests) {
            queue.offer(rq.pay);
            answer += rq.pay;
            if (queue.size() > rq.date) {
                answer -= queue.poll();
            }
        }

        System.out.println(answer);
    }
}