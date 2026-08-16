package practice.ch10.p_04;

import java.util.*;

public class Main {

    static class Block implements Comparable<Block> {
        int width, height, weight;

        Block (int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Block o) {
            return o.width - this.width;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Block[] arr = new Block[n];
        
        for(int i = 0; i < n; i++) {
            int width = in.nextInt();
            int height = in.nextInt();
            int weight = in.nextInt();

            arr[i] = new Block(width, height, weight);
        }
        Arrays.sort(arr);

        int[] dy = new int[n];
        dy[0] = arr[0].height;
        int max = arr[0].height;

        for(int i = 1; i < n; i++) {
            dy[i] = arr[i].height;

            for(int j = 0; j < i; j++) {
                if(arr[i].weight < arr[j].weight && arr[i].height + dy[j] > dy[i]) {
                    dy[i] = arr[i].height + dy[j];
                }
            }

            if(dy[i] > max) {
                max = dy[i];
            }
        }

        System.out.println(max);
    }
}