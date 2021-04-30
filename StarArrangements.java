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

class StarArrangements {
    
    public static void main(String[] args) {
        new StarArrangements();
    }

    StarArrangements() {
        answer();
    }

    void answer() {
        int s = new java.util.Scanner(System.in).nextInt();
        System.out.printf("%d:\n", s);
        for (int i = 2; i < s; i++) {
            for (int j = i - 1; j < s; j++) {
                if (j > i) break;
                int curr = i;
                boolean next = true;
                while (curr < s) {
                    if (next) {
                        next = false;
                        curr += j;
                    } else {
                        next = true;
                        curr += i;
                    }
                }
                if (curr == s) 
                    System.out.printf("%d,%d\n", i, j);
            }   
        }
        // sc.close();
    }

}
