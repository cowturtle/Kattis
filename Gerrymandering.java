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

class Gerrymandering {
    
    public static void main(String[] args) {
        new Gerrymandering();
    }

    Gerrymandering() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p = sc.getInt(), d = sc.getInt();
        int[][] districts = new int[d][2];

        while (p-- > 0) {
            int precinct = sc.getInt();
            districts[precinct - 1][0] += sc.getInt();
            districts[precinct - 1][1] += sc.getInt();
        }

        int totalWA = 0, totalWB = 0, total = 0;
        for (int[] precinct : districts) {
            total += precinct[0] + precinct[1];

            int needed = (int) Math.floor((double) (precinct[0] + precinct[1]) / 2) + 1;
            if (precinct[0] > precinct[1]) {
                totalWA += precinct[0] - needed;
                totalWB += precinct[1];
                sb.append("A").append(" ");
                sb.append(precinct[0] - needed).append(" ");
                sb.append(precinct[1]);
            } else {
                totalWA += precinct[0];
                totalWB += precinct[1] - needed;
                sb.append("B").append(" ");
                sb.append(precinct[0]).append(" ");
                sb.append(precinct[1] - needed);
            }
            sb.append("\n");
        }
        sb.append(String.format("%.10f", Math.abs(totalWA - totalWB) / (double) total));
        System.out.println(sb.toString());
        sc.close();
    }

}
