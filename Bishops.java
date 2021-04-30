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

class Bishops {

    public static void main(String[] args) {
        // https://en.wikibooks.org/wiki/Chess/Puzzles/Placement/14_Bishops/Solution#:~:text=Since%2014%20bishops%20is%20possible,no%20two%20attack%20each%20other.v
        // placement is one straight line one each side, take away bishops at one side's rook ends.
        // 0 0
        // 1 1
        // 2 2
        // 3 4
        // 4 6 
        // 5 8
        // 6 10
        // 7 12
        // 8 14

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (sc.hasMoreTokens()) {
            int n = sc.getInt();
            out.println(n == 0 || n == 1 ? n : 2 * n - 2);
        }
        out.close();
        sc.close();
    }

}

