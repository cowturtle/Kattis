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

class AmalgamatedArtichokes {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray()));
    }

    static double foo(double[] arr) {
        double p = arr[0], a = arr[1], b = arr[2], c = arr[3], d = arr[4], n = arr[5];
        double max_decline = 0.0;
        double max_price = priceFormula(p, a, b, c, d, 1);        
        for (int i = 2; i <= n; i++) {
            double next_max_price = priceFormula(p, a, b, c, d, i);        
            max_decline = Math.max(max_decline, max_price - next_max_price);
            max_price = Math.max(max_price, next_max_price);
        }
        return max_decline;
    }

    static double priceFormula(double p, double a, double b, double c, double d, double n) {
        return p * ( Math.sin((a * n) + b) + Math.cos((c * n) + d) + 2 );
    }
    
}
