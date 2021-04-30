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

class ChanukahChallenge {
    
    public static void main(String[] args) {
        new ChanukahChallenge();
    }

    ChanukahChallenge() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt();
        int[] arr = new int[p];
        while (p-- > 0) {
            arr[sc.getInt() - 1] = getCandles(sc.getInt());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d %d\n", i + 1, arr[i]);
        }
    }

    int getCandles(int days) {
        return sumUp(days) + days;
    }

    int sumUp(int n) {
        if (n == 1) return 1;
        return n + sumUp(n - 1);
    }

}
