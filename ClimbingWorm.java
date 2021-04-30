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

class ClimbingWorm {
    
    public static void main(String[] args) {
        System.out.println(
            foo(
                java.util.Arrays.stream(
                    new java.util.Scanner(System.in)
                        .nextLine()
                        .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()));
    }

    static int foo(int[] arr) {
        int a = arr[0], b = arr[1], h = arr[2], c = 0;
        while (h > 0) {
            c++;
            h -= a;
            if (h <= 0) break;
            h += b;
        }
        return c;
    }
    
}
