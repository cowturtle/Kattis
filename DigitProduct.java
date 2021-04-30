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

class DigitProduct {

  public static void main(String[] args) {
    System.out.println(foo(new java.util.Scanner(System.in).nextInt()));
  }

  static int foo(int n) {
    if (n < 10) return n;
    int product = 1;
    while (n > 0) {
      product *= n % 10 == 0 ? 1 : n % 10;
      n /= 10;
    }
    return foo(product);
  }

}
