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

class Digits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while (!(s = br.readLine()).equals("END")) {
            int len = s.length();
            if (len < 8 && Integer.parseInt(s) == len) {
                out.println(1);
            } else {
                int count = 2;
                int curr = String.valueOf(len).length(), prev = len;
                while (curr != prev) {
                    prev = curr;
                    curr = String.valueOf(prev).length();
                    count++;
                }   
                out.println(count);
            }
        }
        out.close();
        br.close();
    }

}
