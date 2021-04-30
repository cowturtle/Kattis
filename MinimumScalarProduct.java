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

class MinimumScalarProduct {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int t = sc.getInt();
    for (int tt = 1; tt <= t; tt++) {
      int n = sc.getInt();
      long sum = 0;
      int[] v1 = new int[n];
      int[] v2 = new int[n];
      for (int i = 0; i < n; i++)
        v1[i] = sc.getInt();
      for (int i = 0; i < n; i++)
        v2[i] = sc.getInt();
      Arrays.sort(v1);
      Arrays.sort(v2);
      for (int i = 0; i < n; i++)
        sum += (long) v1[i] * (long) v2[n - 1 - i];
      out.printf("Case #%d: %d\n", tt, sum);
    }
    out.close();
    sc.close();
  }

}
