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

class AreYouListening {

    public static void main(String[] args) {

        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public double distanceTo(Point p) {
                return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            }

        }

        class Circle {
            Point centre;
            int radius;

            Circle(Point centre, int radius) {
                this.centre = centre;
                this.radius = radius;
            }

            boolean inRange(Circle c) {
                return this.centre.distanceTo(c.centre) < this.radius + c.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        int cx = sc.getInt(), cy = sc.getInt(), n = sc.getInt();
        Circle me = new Circle(new Point(cx, cy), -1);
        Circle[] listening = new Circle[n];
        for (int i = 0; i < n; i++)
            listening[i] = new Circle(new Point(sc.getInt(), sc.getInt()), sc.getInt());
        int listeners = 0;
        while (listeners < 3) {
            listeners = 0;
            me.radius++;
            for (Circle c : listening) 
                if (me.inRange(c)) listeners++;
        }
        System.out.println(me.radius == 0 ? 0 : me.radius - 1);
        sc.close();
    }

}
