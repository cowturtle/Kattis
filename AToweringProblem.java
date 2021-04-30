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

class AToweringProblem {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] boxes = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            boxes[i] = arr[i];
            sum += arr[i];
        }
        java.util.Arrays.sort(boxes);    
        int h1 = arr[6], h2 = arr[7];
        int i = 0, j = 0, k = 0;
        boolean pass = false;
        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 5; j++) {
                for (k = j + 1; k < 6; k++) {
                    if (boxes[i] + boxes[j] + boxes[k] == h1) {
                        pass = true;
                        break;
                    }
                }
                if (pass) break;                    
            }                
            if (pass) break;
        }
        for (int l = 5; l >= 0; l--)
            if (l == i || l == j || l == k) System.out.print(boxes[l] + " ");
        for (int l = 5; l >= 0; l--)
            if (l != i && l != j && l != k) System.out.print(boxes[l] + " ");

    }
    
}
