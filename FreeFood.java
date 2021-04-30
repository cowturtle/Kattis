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

class FreeFood {
    
    public static void main(String[] args) {
        new FreeFood();
    }

    FreeFood() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int tt = 0, n = sc.getInt();
        int[] days = new int[365 + 1];
        while (n-- > 0) {
            int start = sc.getInt(), end = sc.getInt();
            for (int i = start; i <= end; i++)
                days[i]++;
        }
        for (int i = 1; i < days.length; i++)
            tt += days[i] > 0 ? 1 : 0;
        System.out.println(tt);
        sc.close();
    }

}
