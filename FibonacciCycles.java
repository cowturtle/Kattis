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

class FibonacciCycles {

    static final HashMap<Integer, Integer> fibs = new HashMap<>();

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int q = sc.getInt();
        while (q-- > 0) {
            int k = sc.getInt();
            int[] visited = new int[1000];
            Arrays.fill(visited, -1);
            int index = 2;
            while (true) {
                int value = fib(index, k) % k;
                if (visited[value] != -1) {
                    out.println(visited[value]);
                    break;
                }
                visited[value] = index;
                index++;
            }
            fibs.clear();
        }
        out.close();
        sc.close();
    }

    static int fib(int n, int k) {
        if (fibs.containsKey(n)) return fibs.get(n);
        if (n == 0 || n == 1) return 1;
        int x = (fib(n - 1, k) % k) + (fib(n - 2, k) % k);
        fibs.put(n, x);
        return x;
    }

}
