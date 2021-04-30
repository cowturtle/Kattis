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

class JewelryBox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(String.format("%.10f", findMaxVol(sc.getInt(), sc.getInt()))).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    static double findMaxVol(int x, int y) {
        double firstRoot = rootPos(x, y);
        double secondRoot = rootNeg(x, y);
        if (determineMax(x, y, firstRoot)) {
            return findVolume(x, y, firstRoot);
        }
        return findVolume(x, y, secondRoot);
    }

    static double findVolume(int x, int y, double h) {
        return (x - (2 * h)) * (y - (2 * h)) * h;
    }

    static boolean determineMax(int x, int y, double root) {
        return 4 * ((6 * root) - (double) x - (double) y) < 0;
    }

    static double rootPos(int x, int y) {
        int a = 12, b = -4 * (x + y), c = x * y;
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    static double rootNeg(int x, int y) {
        int a = 12, b = -4 * (x + y), c = x * y;
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
    
}
