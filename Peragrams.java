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

class Peragrams {
    
    public static void main(String[] args) {
        char[] word = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] letters = new int[26];
        int count = 0;
        for (char c : word)
            letters[c - 'a']++;
        for (int i = 0; i < 26; i++)
            if (letters[i] % 2 == 1) count++;
        // If there are more than needed, then minus because u need to remove
        // the other "redundant" ones minimally
        if (word.length % 2 == 0) { // odd words, one count of char to be odd
            if (count > 1) count--;
        } else {
            if (count > 0) count--; // even words, all chars even num
        }
        System.out.println(count);
    }
    
}
