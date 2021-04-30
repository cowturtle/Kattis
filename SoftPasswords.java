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

class SoftPasswords {
    
    public static void main(String[] args) {
        new SoftPasswords();
    }

    SoftPasswords() {
        answer();
    }

    void answer() {    
        Kattio sc = new Kattio(System.in);
        String s = sc.getWord(), p = sc.getWord();
        System.out.println(check(s, p) ? "Yes" : "No");
        // sc.close();
    }
    
    boolean check(String s, String p) {
        if (s.equals(p)) return true;
        if (s.substring(0, s.length() - 1).equals(p) 
            && 48 <= s.charAt(s.length() - 1) && s.charAt(s.length() - 1) <= 57) return true;
        if (s.substring(1, s.length()).equals(p)
            && 48 <= s.charAt(0) && s.charAt(0) <= 57) return true;
        if (s.length() != p.length()) return false;
        if (reverse(s, p)) return true;
        return false;
    }

    boolean reverse(String s, String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (65 <= c && c <= 90) {
                c = (char) (c + 32);
            } else if (97 <= c && c <= 122) {
                c = (char) (c - 32);
            }
            if (c != s.charAt(i)) return false;
        }
        return true;
    }

}
