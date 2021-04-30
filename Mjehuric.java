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

class Mjehuric {
    
    public static void main(String[] args) {
        System.out.println(bubbleSort(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String bubbleSort(int[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) 
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sorted = false;
                    sb.append(java.util.Arrays.toString(arr).replaceAll("[\\[\\],]", "")).append("\n");
                }
        }
        return sb.toString().trim();        
    }
    
}
