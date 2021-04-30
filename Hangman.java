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

class Hangman {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String word = java.util.Arrays.stream(sc.getWord().split("")).distinct().reduce("", (x,y) -> x + y);
        char[] permute = sc.getWord().toCharArray();
        int win = word.length(), curr = 0;
        int death = 10;
        for (char c : permute) {
            if (word.contains(String.valueOf(c))) {
                curr++;
            } else death--;
            if (curr == win || death == 0) break;
        }
        
        System.out.println(death == 0 ? "LOSE" : "WIN");
    }
    
}
