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

class DASort {

    // e.g.
    // 1 5 2 4 3 6
    // 1 2 3 4 5 6
    // finding out how many are already nicely sorted in order
    // it would be easier if the numbers are strictly ascending by 1
    // to get around that we have 2 arrays

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p = sc.getInt();
        while (p-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int n = sc.getInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) 
                arr2[i] = arr[i] = sc.getInt();
            Arrays.sort(arr);
            int j = 0;
            for (int i = 0; i < n; i++)
                if (arr2[i] == arr[j]) j++;
            sb.append(n - j).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
