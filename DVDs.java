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

class DVDs {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int k = sc.getInt();
        while (k-- > 0) {
            int n = sc.getInt(), j = 1;
            for (int i = 0; i < n; i++)
                if (sc.getInt() == j) j++;
            sb.append(n - j + 1).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
