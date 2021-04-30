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

class TimeTravellingTemperatures {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray()));
    }
    
    static String foo(double[] arr) {
        double a = 0.0, b = arr[0];
        double da = 1.0, db = arr[1];
        if (db == 1) {
            if (b == 0) {
                return "ALL GOOD";
            }
            return "IMPOSSIBLE";
        }
        return String.format("%.10f", - (a - b) / (da - db));
    }

}
