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

class MovingDay {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), v = sc.getLong(), max = 0;
        while (n-- > 0) 
            max = Math.max(sc.getLong() * sc.getLong() * sc.getLong(), max);
        System.out.println(max - v);
        sc.close();
    }
    
}
