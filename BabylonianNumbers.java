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

class BabylonianNumbers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            String[] arr = sc.getWord().replaceAll(",", ", ").split(",");
            long val = 0;
            long mult = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i].equals(" ")) arr[i] = "0";
                val += Long.parseLong(arr[i].trim()) * mult;
                mult *= 60;
            }
            sb.append(val).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
