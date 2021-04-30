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

class SetExclamation {
    
    public static void main(String[] args) {
        new SetExclamation();
    }

    SetExclamation() {
        answer();
    }

    void answer() { 
        // 1 2 3 symbols
        // diamonds, squiggles or ovals
        // solid striped or open fill
        // red green or purple
        Card[] board = readBoard();
        System.out.println(getSet(board));        
    }

    String getSet(Card[] board) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < board.length; i++) {
            for (int j = i + 1; j < board.length; j++) {
                for (int k = j + 1; k < board.length; k++) {
                    if (checkSet(board[i], board[j], board[k])) {
                        sb.append((i + 1) + " " + (j + 1) + " " + (k + 1) + "\n");
                    }
                }
            }
        }
        return sb.length() == 0 ? "no sets" : sb.toString();
    }

    boolean checkSet(Card a, Card b, Card c) {
        boolean[] same = new boolean[4];

        same[0] = checkSymbol(a,b,c);
        same[1] = checkShape(a,b,c);
        same[2] = checkFill(a,b,c);
        same[3] = checkColor(a,b,c);

        // check consistency of difference
        if ((!same[0] && !trueDiffSymbol(a,b,c))
            || (!same[1] && !trueDiffShape(a,b,c))
            || (!same[2] && !trueDiffFill(a,b,c)) 
            || (!same[3] && !trueDiffColor(a,b,c))) return false; 
        return true;
    }

    boolean checkSymbol(Card a, Card b, Card c) {
        return a.sameSymbol(b) && b.sameSymbol(c);
    }

    boolean checkShape(Card a, Card b, Card c) {
        return a.sameShape(b) && b.sameShape(c);
    }

    boolean checkFill(Card a, Card b, Card c) {
        return a.sameFill(b) && b.sameFill(c);
    }

    boolean checkColor(Card a, Card b, Card c) {
        return a.sameColor(b) && b.sameColor(c);
    }

    boolean trueDiffSymbol(Card a, Card b, Card c) {
        return !a.sameSymbol(b) && !b.sameSymbol(c) && !c.sameSymbol(a);
    }

    boolean trueDiffShape(Card a, Card b, Card c) {
        return !a.sameShape(b) && !b.sameShape(c) && !c.sameShape(a);
    }

    boolean trueDiffFill(Card a, Card b, Card c) {
        return !a.sameFill(b) && !b.sameFill(c) && !c.sameFill(a);
    }
    
    boolean trueDiffColor(Card a, Card b, Card c) {
        return !a.sameColor(b) && !b.sameColor(c) && !c.sameColor(a);
    }


    Card[] readBoard() {
        Kattio sc = new Kattio(System.in);
        Card[] board = new Card[12];
        for (int i = 0; i < board.length; i++) {
            char[] s = sc.getWord().toCharArray();
            board[i] = new Card(s[0], s[1], s[2], s[3]);
        }
        // sc.close();
        return board;
    }
    
}

class Card {
    private final char symbol;
    private final char shape;
    private final char fill;
    private final char color;

    public Card(char symbol, char shape, char fill, char color) {
        this.symbol = symbol;
        this.shape = shape;
        this.fill = fill;
        this.color = color;
    }

    boolean sameSymbol(Card other) {
        return this.symbol == other.symbol;
    }

    boolean sameShape(Card other) {
        return this.shape == other.shape;
    }

    boolean sameFill(Card other) {
        return this.fill == other.fill;
    }

    boolean sameColor(Card other) {
        return this.color == other.color;
    }
}
