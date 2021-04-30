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

class Parket {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String foo(int[] arr) {
        int r = arr[0], b = arr[1], total = r + b;
        int i = 3;
        for (; i < total; i++) {
            if (total % i == 0 
                && ((total / i) - 2) * (i - 2) == b) break;
        }
        return (int) Math.max(i, total / i) + " " + (int) Math.min(i, total / i);
    }
    
}
