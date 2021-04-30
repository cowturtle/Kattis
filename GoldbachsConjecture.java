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

class GoldbachsConjecture {
    
    public static void main(String[] args) {

        class Sum {
            int first, second;
            Sum(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] primes = new boolean[32001];
        getPrimes(primes);
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt();
            int first = x == 4 ? 2 : 1, second = 0;
            ArrayList<Sum> al = new ArrayList<>();
            while (first <= (second = x - first)) {
                if (primes[first] && primes[second]) 
                    al.add(new Sum(first, second));
                first += 2;
            }
            sb.append(x + " has " + al.size() + " representation(s)").append("\n");
            for (Sum sum : al)
                sb.append(sum.first + "+" + sum.second).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void getPrimes(boolean[] primes) {
        for (int i = 2; i <= 32000; i++) 
            primes[i] = isPrime(i);
    }

    static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(x -> n % x == 0);
    }
    
}
