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

class Cetiri {
    
    public static void main(String[] args) {
        System.out.println(foo(Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static int foo(int[] arr) {
        Arrays.sort(arr);
        int constant = Math.min(arr[1] - arr[0], arr[2] - arr[1]);
        int[] arr2 = new int[] {arr[0], arr[0] + constant, arr[0] + 2 * constant, arr[0] + 3 * constant};
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            if (x != arr[0] && x != arr[1] && x != arr[2]) {
                return x;
            }
        }        
        return arr[0];
    }
    
}
