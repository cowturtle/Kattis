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

class TeacherEvaluation {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt(), nn = n;;
        int total = 0;
        for (int i = 0; i < n; i++)
            total += sc.getInt();
        if (p == 100) {
            System.out.println("impossible");
        } else {
            while (total / (double) nn < p) {
                nn++;
                total += 100;
            }
            System.out.println(nn - n);
        }        
        sc.close();
    }

}
