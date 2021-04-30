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

class Inflation {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] balloons = new int[n];
        int[] helium = new int[n];
        for (int i = 0; i < n; i++) {
            helium[i] = sc.getInt();
            balloons[i] = i + 1;
        }
        Arrays.sort(helium);
        boolean fail = false;
        for (int i = 0; i < n; i++) {
            balloons[i] -= helium[i];
            if (balloons[i] < 0) {
                fail = true;
                break;
            } 
        }
        if (fail) {
            System.out.println("impossible");
        } else {
            double frac = 0;
            for (int i = 0; i < n; i++)
                frac = Math.max(frac, balloons[i] / ((double) i + 1));
            System.out.println(1 - frac);
        }
        sc.close();
    }
    
}
