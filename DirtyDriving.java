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

class DirtyDriving {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt();
        int[] cars = new int[n];
        for (int i = 0; i < n; i++)
            cars[i] = sc.getInt();
        Arrays.sort(cars);
        int min = 0;
        for (int i = 0; i < n; i++)
            min = Math.max(min, p * (i + 1) - (cars[i] - cars[0]));
        System.out.println(min);
        sc.close();
    }

}
