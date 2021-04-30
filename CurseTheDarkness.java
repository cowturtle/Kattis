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

class CurseTheDarkness {
    
    public static void main(String[] args) {

        class Point {
            double x, y;
            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }
        }

        class Candle {

            Point centre;
            double radius = 8.0;
            public Candle(Point centre) {
                this.centre = centre;
            }

            boolean isCovers(Point p) {
                return p.distanceTo(this.centre) <= this.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.getInt();
        while (m-- > 0) {
            Point book = new Point(sc.getDouble(), sc.getDouble());
            int n = sc.getInt();
            boolean light = false;
            while (n-- > 0) 
                if (new Candle(new Point(sc.getDouble(), sc.getDouble())).isCovers(book)) 
                        light = true;
                
            sb.append(light ? "light a candle" : "curse the darkness").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
