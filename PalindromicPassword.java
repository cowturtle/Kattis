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

class PalindromicPassword {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        boolean[] palindrome = new boolean[1000000]; // 0 - 100000 - 999999
        for (int i = 100000; i <= 999999; i++) 
            palindrome[i] = isPalindrome(i);
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt(), down = 0, up = 0;
            for (up = x; up <= 999999; up++)
                if (isPalindrome(up)) break;
            for (down = x; down >= 99999; down--)
                if (isPalindrome(down)) break;                
            if (up - x > x - down) {
               out.println(down);
            } else if (up - x < x - down) {
                out.println(up);
            } else {
                out.println((int) Math.min(down, up)); 
            }
        }
        out.close();
        sc.close();
    }

    static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        s = "0".repeat(6 - s.length()) + s;
        return s.charAt(0) == s.charAt(5) && s.charAt(1) == s.charAt(4) && s.charAt(2) == s.charAt(3);
    }

}
