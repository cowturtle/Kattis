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

class Deathstar {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                sc.getInt();
            for (int j = i; j < n; j++) {
                int x = sc.getInt();
                arr[i] |= x;
                arr[j] |= x;
            }
        }
        System.out.println(java.util.Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        sc.close();
    }
    
}
