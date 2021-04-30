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

class Misa {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        int[][] shook = new int[r][c];
        char[][] seats = new char[r][c];
        int mirko = 0, others = 0;
        for (int i = 0; i < r; i++)
            seats[i] = sc.getWord().toCharArray();
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)
                if (seats[i][j] == '.') {
                    mirko = mirko < 9 ? Math.max(mirko, mirkoShaking(seats, i, j)) : mirko;
                } else {
                    others += othersShaking(seats, shook, i, j);
                }
        System.out.println(others + mirko);
        sc.close();
    }

    static int othersShaking(char[][] seats, int[][] shook, int i, int j) {
        int count = 0;
        shook[i][j] = 1;
        if (shake(seats, i - 1, j) && shook[i - 1][j] != 1) count++; // Up
        if (shake(seats, i + 1, j) && shook[i + 1][j] != 1) count++; // Down
        if (shake(seats, i, j - 1) && shook[i][j - 1] != 1) count++; // Left
        if (shake(seats, i, j + 1) && shook[i][j + 1] != 1) count++; // Right
        if (shake(seats, i - 1, j - 1) && shook[i - 1][j - 1] != 1) count++; // Top-Left
        if (shake(seats, i - 1, j + 1) && shook[i - 1][j + 1] != 1) count++; // Top-Right
        if (shake(seats, i + 1, j - 1) && shook[i + 1][j - 1] != 1) count++; // Bottom-Left
        if (shake(seats, i + 1, j + 1) && shook[i + 1][j + 1] != 1) count++; // Bottom-Right
        return count;
    }

    static int mirkoShaking(char[][] seats, int i, int j) {
        int count = 0;
        if (shake(seats, i - 1, j)) count++; // Up
        if (shake(seats, i + 1, j)) count++; // Down
        if (shake(seats, i, j - 1)) count++; // Left
        if (shake(seats, i, j + 1)) count++; // Right
        if (shake(seats, i - 1, j - 1)) count++; // Top-Left
        if (shake(seats, i - 1, j + 1)) count++; // Top-Right
        if (shake(seats, i + 1, j - 1)) count++; // Bottom-Left
        if (shake(seats, i + 1, j + 1)) count++; // Bottom-Right
        return count;
    }

    static boolean shake(char[][] seats, int i, int j) {
        return 0 <= i && i < seats.length 
                && 0 <= j && j < seats[i].length
                && seats[i][j] == 'o';
    }
    
}
