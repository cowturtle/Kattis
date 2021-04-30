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

class SumOfTheOthers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            int target = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                int sum = 0;
                target = arr[i];
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) sum += arr[j];
                }
                if (sum == target) break;
            }
            System.out.println(target);
        }
        sc.close();
    }
    
}
