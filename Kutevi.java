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

class Kutevi {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int factor = 360;
        int n = sc.getInt(), k = sc.getInt();
        while (n-- > 0) 
            factor = gcd(factor, sc.getInt());
        while (k-- > 0) 
            if (sc.getInt() % factor == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        System.out.print(sb.toString());
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
