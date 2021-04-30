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

class GreedilyIncreasingSubsequence {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        while (n-- > 0) {
            int curr = sc.getInt();
            if (max < curr) {
                max = curr;
                list.add(max);
            }
        }
        System.out.println(list.size());
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        sc.close();
    }   

}
