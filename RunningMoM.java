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
