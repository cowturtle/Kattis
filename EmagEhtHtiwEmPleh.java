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

class EmagEhtHtiwEmPleh {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String whitestr = sc.nextLine();
        String blackstr = sc.nextLine();
        whitestr = whitestr.substring(7, whitestr.length());
        blackstr = blackstr.substring(7, blackstr.length());
        String[] white = whitestr.split(",");
        String[] black = blackstr.split(",");
        String[][] board = new String[8][8];
        for (String s : white) {
            if (s.length() == 3) {
                int x = 7 - (s.charAt(2) - 48 - 1);
                int y = (s.charAt(1) - 97);
                board[x][y] = String.valueOf(s.charAt(0));
            } else if (s.length() == 2) {
                int x = 7 - (s.charAt(1) - 48 - 1);
                int y = (s.charAt(0) - 97);
                board[x][y] = "P";
            }
        }
        for (String s : black) {
            if (s.length() == 3) {
                int x = 7 - (s.charAt(2) - 48 - 1);
                int y = (s.charAt(1) - 97);
                board[x][y] = String.valueOf(s.charAt(0)).toLowerCase();
            } else if (s.length() == 2) {
                int x = 7 - (s.charAt(1) - 48 - 1);
                int y = (s.charAt(0) - 97);
                board[x][y] = "p";
            }
        }
        sb.append("+---+---+---+---+---+---+---+---+");
        sb.append("\n");
        for (int i = 0; i < 8; i++) {
            sb.append("|");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            sb.append("...");
                        } else {
                            sb.append(":::");
                        }
                    } else {
                        if (j % 2 == 0) {
                            sb.append(":::");
                        } else {
                            sb.append("...");
                        }
                    }
                } else {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            sb.append("." + board[i][j] + ".");
                        } else {
                            sb.append(":" + board[i][j] + ":");
                        }
                    } else {
                        if (j % 2 == 0) {
                            sb.append(":" + board[i][j] + ":");
                        } else {
                            sb.append("." + board[i][j] + ".");
                        }
                    }
                }
                    
                sb.append("|");   
            }
            sb.append("\n");
            sb.append("+---+---+---+---+---+---+---+---+");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}
