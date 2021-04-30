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

class CatalanNumbers {
// https://en.wikipedia.org/wiki/Catalan_number
// C_n + 1 = ((2(2n + 1)) / (n + 2)) * C_n
// C_n = ((2(2(n - 1) + 1)) / (n - 1 + 2)) * C_n - 1
// C_n = ((2(2(n - 1) + 1)) / (n - 1 + 2)) * C_n - 1
// C_n = ((2(2n - 2 + 1))) / (n + 1)) * C_n - 1
// C_n = ((2(2n - 1))) / (n + 1)) * C_n - 1

    private final static BigInteger[] memoized = new BigInteger[5001];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        memoized[0] = BigInteger.ONE;
        memoized[1] = BigInteger.ONE;
        int n = sc.getInt();
        while (n-- > 0)
            out.println(catalan(sc.getInt()));
        out.close();
        sc.close();
    }

    static BigInteger catalan(int n) {
        if (memoized[n] != null) return memoized[n];
        if (n > 20) catalan(n - 20);
        return memoized[n] = catalan(n - 1).multiply(BigInteger.valueOf(2 * (2 * n - 1))).divide(BigInteger.valueOf(n + 1));
    }

}
