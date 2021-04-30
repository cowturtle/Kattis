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

class RotateAndCut {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            String s = sc.getWord();
            int len = s.length();
            if (len < 4) {
                sb.append(s);
            } else {
                int start = 0, end = len;
                boolean flip = false;
                for (int i = 0; i < n; i++) {
                    int diff = len / 4;
                    if (flip) {
                        end -= diff;
                    } else {
                        start += diff;
                    }
                    len = end - start;
                    if (len < 4) break;
                    flip = !flip;
                }
                sb.append(s.substring(start, end));
            }

            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
