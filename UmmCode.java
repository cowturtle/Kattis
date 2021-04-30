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

class UmmCode {

    public static void main(String[] args) throws java.io.IOException {
        String[] s = new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in))
                        .readLine()
                        .replaceAll("[^a-zA-Z0-9 ]", "")
                        .split("\\s+");
        String x = "", res = "";
        for (int i = 0; i < s.length; i++)
            if (s[i].matches("^[um]*$")) 
                for (char c : s[i].toCharArray()) {
                    x += c == 'u' ? '1' : '0';
                    if (x.length() == 7) {
                        res += (char) Integer.parseInt(x, 2);
                        x = "";
                    }
                }                    
        System.out.println(res);
    }

}
