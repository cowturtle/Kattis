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

class CompoundWords {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        List<String> original = new ArrayList<>();
        Set<String> collect = new HashSet<>();        
        while (sc.hasMoreTokens()) {
            original.add(sc.getWord());
        }
        for (int i = 0; i < original.size(); i++) {
            for (int j = 0; j < original.size(); j++) {
                if (i != j) collect.add(original.get(i) + original.get(j));
            }
        }
        List<String> output = new ArrayList<>(collect);
        Collections.sort(output);
        for (String s : output)
            System.out.println(s);
        sc.close();
    }
    
}
