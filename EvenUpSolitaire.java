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

class EvenUpSolitaire {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        LinkedList<Integer> cards = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int card = sc.getInt();
            if (!cards.isEmpty() && ((card + cards.peekFirst()) % 2 == 0)) 
                cards.pollFirst();
            else cards.addFirst(card);
        }
        System.out.println(cards.size());
        sc.close();
    }

}
