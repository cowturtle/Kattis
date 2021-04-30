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

class RationalArithmetic {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        while (n-- > 0) {
            long x1 = sc.getLong(), y1 = sc.getLong();
            char op = sc.getWord().charAt(0);
            long x2 = sc.getLong(), y2 = sc.getLong();
            if (op == '+' || op == '-') {
                x1 = x1 * y2;
                x2 = x2 * y1;
                y1 *= y2;
                x1 = op == '+' ? x1 + x2 : x1 - x2;
                long i = gcd(x1, y1);
                x1 /= i;
                y1 /= i;
                if (y1 < 0) {
                    y1 *= -1;
                    x1 *= -1;
                }
            } else if (op == '*' || op == '/') {
                if (op == '/') {
                    long tmp = x2;
                    x2 = y2;
                    y2 = tmp;
                }
                x1 *= x2;
                y1 *= y2;
                long i = gcd(x1, y1);
                x1 /= i;
                y1 /= i;
                if (y1 < 0) {
                    y1 *= -1;
                    x1 *= -1;
                }
            }
            out.printf("%d / %d\n", x1, y1);
        }
        out.close();
        sc.close();
    }

    static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

}
