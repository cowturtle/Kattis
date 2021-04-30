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

class Crne {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLong()));
    }

    static long foo(long n) {
        long a = n / 2, b = a;
        if (a + b < n) b++;
        a++;
        b++;
        return a * b;
        // 1 2
        // 2 4
        // 3 6
        // 4 8
        // 5 12
    }
    
}
