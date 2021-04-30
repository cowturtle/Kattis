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

class NotAmused {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> com = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        };
        int days = 1;
        while (sc.hasMoreTokens()) {
            sc.getWord();
            HashMap<String, Integer> timecard = new HashMap<>();
            while (true) {
                String action = sc.getWord();
                if (action.equals("CLOSE")) break;
                String name = sc.getWord();
                int time = sc.getInt();
                timecard.put(name, (timecard.containsKey(name) ? timecard.get(name) : 0) + (action.equals("ENTER") ? -time : time));
            }
            ArrayList<Entry<String, Integer>> list = new ArrayList<>(timecard.entrySet());
            Collections.sort(list, com);
            sb.append("Day ");
            sb.append(days++);
            sb.append("\n");
            for (Entry<String, Integer> e : list)
                sb.append(e.getKey()).append(" $").append(String.format("%.2f", ((double) e.getValue()) / 10)).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}
