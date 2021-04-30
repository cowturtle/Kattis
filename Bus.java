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

class Bus {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int k = sc.getInt(), p = 1;
            while (k-- > 0) {
                p += .5;
                p *= 2;
            }
            p--;
            sb.append(p).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
