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

class SumKindOfProblem {
    
    public static void main(String[] args) {
        new SumKindOfProblem();
    }

    SumKindOfProblem() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int p = sc.getInt();
        while (p-- > 0) {
            sb.append(sc.getInt());
            sb.append(" ");
            int n = sc.getInt();
            sb.append(sumFirstN(n));
            sb.append(" ");
            sb.append(sumFirstNOdd(n));
            sb.append(" ");
            sb.append(sumFirstNEven(n));
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }


    int sumFirstN(int n) {
        return (n * (n + 1)) / 2;
    }

    int sumFirstNOdd(int n) {
        return (int) Math.pow(n, 2);
    }

    int sumFirstNEven(int n) {
        return (int) Math.pow(n, 2) + n;
    }

}
