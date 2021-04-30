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

class BestCompressionEver {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray()));
    }

    static String foo(long[] arr) {
        arr[1] += 1;
        arr[1] = 1L << arr[1]; // Power function, new cool. think of 1 as 2^0. << is signed right bit shift operator.
        arr[1] -= 1;
        return arr[0] <= arr[1] ? "yes" : "no";
    }
    
}
