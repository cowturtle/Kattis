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

class Vauvau {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), d = sc.getInt();
        int p = sc.getInt(), m = sc.getInt(), g = sc.getInt();
        int cycle1 = a + b, cycle2 = c + d;
        System.out.printf("%s\n%s\n%s\n", 
                            getAttack(p, cycle1, cycle2, a, c),
                            getAttack(m, cycle1, cycle2, a, c),
                            getAttack(g, cycle1, cycle2, a, c));
        sc.close();
    }

    static String getAttack(int person, int cycle1, int cycle2, int a, int c) {
        int p1 = 0;
        int c1 = person % cycle1;
        int c2 = person % cycle2;
        if (c1 > 0 && c1 <= a) p1++;
        if (c2 > 0 && c2 <= c) p1++;

        String print = "";
        if (p1 == 0) {
            print = "none";
        } else if (p1 == 1) {
            print = "one";
        } else {
            print = "both";
        }

        return print;
    }
    
}
