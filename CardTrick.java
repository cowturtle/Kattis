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

class CardTrick {
    
    public static void main(String[] args) {
        new CardTrick();
    }

    CardTrick() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            ArrayDeque<Integer> deck = new ArrayDeque<>();            
            // Working backwards, just reversing the process
            while (n > 0) {
                deck.offerFirst(n); // Add card to deck, put on the top
                for (int i = 0; i < n; i++)
                    deck.offerFirst(deck.pollLast()); // Move last card to front
                n--;
            }
            sb.append(deck.toString().replaceAll("[\\[\\],]", "")).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
