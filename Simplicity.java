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

class Simplicity {

    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] count = new int[26];
        for (char c : arr) count[c - 97]++;
        java.util.Arrays.sort(count);
        System.out.println(java.util.stream.IntStream.range(0, 26 - 2).map(x -> count[x]).reduce(0, (x,y) -> x + y));
    }
    
}
