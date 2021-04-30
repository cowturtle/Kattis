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

class DogAndGopher {
    
    public static void main(String[] args) {

        class Point {
            double x, y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

            boolean isEmpty() {
                return this.x == Double.MAX_VALUE && this.y == Double.MAX_VALUE;
            }

        }

        Kattio sc = new Kattio(System.in);
        Point gopher = new Point(sc.getDouble(), sc.getDouble());
        Point dog = new Point(sc.getDouble(), sc.getDouble());
        Point escape = new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        while (sc.hasMoreTokens()) {
            Point hole = new Point(sc.getDouble(), sc.getDouble());
            double gopherDistance = gopher.distanceTo(hole);
            double dogDistance = dog.distanceTo(hole) / 2;
            if (gopherDistance < dogDistance) {
                escape = hole;
                break;
            }
        }
        System.out.println(escape.isEmpty() ? "The gopher cannot escape." : "The gopher can escape through the hole at (" + String.format("%.3f", escape.x) + "," + String.format("%.3f", escape.y) + ").");
        sc.close();
    }
    
}
