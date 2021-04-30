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

class EventPlanning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int participants = sc.getInt(), budget = sc.getInt(), hotels = sc.getInt(), weeks = sc.getInt();
        int min = Integer.MAX_VALUE;
        while (hotels-- > 0) {
            int price = sc.getInt();
            for (int i = 0; i < weeks; i++) {
                int beds = sc.getInt(), totalCost = 0;
                if (beds >= participants && (totalCost = participants * price) <= budget) 
                    min = Math.min(totalCost, min);
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? "stay home" : min);
        sc.close();
    }
    
}
