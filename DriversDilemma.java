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

class DriversDilemma {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        double c = sc.getDouble() / 2.0, x = sc.getDouble(), m = sc.getDouble();
        double[][] chart = new double[6][2];
        for (int i = 0; i < 6; i++)
            chart[i] = new double[]{sc.getDouble(), sc.getDouble()};
        boolean yes = false;
        int i = 5;
        for (; i >= 0; i--) {
            double totalTime = m / chart[i][0];
            double moveConsumption = m / chart[i][1];
            double leakConsumption = x * totalTime;
            if (c - moveConsumption - leakConsumption > 0) {
                yes = true;
                break;
            }
        }
        System.out.printf("%s %s", yes ? "YES" : "NO", yes ? (int) chart[i][0] : "");
        sc.close();
    }

}
