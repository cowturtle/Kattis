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

class SantaKlas {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String foo(int[] arr) {
        int h = arr[0], v = arr[1];
        if (v <= 180) return "safe";
        return String.valueOf((int) (h / Math.cos(Math.toRadians(v) + (Math.PI / 2))));
    }
    
}
