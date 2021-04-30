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

class JanitorTroubles {
    
    public static void main(String[] args) {
        new JanitorTroubles();
    }

    JanitorTroubles() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        System.out.println(brahmaguptaFormula(sc.getDouble(), sc.getDouble(), sc.getDouble(), sc.getDouble()));
        sc.close();
    }

    double brahmaguptaFormula(double a, double b, double c, double d) {
        double s = semiperimeter(a, b, c, d);
        return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d));
    }

    double semiperimeter(double a, double b, double c, double d) {
        return (a + b + c + d) / 2;
    }

}
