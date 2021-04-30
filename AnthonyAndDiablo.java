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

class AnthonyAndDiablo {
    
    public static void main(String[] args) {
        double[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();
        double A = arr[0];
        double N = arr[1];
        double r = N / (2 * Math.PI); // Let n be the circumferance of circle
        double a = Math.PI * r * r;
        if (a >= A) {
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
    
}
