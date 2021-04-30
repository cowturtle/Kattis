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
