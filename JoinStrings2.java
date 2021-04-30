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

class JoinStrings2 {

  static class Node {
    public final String value;
    public Node next;

    public Node(String value) {
      this.value = value;
      this.next = null;
    }
  }

  private final Node[] heads;
  private final Node[] tails;
  private int printIndex;

  public JoinStrings2(Node[] heads, Node[] tails) {
    this.heads = heads;
    this.tails = tails;
    this.printIndex = -1;
  }

  public void join(Kattio sc) {
    int operations = this.heads.length - 1;
    int a = 0, b = 0;
    while (operations-- > 0) {
      a = sc.getInt() - 1;
      b = sc.getInt() - 1;
      this.tails[a].next = this.heads[b];
      this.tails[a] = this.tails[b];
    }
    this.printIndex = a;
  }

  public void print(PrintWriter out) {
    Node curr = this.heads[this.printIndex];
    while (curr != null) {
      out.print(curr.value);
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt();
    Node[] heads = new Node[n];
    Node[] tails = new Node[n];

    for (int i = 0; i < n; i++) {
      heads[i] = new Node(sc.getWord());
      tails[i] = heads[i];
    }

    JoinStrings2 js2 = new JoinStrings2(heads, tails);
    js2.join(sc);
    js2.print(out);

    out.close();
    sc.close();
  }

}
