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

class Server {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), t = sc.getInt(), c = 0;
        while (n-- > 0) {
            int x = sc.getInt();
            t-= x;
            if (t < 0) {
                break;
            } else c++;
        }
        System.out.println(c);
        sc.close();
    }
    
}
