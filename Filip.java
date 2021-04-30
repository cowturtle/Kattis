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

class Filip {
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int x = flip(sc.getInt()), y = flip(sc.getInt());
        System.out.println((int) Math.max(x, y));
    }

    static int flip(int x) {
        int z = 0;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            z *= 10;
            z += d;
        }
        return z;
    }
}
