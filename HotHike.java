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

class HotHike {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int start = arr.length - 1 - 2;
        int end = 0;
        int best = 0;
        int max = Integer.MAX_VALUE;
        for (int i = start; i >= end; i--) {
            int b = Math.max(arr[i], arr[i + 2]);
            if (b <= max) {
                max = b;
                best = i;
            }            
        }
        System.out.printf("%d %d", best + 1, max);
        sc.close();
    }
    
}
