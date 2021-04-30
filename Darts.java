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

class Darts {
    
    public static void main(String[] args) {
        int[] scores = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] radiuses = new int[10];
        for (int i = 0; i < 10; i++)
            radiuses[i] = 20 * (11 - scores[i]);
        Kattio sc = new Kattio(System.in);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt(), total = 0;
            while (n-- > 0) {
                double distance = distance(sc.getDouble(), sc.getDouble());
                for (int i = 0; i < 10; i++)
                    if (distance <= radiuses[i]) {
                        total += scores[i];
                        break;
                    }
            }
            System.out.println(total);
        }
        sc.close();
    }

    static double distance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
}

