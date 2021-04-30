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

class HiddenPassword {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        char[] p = arr[0].toCharArray();
        char[] s = arr[1].toCharArray();
        ArrayList<Character> plist = new ArrayList<>();
        ArrayList<Character> slist = new ArrayList<>();
        for (char c : p)
            plist.add(c);
        for (char c : s)
            slist.add(c);
        char curr = plist.get(0);
        for (char c : slist) {
            if (curr == c) {
                plist.remove(0);
                if (plist.size() == 0) break;
                curr = plist.get(0);
            } else if (plist.size() > 0 && plist.contains(c)) {
                break;
            }
        }
        System.out.println(plist.size() == 0 ? "PASS" : "FAIL");
    }
    
}
