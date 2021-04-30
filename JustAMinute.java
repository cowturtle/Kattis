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

class JustAMinute {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        double totalm = 0, totals = 0, average = 0;
        for (int i = 0; i < n; i++) {
            double m = sc.getDouble(), s = sc.getDouble();
            totalm += m * 60;
            totals += s;
        }
        System.out.println((average = totals / totalm) <= 1.0 ? "measurement error" : String.format("%.10f", average));
        sc.close();
    }
    
}
