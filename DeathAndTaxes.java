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

class DeathAndTaxes {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int stockCount = 0;
        double costPerStock = 0;
        double earnings = 0;
        boolean dead = false;
        while (!dead) {
            String cmd = sc.getWord();
            switch (cmd) {
                case "buy": 
                    if (stockCount == 0) {
                        stockCount = sc.getInt();
                        costPerStock = sc.getDouble();
                    } else {
                        int boughtStock = sc.getInt();
                        double boughtPrice = sc.getDouble();
                        double oldHoldings = stockCount * costPerStock;
                        double newHoldings = boughtStock * boughtPrice;
                        stockCount += boughtStock;
                        costPerStock = (oldHoldings + newHoldings) / stockCount;
                    }                    
                    break;
                case "sell": 
                    stockCount -= sc.getInt();
                    sc.getInt();
                    break;
                case "split": 
                    int split = sc.getInt();
                    stockCount *= split;
                    costPerStock /= split;
                    break;
                case "merge": 
                    int merge = sc.getInt();
                    stockCount /= merge;
                    costPerStock *= merge;
                    break;
                case "die": 
                    double soldPrice = sc.getDouble();
                    if (soldPrice - costPerStock < 0) {
                        earnings = stockCount * soldPrice;
                    } else {
                        earnings = stockCount * (soldPrice - ((soldPrice - costPerStock) * 0.3));
                    }
                    dead = true;
                    break;
            }
            // System.out.println(stockCount + " " + costPerStock);
        }
        System.out.printf("%.2f\n", earnings);
        sc.close();
    }
    
}
