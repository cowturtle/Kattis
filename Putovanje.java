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

class Putovanje {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), c = sc.getInt(), max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        for (int i = 0; i < n; i++) {
            int localmax = 0, eaten = 0;
            for (int j = i; j < n; j++) {
                if (eaten + arr[j] <= c) {
                    eaten += arr[j];
                    localmax++;
                }
            }
            max = Math.max(max, localmax);
        }
        System.out.println(max);
        sc.close();
    }
    
}
