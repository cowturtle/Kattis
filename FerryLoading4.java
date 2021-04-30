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

class FerryLoading4 {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        while (c-- > 0) {
            int l = sc.getInt() * 100, m = sc.getInt();
            ArrayDeque<Integer> leftBank = new ArrayDeque<>();
            ArrayDeque<Integer> rightBank = new ArrayDeque<>();
            while (m-- > 0) {
                int len = sc.getInt();
                String bank = sc.getWord();
                if (bank.equals("left")) {
                    leftBank.add(len);
                } else rightBank.add(len);
            }
            int moves = 0;
            boolean left = true;
            while (!leftBank.isEmpty() || !rightBank.isEmpty()) {
                int tmpl = l;
                if (left) {
                    while (!leftBank.isEmpty() && tmpl - leftBank.peek() > 0) {
                        tmpl -= leftBank.poll();
                    }
                } else {
                    while (!rightBank.isEmpty() && tmpl - rightBank.peek() > 0) {
                        tmpl -= rightBank.poll();
                    }
                }
                left = !left;
                moves++;
            }
            sb.append(moves).append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}
