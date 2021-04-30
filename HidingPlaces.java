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

class HidingPlaces {
    
    static final int[] rarr = new int[] {-1, 1, -2, 2, -2, 2, -1, 1};
    static final int[] carr = new int[] {-2, -2, -1, -1, 1, 1, 2, 2};
    static final int BOARD_LENGTH = 8;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            String initial = sc.getWord();
            int letter = letterToInt(initial.charAt(0));
            int digit = digitToInt(initial.charAt(1));
            int[][] board = new int[BOARD_LENGTH][BOARD_LENGTH];
            boolean[][] visited = new boolean[BOARD_LENGTH][BOARD_LENGTH];
            traverse(board, visited, digit, letter);
            writeOut(sb, board, getMax(board));
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void writeOut(StringBuilder sb, int[][] board, int max) {
        sb.append(max).append(" ");
        for (int i = 0; i < BOARD_LENGTH; i++)
            for (int j = 0; j < BOARD_LENGTH; j++)
                if (board[i][j] == max) {
                    sb.append(intToLetter(j)).append(intToDigit(i)).append(" ");
                }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
    }

    static int getMax(int[][] board) {
        int max = 0;
        for (int i = 0; i < BOARD_LENGTH; i++) 
            for (int j = 0; j < BOARD_LENGTH; j++) 
                max = Math.max(max, board[i][j]);    
        return max;
    }

    static void traverse(int[][] board, boolean[][] visited, int x, int y) {

        class Point {
            int x, y;
            int count;
            Point(int x, int y, int count) {
                this.x = x;
                this.y = y;
                this.count = count;
            }
        }

        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(x, y, 0);
        queue.offer(start);
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (validBounds(p.x, p.y) && !visited[p.x][p.y]) {
                visited[p.x][p.y] = true;
                board[p.x][p.y] = p.count;
                for (int i = 0; i < 8; i++) {
                    int xx = p.x + rarr[i];
                    int yy = p.y + carr[i];
                    queue.offer(new Point(xx, yy, p.count + 1));
                }                    
            }
        }
    } 

    static boolean validBounds(int x, int y) {
        return 0 <= x && x < BOARD_LENGTH && 0 <= y && y < BOARD_LENGTH;
    }
    
    static int letterToInt(char c) {
        switch(c) {
            case 'a' : return 0;
            case 'b' : return 1;
            case 'c' : return 2;
            case 'd' : return 3;
            case 'e' : return 4;
            case 'f' : return 5;
            case 'g' : return 6;
            case 'h' : return 7;
            default: return -1;
        }
    }

    static int digitToInt(char c) {
        switch(c) {
            case '1' : return 7;
            case '2' : return 6;
            case '3' : return 5;
            case '4' : return 4;
            case '5' : return 3;
            case '6' : return 2;
            case '7' : return 1;
            case '8' : return 0;
            default: return -1;
        }
    }

    static char intToLetter(int i) {
        switch(i) {
            case 0 : return 'a';
            case 1 : return 'b';
            case 2 : return 'c';
            case 3 : return 'd';
            case 4 : return 'e';
            case 5 : return 'f';
            case 6 : return 'g';
            case 7 : return 'h';
            default: return ' ';
        }
    }

    static char intToDigit(int i) {
        switch(i) {
            case 0 : return '8';
            case 1 : return '7';
            case 2 : return '6';
            case 3 : return '5';
            case 4 : return '4';
            case 5 : return '3';
            case 6 : return '2';
            case 7 : return '1';
            default: return ' ';
        }
    }

}
