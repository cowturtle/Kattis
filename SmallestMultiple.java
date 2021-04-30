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

class SmallestMultiple {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            BigInteger common = new BigInteger(arr[0]);
            for (int i = 1; i < arr.length; i++)
                common = lcm(common, new BigInteger(arr[i]));
            out.println(common);
        }
        out.close();
        br.close();
    }

    static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(x.gcd(y));
    }

}
