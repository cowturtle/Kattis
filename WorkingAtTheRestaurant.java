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

class WorkingAtTheRestaurant {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String[] tmp;
    while ((s = br.readLine()) != null)
    {
      if (s.equals("0")) break;
      char c = '\u0000';
      int n = Integer.parseInt(s);
      int m = 0;
      int p1 = 0, p2 = 0;
      while (n-- > 0)
      {
        tmp = br.readLine().split(" ");
        c = tmp[0].charAt(0);
        m = Integer.parseInt(tmp[1]);

        if (c == 'D')
        {
          out.printf("DROP 2 %d\n", m);
          p2 += m;
        }
        else if (c == 'T')
        {
          if (p1 >= m)
          {
            out.printf("TAKE 1 %d\n", m);
            p1 -= m;
          }
          else
          {
            if (p1 > 0)
            {
              out.printf("TAKE 1 %d\n", p1);
              m -= p1;
              p1 = 0;
            }
            out.printf("MOVE 2->1 %d\n", p2);
            p1 = p2;
            p1 -= m;
            p2 = 0;
            out.printf("TAKE 1 %d\n", m);
          }
        }
      }
      out.println();
    }

    out.close();
    br.close();
  }

}
