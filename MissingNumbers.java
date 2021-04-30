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

class MissingNumbers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        boolean[] miss = new boolean[200 + 1];
        int last = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.getInt();
            if (i == n - 1) last = x;
            miss[x] = true;
        }
        for (int i = 1; i <= last; i++)
            if (!miss[i]) sb.append(i).append("\n");
        System.out.println(sb.length() == 0 ? "good job" : sb.toString());
        sc.close();
    }
    
}
