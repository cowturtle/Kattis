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

class HeightOrdering {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            ArrayList<Integer> students = new ArrayList<>();
            students.add(sc.getInt());
            int steps = 0;
            for (int j = 0; j < 19; j++) {
                int x = sc.getInt();
                int k = students.size() - 1;
                for (; k >= 0; k--) 
                    if (x > students.get(k)) break;
                steps += students.size() - ++k;
                students.add(k, x);
            }
            sb.append(i).append(" ").append(steps).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
