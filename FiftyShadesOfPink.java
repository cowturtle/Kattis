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

class FiftyShadesOfPink {
    
    public static void main(String[] args) {
        new FiftyShadesOfPink();
    }

    FiftyShadesOfPink() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), total = 0;
        while (n-- > 0) {
            String s = sc.getWord().toLowerCase();
            total += s.contains("pink") || s.contains("rose") ? 1 : 0;
        }
        System.out.println(total == 0 ? "I must watch Star Wars with my daughter" : total);
        sc.close();
    }

}
