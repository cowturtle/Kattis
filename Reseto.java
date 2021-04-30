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

class Reseto {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0], k = arr[1], target = -1;
        boolean[] nums = new boolean[n + 1];
        int i = 2;
        while (k > 0) {
            while (nums[i] && i < n + 1) i++;
            for (int j = i; j < n + 1 && k > 0; j += i) 
                if (!nums[j]) {
                    nums[j] = true;
                    k--;
                    target = j;
                }
        }
        System.out.println(target);
    }
    
}
