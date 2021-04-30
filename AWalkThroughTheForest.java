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
