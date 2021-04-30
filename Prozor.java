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

class Prozor {
    
    public static void main(String[] args) {
        new Prozor();
    }

    Prozor() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        int r = arr[0], c = arr[1], k = arr[2], max = 0, drawx = 0, drawy = 0;
        char[][] window = new char[r][c];
        for (int i = 0; i < r; i++) 
            window[i] = sc.nextLine().toCharArray();
        for (int i = 0; i < r - k + 1; i++) {
            for (int j = 0; j < c - k + 1; j++) {
                int lmax = 0;
                for (int a = i + 1; a < i + k - 1; a++) {
                    for (int b = j + 1; b < j + k - 1; b++) {
                        if (window[a][b] == '*') lmax++;
                    }
                }
                if (lmax > max) {
                    drawx = i;
                    drawy = j;
                    max = lmax;
                }
            }
        }
        System.out.println(max);
        for (int i = drawy; i < drawy + k - 1; i++)
            window[drawx][i] = '-'; 
        for (int i = drawy; i < drawy + k - 1; i++)
            window[drawx + k - 1][i] = '-'; 
        for (int i = drawx + 1; i < drawx + k - 1; i++) {
            for (int j = drawy; j < drawy + k; j++) {
                if (j == drawy || j == drawy + k - 1) {
                    window[i][j] = '|';
                }
            }
        }
        window[drawx][drawy] = '+';
        window[drawx][drawy + k - 1] = '+';
        window[drawx + k - 1][drawy + k - 1] = '+';
        window[drawx + k - 1][drawy] = '+';
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(window[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }       
    
}
