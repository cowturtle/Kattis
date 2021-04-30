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

class Prsteni {
    
    public static void main(String[] args) {
        new Prsteni();
    }

    Prsteni() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int rings = sc.getInt();
        int[] radius = new int[rings];
        double relation = 1;
        for (int i = 0; i < rings; i++)
            radius[i] = sc.getInt();
        for (int i = 0; i < rings - 1; i++) {
            double x = radius[i] * relation;
            double y = radius[i + 1];
            relation = x / y;
            sb.append(fractions(x,y)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    String fractions(double x, double y) {
        double divisor = gcd(x, y);
        return String.valueOf((int) (x / divisor) + "/" + (int) (y / divisor));
    }

    double gcd(double x, double y) {
        if (y > x) return gcd(y, x);
        if (Math.abs(y) < 0.001) return x;
        return gcd(y, x - Math.floor(x / y) * y);
    }
    
}
