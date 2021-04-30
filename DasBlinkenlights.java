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

class DasBlinkenlights {
    
    public static void main(String[] args) {
        int[] pqs = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(lcm(pqs[0], pqs[1]) <= pqs[2] ? "yes" : "no" );
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        // No need abs as time is positive
        return (a * b) / gcd(a, b);
    }
    
}
