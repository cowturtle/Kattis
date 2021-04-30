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

class MoscowDream {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), n = sc.getInt();
        String ans = "NO";
        if (a != 0 && b != 0 && c != 0 && a + b + c >= n && n >= 3) ans = "YES";
        System.out.println(ans);
        sc.close();
    }
    
}
