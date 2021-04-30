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

class Yoda {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String a = sc.getWord(), b = sc.getWord();
        if (a.length() > b.length()) {
            b = "0".repeat(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            a = "0".repeat(b.length() - a.length()) + a;
        }
        int n = a.length();
        String aleft = "", bleft = "";
        for (int i = 0; i < n; i++) {
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            int ai = Character.getNumericValue(ac);
            int bi = Character.getNumericValue(bc);
            if (ai > bi) {
                aleft += ac;
            } else if (bi > ai) {
                bleft += bc;
            } else {
                aleft += ac;
                bleft += bc; 
            }
        }
        System.out.println(aleft.equals("") ? "YODA" : Integer.parseInt(aleft));
        System.out.println(bleft.equals("") ? "YODA" : Integer.parseInt(bleft));        
        sc.close();
    }
    
}
