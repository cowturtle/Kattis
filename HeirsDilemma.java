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

class HeirsDilemma {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        System.out.println(check(sc.getInt(), sc.getInt()));
        sc.close();
    }

    static int check(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int x = i;
            boolean[] different = new boolean[10];
            boolean fail = false;
            while (x > 0) {
                int digit = x % 10;
                if (different[digit] || digit == 0 || i % digit != 0) {
                    fail = true;
                    break;
                }
                different[digit] = true;
                x /= 10;
            }
            if (!fail) count++;

        }
        return count;
    }
    
}
