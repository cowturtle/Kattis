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

class Sim {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] input = br.readLine().toCharArray();
            ArrayDeque<Character> front = new ArrayDeque<>();
            ArrayDeque<Character> back = new ArrayDeque<>();
            boolean b = true;
            for (char c : input) {
                if (c == '<') {
                    if (b) {
                        if (!back.isEmpty())
                            back.pollLast();
                    } else if (!b) {
                        if (!front.isEmpty())
                            front.pollLast();
                    }
                } else if (c == '[' || c == ']') {
                    b = c == ']';
                    while (!front.isEmpty())
                        back.offerFirst(front.pollLast());
                } else {
                    if (b) {
                        back.offerLast(c);
                    } else {
                        front.offerLast(c);
                    }
                }
            }
            while (!front.isEmpty())
                out.print(front.pop());
            while (!back.isEmpty())
                out.print(back.pop());
            out.println();
        }
        out.close();
        br.close();
    }

}
