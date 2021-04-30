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
// https://www.mathsisfun.com/algebra/matrix-inverse.html
class MatrixInverse {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        while (sc.hasMoreTokens()) {
            out.printf("Case %d:\n", t++);
            int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), d = sc.getInt();
            int determinant = a *d - b * c; // scalar value
            out.printf("%d %d\n", d / determinant, -b / determinant);
            out.printf("%d %d\n", -c / determinant, a / determinant);
        }
        out.close();
        sc.close();
    }

}
