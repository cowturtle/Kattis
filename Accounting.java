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

class Accounting {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    HashMap<Integer, Integer> hmap = new HashMap<>();
    sc.getInt();
    int q = sc.getInt(), def = 0;
    while (q-- > 0) {
      char op = sc.getWord().charAt(0);
      if (op == 'S') {
        int i = sc.getInt(), x = sc.getInt();
        hmap.put(i, x);
      } else if (op == 'P') {
        int i = sc.getInt();
        out.printf("%d\n", hmap.containsKey(i) ? hmap.get(i) : def);
      } else if (op == 'R') {
        int x = sc.getInt();
        def = x;
        hmap.clear();
      }
    }
    out.close();
    sc.close();
  }

}
