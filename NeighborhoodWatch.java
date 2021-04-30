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

class NeighborhoodWatch {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt(), k = sc.getInt() + 2;
        long safety = gaussFormula((long) n);
        long[] safeHouses = new long[k];
        safeHouses[0] = 0L;
        safeHouses[k - 1] = n + 1;
        for (int i = 1; i < k - 1; i++)
            safeHouses[i] = sc.getLong();
        for (int i = 0; i < k - 1; i++) 
            safety -= gaussFormula(safeHouses[i + 1] - safeHouses[i] - 1); // any trip inbetween is not safe.
        out.println(safety);
        out.close();
        sc.close();
    }

    static long gaussFormula(long n) {
        return (n * (n + 1)) / 2L;
    }

}
