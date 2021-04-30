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

class Egypt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            int a = 1, b = 2, c = 0;    
            if (arr[0] > arr[1] && arr[0] > arr[2]) {
                c = arr[0];
                a = arr[1];
                b = arr[2];
            } else if (arr[1] > arr[0] && arr[1] > arr[2]) {
                c = arr[1];
                a = arr[0];
                b = arr[2];
            } else if (arr[2] > arr[0] && arr[2] > arr[1]) {
                c = arr[2];
                a = arr[0];
                b = arr[1];
            }
            boolean right = c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            sb.append(right ? "right" : "wrong");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

}
