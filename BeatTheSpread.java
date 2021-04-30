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

class BeatTheSpread {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int sum = sc.getInt(), diff = sc.getInt();
            int a = (sum + diff) / 2;
            int b = sum - a;
            if (a >= 0 && b >= 0 && a + b == sum && Math.abs(a - b) == diff) {
                sb.append(Math.max(a, b) + " " + Math.min(a, b));
            } else {
                sb.append("impossible");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
