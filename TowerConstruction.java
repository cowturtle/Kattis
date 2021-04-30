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

class TowerConstruction {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    int n = sc.getInt();
    if (n == 1) {
      System.out.println(1);
    } else {
      int curr = sc.getInt();
      int towers = 1;
      n--;
      for (int i = 0; i < n; i++) {
        int next = sc.getInt();
        if (next > curr) 
          towers++;
        curr = next;
      }
      System.out.println(towers);
    }
    sc.close();
  }

}
