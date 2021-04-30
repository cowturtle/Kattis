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

class Ladice {

  private final int[] roots;
  private final int[] occupied;
  private int queries;

  public Ladice(int n, int l) {
    this.roots = new int[l];
    this.occupied = new int[l];
    Arrays.fill(this.roots, -1);
    this.queries = n;
  }

  public void run(Kattio sc, PrintWriter out) {

    while (this.queries-- > 0) {
      int a = sc.getInt() - 1, b = sc.getInt() - 1;
      union(a, b);
      out.println(findSpace(a) ? "LADICA" : "SMECE"); 
    }

  }

  private int find(int a) {
    if (this.roots[a] < 0) return a;
    return this.roots[a] = find(this.roots[a]);
  }

  private void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a == b) return;
    this.roots[a] += this.roots[b];
    this.occupied[a] += this.occupied[b];
    this.roots[b] = a;
  }

  private boolean findSpace(int a) {
    a = find(a);
    this.occupied[a]++;
    if (this.occupied[a] > -this.roots[a]) { // Throw
      this.occupied[a]--;
      return false;
    } // Kept
    return true;
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = sc.getInt(), l = sc.getInt();
    Ladice ladice = new Ladice(n, l);
    ladice.run(sc, out);
    out.close();
    sc.close();
  }

}
