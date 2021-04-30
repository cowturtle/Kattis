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

class WatchOutForThoseHailstones {
    
    static HashMap<Long, Long> memoized = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(foo(Long.parseLong(new java.util.Scanner(System.in).nextLine())));
    }

    static long foo(long n) {
        if (memoized.containsKey(n)) return memoized.get(n); 
        if (n == 1) return 1;
        memoized.put(n, n % 2 == 0 ? foo(n / 2) : foo(3 * n + 1));
        return n + memoized.get(n);
    }
    
}
