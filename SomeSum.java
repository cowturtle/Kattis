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

class SomeSum {
    
    public static void main(String[] args) {
        System.out.println(sumthing(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static String sumthing(int n) {
        // 1 EITHER
        // 1+2 odd
        // 1+2+3 / 2+3+4 EITHER
        // 1+2+3+4 even
        // 1+2+3+4+5 EITHER
        // 1+2+3+4+5+6 odd
        // 1+2+3+4+5+6+7 EITHER
        // 1+2+3+4+5+6+7+8 even
        // 1+2+3+4+5+6+7+8+9 EITHER
        // 1+2+3+4+5+6+7+8+9+10 odd
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 9) return "Either";
        if (n == 2 || n == 6 || n == 10) return "Odd";
        return "Even";
    }
    
}
