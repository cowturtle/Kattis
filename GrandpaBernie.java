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

class GrandpaBernie {
    // 0.65.. how to be faster?
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, ArrayList<Integer>> hmap = new HashMap<>();
        int n = sc.getInt();
        while (n-- > 0) {
            String country = sc.getWord();
            int year = sc.getInt();
            
            if (hmap.containsKey(country)) {
                hmap.get(country).add(year);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(year);
                hmap.put(country, al);
            }
        }
        int q = sc.getInt();
        Set<String> spoken = new HashSet<>();
        while (q-- > 0) {
            String country = sc.getWord();
            int count = sc.getInt() - 1;
            if (!spoken.contains(country)) 
                Collections.sort(hmap.get(country));    
            sb.append(hmap.get(country).get(count));
            sb.append("\n");
            spoken.add(country);
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
