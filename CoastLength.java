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

class CoastLength {

  private static final int[][] MOVES = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    int[] tmpi = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int r = tmpi[0] + 2, c = tmpi[1] + 2;
    int[][] grid = new int[r][c];
    boolean[][] visited = new boolean[r][c];
    for (int i = 1; i < r - 1; i++) {
      String[] tmps = br.readLine().split("");
      for (int j = 1; j < c - 1; j++)
        grid[i][j] = Integer.parseInt(tmps[j - 1]);
    }
    System.out.println(walk(grid, visited, r, c));
    br.close();
  }

  static int walk(int[][] grid, boolean[][] visited, int r, int c) {
    int sum = 0;
    Queue<int[]> queue = new LinkedList<>(); 
    queue.offer(new int[]{0, 0});
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      if (visited[curr[0]][curr[1]]) continue;
      visited[curr[0]][curr[1]] = true;
      for (int[] moves : MOVES) {
        int i = curr[0] + moves[0];
        int j = curr[1] + moves[1];
        if (valid(i, j, r, c)) {
          if (grid[i][j] == 1) {
            sum++;
          } else if (!visited[i][j]) {
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
    return sum;
  }

  static boolean valid(int i, int j, int r, int c) {
    return 0 <= i && i < r && 0 <= j && j < c;
  }

}
