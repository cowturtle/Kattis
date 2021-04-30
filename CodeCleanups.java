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

class CodeCleanups {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), dirty = 0, pushes = 0, count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int j = 0;
        for (int i = 1; i <= 365 + 1; i++) {
            if (dirty < 20) { // strictly less than 20
                dirty += pushes; // accumulate pushes
                if (j < arr.length && arr[j] == i) {
                    pushes++;
                    j++;
                }
            } else { 
                dirty = 0;
                pushes = 0;
                count++;
                i -= 2; 
                if (arr[j - 1] == i + 1) j--;
                // it hit 20 and above today, so we should have cleared the day b4. 
                // i-- to move to previous day where it was still < 20
                // i-- again as to counter the i++ of the days running. 
                // So the next iteration will be yesterday
            }
        }
        if (dirty > 0) count++;
        System.out.println(count);
        sc.close();
    }
    
}
