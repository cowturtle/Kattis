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

class LostLineup {
    
    public static void main(String[] args) {
        new LostLineup();
    }

    LostLineup() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 2; i <= n; i++)
            arr[sc.getInt() + 1] = i;
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        sc.close();
    }

}
