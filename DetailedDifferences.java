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

class DetailedDifferences {
    
    public static void main(String[] args) {
        new DetailedDifferences();
    }

    DetailedDifferences() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            String org = sc.getWord(), next = sc.getWord(), res = "";
            for (int i = 0; i < org.length(); i++) {
                if (org.charAt(i) == next.charAt(i)) {
                    res += ".";
                } else {
                    res += "*";
                }
            }
            sb.append(org);
            sb.append("\n");
            sb.append(next);
            sb.append("\n");
            sb.append(res);
            sb.append("\n\n");
        }
        System.out.println(sb.toString().trim());
    }

}
