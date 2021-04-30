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

class FourThought {
    
    static class Equation {
        char[] operations;

        Equation(char[] operations) {
            this.operations = operations;
        }        

        public String toString(int ans) {
            return String.format("4 %s 4 %s 4 %s 4 = %d", this.operations[0], this.operations[1], this.operations[2], ans); 
        }

    }

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Integer, Equation> equations = new HashMap<>();
        buildEquations(equations);
        int n = sc.getInt(), x = 0;
        while (n-- > 0) 
            out.println(equations.containsKey(x = sc.getInt()) ? equations.get(x).toString(x) : "no solution");
        out.close();
        sc.close();
    }

    static void buildEquations(HashMap<Integer, Equation> equations) {
        char[] operations = new char[]{'+','-','*','/'};
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++) {
                    char[] tmp = new char[] {operations[i], operations[j], operations[k]};
                    equations.put(evaluate(tmp), new Equation(tmp));
                }                    
    }

    static <T> void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static int evaluate(char[] operations) {
        // operations. + -1, - -2, *, -3, / -4
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(operationToInt(operations[0]));
        al.add(4);
        al.add(operationToInt(operations[1]));
        al.add(4);
        al.add(operationToInt(operations[2]));
        al.add(4);
        process(al, -3);
        process(al, -4);
        process(al, -1);
        process(al, -2);
        return al.get(0);
    }

    static void process(ArrayList<Integer> al, int op) {
        while (al.contains(op)) {
            int x = al.indexOf(op);
            int f = al.get(x - 1), g = al.get(x + 1);
            int res = 0;
            if (op == -1) {
                res = f + g;
            } else if (op == -2) {
                res = f - g;
            } else if (op == -3) {
                res = f * g;
            } else if (op == -4) {
                res = f / g;
            }            
            al.set(x, res);
            al.remove(x + 1);
            al.remove(x - 1);
        }
    }

    static int operationToInt(char c) {
        return c == '+' ? -1 : c == '-' ? -2 : c == '*' ? -3 : -4;
    }

}
