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

class OddGnome {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int g = sc.getInt();
            int[] arr = new int[g];
            for (int i = 0; i < g; i++)
                arr[i] = sc.getInt();
            int i = 0;
            for (; i < g - 1; i++)
                if (arr[i + 1] != arr[i] + 1) break;
            sb.append(i + 2).append("\n");
        }
        System.out.println(sb.toString());
    }
    
}
