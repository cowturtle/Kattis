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

class Zamka {
    
    public static void main(String[] args) {
        new Zamka();
    }

    Zamka() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int l = sc.getInt(), d = sc.getInt(), x = sc.getInt();
        System.out.printf("%d %d\n", getMin(l,d,x), getMax(l,d,x));
        // sc.close();
    }

    int getMin(int l, int d, int x) {
        for (int i = l; i <= d; i++) {
            int z = i;
            int t = 0;
            while (z > 0) {
                t += z % 10;
                z /= 10;
            }
            if (t == x) return i;
        }
        return -1;
    }

    int getMax(int l, int d, int x) {
        for (int i = d; i >= l; i--) {
            int z = i;
            int t = 0;
            while (z > 0) {
                t += z % 10;
                z /= 10;
            }
            if (t == x) return i;
        }
        return -1;
    }

}
