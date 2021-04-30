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

class ShebaAmoebas {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] dish = new char[r][c];
        int[][] plotter = new int[r][c];
        for (int i = 0; i < r; i++)
            dish[i] = sc.getWord().toCharArray();
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dish[i][j] == '#' && plotter[i][j] == 0) {
                    count++;
                    closeLoop(dish, plotter, i, j, count);
                }
            }
        }
        System.out.println(count);
        sc.close();
    }

    static void closeLoop(char[][] dish, int[][] plotter, int i, int j, int count) {
        if (i == -1 || j == -1 || i == dish.length || j == dish[0].length) return;
        if (dish[i][j] == '#' && plotter[i][j] == 0) {
            plotter[i][j] = count;
            closeLoop(dish, plotter, i - 1, j, count); // top
            closeLoop(dish, plotter, i + 1, j, count); // bottom
            closeLoop(dish, plotter, i, j - 1, count); // left
            closeLoop(dish, plotter, i, j + 1, count); // right

            closeLoop(dish, plotter, i - 1, j - 1, count); // top-left
            closeLoop(dish, plotter, i - 1, j + 1, count); // top-right
            closeLoop(dish, plotter, i + 1, j - 1, count); // bottom-left
            closeLoop(dish, plotter, i + 1, j + 1, count); // bottom-right
        }
    }
    
}
