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

class AlmostPerfect {
    
    public static void main(String[] args) {
        new AlmostPerfect();
    }

    AlmostPerfect() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = sc.getInt(), x = findSum(n);
            sb.append(n).append(" ");
            if (x == n) {
                sb.append("perfect");
            } else if (Math.abs(x - n) <= 2) {
                sb.append("almost perfect");
            } else {
                sb.append("not perfect");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    int findSum(int n) {
        int x = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    x += i;
                } else x += i + (n / i);
            } 
        }        
        return x - n;
    }

}
