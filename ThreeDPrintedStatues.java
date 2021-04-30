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

class ThreeDPrintedStatues {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static int foo(int n) {
        if (n == 1) return 1;
        int printer = 1, days = 1;
        while (printer < n) {
            printer *= 2;
            days++;
        }
        return days;
    }
    
}
