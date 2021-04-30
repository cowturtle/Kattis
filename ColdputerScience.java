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

class ColdputerScience {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i] < 0 ? 1 : 0;
        }
        System.out.println(count);
    }
}
