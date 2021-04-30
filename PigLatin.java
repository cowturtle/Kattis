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

class PigLatin {
    
    public static void main(String[] args) {
        new PigLatin();
    }

    PigLatin() {
        answer();
    }

    void answer() {    
        Scanner sc = new Scanner(System.in); 
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            StringBuffer sb = new StringBuffer();
            for (String s : arr) {
                char first = s.charAt(0);
                if (isVowel(first)) {
                    sb.append(s + "yay");
                } else {
                    int i = 1;
                    for (; i < s.length(); i++) {
                        if (isVowel(s.charAt(i))) break; 
                    }
                    sb.append(s.substring(i, s.length()) + s.substring(0, i) + "ay");
                }
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
        
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

}
