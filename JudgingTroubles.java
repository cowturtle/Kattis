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

class JudgingTroubles {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> dom = new HashMap<>();
        HashMap<String, Integer> kattis = new HashMap<>();
        int n = sc.getInt(), count = 0, nn = n;
        String s = "";
        while (nn-- > 0)
            dom.put(s = sc.getWord(), (dom.containsKey(s) ? dom.get(s) : 0) + 1);
        while (n-- > 0)
            kattis.put(s = sc.getWord(), (kattis.containsKey(s) ? kattis.get(s) : 0) + 1);
        for (Entry<String, Integer> e : dom.entrySet()) 
            count += Math.min(e.getValue(), kattis.containsKey(e.getKey()) ? kattis.get(e.getKey()) : 0);            
        System.out.println(count);
        sc.close();
    }
    
}
