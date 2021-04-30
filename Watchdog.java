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

class Watchdog {
    
    public static void main(String[] args) {

        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Point) {
                    Point p = (Point) obj;
                    return p.x == this.x && this.y == p.y;
                }
                return false;
            }

            @Override
            public String toString() {
                return this.x + " " + this.y;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int s = sc.getInt(), h = sc.getInt();
            ArrayList<Point> hatches = new ArrayList<>();
            while (h-- > 0)
                hatches.add(new Point(sc.getInt(), sc.getInt()));
            boolean pass = false;
            Point p = null;
            for (int i = 1; i < s && !pass; i++) {
                for (int j = 1; j < s && !pass; j++) {
                    p = new Point(i, j);
                    if (hatches.contains(p)) continue;
                    int l = Math.min(Math.min(i, s - i), Math.min(j, s - j)); // to not fall off
                    pass = true;
                    for (Point hatch : hatches) {
                        if (p.distanceTo(hatch) > l) {
                            pass = false;
                            break;
                        }
                    }
                }
            }
            sb.append(pass ? p : "poodle").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
