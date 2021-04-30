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

class TripleTexting {
    
    public static void main(String[] args) {
        new TripleTexting();
    }

    TripleTexting() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        int length = s.length() / 3;
        String s1 = s.substring(0, length);
        String s2 = s.substring(length, length * 2);
        String s3 = s.substring(length * 2, length * 3);
        String ans = "";
        if (s1.equals(s2)) {
            ans = s1;
        } else if (s1.equals(s3)) {
            ans  = s1;
        } else if (s2.equals(s3)) {
            ans = s2;
        }
        System.out.println(ans);
    }

}
