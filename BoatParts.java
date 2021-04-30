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

class BoatParts {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), n = sc.getInt();
        Set<String> set = new HashSet<>();
        int days = 0;
        for (int i = 1; i <= n; i++) {
            set.add(sc.getWord());
            if (set.size() == p && days == 0) {
                days = i;
            }
        }
        System.out.println(days == 0 ? "paradox avoided" : days);
        sc.close();
    }
    
}
