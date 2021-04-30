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

class TouchscreenKeyboard {
    
    public static void main(String[] args) {
        new TouchscreenKeyboard();
    }

    TouchscreenKeyboard() {
        answer();
    }

    static final char[][] KEYBOARD 
        = new char[][] {
            {'q','w','e','r','t','y','u','i','o','p'},
            {'a','s','d','f','g','h','j','k','l'},
            {'z','x','c','v','b','n','m'}};

    static final Map<Character, int[]> memoized = new HashMap<>();

    static final Comparator<Entry<String, Integer>> SORT_VALUE = new Comparator<>() {
        @Override
        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
            int x = o1.getValue().compareTo(o2.getValue());
            return x == 0 ? o1.getKey().compareTo(o2.getKey()) : x;
        }
    };

    void answer() { 
        Kattio sc = new Kattio(System.in);
        buildMemoized();
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char[] typed = sc.getWord().toCharArray();
            int l = sc.getInt();
            HashMap<String, Integer> hmap = new HashMap<>();
            while (l-- > 0) {
                String tmp = sc.getWord();
                int dist = 0;
                for (int i = 0; i < typed.length; i++) {
                    if (typed[i] == tmp.charAt(i)) continue;
                    int[] xy1 = searchLetter(typed[i]);
                    int[] xy2 = searchLetter(tmp.charAt(i));

                    dist += (int) (Math.abs(xy1[0] - xy2[0]) 
                                + Math.abs(xy1[1] - xy2[1]));
                }
                hmap.put(tmp, dist);
            }
            List<Entry<String, Integer>> list = new LinkedList<>(hmap.entrySet());
            Collections.sort(list, SORT_VALUE);
            for (Entry<String, Integer> entry : list) 
                sb.append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue())
                    .append("\n");
        }      
        System.out.println(sb.toString().trim());
        sc.close();
    }

    void buildMemoized() {
        for (int i = 0; i < KEYBOARD.length; i++) {
            for (int j = 0; j < KEYBOARD[i].length; j++) {
                memoized.put(KEYBOARD[i][j], new int[] {i, j});
            }
        }
    }

    int[] searchLetter(char c) {
        if (memoized.containsKey(c)) {
            return memoized.get(c);
        }
        return null;
    }

}
