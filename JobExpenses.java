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

class JobExpenses {
    
    public static void main(String[] args) {
        new JobExpenses();
    }

    JobExpenses() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), sum = 0;
        while (n-- > 0) {
            int x = 0;
            sum += (x = sc.getInt()) < 0 ? (int) Math.abs(x) : 0;
        }
        System.out.println(sum);
    }

}
