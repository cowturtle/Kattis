import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Map;
import java.util.Set;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Stack;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

///////////////////////////////////////////////////////////////////////////////

class TheSetStackComputer 
{

  private Stack<HashSet<Object>> stack;
  private HashMap<HashSet<Object>, Integer> map;

  public TheSetStackComputer()
  {
    this.stack = new Stack<>();
    this.map = new HashMap<>();
  }

  public void push()
  {
    this.stack.push(new HashSet<>());
  }

  public void dup()
  {
    HashSet<Object> set = this.stack.pop();
    this.stack.push(set);
    this.stack.push(set);
  }

  public void union()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>(set1);
    set.addAll(set2);
    this.stack.push(set);
  }

  public void intersect()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>(set1);
    set.retainAll(set2);
    this.stack.push(set);
  }

  public void add()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>();

    if (this.map.containsKey(set1))
    {
      set.add(this.map.get(set1));
    }
    else
    {
      set.add(this.map.size());
      this.map.put(set1, this.map.size());
    }
    set.addAll(set2);
    this.stack.push(set);
  }

  public int size()
  {
    return this.stack.peek().size();  
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    TheSetStackComputer tssc = new TheSetStackComputer();

    int t = Integer.parseInt(br.readLine());
    int n = 0;
    char c = '\u0000';
    while (t-- > 0)
    {
      n = Integer.parseInt(br.readLine());
      while (n-- > 0)
      {
        c = br.readLine().charAt(0);
        if (c == 'P') tssc.push();
        if (c == 'D') tssc.dup();
        if (c == 'U') tssc.union();
        if (c == 'I') tssc.intersect();
        if (c == 'A') tssc.add();
        out.println(tssc.size());
      }
      out.println("***");
    }

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Baloni {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    br.readLine();
    String[] tmp = br.readLine().split(" ");
    int[] counter = new int[1_000_000 + 1];
    int min = 0, x = 0;

    // 1 - based indexing
    for (String s : tmp)
    {
      x = Integer.parseInt(s);
      if (counter[x] > 0) 
      {
        counter[x]--; 
      }
      counter[x - 1]++; 
    }

    for (int i : counter)
    {
      min += i;
    }
    out.println(min);

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class WorkingAtTheRestaurant {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String[] tmp;
    while ((s = br.readLine()) != null)
    {
      if (s.equals("0")) break;
      char c = '\u0000';
      int n = Integer.parseInt(s);
      int m = 0;
      int p1 = 0, p2 = 0;
      while (n-- > 0)
      {
        tmp = br.readLine().split(" ");
        c = tmp[0].charAt(0);
        m = Integer.parseInt(tmp[1]);

        if (c == 'D')
        {
          out.printf("DROP 2 %d\n", m);
          p2 += m;
        }
        else if (c == 'T')
        {
          if (p1 >= m)
          {
            out.printf("TAKE 1 %d\n", m);
            p1 -= m;
          }
          else
          {
            if (p1 > 0)
            {
              out.printf("TAKE 1 %d\n", p1);
              m -= p1;
              p1 = 0;
            }
            out.printf("MOVE 2->1 %d\n", p2);
            p1 = p2;
            p1 -= m;
            p2 = 0;
            out.printf("TAKE 1 %d\n", m);
          }
        }
      }
      out.println();
    }

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class GolombRulers {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    ArrayList<Integer> missing;
    String s = "";
    boolean[] found;
    boolean not;
    int[] arr;
    while ((s = br.readLine()) != null)
    {
      missing = new ArrayList<>();
      not = false;
      found = new boolean[1_000_000];
      arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(arr);
      for (int i = arr.length - 1; i >= 0; i--)
      {
        for (int j = i - 1; j >= 0; j--)
        {
          int x = arr[i] - arr[j];
          if (found[x])
          {
            not = true;
            break;
          }
          else
          {
            found[x] = true;
          }
        }
        if (not) break;
      }

      if (not)
      {
        out.println("not a ruler");
      }
      else
      {
        for (int i = 1; i < arr[arr.length - 1]; i++)
        {
          if (!found[i]) missing.add(i);
        }
        if (missing.isEmpty())
        {
          out.println("perfect");
        }
        else
        {
          out.printf("missing %s\n", missing.toString().replaceAll("[\\[\\],]", ""));
        }
      }
    }
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class MasteringMastermind {

  public static void main(String[] args) {
    String[] tmp = new Scanner(System.in).nextLine().split(" ");
    int n = Integer.parseInt(tmp[0]);

    char[] arr1 = tmp[1].toCharArray();
    char[] arr2 = tmp[2].toCharArray();
    int[] count1 = new int[26];
    int[] count2 = new int[26];
    int r = 0, s = 0;
    for (int i = 0; i < n; i++)
    {
      if (arr1[i] == arr2[i])
      {
        r++;
      } 
      else 
      {
        count1[arr1[i] - 65]++;
        count2[arr2[i] - 65]++;
      }
    }

    for (int i = 0; i < 26; i++)
      s += Math.min(count1[i], count2[i]);

    System.out.printf("%d %d\n", r, s);
  }
}

///////////////////////////////////////////////////////////////////////////////

class NatureReserve 
{
  class Edge
  {
    private int to;
    private int weight;
    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class TreeSetComparator implements Comparator<Edge>
  {
    @Override
    public int compare(Edge e1, Edge e2)
    {
      return e1.weight - e2.weight;
    }
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>());
      }
    }

    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));
    }

    public Long prims(int[] stations)
    {
      long total = 0L;
      
      boolean[] visited = new boolean[this.adjList.size()];
      PriorityQueue<Edge> queue = new PriorityQueue<>(new TreeSetComparator());

      for (int s : stations)
      {
        visited[s] = true;
        for (Edge e : this.adjList.get(s))
        {
          queue.add(e);
        }
      }

      Edge curr;
      while (!queue.isEmpty())
      {
        // curr = queue.pollFirst();
        curr = queue.poll();
        if (!visited[curr.to])
        {
          visited[curr.to] = true;
          total += curr.weight;

          for (Edge e : this.adjList.get(curr.to))
          {
            if (!visited[e.to])
            {
              queue.add(e);
            }
          }
        }
      }

      return total;
    }
  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);

    int t = sc.getInt();
    while (t-- > 0)
    {
      int n = sc.getInt(), m = sc.getInt(), l = sc.getInt(), s = sc.getInt();
      
      Graph graph = new Graph(n);      
      int[] stations = new int[s];
      for (int i = 0; i < s; i++)
      {
        stations[i] = sc.getInt();
      }

      while (m-- > 0)
      {
        graph.addEdge(sc.getInt(), sc.getInt(), sc.getInt() + l);
      }

      System.out.println(graph.prims(stations));
    }    

    sc.close();
  }

  public static void main(String[] args) 
  {
    new NatureReserve().run();  
  }
}

///////////////////////////////////////////////////////////////////////////////

class AWalkThroughTheForest {

  class Comp implements Comparator<Edge>
  {
    @Override
    public int compare(Edge e1, Edge e2)
    {
      return e1.weight - e2.weight;
    }
  }

  class Edge
  {
    int to;
    int weight;
    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>());
      }
    }

    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));      
    }

    public void dijkstra(int[] distance, int source)
    {
      PriorityQueue<Edge> queue = new PriorityQueue<>(new Comp());
      queue.offer(new Edge(source, 0));
      distance[source] = 0;

      Edge curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        if (distance[curr.to] >= curr.weight)
        {
          for (Edge e : this.adjList.get(curr.to))
          {
            if (distance[e.to] > distance[curr.to] + e.weight)
            {
              distance[e.to] = distance[curr.to] + e.weight;
              queue.offer(new Edge(e.to, distance[e.to]));
            }
          }
        }
      }
    }

    public int countPath(int[] paths, int[] distance, int destination)
    {
      if (paths[destination] == Integer.MIN_VALUE)
      {
        int ways = 0;
        for (Edge e : this.adjList.get(destination))
        {
          if (distance[e.to] > distance[destination])
          {
            ways += countPath(paths, distance, e.to);
          }
        }
        paths[destination] = ways;
      }
      return paths[destination];
    }

  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    while (true)
    {
      int n = sc.getInt();
      if (n == 0) break;
      int m = sc.getInt();
      Graph graph = new Graph(n);

      while (m-- > 0)
      {
        graph.addEdge(sc.getInt(), sc.getInt(), sc.getInt());
      }
      
      int[] distance = new int[n + 1];
      int[] paths = new int[n + 1];
      Arrays.fill(distance, Integer.MAX_VALUE);
      Arrays.fill(paths, Integer.MIN_VALUE);
      graph.dijkstra(distance, 2);
      paths[1] = 1;
      out.println(graph.countPath(paths, distance, 2));
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) {
    new AWalkThroughTheForest().run();
  }

}

///////////////////////////////////////////////////////////////////////////////

class LostMap {

  class Edge
  {
    int to;
    int weight;

    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class Node
  {
    int vertex;
    int key;
    public Node(int vertex, int key)
    {
      this.vertex = vertex;
      this.key = key;
    }    
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>(n / 2));
      }
    }
    
    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));
    }

    public void prims(int source, int[] parents)
    {
      PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>(){
        @Override
        public int compare(Node n1, Node n2)
        {
          return n1.key - n2.key;
        }
      });

      Node[] nodes = new Node[this.adjList.size()];
      boolean[] visited = new boolean[this.adjList.size()];

      for (int i = 1; i < nodes.length; i++)
      {
        nodes[i] = new Node(i, i == source ? 0 : Integer.MAX_VALUE);
        queue.offer(nodes[i]);
      }

      visited[source] = true;

      Node curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        visited[curr.vertex] = true;
        for (Edge e : this.adjList.get(curr.vertex))
        {
          if (nodes[e.to].key > e.weight)
          {
            queue.remove(nodes[e.to]);
            nodes[e.to].key = e.weight;
            queue.offer(nodes[e.to]);
            parents[e.to] = curr.vertex;
          }
        }
      }
    }
  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt(), x = -1;
    Graph graph = new Graph(n);
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        x = sc.getInt();
        if (i < j)
        {
          graph.addEdge(i, j, x);
        }
      }
    }

    int[] parents = new int[n + 1];
    Arrays.fill(parents, -1);
    graph.prims(1, parents);

    for (int i = 1; i < parents.length; i++)
    {
      if (parents[i] != -1)
      {
        System.out.printf("%d %d\n", parents[i], i);
      }
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) {
    new LostMap().run();
  }

}

///////////////////////////////////////////////////////////////////////////////

class BuildDependencies 
{
  public void run()
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    try 
    {
      int n = Integer.parseInt(br.readLine());

      HashMap<String, Integer> hmap = new HashMap<>(n);
      String[] files = new String[n];
      ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
      for (int i = 0; i < n; i++)
      {
        adjList.add(new ArrayList<>());
      }
      int[] deg = new int[n];

      String in;
      String[] inarr;
      String name;
      int colonIndex;
      int nameIndex;
      int depenIndex;
      while (n-- > 0)
      {
        in = br.readLine();
        colonIndex = in.lastIndexOf(":");
        name = in.substring(0, colonIndex);

        if (!hmap.containsKey(name))
        {
          hmap.put(name, hmap.size());          
        }
        nameIndex = hmap.get(name);

        if (colonIndex < in.length() - 1)
        {
          inarr = in.substring(colonIndex + 2, in.length()).split(" ");
          for (String s : inarr)
          {
            if (!hmap.containsKey(s))
            {
              hmap.put(s, hmap.size());              
            }   
            depenIndex = hmap.get(s); 
            adjList.get(depenIndex).add(nameIndex);
            
          }
          deg[nameIndex] += inarr.length;
        }
      }
      
      in = br.readLine();
      int sourceIndex = hmap.get(in);

      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0; i < deg.length; i++)
      {
        if (i == sourceIndex) continue;
        if (deg[i] == 0)
        {
          queue.offer(i);
        }
      }

      int curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        for (Integer i : adjList.get(curr))
        {
          deg[i]--;
          if (i == sourceIndex) continue;
          if (deg[i] == 0)
          {
            queue.offer(i);
          }
        }
      }

      for (Map.Entry<String, Integer> e : hmap.entrySet())
      {
        files[e.getValue()] = e.getKey();
      }

      queue.offer(sourceIndex);
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        out.println(files[curr]);
        for (Integer i : adjList.get(curr))
        {
          deg[i]--;
          if (deg[i] == 0)
          {
            queue.offer(i);
          }
        }
      }

      out.close();
      br.close();
    } 
    catch (IOException e) 
    {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) 
  {
    new BuildDependencies().run();        
  }
}

///////////////////////////////////////////////////////////////////////////////

class RunningMoM 
{

  private boolean DFS(String source, HashMap<String, ArrayList<String>> adjList, HashSet<String> visited)
  {
    visited.add(source);
    for (String s : adjList.get(source))
    {
      if (visited.contains(s)) return true;
      visited.add(s);
      if (DFS(s, adjList, visited)) return true;
      visited.remove(s);
    }
    return false;
  }

  // private boolean DFS(String source, HashMap<String, ArrayList<String>> adjList)
  // {
  //   Stack<String> stack = new Stack<>();
  //   HashSet<String> visited = new HashSet<>();
  //   stack.push(source);

  //   String curr;
  //   while (!stack.isEmpty())
  //   {
  //     curr = stack.pop();
      
  //     for (String neighbour : adjList.get(curr))
  //     {        
  //       if (!visited.contains(neighbour))
  //       {          
  //         visited.add(curr);
  //         stack.push(neighbour);
  //       }
  //       else
  //       {
  //         return true;
  //       }
  //     }
  //   }
  //   return false;
  // }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    int n = sc.getInt();
    String origin, destination;
    while (n-- > 0)
    {
      origin = sc.getWord();
      destination = sc.getWord();
      
      if (!adjList.containsKey(origin)) adjList.put(origin, new ArrayList<>());
      if (!adjList.containsKey(destination)) adjList.put(destination, new ArrayList<>());

      adjList.get(origin).add(destination);
    }

    String city;
    while (sc.hasMoreTokens())
    {
      city = sc.getWord();
      out.printf("%s %s\n", city, DFS(city, adjList, new HashSet<>()) ? "safe" : "trapped");
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) 
  {
    new RunningMoM().run();
  }
}

///////////////////////////////////////////////////////////////////////////////

class ElectricalOutlets 
{
  public static void main(String[] args) 
  {
    Kattio sc = new Kattio(System.in);
    int n = sc.getInt();
    while (n-- > 0)
    {
      int k = sc.getInt();
      int sum = 1 - k;
      while (k-- > 0)
      {
        sum += sc.getInt();
      }
      System.out.println(sum);
    }
    sc.close();
  }
}

///////////////////////////////////////////////////////////////////////////////

class Greetings 
{
  public static void main(String[] args) 
  {
    System.out.println(
      java.util.Arrays.toString(
        java.util.Arrays.stream(
          new java.util.Scanner(System.in)
            .nextLine().split(""))
            .map(x -> x.equals("e") ? "e" + "e" : x).toArray())
              .replaceAll("[\\s\\[\\],]", ""));
  }
}

///////////////////////////////////////////////////////////////////////////////

class Template 
{
  public static void main(String[] args) 
  {

  }
}
