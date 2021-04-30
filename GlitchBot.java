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

class GlitchBot {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    int x = sc.getInt(), y = sc.getInt();
    int n = sc.getInt();
    char[] moves = new char[n];
    int[] tmp = null;
    for (int i = 0; i < n; i++)
      moves[i] = sc.getWord().charAt(0);
    for (int i = 0; i < n; i++) {
      char c = moves[i];
      if (c != 'F') {
        moves[i] = 'F';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Forward");
          break;
        }
      } 
      if (c != 'R') {
        moves[i] = 'R';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Right");
          break;
        }
      }
      if (c != 'L') {
        moves[i] = 'L';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Left");
          break;
        }
      }
      moves[i] = c;
    }
    sc.close();
  }

  static boolean check(int x1, int y1, int x2, int y2) {
    return x1 == x2 && y1 == y2;
  }

  static int[] walk(char[] moves) {
    int x = 0, y = 0, face = 0;
    for (char c : moves) 
      if (c == 'F') {
        if (face == 0) {
          y++;
        } else if (face == 1) {
          x++;
        } else if (face == 2) {
          y--;
        } else if (face == 3) {
          x--;
        }
      } else {
        face += c == 'R' ? 1 : -1;
        face = face < 0 ? face + 4 : face % 4;
      }
    return new int[] {x, y};
  }

}
