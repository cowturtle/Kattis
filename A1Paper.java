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

class A1Paper {
    
    static final double A2LongEdge = Math.pow(2, -3.0 / 4);
    static final double A2ShortEdge = Math.pow(2, -5.0 / 4);

    public static void main(String[] args) {
        // Taping by the longedge is the best method
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        long[] papers = new long[n - 1];
        for (int i = 0; i < n - 1; i++)
            papers[i] = sc.getLong();
        
        double tapeCount = 0;
        long paperCount = 1; // Start from 1 as we represent 1 A2 paper

        double constructLongEdge = A2LongEdge;
        double constructShortEdge = A2ShortEdge;

        for (int i = 0; i < n - 1 && paperCount > 0; i++) {
            // 3. Tape length of long edges
            tapeCount += paperCount * constructLongEdge;

            // 1. The amount of paper required for that size to get an A1
            paperCount *= 2;
            paperCount -= papers[i];

            // 2. Go to next paper size
            double tmp = constructLongEdge;
            constructLongEdge = constructShortEdge;
            constructShortEdge = tmp / 2;

        }

        System.out.println(paperCount > 0 ? "impossible" : tapeCount);
        sc.close();
    }
    
}
