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

class ImperialMeasurement {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        System.out.println(thouToAnything(anythingToThou(Double.parseDouble(arr[0]), arr[1]), arr[3]));
    }

    static double anythingToThou(double x, String s) {
        switch(s) {
            case "th": case "thou": return x * 1;
            case "in": case "inch": return x * (1 * 1000);
            case "ft": case "foot": return x * (1 * 1000 * 12);
            case "yd": case "yard": return x * (1 * 1000 * 12 * 3);
            case "ch": case "chain": return x * (1 * 1000 * 12 * 3 * 22);
            case "fur": case "furlong": return x * (1 * 1000 * 12 * 3 * 22 * 10);
            case "mi": case "mile": return x * (1 * 1000 * 12 * 3 * 22 * 10 * 8);
            case "lea": case "league": return x * (1 * 1000 * 12 * 3 * 22 * 10 * 8 * 3);
            default: return 0;
        }
    }

    static double thouToAnything(double x, String s) {
        switch(s) {
            case "th": case "thou": return x / 1;
            case "in": case "inch": return x / (1 * 1000);
            case "ft": case "foot": return x / (1 * 1000 * 12);
            case "yd": case "yard": return x / (1 * 1000 * 12 * 3);
            case "ch": case "chain": return x / (1 * 1000 * 12 * 3 * 22);
            case "fur": case "furlong": return x / (1 * 1000 * 12 * 3 * 22 * 10);
            case "mi": case "mile": return x / (1 * 1000 * 12 * 3 * 22 * 10 * 8);
            case "lea": case "league": return x / (1 * 1000 * 12 * 3 * 22 * 10 * 8 * 3);
            default: return 0;
        }
    }
    
}
