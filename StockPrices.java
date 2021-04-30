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

class StockPrices {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int o = Integer.parseInt(br.readLine());
    int n = 0;
    String[] tmp;
    char c;
    int quantity;
    int cost;
    int lastDeal;
    TreeMap<Integer, Integer> sell; // Lowest
    TreeMap<Integer, Integer> buy; // Highest

    while (o-- > 0)
    {
      lastDeal = -1;
      n = Integer.parseInt(br.readLine());
      sell = new TreeMap<>();
      buy = new TreeMap<>();
      while (n-- > 0)
      {
        tmp = br.readLine().split(" ");
        c = tmp[0].charAt(0);
        quantity = Integer.parseInt(tmp[1]);
        cost = Integer.parseInt(tmp[4]);
        if (c == 'b')
        {
          buy.put(cost, buy.getOrDefault(cost, 0) + quantity);
        }
        else if (c == 's')
        {
          sell.put(cost, sell.getOrDefault(cost, 0) + quantity);
        }
        while (!buy.isEmpty() && !sell.isEmpty() && buy.lastKey() >= sell.firstKey())
        {
          Map.Entry<Integer, Integer> buyPrice = buy.lastEntry();
          Map.Entry<Integer, Integer> sellPrice = sell.firstEntry();

          buy.pollLastEntry();
          sell.pollFirstEntry();

          if (buyPrice.getValue() > sellPrice.getValue())
          {
            buy.put(buyPrice.getKey(), buyPrice.getValue() - sellPrice.getValue());
          }
          else if (buyPrice.getValue() < sellPrice.getValue())
          {
            sell.put(sellPrice.getKey(), sellPrice.getValue() - buyPrice.getValue());
          }

          lastDeal = sellPrice.getKey();
        }
        out.printf("%s %s %s\n", 
            sell.isEmpty() ? "-" : sell.firstKey(),
            buy.isEmpty() ? "-" : buy.lastKey(),
            lastDeal == -1 ? "-" : lastDeal);
      }
    }

    out.close();
    br.close();
  }

}
