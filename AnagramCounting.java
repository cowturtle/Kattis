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

class AnagramCounting {
    
    static final BigInteger[] factorials = new BigInteger[101];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        iniFact();
        while (sc.hasMoreTokens()) {
            String org = sc.getWord();
            BigInteger total = factorials[org.length()];
            int[] letters = new int[123];
            for (char c : org.toCharArray())
                letters[c]++;
            for (int i : letters)
                total = total.divide(factorials[i]);
            sb.append(total).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void iniFact() {
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i < 101; i++)
            factorials[i] = BigInteger.valueOf(i).multiply(factorials[i - 1]);
    }
    
}
