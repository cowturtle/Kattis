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

class BiasedStandings {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            long sum = 0;
            int[] arr = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                sc.getWord();
                arr[i] = sc.getInt();
            }
            Arrays.sort(arr);
            for (int i = 1; i < n + 1; i++) 
                sum += Math.abs(i - arr[i]);           
            sb.append(sum).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
