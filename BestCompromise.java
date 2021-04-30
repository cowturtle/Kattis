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

class BestCompromise {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            double[] averages = new double[m];
            for (int i = 0; i < n; i++)  {
                char[] arr = sc.getWord().toCharArray();
                for (int j = 0; j < m; j++)
                    averages[j] += arr[j] == '1' ? 1 : 0;
            }
            for (double d : averages) 
                out.print(d / n < 0.5 ? '0' : '1');
            out.print("\n");
        }
        out.close();
        sc.close();
    }

}
