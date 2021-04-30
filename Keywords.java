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

class Keywords {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    HashSet<String> set = new HashSet<>();
    int n = Integer.parseInt(br.readLine());
    while (n-- > 0)
      set.add(br.readLine().toLowerCase().replaceAll("[-]", " "));
    out.println(set.size());
    out.close();
    br.close();
  }

}
