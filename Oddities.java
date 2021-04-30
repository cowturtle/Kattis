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

class Oddities {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }
        }
    }
}
