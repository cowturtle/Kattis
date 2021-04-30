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

class ReducedIDNumbers {
    
    private final static int LIMIT = (int) Math.pow(10, 6) ;
 
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        Set<Integer> set = new HashSet<>();
        int i = 1;
        for (; i < LIMIT; i++) {
            for (int j : arr)
                set.add(j % i);
            if (set.size() == arr.length) break;
            set.clear();
        }
        System.out.println(i);
        sc.close();
    }
    
}
