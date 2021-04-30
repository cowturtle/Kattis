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

class Dyslectionary {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        PriorityQueue<String> words = new PriorityQueue<>();        
        int maxlen = 0;
        String s = "";
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                while (!words.isEmpty()) {
                    String word = reverse(words.poll());
                    out.printf("%s\n", " ".repeat(maxlen - word.length()) + word);
                }        
                out.println();
                maxlen = 0;
            } else {
                words.add(reverse(s));
                maxlen = Math.max(s.length(), maxlen);
            }            
        }
        while (!words.isEmpty()) {
            String word = reverse(words.poll());
            out.printf("%s\n", " ".repeat(maxlen - word.length()) + word);
        }            
        out.close();
        br.close();
    }

    static String reverse(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];            
            arr[arr.length - 1 - i] = tmp;
        }            
        return new String(arr);
    }

}
