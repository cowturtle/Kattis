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

class HissingMicrophone {

    public static void main(String[] args) {
        new HissingMicrophone();
    }

    HissingMicrophone() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        String print = "no hiss";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 's' && s.charAt(i) == s.charAt(i + 1)) {
                print = "hiss";
                break;
            }
        }
        System.out.println(print);
    }

}
