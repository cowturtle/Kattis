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

class Ostgotska {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine().split("\\s+")));
    }

    static String foo(String[] input) {
        double count = 0;
        for (int i = 0; i < input.length; i++)
            if (input[i].contains("ae")) count++;
        return count / input.length >= 0.4 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska";
    }
    
}
