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

class TheDragonOfLoowater {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();
            if (n == 0 && m == 0) break;
            int[] heads = new int[n];
            int[] knights = new int[m];
            int sumHeads = 0, sumKnights = 0;
            for (int i = 0; i < n; i++)
                sumHeads += heads[i] = sc.getInt();
            for (int i = 0; i < m; i++)
                sumKnights += knights[i] = sc.getInt();
            if (sumKnights < sumHeads || m < n) {
                out.println("Loowater is doomed!");
            } else {
                Arrays.sort(heads);
                Arrays.sort(knights);
                int h = 0, k = 0, cost = 0;
                for (; h < n; h++) {
                    if (k == m) break;
                    for (; k < m; k++)
                        if (heads[h] <= knights[k])  {
                            cost += knights[k++];
                            break;
                        }
                }
                if (k == m && h < n) {
                    out.println("Loowater is doomed!");
                } else {
                    out.println(cost);
                }                
            }
        }
        out.close();
        sc.close();
    }

}
