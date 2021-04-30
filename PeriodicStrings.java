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

class PeriodicStrings {

    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        char[] input = s.toCharArray();
        int k = 1;
        boolean found = false;
        for (; k < input.length; k++) {
            if (input.length % k != 0) continue;
            found = true;
            String toMatch = s.substring(0, k);
            for (int i = 0; i < input.length; i += k) {
                for (int j = 0; j < k && j < input.length; j++)
                    if (toMatch.charAt(j) != input[i + j]) {
                        found = false;
                        break;
                    }
                if (!found) break;
                toMatch = toMatch.charAt(k - 1) + toMatch.substring(0, k - 1);
            }
            if (found) break;
        }     
        System.out.println(k);
    }

}
