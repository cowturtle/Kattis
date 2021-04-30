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

class Heliocentric {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int i = 1;
        while (sc.hasMoreTokens()) {
            int earth = sc.getInt(), mars = sc.getInt();
            int count = 0;
            while (earth % 365 != 0 || mars % 687 != 0) {
                earth++;
                mars++;
                count++;
            }
            System.out.printf("Case %d: %d\n", i++, count);
        }
        sc.close();
    }
    
}
