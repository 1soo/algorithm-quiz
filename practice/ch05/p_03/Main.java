package practice.ch05.p_03;

import java.util.*;

public class Main {
    public static int solution(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int count = 0;
        
        for(int move : moves) {
            int idx = move - 1;
            for(int i = 0; i < n; i++) {
                if (board[i][idx] != 0) {
                    if(!basket.isEmpty() && board[i][idx] == basket.peek()) {
                        basket.pop();
                        count++;
                    }else {
                        basket.push(board[i][idx]);
                    }
                    board[i][idx] = 0;
                    break;
                }
            }
        }
        
        return count * 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for(int i= 0; i < m; i++) {
            moves[i] = in.nextInt();
        }
        
        System.out.print(solution(n, board, m, moves));
    }
}