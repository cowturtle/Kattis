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

class WordsForNumbers {
    
    private static final String[] oneToTwenty = new String[] {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", 
                                                                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = new String[] {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};                                                    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine())
            sb.append(foo(sc.nextLine())).append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static String foo(String s) {
        String[] arr = s.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (isNumeric(arr[i])) {
                arr[i] = convert(arr[i]).trim().replaceAll("\\s+", "-");
                if (i == 0) {
                    arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1, arr[i].length());
                }
            }
        }
        String ss = "";
        for (String sss : arr) 
            ss += sss + " ";
        return ss.trim();
    }

    static String convert(String s) {
        int i = Integer.parseInt(s);
        if (i == 0) return "zero";
        String ss = "";
        if (i < 20) {
            ss = oneToTwenty[i];
        } else {
            ss = oneToTwenty[i % 10];
            i /= 10;
            ss = tens[i] + ss;
        }
        return ss;
    }

    static boolean isNumeric(String s) {
        if (s == null) return false;
        try {
            int i = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
}
