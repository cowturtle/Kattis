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

class BankQueue {
    
    public static void main(String[] args) {
        new BankQueue();
    }

    BankQueue() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), t = sc.getInt(), total = 0;
        int[] count = new int[t + 1];
        while (n-- > 0) {
            int c = sc.getInt(), ct = sc.getInt();
            for (int i = ct; i >= 0; i--) 
                if (c > count[i]) {
                    int temp = c;
                    c = count[i];
                    count[i] = temp;
                }
        }
        for (int i : count)
            total += i;
        System.out.println(total);
        sc.close();
    }
    
}
