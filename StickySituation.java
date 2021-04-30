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

class StickySituation {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getLong();
        Arrays.sort(arr);
        System.out.println(bar(arr, n) ? "possible" : "impossible");
        sc.close();        
    }

    static boolean bar(long[] arr, int n) {
        for (int i = 0; i < n - 2; i++) 
            if (foo(arr[i], arr[i + 1], arr[i + 2])) return true;
        return false;
    }

    static boolean foo(long a, long b, long c) {
        return a + b > c && b + c > a && c + a > b;
    }
    
}
