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

class Conformity {
    
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), limit = 5, max = 0, count = 0;
        HashMap<Long, Integer> hmap = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int[] arr = new int[limit];
            long l = 0L;
            for (int i = 0; i < limit; i++)
                arr[i] = sc.getInt();
            Arrays.sort(arr);
            for (int i = 0; i < limit; i++)
                l += arr[i] * Math.pow(100, i);
            hmap.put(l, hmap.containsKey(l) ? hmap.get(l) + 1 : 1);
        }
        for (Entry<Long, Integer> e : hmap.entrySet())
            max = Math.max(max, e.getValue());
        for (Entry<Long, Integer> e : hmap.entrySet())
            if (e.getValue() == max) count += e.getValue();
        System.out.println(count);
        sc.close();
    }
    
}
