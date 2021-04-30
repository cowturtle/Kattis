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

class IntegerLists {
    
    public static void main(String[] args) {
        new IntegerLists();
    }

    IntegerLists() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            char[] actions = sc.getWord().toCharArray();
            int size = sc.getInt();
            String[] list = readList(sc.getWord(), size);
            
            Deque<String> queue = new LinkedList<>();
            addToQueue(queue, list);
            sb.append(act(queue, actions)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    String[] readList(String s, int size) {
        return size == 0 ? new String[0] : s.substring(1, s.length() - 1).split(",");
    }

    void addToQueue(Deque<String> queue, String[] list) {
        for (String s : list) 
            queue.add(s);
    }

    String act(Deque<String> queue, char[] actions) {
        boolean back = false, error = false;
        for (char c : actions) {
            if (c == 'R') {
                back = !back;
            } else {
                if (queue.size() == 0) {
                    error = true;
                    break;
                }
                if (back) {
                    queue.removeLast();
                } else {
                    queue.removeFirst();
                }
            }
        }

        return writeOutput(queue, back, error);
    }

    String writeOutput(Deque<String> queue, boolean back, boolean error) {

        if (error) return "error";

        StringBuilder sb = new StringBuilder();
        if (back) {
            Deque<String> backwards = new LinkedList<>();
            Iterator iter = queue.iterator();
            while (iter.hasNext())
                backwards.push(String.valueOf(iter.next()));
            sb.append(backwards.toString().replaceAll("\\s+", ""));
        } else {
            sb.append(queue.toString().replaceAll("\\s+", ""));
        }
        return sb.toString().trim();     
    }
}
