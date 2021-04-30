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

class KnightJump {
    
    static final int[] rarr = new int[] {2, 2, -2, -2, 1, 1, -1, -1};
    static final int[] carr = new int[] {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[][] board = new char[n][n];
        int[][] counts = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int ki = -1, kj = -1;
        for (int i = 0; i < n; i++) {
            board[i] = sc.getWord().toCharArray();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'K') {
                    ki = i;
                    kj = j;
                }
                counts[i][j] = -1;
            }
        }
        foo(board, counts, visited, ki, kj, n);
        // for (int i = 0; i < n; i++)
        //     System.out.println(Arrays.toString(counts[i]));
        System.out.println(counts[0][0]);
        sc.close();
    }

    static void foo(char[][] board, int[][] counts, boolean[][] visited, int i, int j, int n) {

        class Point {
            int x, y;
            int count;
            public Point(int x, int y, int count) {
                this.x = x;
                this.y = y;
                this.count = count;
            }
        }

        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(i, j, 0);
        queue.offer(start);
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (validBounds(p.x, p.y, n) && !visited[p.x][p.y] && board[p.x][p.y] != '#') {
                visited[p.x][p.y] = true;
                counts[p.x][p.y] = p.count;
                for (int k = 0; k < 8; k++) 
                    queue.offer(new Point(p.x + rarr[k], p.y + carr[k], p.count + 1));
            }
        }
    }

    static boolean validBounds(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    
}
