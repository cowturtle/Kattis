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

class Beekeeper {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Comparator<Entry<String, Integer>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            HashMap<String, Integer> hmap = new HashMap<>();
            while (n-- > 0) {
                String s = sc.getWord();
                char[] arr = s.toCharArray();
                int count = 0;
                for (int i = 0; i < arr.length - 1; i++) 
                    if (arr[i] == arr[i + 1] 
                        && (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' 
                        || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'y')) count++;
                hmap.put(s, count);
            }            
            ArrayList<Entry<String, Integer>> list = new ArrayList<>(hmap.entrySet());
            out.println(Collections.max(list, comp).getKey());
        }
        out.close();
        sc.close();
    }

}
