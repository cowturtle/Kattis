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

class LooRolls {
    
    public static void main(String[] args) {
        long[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        long count = 0, x = 0;
        while ((x = arr[0] % arr[1]) != 0) {
            arr[1] -= x;
            count++;
        }            
        System.out.println(++count);            
    }
    
}
