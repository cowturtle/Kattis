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

class NPuzzle {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Character, int[]> hmap = new HashMap<>();
        HashSet<Character> visited = new HashSet<>();

        hmap.put('A', new int[]{0, 0});
        hmap.put('B', new int[]{0, 1});
        hmap.put('C', new int[]{0, 2});
        hmap.put('D', new int[]{0, 3});

        hmap.put('E', new int[]{1, 0});
        hmap.put('F', new int[]{1, 1});
        hmap.put('G', new int[]{1, 2});
        hmap.put('H', new int[]{1, 3});

        hmap.put('I', new int[]{2, 0});
        hmap.put('J', new int[]{2, 1});
        hmap.put('K', new int[]{2, 2});
        hmap.put('L', new int[]{2, 3});

        hmap.put('M', new int[]{3, 0});
        hmap.put('N', new int[]{3, 1});
        hmap.put('O', new int[]{3, 2});
        hmap.put('.', new int[]{3, 3});
        
        int scatter = 0;
        for (int i = 0; i < 4; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = 0; j < 4; j++) {
                int[] coor = hmap.get(tmp[j]);
                if (tmp[j] != '.' && !visited.contains(tmp[j]) 
                    && !(i == coor[0] && j == coor[1])) {
                    visited.add(tmp[j]);                    
                    scatter += Math.abs(i - coor[0]) + Math.abs(j - coor[1]);
                }                    
            }
        }          
        
        out.println(scatter);
        out.close();
        sc.close();
    }

}
