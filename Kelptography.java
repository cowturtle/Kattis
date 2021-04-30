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

class Kelptography {
    
    public static void main(String[] args) {
        new Kelptography();
    }

    Kelptography() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();

        char[] lastChars = sc.getWord().toCharArray();
        char[] encrypted = sc.getWord().toCharArray();
        
        char[] decrypted = new char[m];

        int x = n;
        for (int i = m - 1; i > m - n - 1; i--) {
            decrypted[i] = lastChars[--x];
        }
        for (int i = m - 1; i >= n; i--) {
            int deChar = 26 + encrypted[i] - decrypted[i];
            deChar %= 26;
            deChar += 97;
            decrypted[i - n] = (char) deChar;
        }
        System.out.println(
            java.util.stream.IntStream.range(0, decrypted.length)
                .mapToObj(t -> decrypted[t] + "")
                .reduce("", (t,v) -> t + v));
        // sc.close();
    }   
 
}
