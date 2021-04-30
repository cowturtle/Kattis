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

class Bela {
    public static void main(String[] args) {
        new Bela();
    }
    
    static final int[] N_DOMINANT = new int[] {11,4,3,2,10,0,0,0};
    static final int[] _DOMINANT = new int[] {11,4,3,20,10,14,0,0};

    Bela() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() * 4;
        char b = sc.getWord().charAt(0);
        int total = 0;
        while (n > 0) {
            n--;
            String s = sc.getWord();
            int pos = getPos(s.charAt(0));
            if (s.charAt(1) == b) {
                total += _DOMINANT[pos];
            } else {
                total += N_DOMINANT[pos];
            }
        }
        System.out.println(total);
    }

    int getPos(char c) {
        switch(c) {
            case 'A': return 0;
            case 'K': return 1;
            case 'Q': return 2;
            case 'J': return 3;
            case 'T': return 4;
            case '9': return 5;
            case '8': return 6;
            case '7': return 7;
            default: return -1;
        }
    }

}
