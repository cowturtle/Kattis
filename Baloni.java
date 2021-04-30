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

class Baloni {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    br.readLine();
    String[] tmp = br.readLine().split(" ");
    int[] counter = new int[1_000_000 + 1];
    int min = 0, x = 0;

    // 1 - based indexing
    for (String s : tmp)
    {
      x = Integer.parseInt(s);
      if (counter[x] > 0) 
      {
        counter[x]--; 
      }
      counter[x - 1]++; 
    }

    for (int i : counter)
    {
      min += i;
    }
    out.println(min);

    out.close();
    br.close();
  }

}
