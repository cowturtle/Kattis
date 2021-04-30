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

class MissingGnomes {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> missing = new LinkedList<>();
        int n = sc.getInt(), m = sc.getInt();
        boolean[] arr = new boolean[n + 1];
        while (m-- > 0) {
            int x = sc.getInt();
            arr[x] = true;
            input.offer(x);
        }
        for (int i = 1; i < n + 1; i++)
            if (!arr[i]) missing.offer(i);
        while (!input.isEmpty() || !missing.isEmpty()) {
            if (input.isEmpty()) {
                out.println(missing.poll());
            } else if (missing.isEmpty()) {
                out.println(input.poll());
            } else if (input.peek() < missing.peek()) {
                out.println(input.poll());
            } else {
                out.println(missing.poll());
            }
        }
        out.close();
        sc.close();
    }

}
