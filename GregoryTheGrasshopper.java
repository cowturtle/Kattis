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

class GregoryTheGrasshopper {

    private static final int[][] _MOVES = new int[][] {{-1, -2}, {1, -2}, 
                                                        {-2, -1}, {2, -1},
                                                        {-2, 1}, {2, 1},
                                                        {-1, 2}, {1, 2}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] tmp = s.split(" ");
            int r = Integer.parseInt(tmp[0]);
            int c = Integer.parseInt(tmp[1]);
            int gr = Integer.parseInt(tmp[2]) - 1;
            int gc = Integer.parseInt(tmp[3]) - 1;
            int lr = Integer.parseInt(tmp[4]) - 1;
            int lc = Integer.parseInt(tmp[5]) - 1;
            int[][] grid = new int[r][c];
            grid[gr][gc] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{gr, gc});
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];
                for (int[] move : _MOVES) {
                    int new_r = i + move[0];
                    int new_c = j + move[1];
                    if (safe(new_r, new_c, r, c) && 
                            (grid[new_r][new_c] == 0 || grid[new_r][new_c] > grid[i][j] + 1)) {
                            grid[new_r][new_c] = grid[i][j] + 1;
                            queue.offer(new int[]{new_r, new_c});
                    }
                }
            }
            out.println(grid[lr][lc] == 0 ? "impossible" : grid[lr][lc] - 1);
        }
        out.close();
        br.close();
    }

    static boolean safe(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}
