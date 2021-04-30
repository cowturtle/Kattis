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

class FallingApart {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = -1 * sc.getInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            arr[i] *= -1;
        int a = 0, b = 0;
        for (int i = 0; i < n; i++)
            if (i % 2 == 0) {
                a += arr[i];
            } else b += arr[i];
        System.out.printf("%d %d\n", a, b);
        sc.close();
    }
    
}
