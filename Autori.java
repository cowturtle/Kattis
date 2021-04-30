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

class Autori {
    void answer() {
        String[] sarr = new Scanner(System.in).nextLine().split("-");
        String s = "";
        for (String ss : sarr) {
            s += String.valueOf(ss.charAt(0));
        }
        System.out.println(s);
    }
}
