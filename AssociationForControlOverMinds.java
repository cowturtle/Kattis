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

class AssociationForControlOverMinds {

  private static final int[] ingredients = new int[500_501];

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    Arrays.fill(ingredients, -1);
    int n = sc.getInt(), concot = 0;
    while (n-- > 0) {
      int m = sc.getInt();
      int ingredientsCount = m, availIngredients = 0;
      HashSet<Integer> recipe = new HashSet<>();
      while (m-- > 0) 
        recipe.add(findSet(sc.getInt()));
      Iterator i = recipe.iterator();
      while (i.hasNext()) 
        availIngredients += getSize((int) i.next());         
      if (ingredientsCount == availIngredients) {
        concot++;
        i = recipe.iterator();
        int first = (int) i.next();
        while (i.hasNext())
          unionSet(first, (int) i.next());
      }
    }
    System.out.println(concot);
    sc.close();
  }  

  static int getSize(int i) {
    return -ingredients[findSet(i)];
  }

  static int findSet(int i) {
    if (ingredients[i] < 0) return i;
    return ingredients[i] = findSet(ingredients[i]);
  }

  static void unionSet(int i, int j) {
    i = findSet(i);
    j = findSet(j);
    if (i == j) return;
    ingredients[i] += ingredients[j];
    ingredients[j] = i;
  }

}
