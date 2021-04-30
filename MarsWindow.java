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

class MarsWindow {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static String foo(int n) {
        Calendar c = Calendar.getInstance();
        Calendar t = Calendar.getInstance();
        c.set(2018, 3, 1);
        t.set(n, 1, 1);
        while (c.get(Calendar.YEAR) < t.get(Calendar.YEAR)) 
            c.add(Calendar.MONTH, 26);
        return c.get(Calendar.YEAR) == t.get(Calendar.YEAR) ? "yes" : "no";
    }
    
}
