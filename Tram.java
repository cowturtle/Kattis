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

class Tram {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), nn = n, nnn = 0L;
        while (n-- > 0)
            nnn -= sc.getLong() - sc.getLong();
        System.out.printf("%.6f", nnn / (double) nn);
        sc.close();
    }
    
}
