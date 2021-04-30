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

class HelpMeWithTheGame {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            sc.getWord();
            board[i] = sc.getWord()
                            .substring(1, 32)
                            .replaceAll(":::", "X")
                            .replaceAll("\\.\\.\\.", "X")
                            .replaceAll("[\\.:]","")
                            .split("\\|");
        }
        sc.getWord();
        // . = white
        // : = black
        ArrayList<String> white = new ArrayList<>();
        ArrayList<String> black = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char tmp = board[i][j].charAt(0);
                if (tmp != 'X') {
                    String in = (tmp == 'P' || tmp == 'p' ? "" : Character.toUpperCase(tmp)) + "" + ((char) (j + 97)) + String.valueOf(8 - i);
                    if (Character.isUpperCase(tmp)) { // white
                        white.add(in);
                    } else { // black
                        black.add(in);
                    }
                }
            }
        };
        Comparator<String> whiteSort = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                // 1. By piece
                // 2. Smaller row number
                // 3. Smaller column letter
                int diff = getDiff(s1, s2);

                if (diff == 0) {
                    if (s1.length() == 3) {
                        if (s1.charAt(2) == s2.charAt(2)) {
                            return s1.charAt(1) - s2.charAt(1);
                        } else {
                            return s1.charAt(2) - s2.charAt(2);
                        }
                    } else {
                        if (s1.charAt(1) == s2.charAt(1)) {
                            return s1.charAt(0) - s2.charAt(0);
                        } else {
                            return s1.charAt(1) - s2.charAt(1);
                        }
                    }
                }

                return s1.compareTo(s2) + diff;
            }
        };
        Comparator<String> blackSort = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                // 1. By piece
                // 2. Bigger row number
                // 3. Smaller column letter
                int diff = getDiff(s1, s2);
                
                if (diff == 0) {
                    if (s1.length() == 3) {
                        if (s1.charAt(2) == s2.charAt(2)) {
                            return s1.charAt(1) - s2.charAt(1);
                        } else {
                            return s2.charAt(2) - s1.charAt(2);
                        }
                    } else {
                        if (s1.charAt(1) == s2.charAt(1)) {
                            return s1.charAt(0) - s2.charAt(0);
                        } else {
                            return s2.charAt(1) - s1.charAt(1);
                        }
                    }
                }

                return s1.compareTo(s2) + diff;
            }
        };
        Collections.sort(white, whiteSort);
        Collections.sort(black, blackSort);
        System.out.printf("White: %s\nBlack: %s", 
                            white.toString().replaceAll("[\\[\\]\\s+]", ""), 
                            black.toString().replaceAll("[\\[\\]\\s+]", ""));
        sc.close();
    }
    
    static int getDiff(String s1, String s2) {
        int diff = 0;

        if (s1.contains("K")) diff -= 111111;
        else if (s1.contains("Q")) diff -= 11111;
        else if (s1.contains("R")) diff -= 1111;
        else if (s1.contains("B")) diff -= 111;
        else if (s1.contains("N")) diff -= 11;

        if (s2.contains("K")) diff += 111111;
        else if (s2.contains("Q")) diff += 11111;
        else if (s2.contains("R")) diff += 1111;
        else if (s2.contains("B")) diff += 111;
        else if (s2.contains("N")) diff += 11;

        return diff;
    }

}
