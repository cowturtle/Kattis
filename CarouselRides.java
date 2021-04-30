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

class CarouselRides {

    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();

            if (n == 0 && m == 0) break;

            int aa = 0, bb = 0;
            while (n-- > 0) {
                int a = sc.getInt(), b = sc.getInt();
                if (a > m) continue;
                double value1 = a / (double) b, value2 = aa / (double) bb;
                if (aa == 0 // first
                    || value1 > value2 // value of new greater than old
                    || value1 == value2 && a > aa) { // more tickets
                        aa = a;
                        bb = b;
                }          
            }
            out.println(aa == 0 ? "No suitable tickets offered" : "Buy " + aa + " tickets for $" + bb);      
        }
        out.close();
        sc.close();
    }

}
