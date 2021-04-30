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

class Sort {
    
    static final HashMap<Integer, Integer> hmap = new HashMap<>();
    static final HashMap<Integer, Integer> hmap2 = new HashMap<>();

    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return hmap.get(i2) == hmap.get(i1) ? hmap2.get(i1) - hmap2.get(i2) : hmap.get(i2) - hmap.get(i1);
            }
        };
        Kattio sc = new Kattio(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.getInt(), c = sc.getInt(), i = 0;
        while (n-- > 0) {
            int x = sc.getInt();
            al.add(x);
            hmap.put(x, (hmap.containsKey(x) ? hmap.get(x) : 0) + 1);
            if (!hmap2.containsKey(x)) 
                hmap2.put(x, i++);
            
        }
        Collections.sort(al, comp);
        System.out.println(al.toString().replaceAll("[\\[\\],]", ""));
        sc.close();
    }
    
}
