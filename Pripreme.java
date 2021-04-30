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

class Pripreme {

    public static void main(String[] args) {
        // Cannot lecture a team at the same time
        // it the team that takes the longest time to understand longer
        // than the sum of all other teams combined, it will take a total of the max * 2 e.g. in sample 2
        // if it is lesser, optimal plan can proceed normally as shown in sample 1 and 3
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int max = 0;
        long sum = 0L;
        while (n-- > 0) {
            int x = sc.getInt();
            max = (int) Math.max(x, max);
            sum += x;
        }
        System.out.println(max >= sum - max ? max * 2 : sum);
        sc.close();
    }

}
