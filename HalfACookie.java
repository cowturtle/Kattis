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

class HalfACookie {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Kattio sc = new Kattio(System.in);
        while (sc.hasMoreTokens()) {
            double r = sc.getDouble(), x = sc.getDouble(), y = sc.getDouble();
            double hammerDistFromOrigin = pythagorasHypotenuse(x, y);
            if (hammerDistFromOrigin < r) {
                double cookie_whole = circleArea(r);
                double chord = 2 * pythagorasSide(r, hammerDistFromOrigin);
                double triangle_area = triangleArea(chord, hammerDistFromOrigin);
                double theta = angleBetweenLengths(r, hammerDistFromOrigin);
                double sector = (theta / (2 * Math.PI)) * cookie_whole;
                double segment1 = sector - triangle_area;
                double segment2 = cookie_whole - segment1;
                sb.append(String.format("%.6f", segment2)).append(" ").append(String.format("%.6f", segment1));
            } else {
                sb.append("miss");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

    static double angleBetweenLengths(double radius, double height) {
        return Math.acos(height / radius) * 2;
    }

    static double triangleArea(double base, double height) {
        return (1/2.0) * height * base;
    }

    static double pythagorasSide(double hypotenuse, double other) {
        return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(other, 2));
    }

    static double pythagorasHypotenuse(double other1, double other2) {
        return Math.sqrt(Math.pow(other1, 2) + Math.pow(other2, 2));
    }

    static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
}
