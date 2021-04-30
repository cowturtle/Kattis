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

class FundamentalNeighbours {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s), neighbour = 1;
            HashMap<Integer, Integer> primeFactors = new HashMap<>();
            getPrimeFactors(primeFactors, n);
            for (Entry<Integer, Integer> e : primeFactors.entrySet())
                neighbour *= (int) Math.pow(e.getValue(), e.getKey());
            out.printf("%d %d\n", n, neighbour);
        }
        out.close();
        br.close();
    }

    static void getPrimeFactors(HashMap<Integer, Integer> primeFactors, int n) {
        int count = 0;
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }

        if (count > 0) primeFactors.put(2, count);
        count = 0;

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) primeFactors.put(i, count);
            count = 0;
        }
        if (n > 2) primeFactors.put(n, 1);
    }

}
