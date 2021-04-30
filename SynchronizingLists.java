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

class SynchronizingLists {
    
    public static void main(String[] args) {
        new SynchronizingLists();
    }

    SynchronizingLists() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            ArrayList<Integer> org = new ArrayList<>();
            ArrayList<Integer> wrong = new ArrayList<>();
            for (int i = 0; i < n; i++) 
                org.add(sc.getInt());
            ArrayList<Integer> dup = new ArrayList<>(org);
            for (int i = 0; i < n; i++) 
                wrong.add(sc.getInt());
            Collections.sort(dup);                    
            Collections.sort(wrong);
            HashMap<Integer, Integer> hmap = new HashMap<>();
            for (int i = 0; i < n; i++)
                hmap.put(dup.get(i), wrong.get(i));
            for (Integer i : org) 
                sb.append(hmap.get(i)).append("\n");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }
    
}
