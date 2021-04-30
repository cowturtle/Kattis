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
