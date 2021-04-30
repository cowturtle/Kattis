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

class LuhnsChecksumAlgorithm {
    
    public static void main(String[] args) {
        new LuhnsChecksumAlgorithm();
    }

    LuhnsChecksumAlgorithm() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(check(sc.getWord().toCharArray()) ? "PASS" : "FAIL").append("\n");
        System.out.println(sb.toString());
        sc.close();
    }

    boolean check(char[] arr) {
        // 1. Start from right end, multiply every second by 2
        // 2. if product is more than 2, plus together
        // 3. Add all up aft
        // 4. If divisible by 10, pass. else fail
        int total = 0;
        boolean second = false;
        for (int i = arr.length - 1 ; i > - 1; i--) {
            int x = Integer.parseInt(String.valueOf(arr[i]));
            if (second) {            
                x *= 2;
                x = x > 9 ? (x % 10) + (x / 10) : x;
                second = false;
            } else {
                second = true;
            }
            total += x;
        }
        return total % 10 == 0;
    }

}
