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

class ShortSell {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt(), k = sc.getInt();
    long costMax = 0, profit = 0;
    for (int i = 0; i < n; i++) {
      long cost = sc.getLong();
      cost *= 100;
      cost += k * i;
      if (cost > costMax) {
        costMax = cost;
      } 
      if (costMax - cost > profit) { // If the max cost - current cost = new profit > old profit
        // System.out.printf("%d %d %d\n", costMax, cost, profit);
        profit = costMax - cost;
      }
    }

    profit -= k; // Inclusive k
    profit = profit < 0 ? 0 : profit;

    out.println(profit);
    out.close();
    sc.close();
  }

}
