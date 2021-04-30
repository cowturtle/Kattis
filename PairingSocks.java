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

class PairingSocks {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() * 2, moves = 0;
        Stack<Integer> original = new Stack<>(), auxiliary = new Stack<>();
        while (n-- > 0)
            original.push(sc.getInt());
        while (!original.isEmpty()) {
            moves++;
            if (!auxiliary.isEmpty() && auxiliary.peek().equals(original.peek())) {
                auxiliary.pop();
                original.pop();
            } else {
                auxiliary.push(original.pop());
            }            
        }
        System.out.println(auxiliary.isEmpty() ? moves : "impossible");
        sc.close();
    }

}
