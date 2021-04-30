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

class TheEasiestProblemIsThisOne {
    
    public static void main(String[] args) {
        new TheEasiestProblemIsThisOne();
    }

    TheEasiestProblemIsThisOne() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while ((n = sc.getInt()) != 0) {
            int target = sumOfDigits(n);
            int x = 10;
            while (x++ < Integer.MAX_VALUE) {
                if (sumOfDigits(n * x) == target) break;
            }
            sb.append(x).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    int sumOfDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumOfDigits(n / 10);
    }

}
