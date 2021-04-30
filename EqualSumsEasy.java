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

class EqualSumsEasy {

  private static final PrintWriter out = new PrintWriter(System.out);
  private static final HashMap<Integer, int[]> hmap = new HashMap<>();
  private static boolean found = false;

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);   
    int t = sc.getInt();
    for (int tt = 1; tt <= t; tt++) {
      out.printf("Case #%d:\n", tt);
      int n = sc.getInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++)
        arr[i] = sc.getInt();
      for (int i = 1; i <= n && !found; i++) 
        combination(arr, n, i);
      hmap.clear();   
      if (!found) out.println("Impossible");
      found = false;
    }
    out.close();
    sc.close();
  }

  static void combination(int[] arr, int n, int r) {
    int[] data = new int[r];
    combinationHelper(arr, data, 0, n - 1, 0, r);
  }

  static void combinationHelper(int[] arr, int[] data, int start, int end, int index, int r) {
    if (found) return;
    if (index == r) {
      int sum = 0;
      int[] tmp = Arrays.copyOfRange(data, 0, r);
      for (int i : tmp)
        sum += i;
      if (hmap.containsKey(sum)) {
        out.println(printable(tmp));
        out.println(printable(hmap.get(sum)));
        found = true;
      } else {
        hmap.put(sum, tmp);
      }
      return;
    }
    for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
      data[index] = arr[i];
      combinationHelper(arr, data, i + 1, end, index + 1, r);
    }
  }

  static String printable(int[] arr) {
    return Arrays.toString(arr).replaceAll("[\\[\\],]", "");
  }

}
