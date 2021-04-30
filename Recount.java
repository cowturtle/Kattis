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

class Recount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        String s = "";
        while (!(s = sc.nextLine()).equals("***")) 
            hmap.put(s, (hmap.containsKey(s) ? hmap.get(s) : 0) + 1);
        String name = "";
        int max = 0;
        boolean runoff = false;
        Iterator i = hmap.entrySet().iterator();
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<String, Integer> e = (Entry<String, Integer>) i.next();
            if (max < e.getValue()) {
                max = e.getValue();
                name = e.getKey();
            }
        }
        i = hmap.entrySet().iterator();
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<String, Integer> e = (Entry<String, Integer>) i.next();
            if (max == e.getValue() && !name.equals(e.getKey())) {
                runoff = true;
                break;
            }
        }
        System.out.println(runoff ? "Runoff!" : name);
        sc.close();
    }
    
}
