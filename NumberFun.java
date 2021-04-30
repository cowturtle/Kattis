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

class NumberFun {
    
    public static void main(String[] args) {
        new NumberFun();
    }

    NumberFun() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            sb.append(check(sc.getInt(), sc.getInt(), sc.getInt()) ? "Possible" : "Impossible");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        // sc.close();
    }   

    boolean check(int a, int b, int c) {
        return a + b == c 
            || a - b == c
            || b - a == c
            || a * b == c
            || ((double) a) / b == (double) c
            || ((double) b) / a == (double) c;
    }
 
}
