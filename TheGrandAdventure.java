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

class TheGrandAdventure {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(run(sc.getWord().toCharArray()) ? "YES" : "NO").append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean run(char[] arr) {
        Stack<Character> bag = new Stack<>();
        for (char c : arr) {
            switch (c) {
                case '$': // Money
                case '|': // Incense
                case '*': // Gem
                    bag.push(c);
                    break;
                case 't': // Trader
                    if (bag.isEmpty() || bag.pop() != '|') return false;
                    break;
                case 'j': // Jeweler
                    if (bag.isEmpty() || bag.pop() != '*') return false;
                    break;
                case 'b': // Banker
                    if (bag.isEmpty() || bag.pop() != '$') return false;
                    break;
                case '.':
                    break;
            }
        }
        return bag.isEmpty();
    }
        
}
