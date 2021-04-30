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

class CompetitiveArcadeBasketball {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        ArrayList<String> winners = new ArrayList<>();
        String name = "";
        int n = sc.getInt(), p = sc.getInt(), m = sc.getInt();
        while (n-- > 0)
            hmap.put(sc.getWord(), 0);
        while (m-- > 0) {
            hmap.put((name = sc.getWord()), hmap.get(name) + sc.getInt());
            if (!winners.contains(name) && hmap.get(name) >= p)
                winners.add(name);
        }
        if (winners.size() == 0) {
            System.out.println("No winner!");
        } else {
            for (String s : winners)
                System.out.printf("%s wins!\n", s);
        }
        sc.close();
    }
    
}
