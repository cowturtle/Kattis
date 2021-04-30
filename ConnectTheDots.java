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

class ConnectTheDots {

    private static HashMap<Character, int[]> points = new HashMap<>();
    private static char[][] image = new char[100][100];
    private static PrintWriter out = new PrintWriter(System.out);
    private static final char[] dots = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
                                                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        
        int r = 0, c = 0;
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                drawLines();
                printImage(r, c);
                points.clear();
                image = new char[100][100];
                r = 0;
                c = 0;
            } else {
                char[] tmp = s.toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                    image[r][j] = tmp[j];
                    if (image[r][j] != '.') points.put(image[r][j], new int[]{r, j});
                }
                r++;
                c = tmp.length;
            }            
        }
        drawLines();
        printImage(r, c);
        out.close();
        br.close();
    }

    static void drawLines() {
        int[] curr = points.get(dots[0]);
        for (int k = 1; k < dots.length; k++) {
            char ctmp = dots[k];
            if (!points.containsKey(ctmp)) break;
            int[] next = points.get(ctmp);
            if (curr[0] == next[0]) { // same row
                int start = Math.min(curr[1], next[1]) + 1;
                int end = Math.max(curr[1], next[1]) - 1;
                int row = curr[0];
                for (; start <= end; start++)
                    if (image[row][start] == '|') {
                        image[row][start] = '+';
                    } else if (image[row][start] == '.') {
                        image[row][start] = '-';
                    }
            } else { // same col
                int start = Math.min(curr[0], next[0]) + 1;
                int end = Math.max(curr[0], next[0]) - 1;
                int col = curr[1];
                for (; start <= end; start++)
                    if (image[start][col] == '-') {
                        image[start][col] = '+';
                    } else if (image[start][col] == '.') {
                        image[start][col] = '|';
                    }
            }
            curr = next;
        }
    }

    static void printImage(int r, int c) {
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) 
                out.print(image[k][l]);
            out.println();
        }                  
        out.println();
    }

}
