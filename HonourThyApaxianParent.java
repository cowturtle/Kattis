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

class HonourThyApaxianParent {
    
    public static void main(String[] args) {
        new HonourThyApaxianParent();
    }

    HonourThyApaxianParent() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        String y = sc.getWord(), p = sc.getWord();
        
        char end = y.charAt(y.length() - 1);
        if (end == 'e') {
            sb.append(y).append("x").append(p);
        } else if (end == 'a' || end == 'i' || end == 'o' || end == 'u') {
            sb.append(y.substring(0, y.length() - 1)).append("ex").append(p);
        } else if (y.substring(y.length() - 2, y.length()).equals("ex")) {
            sb.append(y).append(p);
        }else sb.append(y).append("ex").append(p);

        System.out.println(sb.toString());        
        sc.close();
    }
    
}
