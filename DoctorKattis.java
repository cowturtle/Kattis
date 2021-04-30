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

class DoctorKattis {

  class Kat implements Comparable<Kat> {

    private final int id;
    private final String name;
    private int infection;
    private boolean treated;

    public Kat(int id, String name, int infection) {
      this.id = id;
      this.name = name;
      this.infection = infection;
      this.treated = false;
    }

    public void update(int x) {
      this.infection += x;
    }

    public void treat() {
      this.treated = true;
    }

    public boolean isTreated() {
      return this.treated;
    }

    @Override
    public String toString() {
      return this.name;
    }

    @Override
    public int compareTo(Kat k) {
      return this.infection == k.infection ? this.id - k.id : k.infection - this.infection;
    }

  }

  private final static int MAX_KATS = 200_000;
  private final static String EMPTY_CLINIC = "The clinic is empty";

  private final PriorityQueue<Kat> kats;
  private final HashMap<String, Kat> link;
  private int id;

  public DoctorKattis() {
    this.kats = new PriorityQueue<>(MAX_KATS);
    this.link = new HashMap<>(MAX_KATS);
    this.id = 0;
  }

  public void add(String name, int infection) {
    Kat kat = new Kat(id++, name, infection);
    this.kats.offer(kat);
    this.link.put(name, kat);
  }

  public void update(String name, int infection) {
    this.link.get(name).update(infection);
  }

  public void treat(String name) {
    this.link.get(name).treat();
  }

  public String query() {
    Kat kat;
    while ((kat = this.kats.peek()) != null)
      if (kat.isTreated()) {
        this.kats.poll();
      } else {
        return kat.toString();
      }
    return EMPTY_CLINIC;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    DoctorKattis dk = new DoctorKattis();
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {

      String[] tmp = br.readLine().split(" ");
      char op = tmp[0].charAt(0);

      if (op == '0') {
        dk.add(tmp[1], Integer.parseInt(tmp[2]));
      } else if (op == '1') {
        dk.update(tmp[1], Integer.parseInt(tmp[2]));
      } else if (op == '2') {
        dk.treat(tmp[1]);
      } else if (op == '3') {
        out.println(dk.query());
      }

    }

    out.close();
    br.close();

  }

}
