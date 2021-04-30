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

class Akcija {
    
    public static void main(String[] args) {
        new Akcija();
    }

    Akcija() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int[] arr = new int[sc.getInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.getInt();    
        radixSort(arr);        
        System.out.println(getTotal(arr));
        sc.close();
    }

    int getTotal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i += 3) {
            if (i + 1 < arr.length && i + 2 < arr.length) {
                total += arr[i];
                total += arr[i + 1];
            }
        }
        if (arr.length == 1) {
            total = arr[0];
        } else if (arr.length % 3 == 1) {
            total += arr[arr.length - 1];
        } else if (arr.length % 3 == 2) {
            total += arr[arr.length - 1];
            total += arr[arr.length - 2];
        }
        return total;
    }

    void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int pow = 1; max / pow > 0; pow *= 10)
            countingSort(arr, pow);
    }

    int getMax(int[] arr) {
        int max = arr[0], n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    void countingSort(int[] arr, int pow) {
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

    int getDigitCount(int[] arr, int i, int pow) {
        return 9 - ((arr[i] / pow) % 10);
    }

}
