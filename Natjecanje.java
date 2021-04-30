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

class Natjecanje {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int teams = sc.getInt(), damaged = sc.getInt(), reserves = sc.getInt();
        int[] arr = new int[teams];
        Arrays.fill(arr, 1);
        for (int i = 0; i < damaged; i++)
            arr[sc.getInt() - 1]--;
        for (int i = 0; i < reserves; i++)
            arr[sc.getInt() - 1]++;
        for (int i = 0; i < teams; i++) 
            if (arr[i] == 0) {
                if (valid(i - 1, teams) && arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (valid(i + 1, teams) && arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                }
            }
        int min = 0;
        for (int i = 0; i < teams; i++)
            min += arr[i] == 0 ? 1 : 0;
        System.out.println(min);
        sc.close();
    }

    static boolean valid(int i, int n) {
        return 0 <= i && i < n;
    }
     
}
