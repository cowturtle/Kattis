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

class Splat {
    
    public static void main(String[] args) {

        class Point {
            double x,y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            }
        }

        class Circle {
            double radius;
            Point centre;
            String color;

            Circle(double volume, Point centre, String color) {
                this.radius = Math.sqrt(volume / Math.PI);
                this.centre = centre;
                this.color = color;
            }

            boolean isInside(Point p) {
                return this.centre.distanceTo(p) <= this.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        int c = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (c-- > 0) {
            int n = sc.getInt();
            Circle[] colors = new Circle[n];
            for (int i = 0; i < n; i++) {
                Point p = new Point(sc.getDouble(), sc.getDouble());
                double volume = sc.getDouble();
                String color = sc.getWord();
                colors[i] = new Circle(volume, p, color);
            }
            int m = sc.getInt();
            while (m-- > 0) {
                String ans = "";
                Point p = new Point(sc.getDouble(), sc.getDouble());
                for (Circle drop : colors)
                    if (drop.isInside(p)) ans = drop.color;
                sb.append(ans.equals("") ? "white" : ans);
                sb.append("\n");
            }
        }
        System.out.print(sb.toString().trim());
        sc.close();        
    }
    
}
