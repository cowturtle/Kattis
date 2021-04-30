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

class Grid {

    static int[][] grid;
    static int[][] min;
    static int r;
    static int c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        r = Integer.parseInt(tmp[0]);
        c = Integer.parseInt(tmp[1]);
        grid = new int[r][c];
        min = new int[r][c];
        for (int i = 0; i < r; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < c; j++) {
                min[i][j] = Integer.MAX_VALUE;
                grid[i][j] = arr[j] - '0';
            }                
        }
        min[0][0] = 0;
        // for (int i = 0; i < r; i++)
        //     System.out.println(Arrays.toString(min[i]));
        System.out.println(walk());
        br.close();
    }

    static int walk() {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int i = tmp[0], j = tmp[1];
            int k = grid[i][j];
            int[][] moves = new int[][] {{i, j - k}, {i, j + k}, {i - k, j}, {i + k, j}};
            for (int[] move : moves) {
                int ii = move[0], jj = move[1];
                if (inRange(ii, jj, r, c)) {
                    if (min[ii][jj] == Integer.MAX_VALUE || min[ii][jj] > 1 + min[i][j]) {
                        min[ii][jj] = 1 + min[i][j]; 
                        queue.offer(move);
                    }
                }
            }    
        }        
        return min[r - 1][c - 1] == Integer.MAX_VALUE ? -1 : min[r - 1][c - 1];
    }

    static boolean inRange(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}
