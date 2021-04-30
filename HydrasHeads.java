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

class HydrasHeads {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int h = 0, t = 0;

        while ((h = sc.getInt()) != 0 && (t = sc.getInt()) != 0) {
            sb.append(kill(h, t)).append("\n");
        }   
        System.out.println(sb.toString());
        sc.close();
    }

    static int kill(int h, int t) {
        // 1. Can't kill Hydra
        // 2. ONLY if has 2 heads, then Hydra is dead. Next check takes care of this in advance.
        if (t == 0) return -1;
        // 1. t % 2. Cut 2 tails > 1 new head. Therefore, checking if heads can grow
        // 2. If the head can grow, h (current heads) + (t / 2) (newly received heads), is it % 2 == 0
        //    If can % 2 == 0, it means can be killed > Cut 2 heads > Nothing happens
        // 3. Moves are as calculated, t / 2 > cut the tails, (h + (t / 2)) / 2, cut the heads
        if (t % 2 == 0 && (h + (t / 2)) % 2 == 0) return t / 2 + (h + (t / 2)) / 2;
        return 1 + kill(h, t + 1); 
    }
    
}
