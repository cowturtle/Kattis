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

class CandyDivision {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        long n = Long.parseLong(br.readLine());
        TreeSet<Long> set = new TreeSet<>();
        for (long i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                set.add(i - 1);
                if (n / i <= n) set.add(n / i - 1);
            };
        out.println(set.toString().replace("[", "").replace("]", "").replace(",", ""));
        out.close();
        br.close();
    }

}
