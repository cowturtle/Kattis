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

class DisastrousDowntime {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = sc.getInt(), requests = 1 * k, minRequests = 1;
        int[] arr = new int[n];
        arr[0] = sc.getInt();
        for (int i = 1, j = 0; i < n; i++) {
            arr[i] = sc.getInt();
            for (; j < n && arr[j] + 1000 <= arr[i]; j++)
                minRequests--;
            minRequests++;
            requests = Math.max(requests, minRequests);
        }
        System.out.println((int) Math.ceil(requests / (double) k));
        sc.close();
    }

}
