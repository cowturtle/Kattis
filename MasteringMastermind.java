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

class MasteringMastermind {

  public static void main(String[] args) {
    String[] tmp = new Scanner(System.in).nextLine().split(" ");
    int n = Integer.parseInt(tmp[0]);

    char[] arr1 = tmp[1].toCharArray();
    char[] arr2 = tmp[2].toCharArray();
    int[] count1 = new int[26];
    int[] count2 = new int[26];
    int r = 0, s = 0;
    for (int i = 0; i < n; i++)
    {
      if (arr1[i] == arr2[i])
      {
        r++;
      } 
      else 
      {
        count1[arr1[i] - 65]++;
        count2[arr2[i] - 65]++;
      }
    }

    for (int i = 0; i < 26; i++)
      s += Math.min(count1[i], count2[i]);

    System.out.printf("%d %d\n", r, s);
  }
}
