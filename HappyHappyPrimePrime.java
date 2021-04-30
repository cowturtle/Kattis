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

class HappyHappyPrimePrime {
    
    static HashMap<Integer, Integer> hmap = new HashMap<>();

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int x = sc.getInt();
            sb.append(x).append(" ");
            sb.append(isHappyPrime(x) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int powerPerDigit(int n) {
        if (hmap.containsKey(n)) return hmap.get(n);
        int x = 0;
        while (n > 0) {
            x += (int) Math.pow((n % 10), 2);
            n /= 10;
        }
        hmap.put(n, x);
        return x;
    }

    static boolean isHappyPrime(int n) {
        if (!isPrime(n)) return false;
        ArrayList<Integer> al = new ArrayList<>();
        while (n > 1 && !al.contains(n)) {
            al.add(n);
            n = powerPerDigit(n);
        }
        return n == 1;
    }

    static boolean isPrime(int n) {
        if (n == 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(x -> n % x == 0);
    }
    
}
