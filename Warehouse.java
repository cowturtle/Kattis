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

class Warehouse {
    
    public static void main(String[] args) {       
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                if (e1.getValue() == e2.getValue()) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return e2.getValue() - e1.getValue();
            }
        };
        int t = sc.getInt();
        while (t-- > 0) {
            HashMap<String, Integer> hmap = new HashMap<>();
            int n = sc.getInt();
            while (n-- > 0) {
                String name = sc.getWord();
                int count = sc.getInt();
                hmap.put(name, (hmap.containsKey(name) ? hmap.get(name) : 0) + count);
            }
            List<Entry<String, Integer>> list = new ArrayList<>(hmap.entrySet());
            Collections.sort(list, comp);
            sb.append(list.size()).append("\n");
            for (Entry<String, Integer> e : list) 
                sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
