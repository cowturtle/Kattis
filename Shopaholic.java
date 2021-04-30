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

class Shopaholic {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getLong();
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Long x, Long y) {
                return x < y ? 1 : x > y ? -1 : 0;
            }
        });
        Long dis = 0L;
        int lim = (n / 3) * 3;
        for (int i = 0; i < lim; i += 3)
            dis += arr[i + 2];
        System.out.println(dis);
        sc.close();
    }
    
}
