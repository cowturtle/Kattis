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

class EarlyWinter {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), dm = sc.getInt(), count = 0;;
        for (; count < n; count++) 
            if (sc.getInt() <= dm) break;
        System.out.println(count == n ? "It had never snowed this early!" : "It hadn't snowed this early in " + count + " years!");
        sc.close();
    }
    
}
