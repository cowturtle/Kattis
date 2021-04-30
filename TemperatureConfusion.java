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

class TemperatureConfusion {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0], d = arr[1];
        // F = (9/5) * C + 32
        // C = (5/9)(F - 32)
        // C = (5/9)F - (5/9)32
        // C = (5/9)F - (160/9)
        // C = (5/9)(n/d) - (160/9)
        // C = (5n/9d) - (160d/9d)
        // C = (5n - 160d)/(9d);
        int newn = (5 * n) - (160 * d);
        int newd = 9 * d;
        int g = gcd(newn, newd);
        newn /= g;
        newd /= g;
        if (newd < 0) {
            newn *= -1;
            newd *= -1;
        }
        System.out.printf("%d/%d\n", newn, newd);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
}
