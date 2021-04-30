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

class SocialRunning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int min = arr[0] + arr[n - 2]; // clue in qn, 3 to 0 alone, 1 to 2 alone. First alone obvious, second last alone > iterate through example will see
        for (int i = 1; i < n; i++)
            min = Math.min(min, arr[i] + arr[(n - 2 + i) % n]);
        System.out.println(min);        
        sc.close();
    }
    
}
