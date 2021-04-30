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

class AlienNumbers {
    
    public static void main(String[] args) {
        new AlienNumbers();
    }

    AlienNumbers() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<String> al = new ArrayList<>();
        while(n-- > 0) {
            String alien_number = sc.getWord(), 
                source_language = sc.getWord(), 
                target_language = sc.getWord();
            
            char[] alienArr = alien_number.toCharArray();

            ArrayList<Character> sourceArr = toCharList(source_language.toCharArray());
            ArrayList<Character> targetArr = toCharList(target_language.toCharArray());

            int sourceBase = source_language.length();
            int targetBase = target_language.length();

            int index = 0, base = 1;
            for (int i = alienArr.length - 1; i >= 0; i--) {
                index += sourceArr.indexOf(alienArr[i]) * base;
                base *= sourceBase;
            }
            
            StringBuffer result = new StringBuffer();

            while (index > 0) {
                result.insert(0, targetArr.get(index % targetBase));
                index /= targetBase;
            }

            al.add(result.toString());
        }
        for (int i = 1; i <= al.size(); i++) {
            System.out.printf("Case #%d: %s\n", i, al.get(i - 1));
        }
        // sc.close();
    }

    ArrayList<Character> toCharList(char[] arr) {
        ArrayList<Character> al = new ArrayList<>();
        for (char c : arr) {
            al.add(c);
        }
        return al;
    }

}
