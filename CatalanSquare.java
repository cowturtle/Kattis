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
// https://en.wikipedia.org/wiki/Catalan_number
// (1 / n + 1) * (2n choose n)
// (1 / n + 1) * ((2n)! / ((n + 1)! * (2n - n)!))
// (1 / n + 1) * ((2n)! / ((n + 1)! * n!))
// (1 / n + 1) * (n + 2 * n + 3 * .... 2n - 2 * 2n - 1 * 2n) / n!)

class CatalanSquare {

    public static void main(String[] args) {
        System.out.println(catalan(new java.util.Scanner(System.in).nextInt() + 1));
    }

    static BigInteger catalan(int n) {
        return combination(2 * n, n).divide(BigInteger.valueOf(n + 1));
    }

    static BigInteger combination(int n, int r) {
        BigInteger res = BigInteger.ONE;
        BigInteger bigN = BigInteger.valueOf(n);
        if (r > n - r) r = n - r; // e.g. 10C3 == 10C7
        for (int i = 0; i < r; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            BigInteger bigIPlus = BigInteger.valueOf(i + 1);
            res = res.multiply(bigN.subtract(bigI));
            res = res.divide(bigIPlus);
        }
        return res;
    }

}
