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

class Skener {
    
    public static void main(String[] args) {
        new Skener();
    }

    Skener() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int r1 = sc.getInt(), c1 = sc.getInt(), r2 = sc.getInt(), c2 = sc.getInt();
        char[][] arr = new char[r1][c1];
        char[][] res = new char[r1 * r2][c1 * c2];

        for (int i = 0; i < r1; i++) 
            arr[i] = sc.getWord().toCharArray();
        
        for (int i = 0; i < r1; i++) {
            for (int k = 0; k < r2; k++) {
                for (int j = 0; j < c1; j++) {
                    for (int l = 0; l < c2; l++) {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println();
            }
        }
    
        sc.close();
    }

}
