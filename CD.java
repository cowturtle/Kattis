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

class CD {

    public static void main(String[] args) {
        new CD();
    }

    CD() {
        answer();
    }
    
    void answer() {

        Kattio sc = new Kattio(System.in);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();
            if (n == 0 && m == 0) break;
            int[] narr = new int[n];
            int[] marr = new int[m];
            readInput(narr, sc);
            readInput(marr, sc);
            System.out.println(getCount(narr, marr));
        }
        // keeps throwing eof error for some reason
        // sc.close();
        
    }

    int getCount(int[] narr, int[] marr) {
        int itern = 0, iterm = 0, count = 0;
        for (int i = 0; i < marr.length; i++) {
            if (Arrays.binarySearch(narr, marr[i]) > -1)
                count++;
        }
        // too slow
        // while (itern < narr.length - 1 || iterm < marr.length - 1) {
        //     int n = narr[itern];
        //     int m = marr[iterm];
        //     if (n == m) {
        //         count++;
        //         iterm++;
        //         itern++;
        //     } else if (n > m && iterm < marr.length - 1) {
        //         iterm++;
        //     } else if (m > n && itern < narr.length - 1) {
        //         itern++;
        //     }
        // }
        return count;
    }

    void readInput(int[] arr, Kattio sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.getInt();
        }
    }

}
