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

class DeliciousBubbleTea {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int teaTypes = sc.getInt();
        int[] prices = new int[teaTypes];
        for (int i = 0; i < teaTypes; i++)
            prices[i] = sc.getInt();
        int toppingTypes = sc.getInt();
        int[] toppings = new int[toppingTypes];
        for (int i = 0; i < toppingTypes; i++)
            toppings[i] = sc.getInt();
        ArrayList<Integer> totalPrices = new ArrayList<>();
        for (int i = 0; i < teaTypes; i++) {
            int toppingCounts = sc.getInt();
            while (toppingCounts-- > 0)
                totalPrices.add(prices[i] + toppings[sc.getInt() - 1]);
        }
        int wallet = sc.getInt();
        int min = Collections.min(totalPrices);
        System.out.println((wallet / min) > 0 ? (wallet / min) - 1 : 0);
        sc.close();
    }
    
}
