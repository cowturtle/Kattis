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

class RadioCommercials {
    
    public static void main(String[] args) {
        // Kadane's algorithm
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt();
        int[] arr = new int[n];
        int[] memoized = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        getMax(arr, visited, memoized, n - 1, p); // backwards
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(max, memoized[i]);
        System.out.println(max);
        sc.close();
    }

    static int getMax(int[] arr, boolean[] visited, int[] memoized, int i, int p) {
        if (i == 0) return Math.max(arr[i] - p, -p);
        if (visited[i]) return memoized[i];
        // Kadane's algorithm, finding the maximum of just two numbers, A[i] and (A[i] + local_maximum[i-1])
        memoized[i] = Math.max(arr[i], arr[i] + getMax(arr, visited, memoized, i - 1, p)) - p;
        visited[i] = true;
        return memoized[i];
    }
    
}
