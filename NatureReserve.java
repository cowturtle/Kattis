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
