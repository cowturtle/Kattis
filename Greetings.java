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
