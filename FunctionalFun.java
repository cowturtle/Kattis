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

class FunctionalFun {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String s = "";
    String[] tmp = null;
    while ((s = br.readLine()) != null) {
      Set<String> domain = new HashSet<>(), codomain = new HashSet<>();
      tmp = s.split(" ");
      for (int i = 1; i < tmp.length; i++)
        domain.add(tmp[i]);
      s = br.readLine();
      tmp = s.split(" ");
      for (int i = 1; i < tmp.length; i++)
        codomain.add(tmp[i]);

      HashMap<String, String> hmap = new HashMap<>();
      boolean function = true, injective = true, surjective = true;
      int n = Integer.parseInt(br.readLine());
      while (n-- > 0) {
        s = br.readLine();
        if (!function) continue;
        tmp = s.split(" -> ");
        if (hmap.containsKey(tmp[0])) {
          function = false;
        } else {
          if (hmap.containsValue(tmp[1])) {
            injective = false;
          }
          hmap.put(tmp[0], tmp[1]);
        }
      }
      surjective = new HashSet<>(hmap.values()).size() == codomain.size();
      if (!function) {
        out.println("not a function");
      } else if (injective && surjective) {
        out.println("bijective");
      } else if (injective) {
        out.println("injective");
      } else if (surjective) {
        out.println("surjective");
      } else {
        out.println("neither injective nor surjective");
      }
    }
    out.close();
    br.close();
  }

}
