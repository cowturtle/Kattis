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

class LockedTreasure {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[][] combinations = new int[31][31];
        for (int i = 1; i < 31; i++) // start from 1 to match input
            combinations[i][1] = 1;
        for (int i = 1; i < 31; i++)
            combinations[1][i] = 1;
        for (int i = 2; i < 31; i++)
            for (int j = 2; j < 31; j++)
                combinations[i][j] = j <= i ? combinations[i - 1][j] + combinations[i - 1][j - 1] : 1; // binomial theorem. limit is n and can iterate from any 1 to m            
        int t = sc.getInt();
        while (t-- > 0)
            out.println(combinations[sc.getInt()][sc.getInt()]);
        out.close();
        sc.close();
    }

}
