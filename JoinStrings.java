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
// Similar to VirtualFriends concept. However the linking of each element
// requires a double list to promote efficiency

class JoinStrings {
     
    static final PrintWriter out = new PrintWriter(System.out);
     
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(); // n cannot be bigger than 1 because n can == 1;
        String[] input = new String[n];
        ArrayList<LinkedList<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            input[i] = sc.getWord();
            list.add(new LinkedList<>());
        }
        int start = 0;
        while (--n > 0) 
            list.get(start = sc.getInt() - 1).add(sc.getInt() - 1);
        print(input, list, start);
        out.close();
        sc.close();
    }

    static void print(String[] input, ArrayList<LinkedList<Integer>> list, int index) {
        out.print(input[index]);
        for (int i : list.get(index)) 
            print(input, list, i);
    }
    
}
