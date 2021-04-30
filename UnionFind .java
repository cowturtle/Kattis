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
// Cannot use negative indices to represent rank. Find too slow iteration.
// See 5950571

class UnionFind { 

  private int[] elements;
  private int[] sizes;

  public UnionFind(int n) {
    this.elements = new int[n];
    this.sizes = new int[n];
    for (int i = 0; i < n; i++) {
      this.elements[i] = i;
      this.sizes[i] = 1;
    }
  }

  public String checkSameSet(int x, int y) {
    return isSameSet(x, y) ? "yes\n" : "no\n";
  } 

  private boolean isSameSet(int x, int y) {
    return find(x) == find(y);
  }

  private int find(int x) {
    while (elements[x] != x) {
      elements[x] = elements[elements[x]];
      x = elements[x];
    }
    return x;
  }

  public void union(int x, int y) {
    x = find(x);
    y = find(y);
    if (x == y) return;
    if (sizes[x] > sizes[y]) {
      elements[y] = x;
      sizes[x] += sizes[y];
    } else {
      elements[x] = y;
      sizes[y] += x;
    }
  }   

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String in = br.readLine();
    int spaceIndex = in.lastIndexOf(' ');
    int n = Integer.parseInt(in.substring(0, spaceIndex));
    int q = Integer.parseInt(in.substring(spaceIndex + 1, in.length()));
    UnionFind uf = new UnionFind(n);
    while (q-- > 0) {
      in = br.readLine();
      spaceIndex = in.lastIndexOf(' ');
      char op = in.charAt(0);
      int a = Integer.parseInt(in.substring(2, spaceIndex));
      int b = Integer.parseInt(in.substring(spaceIndex + 1, in.length()));
      if (op == '?') {
        bw.write(uf.checkSameSet(a, b));
      } else {
        uf.union(a, b);
      }
    }
    bw.close();
    br.close();
  }

}
