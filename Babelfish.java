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

class Babelfish {
    
    public static void main(String[] args) {
        new Babelfish();
    }

    Babelfish() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hmap = new HashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) break;
            String[] arr = s.split("\\s+");
            hmap.put(arr[1], arr[0]);
        }
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            sb.append(hmap.containsKey(s) ? hmap.get(s) : "eh").append("\n");
        }
        System.out.println(sb.toString());
    }
    
}
