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

class AddEmUp {
    
    public static void main(String[] args) {
        new AddEmUp();
    }

    AddEmUp() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        ArrayList<NumberCard> cards = new ArrayList<>();
        int n = sc.getInt(), s = sc.getInt();
        while (n-- > 0) 
            cards.add(new NumberCard(sc.getInt()));
        System.out.println(find(s, cards) ? "YES" : "NO");
        sc.close();
    }

    

    boolean find(int s, ArrayList<NumberCard> cards) {
        for (int i = 0; i < cards.size() - 1; i++) 
            for (int j = i + 1; j < cards.size(); j++) 
                if (cards.get(i).addEquals(cards.get(j), s)) return true;
        return false;
    }
}

class NumberCard {
    int val;
    int flip;

    NumberCard(int val) {
        this.val = val;
        this.flip = check() ? flip() : 200000001;
    }

    private boolean check() {
        for (int i = 10; i < this.val * 10; i *= 10) {
            int x = (this.val % i) / (i / 10);
            if (x == 3 || x == 4 || x == 7) return false;
        }
        return true;
    }

    public boolean addEquals(NumberCard c, int s) {
        return this.val + c.val == s 
                || this.val + c.flip == s
                || this.flip + c.val == s
                || this.flip + c.flip == s;
    }

    private int flip () {
        int n = this.val;
        int n2 = 0;
        while (n != 0) {
            int x = n % 10;
            if (x == 6) {
                x = 9;
            } else if (x == 9) {
                x = 6;
            }
            n2 = n2 * 10 + x;   
            n /= 10;
        }
        return n2;
    }
}
