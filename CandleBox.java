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

class CandleBox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        // Rita starts at 4.. so 4 + 5 + 6 + 7
        // Theo starts at 3.. so 3 + 4 + 5 + 6
        HashMap<Integer, Integer> ritaMap = new HashMap<>();
        HashMap<Integer, Integer> theoMap = new HashMap<>();
        ritaMap.put(4, 4);
        for (int i = 5; i < 100; i++) 
            ritaMap.put(i, (int) (((i - 3) / 2.0) * (i + 4)));
        theoMap.put(3, 3);
        for (int i = 4; i < 100; i++) 
            theoMap.put(i, (int) (((i - 2) / 2.0) * (i + 3)));
        int diff = sc.getInt(), rita = sc.getInt(), theo = sc.getInt();
        int r = 3 + diff, t = 3, rVal = ritaMap.get(r), tVal = theoMap.get(t);
        while (rVal < rita) {
            if (rita - rVal == tVal - theo) break;
            rVal = ritaMap.get(r);
            tVal = theoMap.get(t);
            r++;
            t++;
        }
        System.out.println(rita - rVal);
        sc.close();
    }
    
}
