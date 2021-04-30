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

class TaiFormula {
    
    public static void main(String[] args) {
        new TaiFormula();
    }

    TaiFormula() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        double area = 0;

        double prevX = sc.getDouble(), prevY = sc.getDouble(),
                nextX = 0, nextY = 0; 

        while (n-- > 0) {
            nextX = sc.getDouble();
            nextY = sc.getDouble(); 
            area += trapezoidArea(prevX, prevY, nextX, nextY);
            prevX = nextX;
            prevY = nextY;
        }
        System.out.println(area / 1000);
        sc.close();
    }

    double trapezoidArea(double x1, double y1, double x2, double y2) {
        return 1/2.0 * (y1 + y2) * (x2 - x1);
    }

}
