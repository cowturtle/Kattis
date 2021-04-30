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

class BabyBites {
    
    public static void main(String[] args) {
        new BabyBites();
    }

    BabyBites() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        boolean isSense = true;
        int n = sc.getInt();
        Pattern p = Pattern.compile("mumble");
        for (int i = 1; i <= n; i++) {
            String s = sc.getWord();
            Matcher m = p.matcher(s);
            if (!m.matches() && i != Integer.parseInt(s)) {
                isSense = false;
                break;
            }
        }
        System.out.println(isSense ? "makes sense" : "something is fishy");
        sc.close();
    }
    
}
