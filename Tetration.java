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

class Tetration {
    
    public static void main(String[] args) {
        System.out.println(String.format("%.6f", foo(Double.parseDouble(new java.util.Scanner(System.in).nextLine()))));
    }

    static double foo(double N) {
        // Tetrating a number a by 5 is just a^a^a^a^a
        // In this case we want to find a powered to infinity
        // NOTE: we are given N, NOT a. basically the result
        // 1. a^infinity = N
        // 2. a^(a^infinity) = N
        // We sub 1 into 2,
        // a^N = N
        // a^(N * 1/N) = N^(1/N)
        // a = N^(1/N)
        return Math.pow(N, 1/N);
    }
    
}
