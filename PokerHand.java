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

class PokerHand {
    
    public static void main(String[] args) {
        new PokerHand();
    }

    PokerHand() {
        answer();
    }

    void answer() {
        int[] arr = new int[13];
        String[] arr2 = new java.util.Scanner(System.in).nextLine().split("\\s+");
        for (String s : arr2) 
            arr[match(s.charAt(0))]++;
        int max = 0;
        for (int i : arr) 
            max = (int) Math.max(max, i);
        System.out.println(max);
    }   

    int match(char c) {
        switch (c) {
            case 'A': return 0;
            case '2': return 1;
            case '3': return 2;
            case '4': return 3;
            case '5': return 4;
            case '6': return 5;
            case '7': return 6;
            case '8': return 7;
            case '9': return 8;
            case 'T': return 9;
            case 'J': return 10;
            case 'Q': return 11;
            case 'K': return 12;
            default: return -1;
        }
    }
 
}
