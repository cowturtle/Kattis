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

class WhichBaseIsItAnyway {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            int dec = sc.getInt();
            sb.append(i)
                .append(" ").append(getOctal(dec))
                .append(" ").append(dec)
                .append(" ").append(getHexa(dec))
                .append("\n");            
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int getOctal(int n) {
        int pow = 0, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 7) return 0;
            sum += digit * Math.pow(8, pow++);
            n /= 10;
        }
        return sum;
    }

    static int getHexa(int n) {
        int pow = 0, sum = 0;
        while (n > 0) {
            sum += (n % 10) * Math.pow(16, pow++);
            n /= 10;
        }
        return sum;
    }
    
}
