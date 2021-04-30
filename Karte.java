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

class Karte {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine().toCharArray()));
    }

    static String foo(char[] input) {
        int p = 13, k = 13, h = 13, t = 13;
        for (int i = 0; i < input.length; i += 3) {
            if (input[i] == 'P') p--;
            else if (input[i] == 'K') k--;
            else if (input[i] == 'H') h--;
            else if (input[i] == 'T') t--;
            for (int j = i + 3; j < input.length; j += 3) {
                if ((input[i] + "" + input[i + 1] + "" + input[i + 2]).equals(input[j] + "" + input[j + 1] + "" + input[j + 2]))
                        return "GRESKA";
            }
        }
        return p + " " + k + " " + h + " " + t;
    }
    
}
