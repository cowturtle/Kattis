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

class Vacuumba {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int m = sc.getInt();
            double x = 0, y = 0, angle = 90;
            while (m-- > 0) {
                double theta = sc.getDouble(), distance = sc.getDouble();
                angle += theta;
                angle %= 360;
                theta = angle;
                theta = Math.toRadians(theta);
                // 1st quadrant
                x += Math.cos(theta) * distance; // cah
                y += Math.sin(theta) * distance; // soh
            }
            sb.append(String.format("%.6f", x));
            sb.append(" ");
            sb.append(String.format("%.6f", y));
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
