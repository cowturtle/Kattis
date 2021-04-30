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

class DeathKnightHero {
    
    public static void main(String[] args) {
        new DeathKnightHero();
    }

    DeathKnightHero() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), won = 0;
        while (n-- > 0) {
            won += battle(sc.getWord().toCharArray()) ? 1 : 0;
        }
        System.out.println(won);
    }

    boolean battle(char[] actions) {
        for (int i = 0; i < actions.length - 1; i++) {
            if (actions[i] == 'C' && actions[i + 1] == 'D') return false;
        }
        return true;
    }   
 
}
