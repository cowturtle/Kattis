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

class IdentifyingMapTiles {
    
    public static void main(String[] args) {
        new IdentifyingMapTiles();
    }

    IdentifyingMapTiles() {
        answer();
    }

    void answer() { 
        String s = new java.util.Scanner(System.in).nextLine();
        int x = 0, y = 0, len = s.length(), mult = 1;
        for (int i = len - 1; i >= 0; i--) {
            char curr = s.charAt(i);

            if (curr == '1' || curr == '3') x += mult;
            if (curr == '2' || curr == '3') y += mult;
            mult *= 2;
        }
        System.out.printf("%d %d %d", len, x, y);
    }
    
}
