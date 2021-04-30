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

class HIndex {
    
    public static void main(String[] args) {
        // Get largest
        // H papers
        // H citations, min 
        // Reverse access
        // because it is sorted as ascending, any paper that is comes from the start if is bigger than the 
        // max h (num of papers aka n), will fail the condition
        // "Your H-Index is the largest number H such that you have H papers with at least H citations."
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), hmax = n;
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++)
            arr[i] = sc.getInt();
        Arrays.sort(arr);
        for (; hmax > 0; hmax--) 
            if (arr[hmax] < n - hmax + 1) break;
        System.out.println(n - hmax);
        sc.close();
    }
    
}
