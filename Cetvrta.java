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

class Cetvrta {
    public static void main(String[] args) {
        new Cetvrta();
    }

    Cetvrta() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int x1 = sc.getInt(), y1 = sc.getInt();
        int x2 = sc.getInt(), y2 = sc.getInt();
        int x3 = sc.getInt(), y3 = sc.getInt();
        int x4 = 0, y4 = 0;

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.printf("%d %d \n", x4, y4);
    }

}
