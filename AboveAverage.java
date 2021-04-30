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

class AboveAverage {
    
    public static void main(String[] args) {
        new AboveAverage();
    }

    AboveAverage() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            double total = 0.0, p = 0.0;
            int n2 = sc.getInt();
            int[] arr = new int[n2];
            while (--n2 >= 0) {
                arr[n2] = sc.getInt();
                total += arr[n2];
            }
            for (int i : arr) 
                if (i > total / arr.length) p++;
            sb.append(String.format("%.3f", p * 100 / arr.length) + "%").append("\n");
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}
