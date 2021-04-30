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

class SortOfSorting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(0) == s2.charAt(0)) {
                    if (s1.charAt(1) == s2.charAt(1)) {
                        return 0;
                    }
                    return s1.charAt(1) - s2.charAt(1);
                }
                return s1.charAt(0) - s2.charAt(0);
            }
        };
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            ArrayList<String> al = new ArrayList<>();
            while (n-- > 0) 
                al.add(sc.getWord());
            Collections.sort(al, c);
            for (String s : al)
                sb.append(s).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}
