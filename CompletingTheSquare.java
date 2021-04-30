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

class CompletingTheSquare {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

        }

        Kattio sc = new Kattio(System.in);
        Point a = new Point(sc.getInt(), sc.getInt());
        Point b = new Point(sc.getInt(), sc.getInt());
        Point c = new Point(sc.getInt(), sc.getInt());
        Point ans = new Point(0, 0);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        if (ab == bc) {
            ans.x = a.x + c.x - b.x;
            ans.y = a.y + c.y - b.y;
        } else if (bc == ca) {
            ans.x = b.x + a.x - c.x;
            ans.y = b.y + a.y - c.y;
        } else if (ca == ab) {
            ans.x = c.x + b.x - a.x;
            ans.y = c.y + b.y - a.y;
        }
        System.out.printf("%d %d\n", ans.x, ans.y);
        sc.close();
    }
    
}
