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

class AddingWords {
    
    public static void main(String[] args) {
        new AddingWords();
    }

    AddingWords() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> hmap = new HashMap<>();
        Map<Integer, String> hmap2 = new HashMap<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            if (tmp[0].equals("def")) {
                hmap2.remove(hmap.get(tmp[1]));
                hmap.put(tmp[1], Integer.parseInt(tmp[2]));
                hmap2.put(Integer.parseInt(tmp[2]), tmp[1]);
            } else if (tmp[0].equals("calc")) {
                
                int total = 0;
                if (hmap.containsKey(tmp[1])) {
                    total += hmap.get(tmp[1]);
                    for (int i = 2; i < tmp.length - 1; i += 2) {
                        if (hmap.containsKey(tmp[i + 1])) {
                            int a = hmap.get(tmp[i + 1]);
                            if (tmp[i].equals("+")) {
                                total += a;
                            } else total -= a;      
                        } else {
                            total = Integer.MIN_VALUE;
                            break;
                        }
                    }
                } else {
                    total = Integer.MIN_VALUE;
                }        

                sb.append(s.substring(5, s.length()));
                sb.append(" ");
                sb.append(hmap2.containsKey(total) ? hmap2.get(total) : "unknown");
                sb.append("\n");
            } else if (tmp[0].equals("clear")) {
                hmap.clear();
                hmap2.clear();
            }
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}
