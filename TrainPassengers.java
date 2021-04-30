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

class TrainPassengers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int c = sc.getInt(), n = sc.getInt();
        System.out.println(foo(c, n, sc) ? "possible" : "impossible");
        sc.close();
    }

    static boolean foo(int c, int n, Kattio sc) {
        int currCapacity = c, left = 0, entered = 0, stay = 0;
        for (int i = 0; i < n; i++) {
            left = sc.getInt();
            entered = sc.getInt();
            stay = sc.getInt();
            currCapacity += left - entered;
            if (i == 0 && left > 0) {
                return false;
            } else if (i == n - 1 && (currCapacity != c || stay > 0)) {
                return false;
            } else if (currCapacity < 0 || currCapacity > c) {
                return false;
            } else if (currCapacity > 0 && stay > 0) {
                return false;
            }
        }
        return true;
    }

    
}
