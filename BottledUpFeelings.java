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

class BottledUpFeelings {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int s = arr[0], v1 = Math.max(arr[1], arr[2]), v2 = Math.min(arr[1], arr[2]);
        int i = s / v1, j = 0;
        boolean f = false;
        for (; i >= 0; i--) {
            if ((s - (i * v1)) % v2 == 0) {
                j = (s - (i * v1)) / v2;
                f = true;
                break;
            }
        }
        System.out.println(f ? i + " " + j : "Impossible");
    }
}
