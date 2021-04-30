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

class TheAmazingHumanCannonball {
    
    static final double _GRAVITY = 9.81;

    public static void main(String[] args) {
        new TheAmazingHumanCannonball();
    }

    TheAmazingHumanCannonball() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        while (n-- > 0) {
            double v0 = sc.getDouble(), 
                    theta = Math.toRadians(sc.getDouble()), 
                    x1 = sc.getDouble(),
                    h1 = sc.getDouble() + 1,
                    h2 = sc.getDouble() - 1;
            double y = getY(v0, getT(x1, v0, theta), theta);
            System.out.println(h1 < y && y < h2 ? "Safe" : "Not Safe");
        }
        // sc.close();
    }

    double getT(double x1, double v0, double theta) {
        return x1 / (Math.cos(theta) * v0);
    }

    double getY(double v0, double t, double theta) {
        return (v0 * t * Math.sin(theta)) - (0.5 * _GRAVITY * Math.pow(t, 2));
    }

}
