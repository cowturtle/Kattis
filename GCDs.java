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

class GCDs {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> tmp = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            arr.add(sc.getInt());        
            set.add(arr.get(i));
        }
        while (arr.size() > 1) { // need more than 2 to do gcd
            for (int i = 0; i < arr.size() - 1; i++) {
                int x = gcd(arr.get(i), arr.get(i + 1)); // gcd of gcd, further reducing, because we are finding the common divisors for an entire range as well
                tmp.add(x);
                set.add(x);
            }
            arr = new ArrayList<>(tmp);
            tmp = new HashSet<>();
        }
        System.out.println(set.size());
        sc.close();
    }

    static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

}
