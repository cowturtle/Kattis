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

class Thanos {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            long p = sc.getLong(), r = sc.getLong(), f = sc.getLong(), count = 0;
            while (p <= f) {
                p *= r;
                count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
