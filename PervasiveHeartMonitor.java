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

class PervasiveHeartMonitor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[a-zA-Z]+");
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            String name = "";
            double total = 0;
            int count = 0;
            for (String s : arr) {
                Matcher m = p.matcher(s);
                if (m.matches()) {
                    name += s + " ";
                } else {
                    total += Double.parseDouble(s);
                    count++;
                }
            }
            sb.append(String.format("%.6f", total / count)).append(" ").append(name.trim()).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
