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

class EulersNumber {
        
    public static void main(String[] args) {
        System.out.println(String.format("%.15f", euler(Double.parseDouble(new java.util.Scanner(System.in).nextLine()))));
    }

    static double euler(double n) {
        double out = 0, fact = 1;
        if (n > 17) n = 17;
        for (int i = 1; i <= n + 1; i++) {
            out += 1 / (fact);
            fact *= i;
        }
        return out;
    }
    
}
