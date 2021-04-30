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
