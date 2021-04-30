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

class TornToPieces { 

  public static void main(String[] args) throws IOException {

    class Node {

      private final String value;
      private final String next;

      Node(String value, String next) {
        this.value = value;
        this.next = next;
      }

    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    Map<String, Set<String>> edges = new HashMap<>();
    Map<String, String> path = new HashMap<>();

    buildGraph(edges, br);

    String[] input = br.readLine().split(" ");
    String start = input[0], end = input[1];
    boolean valid = bfs(start, end, edges, path);

    out.println(valid ? writePath(path, start, end) : "no route found"); 

    out.close();
    br.close();
  }

  static String writePath(Map<String, String> path, String start, String end) {
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();
    stack.push(end);
    String curr = end;
    while (path.containsKey(curr)) 
      stack.push(curr = path.get(curr));
    while (!stack.isEmpty())
      sb.append(stack.pop()).append(" ");
    return sb.toString().substring(1, sb.length());
  }

  static boolean bfs(String start, String end, Map<String, Set<String>> edges, Map<String, String> path) {

    class Node {
      String value, next;
      Node(String value, String next) {
        this.value = value;
        this.next = next;
      }
    }

    Queue<Node> queue = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    queue.offer(new Node(start, ""));

    while (!queue.isEmpty()) {

      Node curr = queue.poll();

      if (visited.contains(curr.value)) continue;
      visited.add(curr.value);

      path.put(curr.value, curr.next);
      for (String neighbour : neighboursOf(curr.value, edges)) {

        if (visited.contains(neighbour)) continue;

        if (neighbour.equals(end)) {
          path.put(neighbour, curr.value);
          return true;
        }

        queue.add(new Node(neighbour, curr.value));

      }

    }

    return false;

  }

  static Set<String> neighboursOf(String vertex, Map<String, Set<String>> edges) {
    return edges.getOrDefault(vertex, new HashSet<>());
  }

  static void buildGraph(Map<String, Set<String>> edges, BufferedReader br) throws IOException {

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {

      String[] tmp = br.readLine().split(" ");
      edges.putIfAbsent(tmp[0], new HashSet<>());

      for (int i = 1; i < tmp.length; i++) {

        edges.putIfAbsent(tmp[i], new HashSet<>());
        edges.get(tmp[i]).add(tmp[0]);
        edges.get(tmp[0]).add(tmp[i]);

      }

    }

  }

}
