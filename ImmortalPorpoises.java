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

class ImmortalPorpoises {
// https://codeforces.com/blog/entry/14516?f0a28=1

    private static final HashMap<Long, Long> memoized = new HashMap<>();
    private static final long disappear = 1000000000L;

    public static void main(String[] args) {
        memoized.put(0L, 0L);
        memoized.put(1L, 1L);
        memoized.put(2L, 1L);
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            long index = sc.getLong();
            out.printf("%d %s\n", i, fib(index));
        }
        out.close();
        sc.close();
    }
    
    // Understanding the pattern
    // https://en.wikipedia.org/wiki/Fibonacci_number#Matrix_form
    // Formula is NOT mine, and it is dervied from matrix multiplcation.
    // Alot of math, but the main point is at the end where
    // F_2n - 1 = (F_n)^2 + (F_n - 1)^2 | n % 2 == 1
    // F_2n = (F_n - 1 + F_n + 1) * F_n | n % 2 == 0
    static long fib(long n) {
        // n value is too large, using Right triangles to further sub divide
        if (memoized.containsKey(n)) return memoized.get(n);
        long next = 0L;
        long k = n;
        if (n % 2 == 0) {
            k /= 2;
            next = fib(k) * (fib(k + 1) + fib(k - 1));
        } else {
            k += 1;
            k /= 2;
            next = (fib(k) * fib(k)) + (fib(k - 1) * fib(k - 1));
        }
        next %= disappear;
        memoized.put(n, next);
        return next;
    }

}
