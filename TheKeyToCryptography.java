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

class TheKeyToCryptography {
    
    public static void main(String[] args) {
        new TheKeyToCryptography();
    }

    TheKeyToCryptography() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        String cipher = sc.getWord(), secret = sc.getWord(), plain = "";
        int clen = cipher.length();
        for (int i = 0; i < clen; i++) {
            int c = cipher.charAt(i) - secret.charAt(i);
            c = c < 0 ? c + 26 : c;
            c += 65;
            plain += (char) c;
            secret += (char) c;
        }
        System.out.println(plain);
    }
    
}
