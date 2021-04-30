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

class Volim {
    
    // It doesnt read it on the values cause i break it off halfway
    // kattis accepts this so yeh
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int k = sc.getInt(), n = sc.getInt(), timeElapsed = 0;
        final int limit = (60 * 3) + 30, playertotal = 8;
        while (n-- > 0) {
            int t = sc.getInt();
            String w = sc.getWord();
            timeElapsed += t;
            if (timeElapsed >= limit) break;
            if (w.equals("T")) k++;
        }
        System.out.println((k % playertotal) == 0 ? 8 : (k % playertotal));
        sc.close();
    }
    
}
