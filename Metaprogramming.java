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

class Metaprogramming {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            String action = sc.getWord();
            if (action.equals("define")) {
                int value = sc.getInt();
                String pointer = sc.getWord();
                hmap.put(pointer, value);
            } else if (action.equals("eval")) {
                String var1 = sc.getWord();
                String operator = sc.getWord();
                String var2 = sc.getWord();
                if (!hmap.containsKey(var1) || !hmap.containsKey(var2)) {
                    sb.append("undefined");
                } else {
                    int v1 = hmap.get(var1), v2 = hmap.get(var2);
                    if (operator.equals("<")) {
                        sb.append(v1 < v2);
                    } else if (operator.equals(">")) {
                        sb.append(v1 > v2);
                    } else if (operator.equals("=")) {
                        sb.append(v1 == v2);
                    }
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
