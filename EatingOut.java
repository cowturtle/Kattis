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

class EatingOut {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int m = arr[0], a = arr[1], b = arr[2], c = arr[3];
        System.out.println(a + b + c <= 2 * m ? "possible" : "impossible"); // max is 2 people pick same item
    }
    
}
