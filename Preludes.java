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

class Preludes {
    
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("A#", "Bb");
        hmap.put("Bb", "A#");
        hmap.put("C#", "Db");
        hmap.put("Db", "C#");
        hmap.put("D#", "Eb");
        hmap.put("Eb", "D#");
        hmap.put("F#", "Gb");
        hmap.put("Gb", "F#");
        hmap.put("G#", "Ab");
        hmap.put("Ab", "G#");
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + i++ + ": ");
            String key = sc.getWord(), tonality = sc.getWord();
            if (hmap.containsKey(key)) {
                sb.append(hmap.get(key));
                sb.append(" ");
                sb.append(tonality);
            } else {
                sb.append("UNIQUE");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
