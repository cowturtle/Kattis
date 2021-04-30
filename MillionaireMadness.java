import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.text.*;

/*
 * @author Theodoric Keith Lim
 */

class MillionaireMadness {

    private static int r, c;
    private static int[][] moves = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public static void main(String[] args) {
        
        class Step implements Comparable<Step> {
            int x, y, cmp;

            Step(int x, int y, int cmp) {
                this.x = x;
                this.y = y;
                this.cmp = cmp;
            }

            @Override
            public int compareTo(Step s) {
                return this.cmp - s.cmp;
            }
        }

        Kattio sc = new Kattio(System.in);
        r = sc.getInt();
        c = sc.getInt();
        int[][] grid = new int[r][c];
        int[][] differences = new int[r][c];
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.getInt();
                differences[i][j] = Integer.MAX_VALUE;
            }
        PriorityQueue<Step> queue = new PriorityQueue<>();
        queue.offer(new Step(0, 0, 0));
        differences[0][0] = 0;
        while (!queue.isEmpty()) {
            Step curr = queue.poll();
            if (!visited[curr.x][curr.y]) {
                visited[curr.x][curr.y] = true;
                for (int[] move : moves) {
                    int rr = curr.x + move[0];
                    int cc = curr.y + move[1];
                    if (valid(rr, cc)) {
                        int diff = grid[rr][cc] - grid[curr.x][curr.y];
                        diff = Math.max(0, diff);
                        diff = Math.max(diff, differences[curr.x][curr.y]);
                        if (diff < differences[rr][cc]) {
                            differences[rr][cc] = diff;
                            queue.offer(new Step(rr, cc, diff));
                        }
                    }
                }
            }
        }

        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.print(differences[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(differences[r - 1][c - 1]);
        sc.close();
    }

    static boolean valid(int i, int j) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}
