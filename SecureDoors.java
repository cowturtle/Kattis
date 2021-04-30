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

class SecureDoors {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        while (n-- > 0) {
            String action = sc.getWord(), name = sc.getWord();
            String print = name;
            if (action.equals("entry")) {
                print += " entered";
                if (al.contains(name)) {
                    print += " (ANOMALY)";
                } else {
                    al.add(name);
                }
            } else {
                print += " exited";
                if (al.contains(name)) {
                    al.remove(al.indexOf(name));
                } else {
                    print += " (ANOMALY)";
                }
            }
            sb.append(print).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
