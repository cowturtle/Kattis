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

class Pseudoprimenumbers {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            String p = sc.getWord(), a = sc.getWord();
            if (p.equals("0")) break;
            BigInteger pp = new BigInteger(p), aa = new BigInteger(a);
            BigInteger ap = aa.modPow(pp, pp);
            out.println(!pp.isProbablePrime(1) && ap.equals(aa) ? "yes" : "no");
        }
        out.close();
        sc.close();
    }

}
