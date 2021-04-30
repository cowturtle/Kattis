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

class ICPCTeamSelection {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt() * 3;
            ArrayList<Integer> al = new ArrayList<>(n);
            for (int i = 0; i < n; i++)
                al.add(sc.getInt());
            Collections.sort(al, Collections.reverseOrder());
            int s = 0;
            while (!al.isEmpty()) {
                s += al.get(1);
                al.remove(0);
                al.remove(0);
                al.remove(al.size() - 1);
            }
            out.println(s);
        }
        out.close();
        sc.close();
    }

}
