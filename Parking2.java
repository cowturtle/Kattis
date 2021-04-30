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

class Parking2 {
    
    public static void main(String[] args) {
        new Parking2();
    }

    Parking2() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            int[] arr = new int[n];
            while (n-- > 0) {
                arr[n] = sc.getInt();
            }
            Arrays.sort(arr);
            System.out.println((arr[arr.length - 1] - arr[0]) * 2);
        }
    }

}
