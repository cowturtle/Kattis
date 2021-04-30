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

class CrackingRSA {

    public static void main(String[] args) throws java.io.IOException {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            long n = sc.getLong(), e = sc.getLong();
            long p = n, q = 2L;
            for (; q <= p; q++) 
                if (p % q == 0) break;
            p /= q;
            long euler = (p - 1) * (q - 1);
            // a - b = k * c
            // (d * e) - 1 = k * euler, k is constant > remove
            // (d * e - 1) % euler == 0 
            long d = 1L;
            while (((d * e) - 1) % euler != 0)
                d++;
            out.println(d); 
        }
        out.close();
        sc.close();
    }

}
