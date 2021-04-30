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

class FloodIt {

  private static final char[] COLORS = new char[] {'1', '2', '3', '4', '5', '6'};
  private static final int[][] MOVES = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  private char[][] grid;
  private boolean[][] connected;
  private int len;

  private int[] changes = new int[COLORS.length];
  private int changeCount;

  FloodIt(char[][] grid) {
    this.grid = grid;
    this.connected = new boolean[grid.length][grid.length];
    this.len = grid.length;
  }

  void solve() {
    connected[0][0] = true;
    connect(this.grid[0][0]);
    boolean[][] tmp = new boolean[this.len][this.len];
    while (!gameFinish()) {
      char nextColor = '0';
      int nextCount = 0;
      for (char color : COLORS) {
        copy(connected, tmp);
        int currCount = simulateConnection(tmp, color);
        if (currCount > nextCount) {
          nextCount = currCount;
          nextColor = color;
        }
      }
      connect(nextColor);
      this.changes[Character.getNumericValue(nextColor) - 1]++;
      this.changeCount++;

      // for (boolean[] arr : this.connected)
      //   System.out.println(Arrays.toString(arr));
      // System.out.println();
      // for (char[] arr: this.grid)
      //   System.out.println(Arrays.toString(arr));
      // System.out.println();

    } 
  }

  void connect(char color) {
    char prev = this.grid[0][0];
    this.grid[0][0] = color;
    boolean[][] visited = new boolean[this.len][this.len];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      for (int[] move : MOVES)  {
        int i = curr[0] + move[0];
        int j = curr[1] + move[1];
        if (valid(i, j) && !visited[i][j]) {
          visited[i][j] = true;
          if (this.connected[i][j] || color == this.grid[i][j]) {
            this.connected[i][j] = true;
            this.grid[i][j] = color;
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
  }

  boolean gameFinish() {
    for (boolean[] arr : this.connected)
      for (boolean b : arr)
        if (!b) return false;
    return true;
  }

  int simulateConnection(boolean[][] tmp, char color) {
    int count = 0;
    boolean[][] visited = new boolean[this.len][this.len];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      for (int[] move : MOVES)  {
        int i = curr[0] + move[0];
        int j = curr[1] + move[1];
        if (valid(i, j) && !visited[i][j]) {
          visited[i][j] = true;
          if (tmp[i][j] || this.grid[i][j] == color) {
            count++;
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
    return count;
  }

  boolean valid(int i, int j) {
    return 0 <= i && i < this.len && 0 <= j && j < this.len;
  }


  void copy(boolean[][] original, boolean[][] duplicate) {
    for (int i = 0; i < original.length; i++)
      System.arraycopy(original[i], 0, duplicate[i], 0, original[i].length);
  }

  String print() {
    return this.changeCount + "\n" + Arrays.toString(this.changes).replaceAll("[\\[\\],]", "") + "\n";
  }

  public static void main(String[] args) throws IOException {
    Kattio sc = new Kattio(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = sc.getInt();
    while (t-- > 0) {
      int n = sc.getInt();
      char[][] grid = new char[n][n];
      for (int i = 0; i < n; i++)
        grid[i] = sc.getWord().toCharArray();
      FloodIt fi = new FloodIt(grid);
      fi.solve();
      bw.write(fi.print());
    }
    bw.close();
    sc.close();
  }

}
