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

class Soylent {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt(), y = x / 400;
            if (y * 400 < x) y++;    
            sb.append(y).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
