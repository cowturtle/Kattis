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

class GolombRulers {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    ArrayList<Integer> missing;
    String s = "";
    boolean[] found;
    boolean not;
    int[] arr;
    while ((s = br.readLine()) != null)
    {
      missing = new ArrayList<>();
      not = false;
      found = new boolean[1_000_000];
      arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(arr);
      for (int i = arr.length - 1; i >= 0; i--)
      {
        for (int j = i - 1; j >= 0; j--)
        {
          int x = arr[i] - arr[j];
          if (found[x])
          {
            not = true;
            break;
          }
          else
          {
            found[x] = true;
          }
        }
        if (not) break;
      }

      if (not)
      {
        out.println("not a ruler");
      }
      else
      {
        for (int i = 1; i < arr[arr.length - 1]; i++)
        {
          if (!found[i]) missing.add(i);
        }
        if (missing.isEmpty())
        {
          out.println("perfect");
        }
        else
        {
          out.printf("missing %s\n", missing.toString().replaceAll("[\\[\\],]", ""));
        }
      }
    }
    out.close();
    br.close();
  }

}
