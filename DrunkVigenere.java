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

class DrunkVigenere {
    
    public static void main(String[] args) {
        new DrunkVigenere();
    }

    DrunkVigenere() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        String c = sc.getWord(), k = sc.getWord(), out = "";
        int len = c.length();
        for (int i = 0; i < len; i++) {
            char cChar = c.charAt(i), kChar = k.charAt(i);
            if (i % 2 == 0) { // backward
                int x = (cChar - kChar) + 65;
                if (x < 65) x += 26;
                out += String.valueOf((char) x);
            } else { // forward
                int x = (cChar + kChar) - 65;
                if (x > 90) x -= 26;
                out += String.valueOf((char) x);
            }
        }
        System.out.println(out);
        sc.close();
    }

}
