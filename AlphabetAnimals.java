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

class AlphabetAnimals {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String first = sc.getWord();
        String answer = "";
        char last = first.charAt(first.length() - 1);
        int n = sc.getInt();
        String[] animals = new String[n];
        for (int i = 0; i < n; i++)
            animals[i] = sc.getWord();
        boolean pass = false, win = false;
        for (int i = 0; i < n; i++) {
            if (last == animals[i].charAt(0)) {
                boolean pass2 = true;
                char newLast = animals[i].charAt(animals[i].length() - 1);
                for (int j = 0; j < n; j++) {
                    if (newLast == animals[j].charAt(0) && i != j) {
                        pass2 = false;
                        break;
                    }
                }
                if (pass2) {
                    pass = true;
                    win = true;
                    answer = animals[i];
                } else if (!pass) {
                    pass = true;
                    answer = animals[i];
                }
            }
            if (win) break;
        }
        if (pass) {
            if (win) {
                System.out.println(answer + "!");
            } else {
                System.out.println(answer);
            } 
        } else {
            System.out.println("?");
        }
        sc.close(); 
    }
    
}
