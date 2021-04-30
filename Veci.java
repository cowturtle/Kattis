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

class Veci {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine()));
    }

    static int foo(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int org = Integer.parseInt(s);
        permute(list, s, 0, s.length() - 1);
        Collections.sort(list);
        for (Integer i : list)
            if (i > org) return i;
        return 0;
    }

    static void permute(ArrayList<Integer> list, String s, int l, int r) {
        if (l == r) {
            list.add(Integer.parseInt(s));
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(list, s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    static String swap(String s, int i, int j) {
        char tmp = 0;
        char[] arr = s.toCharArray();
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return String.valueOf(arr);
    }
    
}
