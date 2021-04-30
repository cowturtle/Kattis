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

class Mia {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p11 = 0, p12 = 0, p21 = 0, p22 = 0;
        while ((p11 = sc.getInt()) != 0 && (p12 = sc.getInt()) != 0 
                && (p21 = sc.getInt()) != 0 && (p22 = sc.getInt()) != 0) {
                    int player1 = calculate(p11, p12);
                    int player2 = calculate(p21, p22);

                    if (player1 == player2) {
                        sb.append("Tie.");
                    } else if (player1 > player2) {
                        sb.append("Player 1 wins.");
                    } else {
                        sb.append("Player 2 wins.");
                    }
                    sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
        
    }

    static int calculate(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        if (a == 2 && b == 1) return a * b * 123456;

        if (a == b) return ((a * 10) + b) * 1000;

        return (a * 10) + b;
    }
    
}
