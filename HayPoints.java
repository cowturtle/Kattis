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

class HayPoints {
    
    public static void main(String[] args) {
        new HayPoints();
    }

    HayPoints() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int m = sc.getInt(), n = sc.getInt();
        Map<String, Integer> hmap = new HashMap<>();
        while (m-- > 0) {
            hmap.put(sc.getWord(), sc.getInt());
        }
        while(n-- > 0) {
            int res = 0;
            String next = "";
            while (!(next = sc.getWord()).equals(".")) {
                if (hmap.containsKey(next)) {
                    res += hmap.get(next);
                }
            }
            System.out.println(res);
        }
    }

}
