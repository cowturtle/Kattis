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

class Kemija {
    
    public static void main(String[] args) {
        new Kemija();
    }

    Kemija() {
        answer();
    }

    void answer() {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isVowel(c)) i += 2;
                sb.append(c);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
