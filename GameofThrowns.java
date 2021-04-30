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

class GameofThrowns {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[] arr = new int[100 + 1];
        int n = sc.getInt(), k = sc.getInt(), i = 1;
        while (k-- > 0) {
            String s = sc.getWord();
            if (s.equals("undo")) {
                i -= sc.getInt();
            } else {
                int x = 0;
                arr[i + 1] = (x = (arr[i] + Integer.parseInt(s)) % n) < 0 ? x + n : x;
                i++;
            }
        }
        System.out.println(arr[i]);
        sc.close();
    }
    
}
