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

class AwkwardParty {
    
    public static void main(String[] args) {
        new AwkwardParty();
    }

    AwkwardParty() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), min = n;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) 
            hmap.put(i, sc.getInt());
        List<Entry<Integer, Integer>> list = new ArrayList<>(hmap.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                if (e1.getValue() == e2.getValue()) {
                    return e1.getKey() - e2.getKey();
                }
                return e1.getValue() - e2.getValue();
            }
        });
        int currVal = -1, currInd = -1;
        for (Entry<Integer, Integer> e : list) {
            int nextVal = e.getValue(), nextInd = e.getKey();  
            if (currVal != nextVal) {
                currVal = nextVal;
                currInd = nextInd;
                continue;
            } else {
                min = Math.min(min, nextInd - currInd);
            }
        }
        System.out.println(min);
    }
    
}
