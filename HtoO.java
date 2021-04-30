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

class HtoO {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Character, Integer> instore = new HashMap<>();
        HashMap<Character, Integer> outstore = new HashMap<>();
        char[] input = sc.getWord().toCharArray();
        int n = sc.getInt();
        char[] output = sc.getWord().toCharArray();
        addToMap(input, instore);
        addToMap(output, outstore);
        multiplyInput(input, instore, n);
        if (checkMoleculesAvailability(instore, outstore)) {
            int create = Integer.MAX_VALUE;
            Iterator iter = outstore.entrySet().iterator();
            while (iter.hasNext()) {
                Entry e = (Entry) iter.next();
                int outrequirements = (Integer) e.getValue();
                int inputmaterials = instore.get((Character) e.getKey());
                // System.out.println(inputmaterials + " " + outrequirements);
                // System.out.println();
                create = Math.min(create, inputmaterials / outrequirements);
            }
            System.out.println(create);        
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    static boolean checkMoleculesAvailability(HashMap<Character, Integer> instore, HashMap<Character, Integer> outstore) {
        Iterator iter = outstore.entrySet().iterator();
        while (iter.hasNext()) 
            if (!instore.containsKey((Character)((Entry) iter.next()).getKey())) return false;
        return true;
    }

    static void multiplyInput(char[] arr, HashMap<Character, Integer> hmap, int n) {
        for (Entry<Character, Integer> e : hmap.entrySet()) 
            hmap.put(e.getKey(), e.getValue() * n);
    }

    static void addToMap(char[] arr, HashMap<Character, Integer> hmap) {
        for (int i = 0; i < arr.length; i++) {
            char letter = arr[i];
            String num = "";
            while (++i < arr.length && Character.isDigit(arr[i]))
                num += arr[i];
            i--;
            hmap.put(letter, (hmap.containsKey(letter) ? hmap.get(letter) : 0) + (num.equals("") ? 1 : Integer.parseInt(num)));
            // System.out.println(letter + " " + hmap.get(letter));
        }
    }
    
}
