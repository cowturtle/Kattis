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

class FroshWeek {
    
    static long count = 0;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++)
            students[i] = sc.getInt();
        mergeSort(students, 0, n - 1);
        System.out.println(count);
        // System.out.println(Arrays.toString(students));
        sc.close();
    }

    static void merge(int[] arr, int l, int r, int m) {
        int leftlen = m - l + 1, rightlen = r - m;

        int left[] = new int[leftlen];
        int right[] = new int[rightlen];

        for (int i = 0; i < leftlen; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < rightlen; i++)
            right[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < leftlen && j < rightlen) {
            if (left[i] > right[j]) {
                arr[k] = right[j++];
                count += leftlen - i;
            } else {
                arr[k] = left[i++];
            }
            k++;
        }

        while (i < leftlen) 
            arr[k++] = left[i++];
        while (j < rightlen)
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // find mid pnt
            mergeSort(arr, l, m); // left half
            mergeSort(arr, m + 1, r); // right half
            merge(arr, l, r, m); // merge back
        }
    }
    
}
