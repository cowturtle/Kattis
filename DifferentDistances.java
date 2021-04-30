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

class DifferentDistances {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double x1 = 0;
        while ((x1 = sc.getDouble()) != 0) {
            double y1 = sc.getDouble(), x2 = sc.getDouble(), y2 = sc.getDouble(), p = sc.getDouble();
            sb.append(String.format("%.10f", pnorm(x1, y1, x2, y2, p))).append("\n");
        }        
        System.out.println(sb.toString());
        sc.close();
    }

    static double pnorm(double x1, double y1, double x2, double y2, double p) {
        return Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1.0 / p); 
    }
    
}
