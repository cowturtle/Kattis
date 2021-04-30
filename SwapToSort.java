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

class SwapToSort {
// Very similar to virtual friends, probably should have done this before that
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = sc.getInt();
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        while (k-- > 0) 
            union(arr, sc.getInt() - 1, sc.getInt() - 1);
        boolean pass = true;
        for (int i = 0; i < n; i++)
            if (searchParent(arr, i) != searchParent(arr, n - 1 - i)) {
                pass = false;
                break;
            }
        System.out.println(pass ? "Yes" : "No");
        sc.close();
    }

    static void union(int[] arr, int a, int b) {
        a = searchParent(arr, a);
        b = searchParent(arr, b);
        if (a != b) {
            arr[a] = b;
        }
    }

    static int searchParent(int[] arr, int i) {
        if (arr[i] == -1) return i;
        return arr[i] = searchParent(arr, arr[i]);
    }
    
}
