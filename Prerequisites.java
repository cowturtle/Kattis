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

class Prerequisites {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int k = sc.getInt();
            if (k == 0) break;
            int m = sc.getInt();
            ArrayList<Integer> freddie = new ArrayList<>();
            boolean pass = true;
            while (k-- > 0) 
                freddie.add(sc.getInt());
            while (m-- > 0) {
                int c = sc.getInt(), min = sc.getInt(), count = 0;
                while (c-- > 0) {
                    int x = sc.getInt();
                    if (freddie.contains(x)) count++;
                }
                if (count < min) pass = false;
            }         
            sb.append(pass ? "yes" : "no").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
