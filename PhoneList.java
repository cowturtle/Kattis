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

class PhoneList {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.getWord();
            Arrays.sort(arr);
            sb.append(check(arr) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean check(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1].startsWith(arr[i])) return false;
        return true;
    }
    
}
