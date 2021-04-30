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

class EngineeringEnglish {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) sb.append(" ");
                String s = arr[i];
                if (set.contains(s.toLowerCase())) {
                    sb.append(".");
                } else {
                    sb.append(s);
                    set.add(s.toLowerCase());
                }
            }            
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
