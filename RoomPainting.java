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

class RoomPainting {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        PriorityQueue<Integer> store = new PriorityQueue<>();
        PriorityQueue<Integer> joe = new PriorityQueue<>();
        while (n-- > 0)
        // for (int i = 0; i < n; i++)
            store.offer(sc.getInt());
        while (m-- > 0)
        // for (int i = 0; i < m; i++)
            joe.offer(sc.getInt());
        long wasted = 0, can = store.poll();
        while (!joe.isEmpty()) {
            int need = joe.poll();
            while (can < need) 
                can = store.poll();
            wasted += can - need;
        }
        System.out.println(wasted);
        sc.close();
    }

}
