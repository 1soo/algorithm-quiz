package practice.ch08.p_08;

import java.util.*;

public class Main {
    static int n, f;
    static int[] arr, pm;
    static boolean[] checked;
    static List<String> answer = new ArrayList<>();
    static List<String> candidates = new ArrayList<>();

    public static int calculate() {
        int[] result = pm.clone();
        int len = result.length;
        while (len > 1) {
            int[] toChange = new int[len - 1];
            for (int i = 0; i < len - 1; i++) {
                toChange[i] = result[i] + result[i + 1];
            }
            result = toChange;
            len = result.length;
        }

        return result[0];
    }

    public static void dfs(int len) {
        if (len == n) {
            if (calculate() == f) {
                StringBuilder sb = new StringBuilder(n);
                for (int num : pm) {
                    sb.append(num).append(" ");
                }
                answer.add(sb.toString());
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (!checked[i]) {
                    checked[i] = true;
                    pm[len] = arr[i];
                    dfs(len + 1);
                    checked[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();

        arr = new int[n];
        pm = new int[n];
        checked = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        dfs(0);
        answer.sort((a, b) -> {
            String[] a_split = a.split(" ");
            String[] b_split = b.split(" ");
            for (int i = 0; i < n; i++) {
                int a_num = Integer.valueOf(a_split[i]);
                int b_num = Integer.valueOf(b_split[i]);
                if (a_num != b_num)
                    return a_num - b_num;
            }

            return 0;
        });
        System.out.println(answer.get(0));
    }
}