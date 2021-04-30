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

class ClosestSum {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + t++ + ":").append("\n");
            int n = sc.getInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.getInt();
            int m = sc.getInt();
            while (m-- > 0) {
                int query = sc.getInt();
                int sum = arr[0] + arr[1];
                for (int i = 0; i < n; i++) 
                    for (int j = i + 1; j < n; j++) {
                        int localsum = arr[i] + arr[j];
                        if (Math.abs(query - sum) > Math.abs(query - localsum)) 
                            sum = localsum;
                    }
                sb.append("Closest sum to ")
                    .append(query)
                    .append(" is ")
                    .append(sum)
                    .append(".")
                    .append("\n");
            }

        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
