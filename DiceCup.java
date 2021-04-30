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

class DiceCup {
    public static void main(String[] args) {
        new DiceCup();
    }

    DiceCup() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int[] count = new int[m * n];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                count[i + j]++;
            }
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            max = (int) Math.max(max, count[i]);
        }
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                System.out.println(i);
            }
        }
    }

}
