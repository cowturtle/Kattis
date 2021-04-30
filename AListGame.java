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

class AListGame {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static int foo(int n) {
        int count = 0;
        for (int y = 2; y <= Math.sqrt(n); y++) {
            if (n % y == 0) {
                n /= y;
                count++;
                y--;
            }
        }
        return count + 1;
    }
    
}
