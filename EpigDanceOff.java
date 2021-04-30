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

class EpigDanceOff {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++)
            arr[i] = sc.getWord().toCharArray();
        
        int moves = 0;
        for (int i = 0; i < c; i++) {
            int dollar = 0, under = 0;
            for (int j = 0; j < r; j++) {
                if (arr[j][i] == '$') {
                    dollar++;
                } else under++;
            }
            if (under == r) moves++;
            if (i == c - 1 && dollar > 0) moves++;
        }
        System.out.println(moves);
        sc.close();
    }
    
}
