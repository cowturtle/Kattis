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

class AnotherCandies {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();           
        while (t-- > 0) {
            long n = sc.getLong();
            BigInteger nBig = BigInteger.valueOf(n);
            BigInteger total = BigInteger.ZERO;

            for (int i = 0; i < n; i++)
                total = total.add(BigInteger.valueOf(sc.getLong()));

            sb.append(total.mod(nBig).equals(BigInteger.ZERO) ? "YES" : "NO").append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}
