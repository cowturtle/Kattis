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

class ReversedBinaryNumbers {
    public static void main(String[] args) {
        new ReversedBinaryNumbers();
    }

    ReversedBinaryNumbers() {
        answer();
    }

    void answer() {
        System.out.println(
            Integer.parseInt(
                new java.lang.StringBuilder(
                    Integer.toBinaryString(
                        new java.util.Scanner(System.in).nextInt()
                    ))
                    .reverse()
                    .toString()
            , 2));
    }
    
}
