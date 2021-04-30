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

class FroshWeek2 {
    
    public static void main(String[] args) {
        // Kattio sc = new Kattio(System.in);
        // int n = sc.getInt(), m = sc.getInt();
        // Integer[] task = new Integer[n];
        // Integer[] rest = new Integer[m];
        // for (int i = 0; i < n; i++)
        //     task[i] = sc.getInt();
        // for (int i = 0; i < m; i++)
        //     rest[i] = sc.getInt();
        // Arrays.sort(task, Collections.reverseOrder());
        // Arrays.sort(rest, Collections.reverseOrder());
        // int i = 0, j = 0, count = 0;
        // while (i < n && j < m) {
        //     if (task[i] <= rest[j]) {
        //         j++;
        //         count++;
        //     }
        //     i++;
        // }
        // System.out.println(count);
        // sc.close();

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int[] task = new int[n];
        int[] rest = new int[m];
        for (int i = 0; i < n; i++)
            task[i] = sc.getInt();
        for (int i = 0; i < m; i++)
            rest[i] = sc.getInt();
        radixSort(task);
        radixSort(rest);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (task[i] <= rest[j]) {
                j++;
                count++;
            }
            i++;
        }
        System.out.println(count);
        sc.close();
    }

    static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int pow = 1; max / pow > 0; pow *= 10)
            countingSort(arr, pow);
    }

    static int getMax(int[] arr) {
        int max = arr[0], n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    static void countingSort(int[] arr, int pow) {
        int i = 0, n = arr.length;
        int[] res = new int[n], count = new int[10]; // base 10
        
        for (i = 0; i < 10; i++)
            count[i] = 0;

        for (i = 0; i < n; i++) 
            count[getDigitCount(arr, i, pow)]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i > -1; i--) {
            int digitCount = getDigitCount(arr, i, pow);
            res[count[digitCount] - 1] = arr[i];
            count[digitCount]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = res[i];
    }

    static int getDigitCount(int[] arr, int i, int pow) {
        return 9 - ((arr[i] / pow) % 10);
    }
    
}
