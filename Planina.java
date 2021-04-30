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

class Planina {
    public static void main(String[] args) {
        new Planina();
    }

    Planina() {
        answer();
    }

    void answer() {
        // 0 4 4^0 + 3
        // 1 9 4^1 + 3 + 2
        // 2 25 4^2 + 5 + 4
        // 3 4^3 + 9 + 8
        // 4 4^4 + 17 + 16
        // 5 1089 4^5 + 33 + 32
        int n = new java.util.Scanner(System.in).nextInt();
        int iter = 1, add = 3;
        while (iter < n) {
            add = add + (int) Math.pow(2, iter);
            iter++;
        }
        System.out.println((int) Math.pow(4, n) + add + add - 1);
    }
}
