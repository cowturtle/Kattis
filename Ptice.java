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

class Ptice {
    
    public static void main(String[] args) {
        new Ptice();
    }

    Ptice() {
        answer();
    }

    static final char[] ADRIAN_CHOICE = new char[] {'A', 'B', 'C'};
    static final char[] BRUNO_CHOICE = new char[] {'B', 'A', 'B', 'C'};
    static final char[] GORAN_CHOICE = new char[] {'C', 'C', 'A', 'A', 'B', 'B'};

    void answer() { 
        Kattio sc = new Kattio(System.in);
        sc.getInt();
        String s = sc.getWord();

        int i = 0, a = 0, b = 0, g = 0;
        int adrian = 0, bruno = 0, goran = 0;
        while (i < s.length()) {
            char ans = s.charAt(i);

            adrian += ADRIAN_CHOICE[a] == ans ? 1 : 0;
            bruno += BRUNO_CHOICE[b] == ans ? 1 : 0;
            goran += GORAN_CHOICE[g] == ans ? 1 : 0;
            
            a = a++ == ADRIAN_CHOICE.length - 1? 0 : a;
            b = b++ == BRUNO_CHOICE.length - 1? 0 : b;
            g = g++ == GORAN_CHOICE.length - 1? 0 : g;
            i++;
        }

        int max = (int) Math.max(adrian, bruno);
        max = (int) Math.max(max, goran);

        System.out.println(max);

        if (adrian == max) System.out.println("Adrian");
        if (bruno == max) System.out.println("Bruno");
        if (goran == max) System.out.println("Goran");

        sc.close();
    }

}
