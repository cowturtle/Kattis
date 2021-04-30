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

class Calculator {

  private List<String> postFix;

  public String evaluate(String input) {

    this.postFix = new ArrayList<>();
    infixToPostfix(input);
    return String.format("%.2f", calculatePostfix());    

  }

  private double calculatePostfix() {

    Stack<Double> stack = new Stack<>();

    for (String s : this.postFix) {

      if (isNumeric(s)) {

        stack.push(Double.parseDouble(s));

      } else {

        char op = s.charAt(0);

        if (op == 'S') {

          stack.push(-stack.pop());

        } else {

          double second = stack.pop();
          double first = stack.pop();
          double result = 0.0;

          if (op == '+') {
            result = first + second;
          } else if (op == '-') {
            result = first - second;
          } else if (op == '*') {
            result = first * second;
          } else if (op == '/') {
            result = first / second;
          }

          stack.push(result);

        }

      }

    }

    return stack.peek();

  }

  private boolean isNumeric(String s) {
    try {
      Double.parseDouble(s);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  private void infixToPostfix(String input) {

    char[] arr = input.toCharArray();
    int len = arr.length;
    char prev = '\u0000';
    Stack<Character> symbols = new Stack<>();

    for (int i = 0; i < len; i++) {

      if (arr[i] == ' ') continue;

      char c = arr[i];      

      if (c == '-' && (prev == '\u0000' || prev == '(' || isOperator(prev))) {

        symbols.push('S');

      } else if (c == '(') {

        symbols.push(c);

      } else if (c == ')') {

        while (!symbols.isEmpty() && symbols.peek() != '(') 
          this.postFix.add("" + symbols.pop());
        symbols.pop();

      } else if (isOperator(c)) {

        while (!symbols.isEmpty() && compareRank(symbols.peek(), c))
          this.postFix.add("" + symbols.pop());
        symbols.push(c);

      } else {

        StringBuilder sb = new StringBuilder();
        for (; i < arr.length; i++) {
          if (arr[i] == ' ') continue;
          if (Character.isDigit(arr[i])) {
            sb.append(arr[i]);
          } else {
            i--;
            break;
          }
        }
        this.postFix.add(sb.toString());

      }

      prev = c;

    }

    while (!symbols.isEmpty())
      this.postFix.add("" + symbols.pop());

  }

  private boolean compareRank(char first, char second) {
    return operatorRank(first) >= operatorRank(second);
  }

  private int operatorRank(char c) {
    if (c == '+' || c == '-') return 1;
    if (c == '*' || c == '/') return 2;
    if (c == 'S') return 3;
    return 0;
  }

  private boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/' || c == 'S'; 
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    Calculator calculator = new Calculator();
    String s = "";
    while ((s = br.readLine()) != null)
      out.println(calculator.evaluate(s));
    out.close();
    br.close();
  }

}
