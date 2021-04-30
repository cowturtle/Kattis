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

class ARationalSequence3 {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int target = sc.getInt();
            int[] foo = new int[] {0, 1};
            bar(target, foo);
            sb.append(foo[0] + "/" + foo[1]);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void bar(int n, int[] foo) {
        if (n > 0) bar(n / 2, foo);
        // left child = p numerator / (p numerator + p denominator)
        // right child = (p numerator + p denominator) / p denominator  
        if (n % 2 == 0) { // left child
            foo[1] += foo[0];
        } else { // right child
            foo[0] += foo[1];
        }
    }

}
