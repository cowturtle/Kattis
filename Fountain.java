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

class Fountain {

  private final int[] LEFTRIGHT = new int[]{-1, 1};

  private char[][] grid;
  private final int r;
  private final int c;

  public Fountain(char[][] grid, int r, int c) {

    this.grid = grid;
    this.r = r;
    this.c = c;

  }

  public void flow() {
    boolean flowed = true;
    while (flowed) {      
      flowed = false;

      for (int i = 0; i < this.r; i++) 

        for (int j = 0; j < this.c; j++) {

          if (this.grid[i][j] == '.') {

            if (i > 0 && this.grid[i - 1][j] == 'V') {

              this.grid[i][j] = 'V';
              flowed = true;

            }

            if (i < this.r - 1) {

              if (j < this.c - 1) {

                if (this.grid[i][j + 1] == 'V' && this.grid[i + 1][j + 1] == '#') {

                  this.grid[i][j] = 'V';
                  flowed = true;

                }

              } 

              if (j > 0) {

                if (this.grid[i][j - 1] == 'V' && this.grid[i + 1][j - 1] == '#') {

                  this.grid[i][j] = 'V';
                  flowed = true;

                }

              }

            }


            if (i < this.r - 1 && j > 0 
                && this.grid[i][j - 1] == 'V' && this.grid[i + 1][j - 1] == '#') {

              this.grid[i][j] = 'V';
              flowed = true;

                }

          }

        }

    }

  }

  public void printGrid() {

    PrintWriter out = new PrintWriter(System.out);

    for (char[] arr : this.grid) {

      for (char c : arr)
        out.print(c);

      out.print("\n");

    }

    out.close();
  }

  public static void main(String[] args) {

    Kattio sc = new Kattio(System.in);
    int r = sc.getInt(), c = sc.getInt();

    char[][] grid = new char[r][c];
    for (int i = 0; i < r; i++)
      grid[i] = sc.getWord().toCharArray();

    Fountain f = new Fountain(grid, r, c);
    f.flow();
    f.printGrid();

    sc.close();
  }

}
