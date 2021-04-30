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

class Statistics {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int caseCount = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + caseCount++ + ": ");
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.getInt();
            while (n-- > 0)
                list.add(sc.getInt());
            int max = Collections.max(list);
            int min = Collections.min(list);
            int range = max - min;
            sb.append(min).append(" ").append(max).append(" ").append(range).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
