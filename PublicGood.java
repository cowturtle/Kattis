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

class PublicGood {

  static class Building {
    char type;
    ArrayList<Building> connections;

    Building() {
      this.type = '\u0000';
      this.connections = new ArrayList<>();
    }

    void connect(Building b) {
      this.connections.add(b);
    }

    boolean hasNoConnections() {
      return this.connections.size() == 0;
    }

    void searchNext() {
      searchNextHelper(this, 'h');
    }

    private void searchNextHelper(Building b, char type) {
      b.type = type;
      for (Building bb : b.connections) 
        if (bb.type == '\u0000')
          searchNextHelper(bb, type == 'h' ? 'p' : 'h');
    }

    @Override
    public String toString() {
      return this.type == 'h' ? "house" : "pub";
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = tmp[0], m = tmp[1];

    Building[] buildings = IntStream.range(0, n)
      .mapToObj(x -> new Building())
      .toArray(Building[]::new);
    while (m-- > 0) {
      tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int x = tmp[0] - 1, y = tmp[1] - 1;
      buildings[x].connect(buildings[y]);
      buildings[y].connect(buildings[x]);
    }

    for (Building b : buildings) {
      if (b.hasNoConnections()) {
        out.println("Impossible");
        out.close();
        br.close();
        return;
      } else if (b.type == '\u0000') {
        b.searchNext();
      }
    }

    IntStream.range(0, n).mapToObj(x -> buildings[x] + (x == n - 1 ? "" : " ")).forEach(out::print);

    out.close();
    br.close();
  }

}
