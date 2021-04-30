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

class DaylightSavingTime {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char c = sc.getWord().charAt(0);
            int d  = sc.getInt();
            int h = sc.getInt(), m = sc.getInt();
            if (c == 'B') {
                m -= d;
                while (m < 0) {
                    h--;
                    m += 60;
                }
            } else {
                m += d;
                while (m >= 60) {
                    h++;
                    m -= 60;
                }
            }
            if (h >= 24) h -= 24;
            if (h < 0) h += 24;
            sb.append(h).append(" ").append(m).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
