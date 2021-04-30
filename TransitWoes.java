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

class TransitWoes {
    public static void main(String[] args) {
        new TransitWoes();
    }

    TransitWoes() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] stn = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int total = stn[1] - stn[0];
        int[] n = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] b = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();                
        int[] c = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray(); 
        int curr = n[0];                               
        for (int i = 1; i < n.length; i++) {
            curr += (curr > c[i - 1] 
                    ? curr % c[i - 1] 
                    : c[i - 1] - curr) 
                    + (b[i - 1] + n[i]);
        }
        sc.close();
        System.out.println(curr > total ? "no" : "yes");
    }
}
