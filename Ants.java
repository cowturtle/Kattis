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

class Ants {
    
    public static void main(String[] args) {
        new Ants();
    }

    Ants() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int test = sc.getInt();
        while (test-- > 0) {
            int l = sc.getInt(), n = sc.getInt(), min = 0, max = 0;
                        
            // Base thoughts behind algorithm
            // 1. Check whether between i or l - i is the largest or least
            //    is pretty straightforward as we are just comparing the 
            //    ant position to either end. 
            // 2. The next is a little trickier in my opinion as it involves
            //    thinking about how the scenario plays out. I imagine it that
            //    when we take the Math.max of either the min or max, it is about
            ///   getting the last ant off the pole. Therefore the min and max time
            //    it takes for that last end to get off the pole.
            // 
            // Naturally, using Math.min will give us 0 on both ends as having no ants 
            // fall off the pole takes no time at all.
            //    
            while (n-- > 0) {
                int x = sc.getInt();
                min = Math.max(min, Math.min(x, l - x));
                max = Math.max(max, Math.max(x, l - x));
            }
            
            sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}
