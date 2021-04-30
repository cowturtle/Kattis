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

class Teque {

    private static int MAX_SIZE = 10000000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        int[] front = new int[MAX_SIZE + 1], back = new int[MAX_SIZE + 1];
        int frontStart = 5000000, frontEnd = 5000000, backStart = 5000000, backEnd = 5000000;
        while (n-- > 0) {
            int op = sc.getWord().length();
            int val = sc.getInt();
            if (op == 3) { // get
                int frontSize = frontEnd - frontStart;
                if (val < frontSize) {
                    out.println(front[frontStart + val + 1]);
                } else {
                    out.println(back[val - frontSize + backStart]);
                }
            } else if (op == 9) { // back
                back[backEnd] = val;
                backEnd++;
            } else if (op == 10) { // front
                front[frontStart] = val;
                frontStart--;
            } else if (op == 11) { // middle
                int frontSize = frontEnd - frontStart;
                int backSize = backEnd - backStart;
                int mid = (frontSize + backSize + 1) / 2;
                while (mid > frontSize) {
                    frontEnd++;
                    front[frontEnd] = back[backStart];
                    backStart++;
                    frontSize = frontEnd - frontStart;
                }
                while (mid < frontSize) {
                    backStart--;
                    back[backStart] = front[frontEnd];
                    frontEnd--;
                    frontSize = frontEnd - frontStart;
                }
                frontEnd++;
                front[frontEnd] = val;
            }
        }
        out.close();
        sc.close();
    }

}
