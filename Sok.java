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

class Sok {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        double a = sc.getDouble(), b = sc.getDouble(), c = sc.getDouble();
        double i = sc.getDouble(), j = sc.getDouble(), k = sc.getDouble();

        double limiter = a / i;
        if (limiter > b / j) limiter = b / j;
        if (limiter > c / k) limiter = c / k;

        a -= limiter * i;
        b -= limiter * j;
        c -= limiter * k;

        System.out.printf("%.6f %.6f %.6f", a, b, c);
        sc.close();
    }
    
}
