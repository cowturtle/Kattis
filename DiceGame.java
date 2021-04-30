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

class DiceGame {
    
    public static void main(String[] args) {
        new DiceGame();
    }

    DiceGame() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double emma = sumStuff(sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt());
        double Gunnar = sumStuff(sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt());
        if (emma < Gunnar) {
            System.out.println("Emma");
        } else if (Gunnar < emma) {
            System.out.println("Gunnar");
        } else {
            System.out.println("Tie");
        }
        sc.close();
    }

    double sumStuff(int a, int b, int c, int d) {
        return sumSmallerStuff(a, b) + sumSmallerStuff(c, d);
    }

    double sumSmallerStuff(int a, int b) {
        return IntStream.rangeClosed(a, b).sum() / (double) (b - a + 1);
    }

}
