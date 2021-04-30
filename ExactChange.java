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

class ExactChange {
    
    static final int MAX_PRICE = 10000;
    static final int MAX_BILL = 10000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int price = sc.getInt() - 1, n = sc.getInt();
            int[] wallet = IntStream.range(0, n).map(x -> sc.getInt()).toArray();
            int[] prices = IntStream.range(0, 10000 + 1).map(x -> x == 0 ? 0 : Integer.MAX_VALUE).toArray();
            for (int bill : wallet) {
                int tmpprice = price;
                while (tmpprice-- > 0) {
                    if (prices[tmpprice] <= MAX_PRICE && tmpprice + bill <= MAX_BILL && prices[tmpprice + bill] > prices[tmpprice] + 1)
                        prices[tmpprice + bill] = prices[tmpprice] + 1;
                }
            }
            while (++price < prices.length) 
                if (prices[price] < Integer.MAX_VALUE) break;
            sb.append(price).append(" ").append(prices[price]).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
