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
