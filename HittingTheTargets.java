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

class HittingTheTargets {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.getInt();
        TargetShape[] arr = new TargetShape[m];
        for (int i = 0; i < m; i++) {
            String s = sc.getWord();
            if (s.equals("rectangle")) {
                arr[i] = new TargetRectangle(new TargetPoint(sc.getDouble(), sc.getDouble()), new TargetPoint(sc.getDouble(), sc.getDouble()));
            } else {
                arr[i] = new TargetCircle(new TargetPoint(sc.getDouble(), sc.getDouble()), sc.getDouble());
            }
        }

        int n = sc.getInt();
        while (n-- > 0) {
            TargetPoint p = new TargetPoint(sc.getDouble(), sc.getDouble());
            int count = 0;
            for (TargetShape ts : arr)
                if (ts.isInside(p)) count++;
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

interface TargetShape {
    boolean isInside(TargetPoint o);
}

class TargetPoint {
    private final double x;
    private final double y;

    public TargetPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(TargetPoint o) {
        return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2));
    }

    public boolean xBetween(TargetPoint p1, TargetPoint p3) {
        return p1.x <= this.x && this.x <= p3.x;
    }

    public boolean yBetween(TargetPoint p1, TargetPoint p3) {
        return p1.y <= this.y && this.y <= p3.y;
    }

}

class TargetRectangle implements TargetShape {
    private final TargetPoint bottoml;   
    private final TargetPoint topr;   

    public TargetRectangle(TargetPoint bottoml, TargetPoint topr) {
        this.bottoml = bottoml;
        this.topr = topr;
    }

    @Override
    public boolean isInside(TargetPoint o) {
        return o.xBetween(this.bottoml, this.topr) && o.yBetween(this.bottoml, this.topr);
    }

}

class TargetCircle implements TargetShape {
    private final TargetPoint centre;
    private final double radius;

    public TargetCircle(TargetPoint centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public boolean isInside(TargetPoint o) {
        return this.centre.distanceTo(o) <= radius;
    }

}
