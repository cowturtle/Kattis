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

class FastFoodPrizes {
    
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int cases = sc.getInt();
        while (cases-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            HashMap<int[], Integer> prizes = new HashMap<>();
            while (n-- > 0) {
                int k = sc.getInt();
                int[] tmp = new int[k];
                for (int i = 0; i < k; i++)
                    tmp[i] = sc.getInt();
                prizes.put(tmp, sc.getInt());                
            }
            int[] stickers = new int[m + 1];
            for (int i = 1; i < m + 1; i++) 
                stickers[i] = sc.getInt();
            Iterator iter = prizes.entrySet().iterator();
            int total = 0;
            while (iter.hasNext()) {
                @SuppressWarnings("unchecked")
                Entry<int[], Integer> e = (Entry<int[], Integer>) iter.next();
                int[] arr = e.getKey();
                int prize = e.getValue();
                int min = stickers[arr[0]];
                for (int i = 1; i < arr.length; i++)
                    min = Math.min(stickers[arr[i]], min);
                for (int i = 0; i < arr.length; i++)
                    stickers[arr[i]] -= min;
                total += min * prize;
            }
            sb.append(total).append("\n");
        }        
        System.out.print(sb.toString());
        sc.close();
    }
    
}
