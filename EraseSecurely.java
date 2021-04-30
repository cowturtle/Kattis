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

class EraseSecurely {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String o = sc.getWord();
        String d = sc.getWord();
        boolean success = false;
        if (n % 2 == 0) {
            success = o.equals(d);
        } else {
            String tmp = "";
            for (char c : o.toCharArray())
                tmp += c == '1' ? '0' : '1';
            success = tmp.equals(d);
        }
        System.out.println(success ? "Deletion succeeded" : "Deletion failed");
        sc.close();
    }
    
}
