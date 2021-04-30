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

class FractionalLotion {
    
    public static void main(String[] args) {

        // 1/x + 1/y = 1/n
        // 1/x = 1/n - 1/y
        // x = 1 / (1/n - 1/y);
        // x = 1 / ((y - n)/(n * y))
        // x = (n * y) / (y - n)

        // 1/n = 1/1
        // x = (1 * y) / (y - 1)

        // y must be > n, lower bound
        // x = (1 * 2) / (2 - 1) = 1 / 1

        // upper bound?
        // 1/n = 1/4
        
        // x = (4 * 5) / (5 - 4) = 20 / 1
        // x = (4 * 6) / (6 - 4) = 24 / 2
        // x = (4 * 7) / (7 - 4) = 28 / 3 X
        // x = (4 * 8) / (8 - 4) = 32 / 4
        // x = (4 * 9) / (9 - 4) = 36 / 5 X
        // x = (4 * 10) / (10 - 4) = 40 / 6 X
        // x = (4 * 11) / (11 - 4) = 44 / 7 X
        // x = (4 * 12) / (12 - 4) = 48 / 8 X
        // x = (4 * 13) / (13 - 4) = 52 / 9 X
        // x = (4 * 14) / (14 - 4) = 56 / 10 X
        // x = (4 * 15) / (15 - 4) = 60 / 11 X
        // x = (4 * 16) / (16 - 4) = 64 / 12 X

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = Integer.parseInt(sc.getWord().split("/")[1]);
            int start = n + 1, end = n * 2, count = 0;
            for (int y = start; y <= end; y++)
                if ((n * y) % (y - n) == 0) count++;
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
