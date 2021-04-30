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

class ColoringSocks {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int s  = sc.getInt(), c = sc.getInt(), k = sc.getInt();
        int[] socks = new int[s];
        for (int i = 0; i < s; i++)
            socks[i] = sc.getInt();
        Arrays.sort(socks); // impt
        int washingmachines = 1;
        int capacity = c - 1;
        int smallestsock = socks[0];
        for (int i = 1; i < socks.length; i++) {
            int sock = socks[i];
            if (capacity == 0 // max cap
                || sock - smallestsock > k) { // will decolourise
                washingmachines++;
                capacity = c;
                smallestsock = sock;
            }
            capacity--;
        }
        System.out.println(washingmachines);
        sc.close();
    }
    
}
