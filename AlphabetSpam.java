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

class AlphabetSpam {
    
    public static void main(String[] args) {
        new AlphabetSpam();
    }

    AlphabetSpam() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        double total = s.length();
        double space = 0, lower = 0, upper = 0, symbols = 0;
        for (char c : s.toCharArray()) {
            if (c == '_') {
                space++;
            } else if (97 <= c && c <= 122) {
                lower++;
            } else if (65 <= c && c <= 90) {
                upper++;
            } else {
                symbols++;
            }
        }
        System.out.printf("%f\n%f\n%f\n%f\n", 
                space / total, lower / total, upper / total, symbols / total);
    }

}
