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

class Bits {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0)
            sb.append(foo(sc.getInt())).append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static int foo(int n) {
        int count = 0;
        while (n > 0) {
            count = Math.max(count, bar(n));
            n /= 10;
        }
        return count;
    }

    static int bar(int n) {
        int count = 0;
        while (n > 0) {
            // if ((n & 1) == 1) count++;
            // n = n >>> 1;
            count++;
            n &= n - 1;
        }
        return count;
    }
    
}
