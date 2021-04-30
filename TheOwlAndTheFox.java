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

class TheOwlAndTheFox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int org = sc.getInt();
            int sum = sumOfDigits(org);
            if (sum == 1) {
                sb.append(0);
            } else {
                sum -= 1;
                int i = org - 1;
                for (; i >= 0; i--) 
                    if (sumOfDigits(i) == sum) break; 
                sb.append(i);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
    static int sumOfDigits(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (char c : s.toCharArray()) 
            sum += c - '0';
        return sum;
    }

    // public static void main(String[] args) {
    //     Kattio sc = new Kattio(System.in);
    //     StringBuilder sb = new StringBuilder();
    //     int n = sc.getInt();
    //     while (n-- > 0) {
    //         int org = sc.getInt();
    //         int sum = sumOfDigits(org);
    //         sum -= 1;
    //         int i = org - 1;
    //         for (; i >= 0; i--) 
    //             if (sumOfDigits(i) == sum) break; 
    //         sb.append(i).append("\n");
    //     }
    //     System.out.println(sb.toString());
    //     sc.close();
    // }
    
    // static HashMap<Integer, Integer> sumMap = new HashMap<>();

    // static int sumOfDigits(int n) {
    //     if (sumMap.containsKey(n)) return sumMap.get(n);
    //     if (n < 10) return n;
    //     int sum = (n % 10) + sumOfDigits(n / 10);
    //     sumMap.put(n, sum);
    //     return sum;
    // }

}
