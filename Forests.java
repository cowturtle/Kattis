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

class Forests {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), t = sc.getInt();
        HashMap<Integer, Set<Integer>> hmap = new HashMap<>();
        for (int i = 1; i <= p; i++)
            hmap.put(i, new TreeSet<>());
        int in = t * p;
        while (sc.hasMoreTokens()) 
            hmap.get(sc.getInt()).add(sc.getInt()); 
        Set<Set<Integer>> opinions = new HashSet<>();
        for (Set<Integer> s : hmap.values())
            opinions.add(s);
        System.out.println(opinions.size());
        sc.close();
    }
    
}
