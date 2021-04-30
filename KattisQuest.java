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

class KattisQuest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    TreeMap<Integer, PriorityQueue<Integer>> tmap = new TreeMap<>();

    while (n-- > 0) {

      String[] in = br.readLine().split(" ");
      int e = Integer.parseInt(in[1]);

      if (in[0].charAt(0) == 'a') {
        int g = Integer.parseInt(in[2]);
        if (tmap.containsKey(e)) {
          tmap.get(e).offer(g);
        } else {
          PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
          queue.offer(g);
          tmap.put(e, queue);
        }
      } else {
        Entry<Integer, PriorityQueue<Integer>> entry = null;
        long accumulate = 0;
        while ((entry = tmap.floorEntry(e)) != null) {
          PriorityQueue<Integer> queue = entry.getValue();
          accumulate += (long) queue.poll();
          if (queue.isEmpty()) tmap.remove(entry.getKey());
          e -= entry.getKey();
        }
        bw.write(accumulate + "\n");
      }

    }

    bw.close();
    br.close();
  }

}
