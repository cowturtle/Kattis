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

class Incognito {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            Set<String> categories = new HashSet<>();
            HashMap<String, Integer> attributesCount = new HashMap<>();
            while (n-- > 0) {
                sc.getWord();
                String attribute = sc.getWord();
                attributesCount.put(attribute, (attributesCount.containsKey(attribute) ? attributesCount.get(attribute) : 1) + 1);
                categories.add(attribute);
            }
            sb.append(categories.stream().mapToInt(x -> attributesCount.get(x)).reduce(1, (x, y) -> x * y) - 1).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
