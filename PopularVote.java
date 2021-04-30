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

class PopularVote {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            int total = 0, highest = 0, index = 0;
            for (int i = 1; i <= n; i++) {
                int x = sc.getInt();
                total += x;
                if (x > highest) {
                    highest = x;
                    index = i;
                } else if (x == highest) {
                    index = -1;
                }
            }
            if (index == -1) {
                sb.append("no winner");
            } else if (highest > total / 2) {
                sb.append("majority winner " + index);
            } else {
                sb.append("minority winner " + index);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
