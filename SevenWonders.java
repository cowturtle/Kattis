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

class SevenWonders {
    
    public static void main(String[] args) {
        new SevenWonders();
    }

    SevenWonders() {
        answer();
    }

    void answer() {
        char[] s = new java.util.Scanner(System.in).nextLine().toCharArray();
        short[] arr = new short[3];        
        for (char c : s) {
            arr[translate(c)]++;
        }
        short min = Short.MAX_VALUE;
        int total = 0;
        for (short i : arr) {
            min = (short) Math.min(min, i);
            total += i * i;
        }
        System.out.println(total + (min * 7));
    }

    int translate(char c) {
        switch(c) {
            case 'T': return 0;
            case 'C': return 1;
            case 'G': return 2;
            default: return -1;
        }
    }

}
