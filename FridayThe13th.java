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

class FridayThe13th {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        // 1 Sun
        // 2 Mon
        // 3 Tues
        // 4 Wed
        // 5 Thurs
        // 6 Fri
        // 7 Sat
        // 8 Sun
        // 9 Mon
        // 10 Tues
        // 11 Wed
        // 12 Thurs
        // 13 Fri
        // 14 Sat
        while (t-- > 0) {
            int d = sc.getInt(), m = sc.getInt(), elapsed = 13, count = 0;
            while (m -- > 0) {
                int days = sc.getInt();
                if (days >= 13 && elapsed % 7 == 6) count++;
                elapsed += days;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
