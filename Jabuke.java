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

class Jabuke {
    
    public static void main(String[] args) {
        new Jabuke();
    }

    Jabuke() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double x1 = sc.getDouble(), 
                y1 = sc.getDouble(), 
                x2 = sc.getDouble(), 
                y2 = sc.getDouble(), 
                x3 = sc.getDouble(), 
                y3 = sc.getDouble();
        double area = getArea(x1, y1, x2, y2, x3, y3);
        int n = sc.getInt(), inside = 0;
        while (n-- > 0) {
            double tx = sc.getDouble(), ty = sc.getDouble();
            inside += area 
                        == (getArea(tx, ty, x2, y2, x3, y3) 
                        + getArea(x1, y1, tx, ty, x3, y3) 
                        + getArea(x1, y1, x2, y2, tx, ty)) ? 1 : 0;
        }
        System.out.printf("%.1f\n%d\n", area, inside);
        sc.close();
    }

    double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
    }

}
