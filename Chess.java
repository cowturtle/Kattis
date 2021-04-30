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

class Chess {
   
    static class Square {
        char x, y, color;       

        Square(char x, char y) {
            this.x = x;
            this.y = y;
            this.color = getColor();
        }

        char getColor() {
            int xx = ((int) this.x) - 65 + 1;
            int yy = Character.getNumericValue(this.y);
            if (xx % 2 == 0) {
                if (yy % 2 == 0) {
                    return 'b';
                }
                return 'w';
            } else {
                if (yy % 2 == 0) {
                    return 'w';
                }
                return 'b';
            }
        }

        boolean differentColor(Square s) {
            return this.color != s.color;
        }

        @Override
        public int hashCode() {
            return ((int) this.x) * 100000 + ((int) this.y);
        }
            
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj instanceof Square) {
                Square s = (Square) obj;
                return s.x == this.x && s.y == this.y;
            }
            return false;
        }

        @Override
        public String toString() {
            return this.x + " " + this.y;
        }
    }

    private static final HashMap<Square, Set<Square>> memoized = new HashMap<>();

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       PrintWriter out = new PrintWriter(System.out);
       int n = Integer.parseInt(br.readLine());
       while (n-- > 0) {
        String tmp = br.readLine();
        char startx = tmp.charAt(0), starty = tmp.charAt(2), endx = tmp.charAt(4), endy = tmp.charAt(6);
        Square start = new Square(startx, starty);
        Square end = new Square(endx, endy);
        if (start.differentColor(end)) {
            out.println("Impossible");
        } else if (start.equals(end)) {
            out.printf("%d %s\n", 0, start);
        } else {
            Set<Square> startset = new HashSet<>();
            Set<Square> endset = new HashSet<>();
            getSet(startset, start);
            getSet(endset, end);
            if (startset.contains(end) || endset.contains(start)) {
                out.printf("%d %s %s\n", 1, start, end);
            } else {
                Set<Square> retain = new HashSet<>();
                retain.addAll(startset);
                retain.retainAll(endset);
                if (retain.size() > 0) {
                    out.printf("%d %s %s %s\n", 2, start, retain.iterator().next(), end);
                } else {
                    out.println("Impossible");
                }
            }
        }
       }
       out.close();
       br.close();
    }

    static void getSet(Set<Square> set, Square s) {
       if (memoized.containsKey(s)) {
           set.addAll(memoized.get(s));
       } else {
           findPossibleMoves(set, s.x, s.y);
           memoized.put(s, set);
       }
    }

    static void findPossibleMoves(Set<Square> set, char x, char y) {
        traverse(set, x, y, 0);
        traverse(set, x, y, 1);
        traverse(set, x, y, 2);
        traverse(set, x, y, 3);
    }

    static void traverse(Set<Square> set, char x, char y, int op) {
        while (true) {
            if (op == 0) {
                x--;
                y--;
            } else if (op == 1) {
                x++;
                y--;
            } else if (op == 2) {
                x++;
                y++;
            } else if (op == 3) {
                x--;
                y++;
            }
            if (!valid(x, y)) break;
            set.add(new Square(x, y));
        }
    }

    static boolean valid(char x, char y) {
        return 65 <= x && x <= 72 && 49 <= y && y <= 56; 
    }

}
