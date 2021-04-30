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

class PasswordHacking {
    
    public static void main(String[] args) {
        new PasswordHacking();
    }

    PasswordHacking() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double expected = 0;
        int n = sc.getInt();
        ArrayList<Double> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.getWord();
            al.add(sc.getDouble());
        }
        Collections.sort(al, Collections.reverseOrder());
        for (int i = 1; i <= n; i++)
            expected += al.get(i - 1) * i;
        System.out.printf("%.4f\n", expected);
        sc.close();
    }

}
