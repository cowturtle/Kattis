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

class IntegerDivision {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), d = sc.getLong();
        HashMap<Long, Long> hmap = new HashMap<>();
        while (n-- > 0) {
            long quotient = sc.getLong() / d;
            hmap.put(quotient, (hmap.containsKey(quotient) ? hmap.get(quotient) : 0L) + 1L);
        }
        Iterator i = hmap.entrySet().iterator();
        long count = 0;
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<Long, Long> e = (Entry) i.next();
            long val = e.getValue();
            // combinations
            // n! / ((n - 2)! * 2!)
            // n * (n - 1) / 2;
            count += val * (val - 1) / 2;
        }
        System.out.println(count);
        sc.close();
    }
    
}
