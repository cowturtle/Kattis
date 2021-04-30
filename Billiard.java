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
class Billiard {
    
    public static void main(String[] args) {
        new Billiard();
    }

    Billiard() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double a = 0, b = 0, s = 0, m = 0, n = 0;
        while ((a = sc.getInt()) != 0 && (b = sc.getInt()) != 0 && (s = sc.getInt()) != 0 && (m = sc.getInt()) != 0 && (n = sc.getInt()) != 0) {
            // a -> hort side
            // b -> vert side
            // s -> time
            // m -> bounces off vert side
            // n -> bounces off horizontal side

            double hortDist = a * m, vertDist = b * n;
            
            double angleA = Math.round(Math.toDegrees(Math.atan(vertDist / hortDist) * 100.0)) / 100.0;
            double distTravel = Math.sqrt(Math.pow(hortDist, 2) + Math.pow(vertDist, 2));
            double speed = distTravel / s;

            sb.append(String.format("%.2f", angleA)).append(" ").append(String.format("%.2f", speed)).append("\n");
        }   
        System.out.println(sb.toString()); 
        sc.close();
    }
    
}
