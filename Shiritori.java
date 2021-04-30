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

class Shiritori {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        Set<String> words = new HashSet<>();
        String curr = sc.getWord();
        boolean first = false, fair = true;
        while (n-- > 0) {
            words.add(curr);
            String next = sc.getWord();
            if (words.contains(next) || curr.charAt(curr.length() - 1) != next.charAt(0)) {
                fair = false;
                break;
            }
            curr = next;
            first = !first;
        }
        System.out.println(fair ? "Fair Game" : first ? "Player 1 lost" : "Player 2 lost");
    }
    
}
