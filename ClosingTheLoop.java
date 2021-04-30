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

class ClosingTheLoop {
    
    public static void main(String[] args) {
        new ClosingTheLoop();
    }

    ClosingTheLoop() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            int s = sc.getInt(), total = 0;
            ArrayList<Integer> blue = new ArrayList<>();
            ArrayList<Integer> red = new ArrayList<>();
            while (s-- > 0) {
                String tmp = sc.getWord();
                int len = Integer.parseInt(tmp.substring(0, tmp.length() - 1));
                if (tmp.charAt(tmp.length() - 1) == 'B') {
                    blue.add(len);
                } else red.add(len);
            }
            Collections.sort(blue);
            Collections.sort(red);
            if (blue.size() > red.size()) {
                while (blue.size() != red.size()) {
                    blue.remove(0);
                }
            } else if (red.size() > blue.size()) {
                while (blue.size() != red.size()) {
                    red.remove(0);
                }
            }
            // System.out.println(blue.toString());
            // System.out.println(red.toString());
            for (Integer x : blue)
                total += x;
            for (Integer x : red)
                total += x; 
            total -= (blue.size() + red.size());
            sb.append("Case #" + i + ": " + total).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}
