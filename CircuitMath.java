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

class CircuitMath {

  void run(BufferedReader br, PrintWriter out) throws IOException {

    br.readLine();
    HashMap<Character, Character> hmap = new HashMap<>();
    char[] truthValues = br.readLine().toCharArray();
    for (int i = 0; i < truthValues.length; i += 2)
      hmap.put((char) ('A' + (i / 2)), truthValues[i]);

    char[] query = br.readLine().toCharArray();
    Stack<Character> values = new Stack<>();
    for (char c : query) {
      if (c == ' ') continue;
      if (isOperator(c)) {
        if (c == '-') {
          values.push(values.pop() == 'F' ? 'T' : 'F');
        } else {
          char second = values.pop();
          char first = values.pop();

          if (c == '+') {

            if (first == 'F' && second == 'F') {
              values.push('F');
            } else {
              values.push('T');
            }

          } else if (c == '*') {

            if (first == 'T' && second == 'T') {
              values.push('T');
            } else {
              values.push('F');
            }

          }

        }
      } else {
        values.push(hmap.get(c));
      }
    }

    out.println(values.peek());

  }

  boolean isOperator(char c) {
    return c == '+' || c == '*' || c == '-';
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    CircuitMath cm = new CircuitMath();
    cm.run(br, out);
    out.close();
    br.close();
  }

}
