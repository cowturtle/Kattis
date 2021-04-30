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

class GreedyPolygons {
    
    public static void main(String[] args) {
        new GreedyPolygons();
    }

    GreedyPolygons() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            double sides = sc.getDouble(), initial_length = sc.getDouble(), expansion = sc.getDouble(), grabs = sc.getDouble();
            sb.append(newArea(sides, initial_length, expansion, grabs)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    double newArea(double sides, double initial_length, double expansion, double grabs) {
        return polygonArea(sides, initial_length) + (grabs * nSidesQuadrilateralAreas(sides, initial_length, expansion)) + nSidesCornerAreas(expansion, grabs);
    }

    double nSidesCornerAreas(double expansion, double grabs) {
        return Math.PI * Math.pow(expansion * grabs, 2);   
    }

    double nSidesQuadrilateralAreas(double sides, double initial_length, double expansion) {
        return sides * initial_length * expansion;
    }


    double polygonArea(double sides, double length) {
        return (Math.pow(length, 2) * sides) / (4 * Math.tan(Math.PI / sides));
    }

}
