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

class GoatRope {
    
    public static void main(String[] args) {
        new GoatRope();
    }

    GoatRope() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        Point2 goat = new Point2(sc.getDouble(), sc.getDouble());
        Point2 one = new Point2(sc.getDouble(), sc.getDouble());
        Point2 two = new Point2(sc.getDouble(), sc.getDouble());

        double t = 0;
        if (one.x <= goat.x && goat.x <= two.x) { // If the goat is between the x length of the house
            if (Math.abs(goat.y - one.y) < Math.abs(goat.y - two.y)) {
                t = Math.abs(goat.y - one.y);
            } else t = Math.abs(goat.y - two.y);
        } else if (one.y <= goat.y && goat.y <= two.y) { // If the goat between the y length of the house
            if (Math.abs(goat.x - one.x) < Math.abs(goat.x - two.x)) {
                t = Math.abs(goat.x - one.x);
            } else t = Math.abs(goat.x - two.x);
        } else { // If the goat inbetween neither of the x or y length
            double cX = 0;
            double cY = 0;
            if (Math.abs(goat.x - one.x) <= Math.abs(goat.x - two.x)) {
                cX = one.x;
            } else cX = two.x;
            if (Math.abs(goat.y - one.y) <= Math.abs(goat.y - two.y)) {
                cY = one.y;
            } else cY = two.y;
            t = goat.distanceTo(new Point2(cX, cY));
        }
        System.out.println(t);
        sc.close();
    }

}

class Point2 {
    double x, y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point2 p) {
        return Math.sqrt(Math.pow(this.y - p.y ,2) + Math.pow(this.x - p.x ,2)); 
    }
}
