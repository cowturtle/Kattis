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

class WoodCutting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            long[] wood = new long[n];
            for (int i = 0; i < n; i++) {
                int w = sc.getInt();
                while (w-- > 0)
                    wood[i] += sc.getLong();
            }
            Arrays.sort(wood);
            long totalWait = 0L, accumulate = 0;
            for (long l : wood) 
                totalWait += accumulate += l;
            sb.append(String.format("%.10f", totalWait / (double) n)).append("\n");
        }  
        System.out.print(sb.toString());
        sc.close(); 
    }
    
}
