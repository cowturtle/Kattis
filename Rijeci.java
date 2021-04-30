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

class Rijeci {
    
    public static void main(String[] args) {
        new Rijeci();
    }

    Rijeci() {
        answer();
    }

    void answer() { 
        System.out.println(plan(new java.util.Scanner(System.in).nextInt()));
    }

    String plan(int n) {
        int a = 1, b = 0;
        while (n-- > 0) {
            int tmp = b;
            b += a;
            a = tmp;
        }
        // 0 1 0 A
        // 1 0 1 B
        // 2 1 1 BA
        // 3 1 2 BAB
        // 4 2 3 BABBA
        // 5 3 5 BABBABAB
        // 6 5 8 BABBABABBABBA
        return a + " " + b;
    }

}
