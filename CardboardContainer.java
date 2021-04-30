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

class CardboardContainer {

    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLong()));
    }

    static long foo(long n) {
        ArrayList<Long> factors = new ArrayList<>((int) n);
        for (long i = 1; i * i <= n; i++)
            if (n % i == 0) {
                factors.add(i);
                factors.add(n / i);
            }
        Collections.sort(factors, Collections.reverseOrder());        
        long cost = Long.MAX_VALUE;
        int size = factors.size();
        for (int i = 0; i < size; i++) {
            long length = factors.get(i);
            long remainder = n / length;
            for (int j = 0; j < size; j++) {
                long breath = factors.get(j);
                if (remainder % breath == 0) {
                    long height = remainder / breath;
                    cost = Math.min(cost, 2L * (length * breath + breath * height + height * length));                        
                }
            }
        }            
        return cost;
    }

}
