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

class BasicProgrammingOne {

  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static final PrintWriter out = new PrintWriter(System.out);

  private final int len;
  private final int op;
  private final String input;

  public BasicProgrammingOne(int n, int t, String input) {
    this.len = n;
    this.op = t;
    this.input = input;
  }

  public String run() {

    switch (this.op) {

      case 1:
        return one();
      case 2:
        return two();
      case 3:
        return three();
      case 4:
        return four();
      case 5:
        return five();
      case 6:
        return six();
      case 7:   
        return seven();
    }

    return "ERROR";
  }

  private String one() {
    return "7";
  }

  private String two() {
    String[] tmp = this.input.split(" ");
    int x = Integer.parseInt(tmp[0]), y = Integer.parseInt(tmp[1]);
    return x > y ? "Bigger" : x < y ? "Smaller" : "Equal";
  }

  private String three() {
    String[] tmp = this.input.split(" ");
    int x = Integer.parseInt(tmp[0]), y = Integer.parseInt(tmp[1]), z = Integer.parseInt(tmp[2]);
    int[] sort = new int[] {x, y, z};
    Arrays.sort(sort);
    return String.valueOf(sort[1]);
  }

  private String four() {
    BigInteger[] arr = toBigIntegerArray();
    BigInteger sum = BigInteger.ZERO;
    for (BigInteger i : arr)
      sum = sum.add(i);
    return sum.toString();
  }

  private String five() {
    BigInteger[] arr = toBigIntegerArray();
    BigInteger sum = BigInteger.ZERO;
    for (BigInteger i : arr)
      if (i.xor(BigInteger.ONE).equals(i.add(BigInteger.ONE)))
        sum = sum.add(i);
    return sum.toString();
  }

  private String six() {
    String[] tmp = this.input.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String s : tmp)
      sb.append((char) ((Integer.parseInt(s) % 26) + 'a'));
    return sb.toString();
  }

  private String seven() {
    int[] tmp = Arrays.stream(this.input.split(" ")).mapToInt(Integer::parseInt).toArray();
    boolean[] visited = new boolean[this.len];
    int i = 0, count = 0;
    while (count < this.len) {
      if (!validRange(i)) return "Out";
      if (visited[i]) return "Cyclic";
      visited[i] = true;
      i = tmp[i];
      count++;
    }
    return "Done";
  }

  private BigInteger[] toBigIntegerArray() {
    BigInteger[] arr = new BigInteger[this.len];
    String[] tmp = this.input.split(" ");
    for (int i = 0; i < this.len; i++)
      arr[i] = new BigInteger(tmp[i]);
    return arr;
  }

  private boolean validRange(int i) {
    return 0 <= i && i < this.len;
  }

  public static void main(String[] args) throws IOException {
    int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = tmp[0], t = tmp[1];
    String input = br.readLine();
    BasicProgrammingOne bpo = new BasicProgrammingOne(n, t, input);
    out.println(bpo.run());
    out.close();
    br.close();
  }

}
