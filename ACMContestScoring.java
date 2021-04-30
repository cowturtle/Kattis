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

class ACMContestScoring {
    
    public static void main(String[] args) {
        new ACMContestScoring();
    }

    ACMContestScoring() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = -1, r = 0, total = 0;
        int[] arr = new int[26];
        boolean[] arr2 = new boolean[26];
        while ((m = sc.getInt()) != -1) {
            char p = sc.getWord().charAt(0), o = sc.getWord().charAt(0);
            if (!arr2[p - 65] && o == 'r') {
                arr[p - 65] += m;
                arr2[p - 65] = true;
                total += arr[p - 65];
                r++;
            } else if (o == 'w') {
                arr[p - 65] += 20;
            }
        }
        System.out.printf("%d %d\n", r, total);        
        sc.close();
    }
}
