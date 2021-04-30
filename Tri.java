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

class Tri {
    
    public static void main(String[] args) {
        new Tri();
    }

    Tri() {
        answer();
    }

    void answer() { System.out.println(calculate(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray())); }

    String calculate(int[] digits) {
        int a = digits[0], b = digits[1], c = digits[2];
        char[] symbols = new char[]{'+','-','/','*'};
        for (int i = 0; i < symbols.length; i++) {
            if (operate(symbols[i], a, b) == c) return a + "" + symbols[i] + "" + b + "=" + c;
        }
        for (int i = 0; i < symbols.length; i++) {
            if (operate(symbols[i], b, c) == a) return a + "=" + b + "" + symbols[i] + "" + c;
        }
        return "GG.com";
    }

    int operate(char c, int a, int b) {
        switch (c) {
            case '+': return a + b;
            case '-': return a - b; 
            case '/': return a / b;
            case '*': return a * b;
            default: return -1;
        }
    }   
 
}
