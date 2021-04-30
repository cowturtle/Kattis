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

class RedRover {
    
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        int n = s.length();
        int min = n;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                String sub = s.substring(i, j);
                String macroed = s.replace(sub, "M");
                min = Math.min(min, sub.length() + macroed.length());
            }
        System.out.println(min);
    }
    
}
