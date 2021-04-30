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

class FlyingSafely {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int cases = sc.getInt();
        while (cases-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            
            while (m-- > 0) {
                sc.getInt();
                sc.getInt();
            }
                
            sb.append(n - 1);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
