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

class ConvexPolygonArea {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int m = sc.getInt();
            Point[] p = new Point[m];
            for (int i = 0; i < m; i++)
                p[i] = new Point(sc.getInt(), sc.getInt());
            int total = 0;
            for (int i = 0; i < m; i++) {
                Point p1 = p[i];
                Point p2 = i == m - 1 ? p[0] : p[i + 1];
                total += (p1.x * p2.y) - (p1.y * p2.x);
            }
            sb.append(total / 2.0).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
