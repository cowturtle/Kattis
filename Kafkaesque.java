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

class Kafkaesque {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int prev = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int curr = sc.getInt();
            if (prev > curr) count++;
            prev = curr;
        }
        System.out.println(count);
    }
    
}
