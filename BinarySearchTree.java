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

class BinarySearchTree {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        int[] counts = new int[300000 + 1];
        long currCount = 0;
        TreeSet<Integer> set = new TreeSet<>();
        while(n-- > 0) {
            int x = sc.getInt();
            set.add(x);
            Integer left = set.lower(x); 
            Integer right = set.higher(x);
            int count = 0;
            count = left != null ? Math.max(count, counts[left]) : count;
            count = right != null ? Math.max(count, counts[right]) : count;
            currCount += count;
            counts[x] = ++count;
            sb.append(currCount).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
