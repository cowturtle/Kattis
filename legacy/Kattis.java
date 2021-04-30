import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Map;
import java.util.Set;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Stack;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Compilation of all my Kattis solutions.

@author Theodoric Keith Lim
@since 10.5.20
*/

////////////////////////////////////////////////////////////////////////////////

class SolvingForCarrots {
    void answer() {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        System.out.println(p);
    }
}

////////////////////////////////////////////////////////////////////////////////

class QuadrantSelection {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        String print = "";
        if (x > 0) {
            if (y > 0) {
                print = "1";
            } else {
                print = "4";
            }
        } else {
            if (y > 0) {
                print = "2";
            } else {
                print = "3";
            }
        }
        System.out.println(print);
    }
}

////////////////////////////////////////////////////////////////////////////////

class Oddities {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////

class ColdputerScience {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i] < 0 ? 1 : 0;
        }
        System.out.println(count);
    }
}

////////////////////////////////////////////////////////////////////////////////

class FizzBuzz {
    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            String print = "";
            if (i % x != 0 && i % y != 0) {
                print = String.valueOf(i);
            } else {
                if (i % x == 0) {
                    print += "Fizz";
                }
                if (i % y == 0) {
                    print += "Buzz";
                }
            }
            System.out.println(print);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////

class Autori {
    void answer() {
        String[] sarr = new Scanner(System.in).nextLine().split("-");
        String s = "";
        for (String ss : sarr) {
            s += String.valueOf(ss.charAt(0));
        }
        System.out.println(s);
    }
}

////////////////////////////////////////////////////////////////////////////////

class Bijele {
    void answer() {
        // kings, queens, rooks, bishops, knights and pawns
        // 1 1 2 2 2 8
        Scanner sc = new Scanner(System.in);
        System.out.printf(
            "%d %d %d %d %d %d", 
            1 - sc.nextInt(),
            1 - sc.nextInt(),
            2 - sc.nextInt(),
            2 - sc.nextInt(),
            2 - sc.nextInt(),
            8 - sc.nextInt()
        );
        sc.close();
    }
}

////////////////////////////////////////////////////////////////////////////////

class Tarifa {

    Tarifa() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt(), count = x;
        while (n > 0) {
            n--;
            count += x - sc.nextInt();
        }
        System.out.println(count);
    }
}

////////////////////////////////////////////////////////////////////////////////

class Spavanac {
    Spavanac() {
        answer();
    }

    void answer() {
        String[] s = new Scanner(System.in).nextLine().split(" ");
        int hours = Integer.parseInt(s[0]), minutes = Integer.parseInt(s[1]);
        Clock c = new Clock(hours, minutes);
        c.minusFourFive();
        System.out.println(c);
    }
}

class Clock {
    int hours;
    int minutes;

    Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void minusFourFive() {
        this.minutes -= 45;
        if (this.minutes < 0) {
            this.minutes += 60;
            this.hours -= 1;
            if (this.hours < 0) {
                this.hours += 24;
            }
        }
    }

    @Override
    public String toString() {
        return this.hours + " " + this.minutes;
    }
}

////////////////////////////////////////////////////////////////////////////////

class HissingMicrophone {

    public static void main(String[] args) {
        new HissingMicrophone();
    }

    HissingMicrophone() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        String print = "no hiss";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 's' && s.charAt(i) == s.charAt(i + 1)) {
                print = "hiss";
                break;
            }
        }
        System.out.println(print);
    }

}

////////////////////////////////////////////////////////////////////////////////

class Pot {

    public static void main(String[] args) {
        new Pot();
    }

    Pot() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int x = sc.nextInt();
            int pot = x % 10;
            x /= 10;
            sum += (int) Math.pow(x, pot);
            n--;
        }
        sc.close();
        System.out.println(sum);
    }

}

////////////////////////////////////////////////////////////////////////////////

class Pet {

    public static void main(String[] args) {
        new Pet();
    }

    Pet() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int max = 0;
        int c = 0;
        while (n <= 5) {
            String[] s = sc.nextLine().split(" ");
            int locl = 0;
            for (String b : s) {
                locl += Integer.parseInt(b);
            }
            max = Math.max(locl, max);
            if (max == locl) c = n;
            n++;
        }
        sc.close();
        System.out.println(c + " " + max);
    }

}

////////////////////////////////////////////////////////////////////////////////

class StuckInATimeLoop {
    public static void main(String[] args) {
        new StuckInATimeLoop();
    }

    StuckInATimeLoop() {
        answer();
    }

    void answer() {
        java.util.stream.IntStream
            .iterate(1, x -> x + 1)
            .limit(new java.util.Scanner(System.in).nextInt())
            .mapToObj(x -> x + " Abracadabra")
            .forEach(System.out::println);
    }
}

////////////////////////////////////////////////////////////////////////////////

class TakeTwoStones {
    public static void main(String[] args) {
        new TakeTwoStones();
    }

    TakeTwoStones() {
        answer();
    }

    void answer() {
        System.out.println(new java.util.Scanner(System.in).nextInt() % 2 == 0 ? "Bob" : "Alice");
    }
}

////////////////////////////////////////////////////////////////////////////////
// The jshell testing will fail. lazy to simulate EOF
class ADifferentProblem {
    public static void main(String[] args) {
        new ADifferentProblem();
    }

    ADifferentProblem() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigInteger> al = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] sarr = sc.nextLine().split(" ");
            al.add(new BigInteger(sarr[0]).subtract(new BigInteger(sarr[1])).abs());
        }
        al.stream().forEach(System.out::println);
        sc.close();
    }
}

////////////////////////////////////////////////////////////////////////////////

class R2 {
    public static void main(String[] args) {
        new R2();
    }

    R2() {
        answer();
    }

    void answer() {
        String[] sarr = new java.util.Scanner(System.in).nextLine().split(" ");
        System.out.println(Integer.parseInt(sarr[1]) * 2 - Integer.parseInt(sarr[0]));
    }
}

////////////////////////////////////////////////////////////////////////////////

class Aaah {
    public static void main(String[] args) {
        new Aaah();
    }

    Aaah() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(second.length() > first.length() ? "no" : "go"); 
    }
}

////////////////////////////////////////////////////////////////////////////////

class SpeedLimit {
    public static void main(String[] args) {
        new SpeedLimit();
    }

    SpeedLimit() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = -1;
        while ((n = Integer.parseInt(sc.nextLine())) != -1) {
            int prev = 0;
            int miles = 0;
            while (n > 0) {
                String[] in = sc.nextLine().split(" ");
                miles += Integer.parseInt(in[0]) * (Integer.parseInt(in[1]) - prev);
                prev = Integer.parseInt(in[1]);
                n--;
            }
            al.add(miles);
        }
        al.stream().map(x -> x + " miles").forEach(System.out::println);
    }
}

////////////////////////////////////////////////////////////////////////////////

class ABC {
    public static void main(String[] args) {
        new ABC();
    }

    ABC() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(x -> Integer.parseInt(x)).toArray();
        Arrays.sort(arr);
        String s = "";
        for (char c : sc.nextLine().toCharArray()) {
            s += arr[c - 65] + " ";
        }
        System.out.println(s = s.substring(0, s.length()));
        sc.close();

    }
}

////////////////////////////////////////////////////////////////////////////////

class Sibice {
    public static void main(String[] args) {
        new Sibice();
    }

    Sibice() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        double[] arr = Arrays.stream( 
                        sc.nextLine()
                        .split("\\s"))
                        .mapToDouble(x -> Double.parseDouble(x))
                        .toArray();
        double hyp = Math.sqrt(Math.pow(arr[2],2) + Math.pow(arr[1],2));
        String res = "";
        while (arr[0] > 0) {
            arr[0]--;
            res += (sc.nextInt() <= hyp ? "DA" : "NE") + "\n";
        }
        sc.close();
        System.out.println(res.substring(0, res.length() - 1));
    }
}

////////////////////////////////////////////////////////////////////////////////
class EightQueens {

    final static int BOARD_LENGTH = 8;

    public static void main(String[] args) {
        new EightQueens();
    }

    EightQueens() {
        answer();
    }

    private void answer() {
        char[][] board = fillBoard();

        System.out.println(countQueens(board) && checkQueens(board) ? "valid" : "invalid");
    }

    private boolean countQueens(char[][] board) {
        int count = 0;
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                if (board[i][j] == '*') count++;
            }
        }
        return count == 8;
    }

    private boolean checkQueens(char[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                if (board[i][j] == '*' && !checkValid(i,j,board)) return false;
            }
        }
        return true;
    }

    private boolean checkValid(int i, int j, char[][] board) {
        return checkVertical(i,j,board) 
            && checkHorizontal(i,j,board)
            && checkRightDiagonal(i,j,board) 
            && checkLeftDiagonal(i,j,board);
    }

    private boolean checkVertical(int i, int j, char[][] board) {
        for (int k = 0; k < BOARD_LENGTH; k++) {
            if (i != k && board[k][j] == '*') return false;
        }
        return true;   
    }

    private boolean checkHorizontal(int i, int j, char[][] board) {
        for (int k = 0; k < BOARD_LENGTH; k++) {
            if (j != k && board[i][k] == '*') return false;
        }
        return true;   
    }

    private boolean checkRightDiagonal(int i, int j, char[][] board) {
        int startx = i, starty = j;
        while (startx < BOARD_LENGTH - 1 && starty > 0) {
            startx++;
            starty--;
        }
        while (startx >= 0 && starty < BOARD_LENGTH) { // 7 0 6 1
            if (startx != i && starty != j 
                && board[startx][starty] == '*') return false;
            startx--;
            starty++;
        }
        return true;
    }

    private boolean checkLeftDiagonal(int i, int j, char[][] board) {
        int startx = i, starty = j;
        while (startx < BOARD_LENGTH - 1 && starty < BOARD_LENGTH - 1) {
            startx++;
            starty++;
        }
        while (startx >= 0 && starty >= 0) {
            if (startx != i && starty != j 
                && board[startx][starty] == '*') return false;
            startx--;
            starty--;
        }
        return true;
    }

    private char[][] fillBoard() {
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < BOARD_LENGTH; i++) {
            Object[] arr = sc.nextLine().chars().mapToObj(x -> (char) x).toArray();
            for (int j = 0; j < BOARD_LENGTH; j++) {
                board[i][j] = (char) arr[j];
            }
        }
        sc.close();
        return board;
    }
}

////////////////////////////////////////////////////////////////////////////////

class Ladder {
    public static void main(String[] args) {
        new Ladder();
    }

    Ladder() {
        answer();
    }

    void answer() {
        System.out.println(
            java.util.Arrays.stream(
                        new java.util.Scanner(System.in).nextLine().split("\\s"))
                        .mapToInt(x -> Integer.parseInt(x))
                        .reduce((x,y) -> (int) Math.ceil(x / Math.sin(y * Math.PI / 180)))
                        .getAsInt());      
    }
}

////////////////////////////////////////////////////////////////////////////////

class JudgingMoose {
    public static void main(String[] args) {
        new JudgingMoose();
    }

    JudgingMoose() {
        answer();
    }

    void answer() {
        int[] arr = java.util.Arrays.stream(
            new java.util.Scanner(System.in)
            .nextLine().split("\\s"))
            .mapToInt(x -> Integer.parseInt(x))
            .toArray();
        String print = "";
        if (arr[0] == 0 && arr[1] == 0) {
            print = "Not a moose";
        } else if (arr[0] == arr[1]) {
            print = "Even " + (arr[0] * 2);
        } else {
            int x = (int) Math.max(arr[0], arr[1]);
            print = "Odd " + (x * 2);
        }
        System.out.println(print);
    }
}

////////////////////////////////////////////////////////////////////////////////

class BusNumbers {
    public static void main(String[] args) {
        new BusNumbers();
    }

    BusNumbers() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split("\\s"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        int[] stops = new int[1001];
        String print = "";
        for (int i = 0; i < arr.length; i++) {
            stops[arr[i]] = 1;
        }
        int con = 0;
        for (int i = 0; i < stops.length; i++) {
            if (stops[i] == 1) {
                if (i < stops.length - 1 && stops[i + 1] == 1) {
                    con += 1;
                } else {
                    if (con == 0) {
                        print += i + " ";
                    } else if (con == 1) {
                        print += (i - 1) + " " + i + " ";
                    } else {
                        print += (i - con) + "-" + i + " ";
                    }
                    con = 0;
                }

            }
        }
        System.out.println(print);
    }
}

////////////////////////////////////////////////////////////////////////////////

class OddManOut {
    public static void main(String[] args) {
        new OddManOut();
    }

    OddManOut() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int c = 1;
        while (c <= n) {
            sc.nextLine();
            int[] arr = Arrays.stream(
                    sc.nextLine().split("\\s"))
                    .mapToInt(x -> Integer.parseInt(x))
                    .toArray();
            Arrays.sort(arr);
            System.out.println("Case #" + c + ": " + findLone(arr));
            c++;
        }

    }

    int findLone(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                if (arr[i + 1] == arr[i + 2]) {
                    return arr[i];
                }
                return arr[i + 1];
            }
        }
        return arr[arr.length - 1];
    }
}

////////////////////////////////////////////////////////////////////////////////

class QuickBrownFox {
    public static void main(String[] args) {
        new QuickBrownFox();
    }

    QuickBrownFox() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            String print = "missing ";
            boolean[] tr = new boolean[26];
            char[] carr = sc.nextLine().toLowerCase().replaceAll("[\\W\\s0-9]", "").toCharArray();
            for (int i = 0; i < carr.length; i++) {
                tr[carr[i] - 97] = true;
            }
            for (int i = 0; i < tr.length; i++) {
                if (!tr[i]) print += (char) (i + 97);
            }
            if (print.equals("missing ")) print = "pangram";
            al.add(print);
            n--;
        }
        al.stream().forEach(System.out::println);
        sc.close();
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class PlantingTrees {
    public static void main(String[] args) {
        new PlantingTrees();
    }

    PlantingTrees() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToInt(x -> Integer.parseInt(x))
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .toArray(x -> new Integer[n]);
        sc.close();
        List<Integer> list = IntStream
                        .iterate(1, x -> x + 1)
                        .limit(n).map(y -> arr[y - 1] + y)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println(Collections.max(list) + 1);
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class Modulo {
    public static void main(String[] args) {
        new Modulo();
    }

    Modulo() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        ArrayList<Integer> al = new ArrayList<>();
        while (n > 0) {
            n--;
            int x = Integer.parseInt(sc.nextLine()) % 42;
            if (!al.contains(x)) {
                al.add(x);
            }
        }
        sc.close();
        System.out.println(al.size());
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class ReversedBinaryNumbers {
    public static void main(String[] args) {
        new ReversedBinaryNumbers();
    }

    ReversedBinaryNumbers() {
        answer();
    }

    void answer() {
        System.out.println(
            Integer.parseInt(
                new java.lang.StringBuilder(
                    Integer.toBinaryString(
                        new java.util.Scanner(System.in).nextInt()
                    ))
                    .reverse()
                    .toString()
            , 2));
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class Trik {
    public static void main(String[] args) {
        new Trik();
    }

    Trik() {
        answer();
    }

    void answer() {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] ball = new char[] {'x','0','0'};
        for (char c : arr) {
            if (c == 'A') {
                swap(ball, 0, 1);
            } else if (c == 'B') {
                swap(ball, 1, 2);
            } else {
                swap(ball, 0, 2);
            }
        }
        int z = -1;
        for (z = 1; z < ball.length; z++) {
            if (ball[z - 1] == 'x') break;
        }
        System.out.println(z);
    }

    void swap(char[] ball, int p1, int p2) {
        char temp = ball[p1];
        ball[p1] = ball[p2];
        ball[p2] = temp;
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class Faktor {
    public static void main(String[] args) {
        new Faktor();
    }

    Faktor() {
        answer();
    }

    void answer() {
        System.out.println(java.util.Arrays.stream(
                        new java.util.Scanner(System.in)
                        .nextLine()
                        .split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .reduce((x,y) -> x * (y - 1) + 1)
                        .getAsInt());
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        new Apaxiaaaaaaaaaaaans();
    }

    Apaxiaaaaaaaaaaaans() {
        answer();
    }

    void answer() {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        String s = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (s.charAt(s.length() - 1) != arr[i]) {
                s += String.valueOf(arr[i]);
            }
        }        
        System.out.println(s);
    }
}

////////////////////////////////////////////////////////////////////////////////

class IveBeenEverywhereMan {
    public static void main(String[] args) {
        new IveBeenEverywhereMan();
    }

    IveBeenEverywhereMan() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int n = Integer.parseInt(sc.nextLine());
            HashSet<String> set = new HashSet<>();
            while (n > 0) {
                set.add(sc.nextLine());                
                n--;
            }
            System.out.println(set.size());
            t--;
        }
        sc.close();
    }
}

////////////////////////////////////////////////////////////////////////////////

class OneChickenPerPerson {
    public static void main(String[] args) {
        new OneChickenPerPerson();
    }

    OneChickenPerPerson() {
        answer();
    }

    void answer() {
        int n = 0;
        System.out.println("Dr. Chaz " + 
            ((n = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).reduce((x,y) -> y - x).getAsInt()) < 0
                            ? "needs " + Math.abs(n) + " more piece" + (Math.abs(n) == 1 ? "" : "s") + " of chicken!"
                            : "will have " + Math.abs(n) + " piece" + (Math.abs(n) == 1 ? "" : "s") + " of chicken left over!"));
    }
}

///////////////////////////////////////////////////////////////////////////////

class Planina {
    public static void main(String[] args) {
        new Planina();
    }

    Planina() {
        answer();
    }

    void answer() {
        // 0 4 4^0 + 3
        // 1 9 4^1 + 3 + 2
        // 2 25 4^2 + 5 + 4
        // 3 4^3 + 9 + 8
        // 4 4^4 + 17 + 16
        // 5 1089 4^5 + 33 + 32
        int n = new java.util.Scanner(System.in).nextInt();
        int iter = 1, add = 3;
        while (iter < n) {
            add = add + (int) Math.pow(2, iter);
            iter++;
        }
        System.out.println((int) Math.pow(4, n) + add + add - 1);
    }
}

///////////////////////////////////////////////////////////////////////////////

class CD {

    public static void main(String[] args) {
        new CD();
    }

    CD() {
        answer();
    }
    
    void answer() {

        Kattio sc = new Kattio(System.in);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();
            if (n == 0 && m == 0) break;
            int[] narr = new int[n];
            int[] marr = new int[m];
            readInput(narr, sc);
            readInput(marr, sc);
            System.out.println(getCount(narr, marr));
        }
        // keeps throwing eof error for some reason
        // sc.close();
        
    }

    int getCount(int[] narr, int[] marr) {
        int itern = 0, iterm = 0, count = 0;
        for (int i = 0; i < marr.length; i++) {
            if (Arrays.binarySearch(narr, marr[i]) > -1)
                count++;
        }
        // too slow
        // while (itern < narr.length - 1 || iterm < marr.length - 1) {
        //     int n = narr[itern];
        //     int m = marr[iterm];
        //     if (n == m) {
        //         count++;
        //         iterm++;
        //         itern++;
        //     } else if (n > m && iterm < marr.length - 1) {
        //         iterm++;
        //     } else if (m > n && itern < narr.length - 1) {
        //         itern++;
        //     }
        // }
        return count;
    }

    void readInput(int[] arr, Kattio sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.getInt();
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class TransitWoes {
    public static void main(String[] args) {
        new TransitWoes();
    }

    TransitWoes() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] stn = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int total = stn[1] - stn[0];
        int[] n = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] b = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();                
        int[] c = java.util.Arrays.stream(
                        sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray(); 
        int curr = n[0];                               
        for (int i = 1; i < n.length; i++) {
            curr += (curr > c[i - 1] 
                    ? curr % c[i - 1] 
                    : c[i - 1] - curr) 
                    + (b[i - 1] + n[i]);
        }
        sc.close();
        System.out.println(curr > total ? "no" : "yes");
    }
}

///////////////////////////////////////////////////////////////////////////////

class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        new QualityAdjustedLifeYear();
    }

    QualityAdjustedLifeYear() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            String.format("%.3f",
                java.util.stream.IntStream.range(0, Integer.parseInt(sc.nextLine()))
                    .mapToDouble(x -> java.util.Arrays.stream(
                        sc.nextLine()
                        .split("\\s+"))
                        .mapToDouble(Double::parseDouble)
                        .reduce((y,z) -> y * z)
                        .getAsDouble())
                .reduce((x,y) -> x + y).getAsDouble()));
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class PieceOfCake {
    public static void main(String[] args) {
        new PieceOfCake();
    }

    PieceOfCake() {
        answer();
    }

    static final int CAKE_HEIGHT = 4;

    void answer() {
        int[] _INPUT = java.util.Arrays.stream(
                                new java.util.Scanner(System.in)
                                .nextLine()
                                .split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        int _LENGTH = _INPUT[0];
        int AREA_1 = _INPUT[1] * _INPUT[2];
        int AREA_2 = (_LENGTH - _INPUT[1]) * _INPUT[2];
        int AREA_3 = _INPUT[1] * (_LENGTH - _INPUT[2]);
        int AREA_4 = (_LENGTH - _INPUT[1]) * (_LENGTH - _INPUT[2]);
        
        int max = AREA_1;
        max = (int) Math.max(max, AREA_2);
        max = (int) Math.max(max, AREA_3);
        max = (int) Math.max(max, AREA_4);

        System.out.println(max * CAKE_HEIGHT);
    }
}

///////////////////////////////////////////////////////////////////////////////

class NastyHacks {
    public static void main(String[] args) {
        new NastyHacks();
    }

    NastyHacks() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        java.util.stream.IntStream.range(0, sc.getInt())
                        .mapToObj(x -> {
                            int v = sc.getInt() - (sc.getInt() - sc.getInt());
                            if (v < 0) {
                                return "advertise";
                            } else if (v > 0) {
                                return "do not advertise";
                            }
                            return "does not matter";
                        })
                        .forEach(System.out::println);
        // sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class IsItHalloween {
    public static void main(String[] args) {
        new IsItHalloween();
    }

    IsItHalloween() {
        answer();
    }

    void answer() {
        System.out.println(yup(new java.util.Scanner(System.in).nextLine()) ? "yup" : "nope");
        
    }

    boolean yup(String s) {
        return s.equals("OCT 31") || s.equals("DEC 25");
    }
}

///////////////////////////////////////////////////////////////////////////////

class HeartRate {
    public static void main(String[] args) {
        new HeartRate();
    }

    HeartRate() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            n--;
            double[] bp = java.util.Arrays.stream(
                            sc.nextLine()
                            .split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();
            System.out.printf("%.4f %.4f %.4f \n", minABPM(bp[0], bp[1]), BPM(bp[0], bp[1]), maxABPM(bp[0], bp[1]));
        }        
        sc.close();
    }

    double minABPM(double b, double p) {
        return BPM(b, p) - 60 / p;
    }

    double BPM(double b, double p) {
        return 60 * b / p;
    }

    double maxABPM(double b, double p) {
        return BPM(b, p) + 60 / p;
    }

}

///////////////////////////////////////////////////////////////////////////////

class HangingOutOnTheTerrace {
    public static void main(String[] args) {
        new HangingOutOnTheTerrace();
    }

    HangingOutOnTheTerrace() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int[] lx = java.util.Arrays.stream(
                            sc.nextLine()
                            .split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int curr = 0, count = 0;
        while (lx[1] > 0) {
            lx[1]--;
            String[] s = sc.nextLine().split("\\s+");
            int y = Integer.parseInt(s[1]);
            if (s[0].equals("enter")) {
                if (curr + y <= lx[0]) {
                    curr += y;
                } else {
                    count ++;
                }
            } else {
                curr -= y;
            }
            // System.out.println(curr);
        }
        System.out.println(count);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class GrassSeedInc {
    public static void main(String[] args) {
        new GrassSeedInc();
    }

    GrassSeedInc() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        double c = Double.parseDouble(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        double cost = 0;
        while (l > 0) {
            l--;
            cost += Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToDouble(Double::parseDouble)
                        .reduce((x,y) -> x * y)
                        .getAsDouble() * c;
        }
        System.out.println(cost);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Filip {
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int x = flip(sc.getInt()), y = flip(sc.getInt());
        System.out.println((int) Math.max(x, y));
    }

    static int flip(int x) {
        int z = 0;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            z *= 10;
            z += d;
        }
        return z;
    }
}

///////////////////////////////////////////////////////////////////////////////

class DiceCup {
    public static void main(String[] args) {
        new DiceCup();
    }

    DiceCup() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int[] count = new int[m * n];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                count[i + j]++;
            }
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            max = (int) Math.max(max, count[i]);
        }
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                System.out.println(i);
            }
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class Cetvrta {
    public static void main(String[] args) {
        new Cetvrta();
    }

    Cetvrta() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int x1 = sc.getInt(), y1 = sc.getInt();
        int x2 = sc.getInt(), y2 = sc.getInt();
        int x3 = sc.getInt(), y3 = sc.getInt();
        int x4 = 0, y4 = 0;

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.printf("%d %d \n", x4, y4);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Bela {
    public static void main(String[] args) {
        new Bela();
    }
    
    static final int[] N_DOMINANT = new int[] {11,4,3,2,10,0,0,0};
    static final int[] _DOMINANT = new int[] {11,4,3,20,10,14,0,0};

    Bela() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() * 4;
        char b = sc.getWord().charAt(0);
        int total = 0;
        while (n > 0) {
            n--;
            String s = sc.getWord();
            int pos = getPos(s.charAt(0));
            if (s.charAt(1) == b) {
                total += _DOMINANT[pos];
            } else {
                total += N_DOMINANT[pos];
            }
        }
        System.out.println(total);
    }

    int getPos(char c) {
        switch(c) {
            case 'A': return 0;
            case 'K': return 1;
            case 'Q': return 2;
            case 'J': return 3;
            case 'T': return 4;
            case '9': return 5;
            case '8': return 6;
            case '7': return 7;
            default: return -1;
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class BatterUp {

    public static void main(String[] args) {
        new BatterUp();
    }

    BatterUp() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        System.out.println(
            java.util.stream.IntStream.range(0, n)
                .mapToDouble(x -> sc.getDouble())
                .filter(x -> x >= 0)
                .average()
                .getAsDouble());
        // sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Zamka {
    
    public static void main(String[] args) {
        new Zamka();
    }

    Zamka() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int l = sc.getInt(), d = sc.getInt(), x = sc.getInt();
        System.out.printf("%d %d\n", getMin(l,d,x), getMax(l,d,x));
        // sc.close();
    }

    int getMin(int l, int d, int x) {
        for (int i = l; i <= d; i++) {
            int z = i;
            int t = 0;
            while (z > 0) {
                t += z % 10;
                z /= 10;
            }
            if (t == x) return i;
        }
        return -1;
    }

    int getMax(int l, int d, int x) {
        for (int i = d; i >= l; i--) {
            int z = i;
            int t = 0;
            while (z > 0) {
                t += z % 10;
                z /= 10;
            }
            if (t == x) return i;
        }
        return -1;
    }

}

///////////////////////////////////////////////////////////////////////////////

class TripleTexting {
    
    public static void main(String[] args) {
        new TripleTexting();
    }

    TripleTexting() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        int length = s.length() / 3;
        String s1 = s.substring(0, length);
        String s2 = s.substring(length, length * 2);
        String s3 = s.substring(length * 2, length * 3);
        String ans = "";
        if (s1.equals(s2)) {
            ans = s1;
        } else if (s1.equals(s3)) {
            ans  = s1;
        } else if (s2.equals(s3)) {
            ans = s2;
        }
        System.out.println(ans);
    }

}

///////////////////////////////////////////////////////////////////////////////

class ARealChallenge {
    
    public static void main(String[] args) {
        new ARealChallenge();
    }

    ARealChallenge() {
        answer();
    }

    void answer() {
        System.out.println(new BigDecimal(new Kattio(System.in).getWord()).sqrt(new MathContext(10)).multiply(new BigDecimal("4")));
    }

}

///////////////////////////////////////////////////////////////////////////////

class BasketballOneOnOne {
    
    public static void main(String[] args) {
        new BasketballOneOnOne();
    }

    BasketballOneOnOne() {
        answer();
    }

    void answer() {
        int a = 0, b = 0;
        boolean finale = false;
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] == 'A') {
                a += arr[i + 1] - 48;
            } else {
                b += arr[i + 1] - 48;
            }

            if (finale) {
                if (a - b >= 2) {
                    System.out.println('A');
                    break;
                } else if (b - a >= 2) {
                    System.out.println('B');
                    break;
                }
            } else if (a == 10 && b == 10) {
                finale = true;
            } else if (a >= 11 && !finale) {
                System.out.println('A');
                break;
            } else if (b >= 11 && !finale) {
                System.out.println('B');
                break;
            }
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class ARationalSequenceTwo {
    
    public static void main(String[] args) {
        new ARationalSequenceTwo();
    }

    ARationalSequenceTwo() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int P = sc.getInt();

        while (P-- > 0) {
            int K = sc.getInt();
            int[] arr = Arrays.stream(sc.getWord().split("/"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            Node curr = new Node(arr[0], arr[1]);
            ArrayDeque<Node> arrDeq = new ArrayDeque<>();

            while (curr.n != 1 || curr.d != 1) {
                arrDeq.offerFirst(curr.duplicate());

                if (curr.n > curr.d) {
                    curr.n -= curr.d;
                } else {
                    curr.d -= curr.n;
                }
            }

            int x = 1;
            while (!arrDeq.isEmpty()) {
                Node temp = arrDeq.poll();
                x *= 2;
                x += temp.n > temp.d ? 1 : 0;
            }
            System.out.printf("%d %d\n", K, x);
        }
        // sc.close();
    }

}

class Node {
    int n, d;
    Node(int n, int d) {
        this.n = n;
        this.d = d;
    }

    Node duplicate() {
        return new Node(this.n, this.d);
    }
}

///////////////////////////////////////////////////////////////////////////////

class TheAmazingHumanCannonball {
    
    static final double _GRAVITY = 9.81;

    public static void main(String[] args) {
        new TheAmazingHumanCannonball();
    }

    TheAmazingHumanCannonball() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        while (n-- > 0) {
            double v0 = sc.getDouble(), 
                    theta = Math.toRadians(sc.getDouble()), 
                    x1 = sc.getDouble(),
                    h1 = sc.getDouble() + 1,
                    h2 = sc.getDouble() - 1;
            double y = getY(v0, getT(x1, v0, theta), theta);
            System.out.println(h1 < y && y < h2 ? "Safe" : "Not Safe");
        }
        // sc.close();
    }

    double getT(double x1, double v0, double theta) {
        return x1 / (Math.cos(theta) * v0);
    }

    double getY(double v0, double t, double theta) {
        return (v0 * t * Math.sin(theta)) - (0.5 * _GRAVITY * Math.pow(t, 2));
    }

}

///////////////////////////////////////////////////////////////////////////////

class StarArrangements {
    
    public static void main(String[] args) {
        new StarArrangements();
    }

    StarArrangements() {
        answer();
    }

    void answer() {
        int s = new java.util.Scanner(System.in).nextInt();
        System.out.printf("%d:\n", s);
        for (int i = 2; i < s; i++) {
            for (int j = i - 1; j < s; j++) {
                if (j > i) break;
                int curr = i;
                boolean next = true;
                while (curr < s) {
                    if (next) {
                        next = false;
                        curr += j;
                    } else {
                        next = true;
                        curr += i;
                    }
                }
                if (curr == s) 
                    System.out.printf("%d,%d\n", i, j);
            }   
        }
        // sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class StackingCups {
    
    public static void main(String[] args) {
        new StackingCups();
    }

    StackingCups() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Cupies> al = new ArrayList<>();
        Pattern p = Pattern.compile("^[a-z]*");
        while (n-- > 0) {
            String s = sc.getWord();
            String s2 = sc.getWord();
            Matcher m = p.matcher(s);
            if (m.matches()) {
                al.add(new Cupies(s, Double.parseDouble(s2)));
            } else {
                al.add(new Cupies(s2, Double.parseDouble(s) / 2));
            }
        }
        Collections.sort(al);
        al.stream().forEach(System.out::println);
        // sc.close();
    }

}

class Cupies implements Comparable<Cupies> {
    double rad;
    String color;

    Cupies(String color, double rad) {
        this.rad = rad;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }

    @Override
    public int compareTo(Cupies c) {
        return (int) (this.rad - c.rad);
    }
}

///////////////////////////////////////////////////////////////////////////////

class HarshadNumbers {
    
    public static void main(String[] args) {
        new HarshadNumbers();
    }

    HarshadNumbers() {
        answer();
    }

    void answer() {
        System.out.println(getSmallestHarshadNumber(new java.util.Scanner(System.in).nextInt()));
    }

    int getSmallestHarshadNumber(double n) {
        for (int i = (int) n; i <= Integer.MAX_VALUE; i++) {
            if (isHarshadNumber(i)) return i;
        }
        return -1;
    }

    boolean isHarshadNumber(double n) {
        double temp = n, sum = 0;
        while (temp > 0) {
            sum += ((int) temp) % 10;
            temp /= 10;
        }
        double res = n / sum;
        return res == Math.floor(res); 
    }

}

///////////////////////////////////////////////////////////////////////////////

class EncodedMessages {
    
    public static void main(String[] args) {
        new EncodedMessages();
    }

    EncodedMessages() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        while (n-- > 0) {
            System.out.println(decipher(sc.getWord()));
        }
        // sc.close();
    }

    String decipher(String encoded) {
        char[][] tile = writeTile(encoded);
        decipherTile(tile);
        return readTile(tile);
    }

    String readTile(char[][] tile) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile.length; j++) {
                sb.append(tile[i][j]);
            }
        }
        return sb.toString();
    }

    void decipherTile(char[][] tile) {
        // 4 4 > 0 4
        // 3 4 > 0 3
        // 2 4 > 0 2
        // 1 4 > 0 1 
        for (int i = 0; i < tile.length / 2; i++) {
            for (int j = i; j < tile.length - 1 - i; j++) {
                char temp = tile[j][i]; // top left
                tile[j][i] = tile[i][tile.length - 1 - j]; // top left < top right

                tile[i][tile.length - 1 - j] 
                    = tile[tile.length - 1 - j][tile.length - 1 - i]; // top right < bottom right
                
                tile[tile.length - 1 - j][tile.length - 1 - i] 
                    = tile[tile.length - 1 - i][j]; // bottom right < bottom left
                
                tile[tile.length - 1 - i][j] = temp; // bottom left < temp

            }
        }
    }

    char[][] writeTile(String encoded) {
        int sqLength = getSquareLength(encoded);
        char[][] tile = new char[sqLength][sqLength];
        int x = 0;
        for (int i = 0; i < sqLength; i++) {
            for (int j = 0; j < sqLength; j++) {
                tile[i][j] = encoded.charAt(x);
                x++;
            }
        }
        return tile;
    } 

    int getSquareLength(String s) {
        return (int) Math.sqrt(s.length());
    }

}

///////////////////////////////////////////////////////////////////////////////

class Parking2 {
    
    public static void main(String[] args) {
        new Parking2();
    }

    Parking2() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            int[] arr = new int[n];
            while (n-- > 0) {
                arr[n] = sc.getInt();
            }
            Arrays.sort(arr);
            System.out.println((arr[arr.length - 1] - arr[0]) * 2);
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class SevenWonders {
    
    public static void main(String[] args) {
        new SevenWonders();
    }

    SevenWonders() {
        answer();
    }

    void answer() {
        char[] s = new java.util.Scanner(System.in).nextLine().toCharArray();
        short[] arr = new short[3];        
        for (char c : s) {
            arr[translate(c)]++;
        }
        short min = Short.MAX_VALUE;
        int total = 0;
        for (short i : arr) {
            min = (short) Math.min(min, i);
            total += i * i;
        }
        System.out.println(total + (min * 7));
    }

    int translate(char c) {
        switch(c) {
            case 'T': return 0;
            case 'C': return 1;
            case 'G': return 2;
            default: return -1;
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class RoamingRomans {
    
    public static void main(String[] args) {
        new RoamingRomans();
    }

    RoamingRomans() {
        answer();
    }

    void answer() {
        System.out.println(
            Math.round(
                romanMileToPaces(
                    feetToRomanMile(
                        englishMilesToFeet(
                            Double.parseDouble(new java.util.Scanner(System.in).nextLine()))))));
    }

    double englishMilesToFeet(double d) {
        return d * 5280;
    }

    double feetToRomanMile(double d) {
        return d / 4854;
    }

    double romanMileToPaces(double d) {
        return d * 1000;
    }

}

///////////////////////////////////////////////////////////////////////////////

class QuickEstimates {
    
    public static void main(String[] args) {
        new QuickEstimates();
    }

    QuickEstimates() {
        answer();
    }

    void answer() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            System.out.println(sc.nextLine().length());
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class AlienNumbers {
    
    public static void main(String[] args) {
        new AlienNumbers();
    }

    AlienNumbers() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<String> al = new ArrayList<>();
        while(n-- > 0) {
            String alien_number = sc.getWord(), 
                source_language = sc.getWord(), 
                target_language = sc.getWord();
            
            char[] alienArr = alien_number.toCharArray();

            ArrayList<Character> sourceArr = toCharList(source_language.toCharArray());
            ArrayList<Character> targetArr = toCharList(target_language.toCharArray());

            int sourceBase = source_language.length();
            int targetBase = target_language.length();

            int index = 0, base = 1;
            for (int i = alienArr.length - 1; i >= 0; i--) {
                index += sourceArr.indexOf(alienArr[i]) * base;
                base *= sourceBase;
            }
            
            StringBuffer result = new StringBuffer();

            while (index > 0) {
                result.insert(0, targetArr.get(index % targetBase));
                index /= targetBase;
            }

            al.add(result.toString());
        }
        for (int i = 1; i <= al.size(); i++) {
            System.out.printf("Case #%d: %s\n", i, al.get(i - 1));
        }
        // sc.close();
    }

    ArrayList<Character> toCharList(char[] arr) {
        ArrayList<Character> al = new ArrayList<>();
        for (char c : arr) {
            al.add(c);
        }
        return al;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Beavergnaw {
    
    public static void main(String[] args) {
        new Beavergnaw();
    }

    Beavergnaw() {
        answer();
    }

    void answer() {
        /*
        1. Convert the cylinders to a square base

        2. Total area, obvious D^3
           V -> Unit of square / unit of circle
             -> 4 / PI
             -> IMPT* imagine a circle of rad 1, the a square surrounding it
                will have length of 2. Therefore their area ratio will be 4 : PI
                NOTE: r^2 is irrelevant here as it is just 1^2 = 1;
           V = V * 4 / PI

        3. D^3 - (V * 1 / pi) = d^3 + 2 frustum

        4. Frustum = Big pyramid - small pyramid
           Big Pyramid = D^2 * D/2 * 1/3 = D^3 / 6
           Small Pyramid = d^2 * d/2 * 1/3 = d^3 / 6
           1 Frustum = (D^3 - d^3) / 6

        5. D^3 - (V * 4 / PI) = d^3 + (D^3 - d^3) / 3
           d^3 = D^3 - (V * 4 / PI) - (D^3 / 3) + (d^3 / 3)
           (2d^3 / 3) = (2D^3 / 3) - (V * 4 / PI)
           d^3 = D^3 - (12V / 2PI)
           d^3 = D^3 - (6V / PI)
        */
        Kattio sc = new Kattio(System.in);
        while (true) {
            double D = sc.getDouble(), V = sc.getDouble();
            if (D == 0 && V == 0) break;
            System.out.printf("%.9f\n", Math.cbrt(Math.pow(D, 3) - (6 * V / Math.PI)));
        }
    }
}

///////////////////////////////////////////////////////////////////////////////

class Kornislav {
    
    public static void main(String[] args) {
        new Kornislav();
    }

    Kornislav() {
        answer();
    }

    void answer() {
        int[] arr = java.util.Arrays.stream(
                        new java.util.Scanner(System.in)
                        .nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        Arrays.sort(arr);
        System.out.println(arr[0] * arr[arr.length - 2]);
    }
}

///////////////////////////////////////////////////////////////////////////////

class Kemija {
    
    public static void main(String[] args) {
        new Kemija();
    }

    Kemija() {
        answer();
    }

    void answer() {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isVowel(c)) i += 2;
                sb.append(c);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

///////////////////////////////////////////////////////////////////////////////

class AlphabetSpam {
    
    public static void main(String[] args) {
        new AlphabetSpam();
    }

    AlphabetSpam() {
        answer();
    }

    void answer() {
        String s = new java.util.Scanner(System.in).nextLine();
        double total = s.length();
        double space = 0, lower = 0, upper = 0, symbols = 0;
        for (char c : s.toCharArray()) {
            if (c == '_') {
                space++;
            } else if (97 <= c && c <= 122) {
                lower++;
            } else if (65 <= c && c <= 90) {
                upper++;
            } else {
                symbols++;
            }
        }
        System.out.printf("%f\n%f\n%f\n%f\n", 
                space / total, lower / total, upper / total, symbols / total);
    }

}

///////////////////////////////////////////////////////////////////////////////

class HayPoints {
    
    public static void main(String[] args) {
        new HayPoints();
    }

    HayPoints() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int m = sc.getInt(), n = sc.getInt();
        Map<String, Integer> hmap = new HashMap<>();
        while (m-- > 0) {
            hmap.put(sc.getWord(), sc.getInt());
        }
        while(n-- > 0) {
            int res = 0;
            String next = "";
            while (!(next = sc.getWord()).equals(".")) {
                if (hmap.containsKey(next)) {
                    res += hmap.get(next);
                }
            }
            System.out.println(res);
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class Sjecista {
    
    public static void main(String[] args) {
        new Sjecista();
    }

    Sjecista() {
        answer();
    }

    void answer() {    
        System.out.println(intersections(new java.util.Scanner(System.in).nextInt()));
    }

    int intersections(int n) { 
        return ((int) (Math.pow(n, 4) - (6 * Math.pow(n, 3)) + (11 * Math.pow(n, 2)) - (6 * n))) / 24;
    }

}

///////////////////////////////////////////////////////////////////////////////

class PigLatin {
    
    public static void main(String[] args) {
        new PigLatin();
    }

    PigLatin() {
        answer();
    }

    void answer() {    
        Scanner sc = new Scanner(System.in); 
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            StringBuffer sb = new StringBuffer();
            for (String s : arr) {
                char first = s.charAt(0);
                if (isVowel(first)) {
                    sb.append(s + "yay");
                } else {
                    int i = 1;
                    for (; i < s.length(); i++) {
                        if (isVowel(s.charAt(i))) break; 
                    }
                    sb.append(s.substring(i, s.length()) + s.substring(0, i) + "ay");
                }
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
        
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

}

///////////////////////////////////////////////////////////////////////////////

class SoftPasswords {
    
    public static void main(String[] args) {
        new SoftPasswords();
    }

    SoftPasswords() {
        answer();
    }

    void answer() {    
        Kattio sc = new Kattio(System.in);
        String s = sc.getWord(), p = sc.getWord();
        System.out.println(check(s, p) ? "Yes" : "No");
        // sc.close();
    }
    
    boolean check(String s, String p) {
        if (s.equals(p)) return true;
        if (s.substring(0, s.length() - 1).equals(p) 
            && 48 <= s.charAt(s.length() - 1) && s.charAt(s.length() - 1) <= 57) return true;
        if (s.substring(1, s.length()).equals(p)
            && 48 <= s.charAt(0) && s.charAt(0) <= 57) return true;
        if (s.length() != p.length()) return false;
        if (reverse(s, p)) return true;
        return false;
    }

    boolean reverse(String s, String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (65 <= c && c <= 90) {
                c = (char) (c + 32);
            } else if (97 <= c && c <= 122) {
                c = (char) (c - 32);
            }
            if (c != s.charAt(i)) return false;
        }
        return true;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ProvincesAndGold {
    
    public static void main(String[] args) {
        new ProvincesAndGold();
    }

    ProvincesAndGold() {
        answer();
    }

    void answer() {
        int[] arr = java.util.Arrays.stream(
                        new java.util.Scanner(System.in)
                        .nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt).toArray();
        System.out.println(
            check(
                java.util.stream.IntStream
                    .rangeClosed(1, 3)
                    .map(x -> arr[x - 1] * (4 - x))
                    .reduce(0, (x, y) -> x + y)));
    }   

    String check(int total) {
        StringBuffer sb = new StringBuffer();
        if (total >= 8) {
            sb.append("Province");
        } else if (total >= 5) {
            sb.append("Duchy");
        } else if (total >= 2) {
            sb.append("Estate");
        }

        if (total >= 2) {
            sb.append(" or ");
        }

        if (total >= 6) {
            sb.append("Gold");
        } else if (total >= 3) {
            sb.append("Silver");
        } else {
            sb.append("Copper");
        }

        return sb.toString();
    }
 
}

///////////////////////////////////////////////////////////////////////////////

class PokerHand {
    
    public static void main(String[] args) {
        new PokerHand();
    }

    PokerHand() {
        answer();
    }

    void answer() {
        int[] arr = new int[13];
        String[] arr2 = new java.util.Scanner(System.in).nextLine().split("\\s+");
        for (String s : arr2) 
            arr[match(s.charAt(0))]++;
        int max = 0;
        for (int i : arr) 
            max = (int) Math.max(max, i);
        System.out.println(max);
    }   

    int match(char c) {
        switch (c) {
            case 'A': return 0;
            case '2': return 1;
            case '3': return 2;
            case '4': return 3;
            case '5': return 4;
            case '6': return 5;
            case '7': return 6;
            case '8': return 7;
            case '9': return 8;
            case 'T': return 9;
            case 'J': return 10;
            case 'Q': return 11;
            case 'K': return 12;
            default: return -1;
        }
    }
 
}

///////////////////////////////////////////////////////////////////////////////

class NumberFun {
    
    public static void main(String[] args) {
        new NumberFun();
    }

    NumberFun() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            sb.append(check(sc.getInt(), sc.getInt(), sc.getInt()) ? "Possible" : "Impossible");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        // sc.close();
    }   

    boolean check(int a, int b, int c) {
        return a + b == c 
            || a - b == c
            || b - a == c
            || a * b == c
            || ((double) a) / b == (double) c
            || ((double) b) / a == (double) c;
    }
 
}

///////////////////////////////////////////////////////////////////////////////

class NoDuplicates {
    
    public static void main(String[] args) {
        new NoDuplicates();
    }

    NoDuplicates() {
        answer();
    }

    void answer() {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        java.util.Arrays.sort(arr);
        System.out.println(check(arr) ? "yes" : "no");
    }   

    boolean check(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                return false;
            }
        }
        return true;
    }
 
}

///////////////////////////////////////////////////////////////////////////////

class LicenseToLaunch {
    
    public static void main(String[] args) {
        new LicenseToLaunch();
    }

    LicenseToLaunch() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int iter = 0, x = -1, next = 0, min = Integer.MAX_VALUE;
        while (iter < n) {
            if ((next = sc.getInt()) < min) {
                x = iter;
                min = next;
            }
            iter++;
        }
        System.out.println(x);
        // sc.close();
    }   
 
}

///////////////////////////////////////////////////////////////////////////////

class Kelptography {
    
    public static void main(String[] args) {
        new Kelptography();
    }

    Kelptography() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();

        char[] lastChars = sc.getWord().toCharArray();
        char[] encrypted = sc.getWord().toCharArray();
        
        char[] decrypted = new char[m];

        int x = n;
        for (int i = m - 1; i > m - n - 1; i--) {
            decrypted[i] = lastChars[--x];
        }
        for (int i = m - 1; i >= n; i--) {
            int deChar = 26 + encrypted[i] - decrypted[i];
            deChar %= 26;
            deChar += 97;
            decrypted[i - n] = (char) deChar;
        }
        System.out.println(
            java.util.stream.IntStream.range(0, decrypted.length)
                .mapToObj(t -> decrypted[t] + "")
                .reduce("", (t,v) -> t + v));
        // sc.close();
    }   
 
}

///////////////////////////////////////////////////////////////////////////////

class DeathKnightHero {
    
    public static void main(String[] args) {
        new DeathKnightHero();
    }

    DeathKnightHero() {
        answer();
    }

    void answer() {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), won = 0;
        while (n-- > 0) {
            won += battle(sc.getWord().toCharArray()) ? 1 : 0;
        }
        System.out.println(won);
    }

    boolean battle(char[] actions) {
        for (int i = 0; i < actions.length - 1; i++) {
            if (actions[i] == 'C' && actions[i + 1] == 'D') return false;
        }
        return true;
    }   
 
}

///////////////////////////////////////////////////////////////////////////////

class Tri {
    
    public static void main(String[] args) {
        new Tri();
    }

    Tri() {
        answer();
    }

    void answer() { System.out.println(calculate(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray())); }

    String calculate(int[] digits) {
        int a = digits[0], b = digits[1], c = digits[2];
        char[] symbols = new char[]{'+','-','/','*'};
        for (int i = 0; i < symbols.length; i++) {
            if (operate(symbols[i], a, b) == c) return a + "" + symbols[i] + "" + b + "=" + c;
        }
        for (int i = 0; i < symbols.length; i++) {
            if (operate(symbols[i], b, c) == a) return a + "=" + b + "" + symbols[i] + "" + c;
        }
        return "GG.com";
    }

    int operate(char c, int a, int b) {
        switch (c) {
            case '+': return a + b;
            case '-': return a - b; 
            case '/': return a / b;
            case '*': return a * b;
            default: return -1;
        }
    }   
 
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class TenKindsOfPeople {
    
    public static void main(String[] args) {
        new TenKindsOfPeople();
    }

    TenKindsOfPeople() {
        answer();
    }

    void answer() { 
        Kattio sc =  new Kattio(System.in);
        char[][] map = readMap(sc);
        int[][] routes = mapRoutes(map);
        System.out.println(processQueries(sc, map, routes));
        // sc.close();
    }

    String processQueries(Kattio sc, char[][] map, int[][] routes) {
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();

        while (n-- > 0) {
            int r1 = sc.getInt() - 1, c1 = sc.getInt() - 1;
            int r2 = sc.getInt() - 1, c2 = sc.getInt() - 1;

            if (routes[r1][c1] == routes[r2][c2]) {
                sb.append(map[r1][c1] == '0' ? "binary" : "decimal");
            } else {
                sb.append("neither");
            }

            sb.append("\n");
        }

        return sb.toString().trim();
    }
 
    int[][] mapRoutes(char[][] map) {
        int[][] routes = new int[map.length][map[0].length];
        int fill = 2;

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if (routes[i][j] == 0) {
                    BreathFirstSearch(new Point(i,j), map, routes, fill);
                    fill++;
                }
            }
        }

        return routes;
    }

    void BreathFirstSearch(Point start, char[][] map, int[][] routes, int fill) {
        Queue<Point> queue = new PriorityQueue<>();
        queue.add(start);
        routes[start.r][start.c] = fill;

        int[] testR = {1, -1, 0, 0};
        int[] testC = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            Point curr = queue.poll();
            int r = curr.r, c = curr.c;

            for (int i = 0; i < 4; i++) {
                int R = r + testR[i];
                int C = c + testC[i];
                
                if ((0 <= R && R < map.length)
                    && (0 <= C && C < map[0].length)
                    && map[R][C] == map[r][c]
                    && routes[R][C] != fill) {
                        routes[R][C] = fill;
                        queue.add(new Point(R, C));
                    }
            }
        }
    }

    char[][] readMap(Kattio sc) {
        char[][] map = new char[sc.getInt()][sc.getInt()];

        for (int i = 0; i < map.length; i++) 
            map[i] = sc.getWord().toCharArray();

        return map;
    }

}

class Point implements Comparable<Point>{
    int r, c;
    Point(int r, int c) { this.r = r; this.c = c; }

    @Override
    public int compareTo(Point p) {
        return (this.r - p.r) + (this.c - p.c);
    }
}

///////////////////////////////////////////////////////////////////////////////

class JobExpenses {
    
    public static void main(String[] args) {
        new JobExpenses();
    }

    JobExpenses() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), sum = 0;
        while (n-- > 0) {
            int x = 0;
            sum += (x = sc.getInt()) < 0 ? (int) Math.abs(x) : 0;
        }
        System.out.println(sum);
    }

}

///////////////////////////////////////////////////////////////////////////////

class ICPCAwards {
    
    public static void main(String[] args) {
        new ICPCAwards();
    }

    ICPCAwards() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<String> schools = new ArrayList<>();
        int x = 0;
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            String sch = sc.getWord(), team = sc.getWord();
            if (x < 12 && !schools.contains(sch)) {
                x++;
                sb.append(sch);
                sb.append(" ");
                sb.append(team);
                sb.append("\n");
                schools.add(sch);
            }
        }
        System.out.println(sb.toString().trim());
        // sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Herman {
    
    public static void main(String[] args) {
        new Herman();
    }

    Herman() {
        answer();
    }

    void answer() { 
        double r = Double.parseDouble(new java.util.Scanner(System.in).nextLine());
        System.out.printf("%f\n%f", getEuclideanArea(r), getTaxicobArea(r));
    }

    double getEuclideanArea(double r) {
        return Math.PI * r * r;
    }

    double getTaxicobArea(double r) {
        return Math.pow(Math.sqrt(Math.pow(r, 2) * 2), 2);
    }

}

///////////////////////////////////////////////////////////////////////////////

class DetailedDifferences {
    
    public static void main(String[] args) {
        new DetailedDifferences();
    }

    DetailedDifferences() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            String org = sc.getWord(), next = sc.getWord(), res = "";
            for (int i = 0; i < org.length(); i++) {
                if (org.charAt(i) == next.charAt(i)) {
                    res += ".";
                } else {
                    res += "*";
                }
            }
            sb.append(org);
            sb.append("\n");
            sb.append(next);
            sb.append("\n");
            sb.append(res);
            sb.append("\n\n");
        }
        System.out.println(sb.toString().trim());
    }

}

///////////////////////////////////////////////////////////////////////////////

class Datum {
    
    public static void main(String[] args) {
        new Datum();
    }

    Datum() {
        answer();
    }

    static int[] daysOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    void answer() { 
        System.out.println(
            getDay(
                java.util.Arrays.stream(
                    new java.util.Scanner(System.in).nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()));
    }

    String getDay(int[] arr) {
        int total = arr[0];

        for (int i = 1; i < arr[1]; i++) {
            total += daysOfMonth[i];
        }
        return translate(total % 7);
    }

    String translate(int i) {
        switch (i) {
            case 0: return "Wednesday";
            case 1: return "Thursday";
            case 2: return "Friday";
            case 3: return "Saturday";
            case 4: return "Sunday";
            case 5: return "Monday";
            case 6: return "Tuesday";
            default: return "Someday...";
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class CryptographersConundrum {
    
    public static void main(String[] args) {
        new CryptographersConundrum();
    }

    CryptographersConundrum() {
        answer();
    }

    static final String DUDE_NAME = "PER";

    void answer() { 
        char[] cipher = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] test = DUDE_NAME.repeat(cipher.length / 3).toCharArray();
        int x = 0;
        for (int i = 0; i < cipher.length; i++) {
            x += cipher[i] == test[i] ? 0 : 1;
        }
        System.out.println(x);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Cudoviste {
    
    public static void main(String[] args) {
        new Cudoviste();
    }

    Cudoviste() {
        answer();
    }

    static final String DUDE_NAME = "PER";

    void answer() { 
        char[][] board = readBoard();
        System.out.println(getParkingSpaces(board));
    }

    String getParkingSpaces(char[][] board) {
        int ZERO = 0, ONE = 0, TWO = 0, THREE = 0, FOUR = 0;

        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length - 1; j++) {
                char c1 = board[i][j];
                char c2 = board[i + 1][j];
                char c3 = board[i][j + 1];
                char c4 = board[i + 1][j + 1];

                if (c1 == '#' 
                    || c2 == '#' 
                    || c3 == '#' 
                    || c4 == '#') continue;
                
                int temp = (c1 == 'X' ? 1 : 0)
                            + (c2 == 'X' ? 1 : 0)
                            + (c3 == 'X' ? 1 : 0)
                            + (c4 == 'X' ? 1 : 0);
                
                if (temp == 0) {
                    ZERO++;
                } else if (temp == 1) {
                    ONE++;
                } else if (temp == 2) {
                    TWO++;
                } else if (temp == 3) {
                    THREE++;
                } else if (temp == 4) {
                    FOUR++;
                }
            }
        }

        return ZERO + "\n" 
                + ONE + "\n" 
                + TWO + "\n" 
                + THREE + "\n" 
                + FOUR;
    }

    char[][] readBoard() {
        Kattio sc = new Kattio(System.in);
        char[][] board = new char[sc.getInt()][sc.getInt()];
        for (int i = 0; i < board.length; i++) 
            board[i] = sc.getWord().toCharArray();
        // sc.close();
        return board;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Peg {
    
    public static void main(String[] args) {
        new Peg();
    }

    Peg() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        char[][] board = getBoard(sc);
        System.out.println(findMoves(board));
        // sc.close();
    }

    int findMoves(char[][] board) {
        int moves = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'o') {
                    moves += checkMoves(i, j, board);    
                }
            }   
        }
        return moves;
    }

    int checkMoves(int i, int j, char[][] board) {
        return checkTop(i, j, board) + checkRight(i, j, board) + checkBottom(i, j, board) + checkLeft(i, j, board);
    }

    int checkTop(int i, int j, char[][] board) {
        if (i - 2 < 0 || i - 1 < 0
            || (board[i - 1][j] != 'o' || board[i - 2][j] != '.')) return 0;
        return 1;
    }
    
    int checkRight(int i, int j, char[][] board) {
        if (j + 2 >= board.length || j + 1 >= board.length
            || (board[i][j + 1] != 'o' || board[i][j + 2] != '.')) return 0;
        return 1;
    }
    
    int checkBottom(int i, int j, char[][] board) {
        if (i + 2 >= board.length || i + 1 >= board.length
            || (board[i + 1][j] != 'o' || board[i + 2][j] != '.')) return 0;
        return 1;
    }
    
    int checkLeft(int i, int j, char[][] board) {
        if (j - 2 < 0 || j - 1 < 0
            || (board[i][j - 1] != 'o' || board[i][j - 2] != '.')) return 0;
        return 1;
    }

    char[][] getBoard(Kattio sc) {
        char[][] board = new char[7][7];
        boardDefault(board);        

        for (int i = 0; i < board.length; i++) {
            char[] arr = sc.getWord().toCharArray();
            if (i == 0 || i == 1 || i == 5 || i == 6) {
                for (int j = 2; j < 2 + arr.length; j++) {
                    board[i][j] = arr[j - 2];
                }
            } else {
                board[i] = arr;
            }
        }
        return board;
    }

    void boardDefault(char[][] board) {
        board[0][0] = '-';
        board[0][1] = '-';
        board[0][5] = '-';
        board[0][6] = '-';

        board[1][0] = '-';
        board[1][1] = '-';
        board[1][5] = '-';
        board[1][6] = '-';

        board[5][0] = '-';
        board[5][1] = '-';
        board[5][5] = '-';
        board[5][6] = '-';

        board[6][0] = '-';
        board[6][1] = '-';
        board[6][5] = '-';
        board[6][6] = '-';
    }

}

///////////////////////////////////////////////////////////////////////////////

class ShatteredCake {
    
    public static void main(String[] args) {
        new ShatteredCake();
    }

    ShatteredCake() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int w = sc.getInt(), n = sc.getInt(), area = 0; 
        while (n-- > 0) {
            area += sc.getInt() * sc.getInt();
        }
        System.out.println(area / w);
        // sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Railroad {
    
    public static void main(String[] args) {
        new Railroad();
    }

    Railroad() {
        answer();
    }

    void answer() { 
        System.out.println(work(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    String work(int[] arr) {
        if (arr[1] % 2 == 0) return "possible";
        return "impossible";
    }

}

///////////////////////////////////////////////////////////////////////////////

class ChanukahChallenge {
    
    public static void main(String[] args) {
        new ChanukahChallenge();
    }

    ChanukahChallenge() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt();
        int[] arr = new int[p];
        while (p-- > 0) {
            arr[sc.getInt() - 1] = getCandles(sc.getInt());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d %d\n", i + 1, arr[i]);
        }
    }

    int getCandles(int days) {
        return sumUp(days) + days;
    }

    int sumUp(int n) {
        if (n == 1) return 1;
        return n + sumUp(n - 1);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Okviri {
    
    public static void main(String[] args) {
        new Okviri();
    }

    Okviri() {
        answer();
    }

    void answer() { 
        System.out.println(work(new java.util.Scanner(System.in).nextLine().toCharArray()));
    }

    String work(char[] arr) {
        StringBuffer sb = new StringBuffer();
        // 1 length 5
        // 2 length 9
        // 3 length 13
        // 4 length 17

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                headTail(sb, arr.length);
            } else if (i % 2 == 0) {
                partial(sb, arr.length);
            } else {
                middle(sb, arr.length, arr);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    void middle(StringBuffer sb, int length, char[] arr) {
        sb.append("#.");
        sb.append(arr[0]);
        sb.append(".#");
        for (int i = 2; i <= length; i++) {
            if ((i + 1) % 3 == 0 || i % 3 == 0) {
                sb.append(".");
                sb.append(arr[i - 1]);
                sb.append(".*");
            } else {
                sb.append(".");
                sb.append(arr[i - 1]);
                sb.append(".#");
            }
        }
        if (length % 3 != 0) {
            sb.deleteCharAt(sb.length()-1);
            sb.append("#");
        }
    }

    void partial(StringBuffer sb, int length) {
        sb.append(".#.#.");
        for (int i = 2; i <= length; i++) {
            if (i % 3 == 0) {
                sb.append("*.*.");
            } else sb.append("#.#.");
        }
    }

    void headTail(StringBuffer sb, int length) {
        sb.append("..#");
        for (int i = 2; i < length; i++) {
            if (i % 3 == 0) {
                sb.append("...*");
            } else sb.append("...#");
        }
        if (length > 1) {
            if (length % 3 == 0) {
                sb.append("...*..");
            } else sb.append("...#..");
        } else sb.append("..");
    }

}

///////////////////////////////////////////////////////////////////////////////

class Jabuke {
    
    public static void main(String[] args) {
        new Jabuke();
    }

    Jabuke() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double x1 = sc.getDouble(), 
                y1 = sc.getDouble(), 
                x2 = sc.getDouble(), 
                y2 = sc.getDouble(), 
                x3 = sc.getDouble(), 
                y3 = sc.getDouble();
        double area = getArea(x1, y1, x2, y2, x3, y3);
        int n = sc.getInt(), inside = 0;
        while (n-- > 0) {
            double tx = sc.getDouble(), ty = sc.getDouble();
            inside += area 
                        == (getArea(tx, ty, x2, y2, x3, y3) 
                        + getArea(x1, y1, tx, ty, x3, y3) 
                        + getArea(x1, y1, x2, y2, tx, ty)) ? 1 : 0;
        }
        System.out.printf("%.1f\n%d\n", area, inside);
        sc.close();
    }

    double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Avion {
    
    public static void main(String[] args) {
        new Avion();
    }

    Avion() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 5; i++) {
            if (sc.getWord().contains("FBI")) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb.toString().trim());
        sc.close();   
    }

}

///////////////////////////////////////////////////////////////////////////////

class Semafori {
    
    public static void main(String[] args) {
        new Semafori();
    }

    Semafori() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int time = 0, prevD = 0, n = sc.getInt(), l = sc.getInt();
        while (n-- > 0) {
            int d = sc.getInt(), r = sc.getInt(), g = sc.getInt();

            int temp = d;
            d -= prevD;
            prevD = temp;

            time += d;

            temp = 0;
            boolean red = true;
            while (time >= temp) {
                if (red) {
                    temp += r;
                    red = false;
                } else {
                    temp += g;
                    red = true;
                }
            }

            if (!red) {
                time = temp;
            }
        }
        time += l - prevD;
        System.out.println(time); 
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class SymmetricOrder {
    
    public static void main(String[] args) {
        new SymmetricOrder();
    }

    SymmetricOrder() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int n = 0, i = 1;
        while ((n = sc.getInt()) != 0) {
            
            String[] arr = new String[n];
            for (; n > 0; n--) {
                arr[arr.length - n] = sc.getWord();
            }
            sb.append("SET");
            sb.append(" ");
            sb.append(i++);
            sb.append("\n");
            
            for (int x = 0; x < arr.length; x += 2) {
                sb.append(arr[x]);
                sb.append("\n");
            } 
            for (int x = arr.length % 2 == 0 ? arr.length - 1 : arr.length - 2; x > -1; x -= 2) {
                sb.append(arr[x]);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class SumKindOfProblem {
    
    public static void main(String[] args) {
        new SumKindOfProblem();
    }

    SumKindOfProblem() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int p = sc.getInt();
        while (p-- > 0) {
            sb.append(sc.getInt());
            sb.append(" ");
            int n = sc.getInt();
            sb.append(sumFirstN(n));
            sb.append(" ");
            sb.append(sumFirstNOdd(n));
            sb.append(" ");
            sb.append(sumFirstNEven(n));
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }


    int sumFirstN(int n) {
        return (n * (n + 1)) / 2;
    }

    int sumFirstNOdd(int n) {
        return (int) Math.pow(n, 2);
    }

    int sumFirstNEven(int n) {
        return (int) Math.pow(n, 2) + n;
    }

}

///////////////////////////////////////////////////////////////////////////////

class AClassyProblem {
    
    public static void main(String[] args) {
        new AClassyProblem();
    }

    AClassyProblem() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            ArrayList<Human> people = new ArrayList<>();
            while (n-- > 0) {
                String name = sc.getWord();
                name = name.substring(0, name.length() - 1);
                int[] rank = Human.stringToIntArray(sc.getWord());
                sc.getWord();
                people.add(new Human(name, rank));
            }
            Collections.sort(people);
            for (Human h : people) 
                sb.append(h).append("\n");
            sb.append("==============================").append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

}

class Human implements Comparable<Human>{
    private final String name;
    private final int[] ranking;

    private final static int MAX_RANK_SIZE = 10;

    Human(String name, int[] ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Human other) {
        for (int i = 0; i < MAX_RANK_SIZE; i++) {
            int a = this.ranking[i], b = other.ranking[i];
            if (a > b) {
                return -1;
            } else if (b > a) {
                return 1;
            }
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    static int[] stringToIntArray(String s) {
        int[] arr = Arrays.stream(s.split("-")).mapToInt(x -> {
                        if (x.equals("upper")) {
                            return 2;
                        } else if (x.equals("middle")) {
                            return 1;
                        }
                        return 0;
                    })
                    .toArray();
        return IntStream.range(0, MAX_RANK_SIZE)
                .map(x -> arr.length - 1 - x < 0 ? 1 : arr[arr.length - 1 - x])
                .toArray();
    }
}

///////////////////////////////////////////////////////////////////////////////

class Skener {
    
    public static void main(String[] args) {
        new Skener();
    }

    Skener() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int r1 = sc.getInt(), c1 = sc.getInt(), r2 = sc.getInt(), c2 = sc.getInt();
        char[][] arr = new char[r1][c1];
        char[][] res = new char[r1 * r2][c1 * c2];

        for (int i = 0; i < r1; i++) 
            arr[i] = sc.getWord().toCharArray();
        
        for (int i = 0; i < r1; i++) {
            for (int k = 0; k < r2; k++) {
                for (int j = 0; j < c1; j++) {
                    for (int l = 0; l < c2; l++) {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println();
            }
        }
    
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Akcija {
    
    public static void main(String[] args) {
        new Akcija();
    }

    Akcija() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int[] arr = new int[sc.getInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.getInt();    
        radixSort(arr);        
        System.out.println(getTotal(arr));
        sc.close();
    }

    int getTotal(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i += 3) {
            if (i + 1 < arr.length && i + 2 < arr.length) {
                total += arr[i];
                total += arr[i + 1];
            }
        }
        if (arr.length == 1) {
            total = arr[0];
        } else if (arr.length % 3 == 1) {
            total += arr[arr.length - 1];
        } else if (arr.length % 3 == 2) {
            total += arr[arr.length - 1];
            total += arr[arr.length - 2];
        }
        return total;
    }

    void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int pow = 1; max / pow > 0; pow *= 10)
            countingSort(arr, pow);
    }

    int getMax(int[] arr) {
        int max = arr[0], n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    void countingSort(int[] arr, int pow) {
        int i = 0, n = arr.length;
        int[] res = new int[n], count = new int[10]; // base 10
        
        for (i = 0; i < 10; i++)
            count[i] = 0;

        for (i = 0; i < n; i++) 
            count[getDigitCount(arr, i, pow)]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i > -1; i--) {
            int digitCount = getDigitCount(arr, i, pow);
            res[count[digitCount] - 1] = arr[i];
            count[digitCount]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = res[i];
    }

    int getDigitCount(int[] arr, int i, int pow) {
        return 9 - ((arr[i] / pow) % 10);
    }

}

///////////////////////////////////////////////////////////////////////////////

class PasswordHacking {
    
    public static void main(String[] args) {
        new PasswordHacking();
    }

    PasswordHacking() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double expected = 0;
        int n = sc.getInt();
        ArrayList<Double> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.getWord();
            al.add(sc.getDouble());
        }
        Collections.sort(al, Collections.reverseOrder());
        for (int i = 1; i <= n; i++)
            expected += al.get(i - 1) * i;
        System.out.printf("%.4f\n", expected);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class DelimiterSoup {
    
    public static void main(String[] args) {
        new DelimiterSoup();
    }

    DelimiterSoup() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        char[] arr = sc.nextLine().toCharArray();
        System.out.println(check(arr));
        sc.close();
    }

    String check(char[] arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(' || c == '[' || c == '{') {
                sb.append(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (sb.length() == 0) return c + " " + i;
                char c2 = sb.charAt(sb.length() - 1);
                if ((c == ')' && c2 !='(') 
                    || (c == ']' && c2 !='[')
                    || (c == '}' && c2 !='{')) return c + " " + i;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return "ok so far";
    }

}

///////////////////////////////////////////////////////////////////////////////

class IntegerLists {
    
    public static void main(String[] args) {
        new IntegerLists();
    }

    IntegerLists() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            char[] actions = sc.getWord().toCharArray();
            int size = sc.getInt();
            String[] list = readList(sc.getWord(), size);
            
            Deque<String> queue = new LinkedList<>();
            addToQueue(queue, list);
            sb.append(act(queue, actions)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    String[] readList(String s, int size) {
        return size == 0 ? new String[0] : s.substring(1, s.length() - 1).split(",");
    }

    void addToQueue(Deque<String> queue, String[] list) {
        for (String s : list) 
            queue.add(s);
    }

    String act(Deque<String> queue, char[] actions) {
        boolean back = false, error = false;
        for (char c : actions) {
            if (c == 'R') {
                back = !back;
            } else {
                if (queue.size() == 0) {
                    error = true;
                    break;
                }
                if (back) {
                    queue.removeLast();
                } else {
                    queue.removeFirst();
                }
            }
        }

        return writeOutput(queue, back, error);
    }

    String writeOutput(Deque<String> queue, boolean back, boolean error) {

        if (error) return "error";

        StringBuilder sb = new StringBuilder();
        if (back) {
            Deque<String> backwards = new LinkedList<>();
            Iterator iter = queue.iterator();
            while (iter.hasNext())
                backwards.push(String.valueOf(iter.next()));
            sb.append(backwards.toString().replaceAll("\\s+", ""));
        } else {
            sb.append(queue.toString().replaceAll("\\s+", ""));
        }
        return sb.toString().trim();     
    }
}

///////////////////////////////////////////////////////////////////////////////

class Ptice {
    
    public static void main(String[] args) {
        new Ptice();
    }

    Ptice() {
        answer();
    }

    static final char[] ADRIAN_CHOICE = new char[] {'A', 'B', 'C'};
    static final char[] BRUNO_CHOICE = new char[] {'B', 'A', 'B', 'C'};
    static final char[] GORAN_CHOICE = new char[] {'C', 'C', 'A', 'A', 'B', 'B'};

    void answer() { 
        Kattio sc = new Kattio(System.in);
        sc.getInt();
        String s = sc.getWord();

        int i = 0, a = 0, b = 0, g = 0;
        int adrian = 0, bruno = 0, goran = 0;
        while (i < s.length()) {
            char ans = s.charAt(i);

            adrian += ADRIAN_CHOICE[a] == ans ? 1 : 0;
            bruno += BRUNO_CHOICE[b] == ans ? 1 : 0;
            goran += GORAN_CHOICE[g] == ans ? 1 : 0;
            
            a = a++ == ADRIAN_CHOICE.length - 1? 0 : a;
            b = b++ == BRUNO_CHOICE.length - 1? 0 : b;
            g = g++ == GORAN_CHOICE.length - 1? 0 : g;
            i++;
        }

        int max = (int) Math.max(adrian, bruno);
        max = (int) Math.max(max, goran);

        System.out.println(max);

        if (adrian == max) System.out.println("Adrian");
        if (bruno == max) System.out.println("Bruno");
        if (goran == max) System.out.println("Goran");

        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class TouchscreenKeyboard {
    
    public static void main(String[] args) {
        new TouchscreenKeyboard();
    }

    TouchscreenKeyboard() {
        answer();
    }

    static final char[][] KEYBOARD 
        = new char[][] {
            {'q','w','e','r','t','y','u','i','o','p'},
            {'a','s','d','f','g','h','j','k','l'},
            {'z','x','c','v','b','n','m'}};

    static final Map<Character, int[]> memoized = new HashMap<>();

    static final Comparator<Entry<String, Integer>> SORT_VALUE = new Comparator<>() {
        @Override
        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
            int x = o1.getValue().compareTo(o2.getValue());
            return x == 0 ? o1.getKey().compareTo(o2.getKey()) : x;
        }
    };

    void answer() { 
        Kattio sc = new Kattio(System.in);
        buildMemoized();
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char[] typed = sc.getWord().toCharArray();
            int l = sc.getInt();
            HashMap<String, Integer> hmap = new HashMap<>();
            while (l-- > 0) {
                String tmp = sc.getWord();
                int dist = 0;
                for (int i = 0; i < typed.length; i++) {
                    if (typed[i] == tmp.charAt(i)) continue;
                    int[] xy1 = searchLetter(typed[i]);
                    int[] xy2 = searchLetter(tmp.charAt(i));

                    dist += (int) (Math.abs(xy1[0] - xy2[0]) 
                                + Math.abs(xy1[1] - xy2[1]));
                }
                hmap.put(tmp, dist);
            }
            List<Entry<String, Integer>> list = new LinkedList<>(hmap.entrySet());
            Collections.sort(list, SORT_VALUE);
            for (Entry<String, Integer> entry : list) 
                sb.append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue())
                    .append("\n");
        }      
        System.out.println(sb.toString().trim());
        sc.close();
    }

    void buildMemoized() {
        for (int i = 0; i < KEYBOARD.length; i++) {
            for (int j = 0; j < KEYBOARD[i].length; j++) {
                memoized.put(KEYBOARD[i][j], new int[] {i, j});
            }
        }
    }

    int[] searchLetter(char c) {
        if (memoized.containsKey(c)) {
            return memoized.get(c);
        }
        return null;
    }

}

///////////////////////////////////////////////////////////////////////////////

class TheEasiestProblemIsThisOne {
    
    public static void main(String[] args) {
        new TheEasiestProblemIsThisOne();
    }

    TheEasiestProblemIsThisOne() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while ((n = sc.getInt()) != 0) {
            int target = sumOfDigits(n);
            int x = 10;
            while (x++ < Integer.MAX_VALUE) {
                if (sumOfDigits(n * x) == target) break;
            }
            sb.append(x).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    int sumOfDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumOfDigits(n / 10);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Rijeci {
    
    public static void main(String[] args) {
        new Rijeci();
    }

    Rijeci() {
        answer();
    }

    void answer() { 
        System.out.println(plan(new java.util.Scanner(System.in).nextInt()));
    }

    String plan(int n) {
        int a = 1, b = 0;
        while (n-- > 0) {
            int tmp = b;
            b += a;
            a = tmp;
        }
        // 0 1 0 A
        // 1 0 1 B
        // 2 1 1 BA
        // 3 1 2 BAB
        // 4 2 3 BABBA
        // 5 3 5 BABBABAB
        // 6 5 8 BABBABABBABBA
        return a + " " + b;
    }

}

///////////////////////////////////////////////////////////////////////////////

class WhatDoesTheFoxSay {
    
    public static void main(String[] args) {
        new WhatDoesTheFoxSay();
    }

    WhatDoesTheFoxSay() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine(), tmp = "";
            while (!(tmp = sc.nextLine()).equals("what does the fox say?")) {
                String[] arr = tmp.split("\\s+");
                s = s.replaceAll("\\b" + arr[arr.length - 1] + "\\b", "");
            }
            System.out.println(s.replaceAll("\\s+", " ").trim());
        }
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Gerrymandering {
    
    public static void main(String[] args) {
        new Gerrymandering();
    }

    Gerrymandering() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p = sc.getInt(), d = sc.getInt();
        int[][] districts = new int[d][2];

        while (p-- > 0) {
            int precinct = sc.getInt();
            districts[precinct - 1][0] += sc.getInt();
            districts[precinct - 1][1] += sc.getInt();
        }

        int totalWA = 0, totalWB = 0, total = 0;
        for (int[] precinct : districts) {
            total += precinct[0] + precinct[1];

            int needed = (int) Math.floor((double) (precinct[0] + precinct[1]) / 2) + 1;
            if (precinct[0] > precinct[1]) {
                totalWA += precinct[0] - needed;
                totalWB += precinct[1];
                sb.append("A").append(" ");
                sb.append(precinct[0] - needed).append(" ");
                sb.append(precinct[1]);
            } else {
                totalWA += precinct[0];
                totalWB += precinct[1] - needed;
                sb.append("B").append(" ");
                sb.append(precinct[0]).append(" ");
                sb.append(precinct[1] - needed);
            }
            sb.append("\n");
        }
        sb.append(String.format("%.10f", Math.abs(totalWA - totalWB) / (double) total));
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class MixedFractions {
    
    public static void main(String[] args) {
        new MixedFractions();
    }

    MixedFractions() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int x = 0, y = 0;
        while ((x = sc.getInt()) != 0 && (y = sc.getInt()) != 0) {
            sb.append(x/y).append(" ");
            sb.append(x % y).append(" / ");
            sb.append(y).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class DiceGame {
    
    public static void main(String[] args) {
        new DiceGame();
    }

    DiceGame() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        double emma = sumStuff(sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt());
        double Gunnar = sumStuff(sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt());
        if (emma < Gunnar) {
            System.out.println("Emma");
        } else if (Gunnar < emma) {
            System.out.println("Gunnar");
        } else {
            System.out.println("Tie");
        }
        sc.close();
    }

    double sumStuff(int a, int b, int c, int d) {
        return sumSmallerStuff(a, b) + sumSmallerStuff(c, d);
    }

    double sumSmallerStuff(int a, int b) {
        return IntStream.rangeClosed(a, b).sum() / (double) (b - a + 1);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Tajna {
    
    public static void main(String[] args) {
        new Tajna();
    }

    Tajna() {
        answer();
    }

    void answer() { 
        String s = new java.util.Scanner(System.in).nextLine();
        int[] d = find(s.length());
        char[][] matrix = new char[d[0]][d[1]];
        int x = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = s.charAt(x++); 
                
            }
        }
        String xs = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                xs += String.valueOf(matrix[i][j]); 
            }
        }
        System.out.println(xs);
    }

    int[] find(int n) {
        int row = n, col = 0;
        for (; row >= 1; row--) {
            if (n % row == 0) {
                col = n / row;
                if (row <= col) break;
            }
        }
        return new int[] {row, col};
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SynchronizingLists {
    
    public static void main(String[] args) {
        new SynchronizingLists();
    }

    SynchronizingLists() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            ArrayList<Integer> org = new ArrayList<>();
            ArrayList<Integer> wrong = new ArrayList<>();
            for (int i = 0; i < n; i++) 
                org.add(sc.getInt());
            ArrayList<Integer> dup = new ArrayList<>(org);
            for (int i = 0; i < n; i++) 
                wrong.add(sc.getInt());
            Collections.sort(dup);                    
            Collections.sort(wrong);
            HashMap<Integer, Integer> hmap = new HashMap<>();
            for (int i = 0; i < n; i++)
                hmap.put(dup.get(i), wrong.get(i));
            for (Integer i : org) 
                sb.append(hmap.get(i)).append("\n");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EstimatingTheAreaOfACircle {
    
    public static void main(String[] args) {
        new EstimatingTheAreaOfACircle();
    }

    EstimatingTheAreaOfACircle() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double r = 0, m = 0, c = 0;
        while ((r = sc.getDouble()) != 0 
                && (m = sc.getDouble()) != 0
                && (c = sc.getDouble()) != 0) {
                    
                    sb.append(Math.PI * Math.pow(r, 2));
                    sb.append(" ");
                    sb.append((c / m) * Math.pow(r * 2, 2));
                    sb.append("\n");
                }
        System.out.println(sb.toString().trim());        
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TheMailboxManufacturersProblem {
    
    public static void main(String[] args) {
        new TheMailboxManufacturersProblem();
    }

    TheMailboxManufacturersProblem() {
        answer();
    }

    static final int MAX_CRACKERS = 100;
    static final int MAX_MAILBOXES = 10;   

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int[] memoized = new int[MAX_CRACKERS * 100 + 
                                    MAX_CRACKERS * 100000 
                                    + MAX_MAILBOXES + 1];
        Arrays.fill(memoized, -1);
        int n = sc.getInt();
        while (n-- > 0) {
            int mailBoxes = sc.getInt(), crackerLimit = sc.getInt();
            sb.append(solve(mailBoxes, 0, crackerLimit, memoized)).append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }

    int solve(int mailBoxes, int lower, int upper, int[] memoized) {

        // Every mailbox blows up at a certain number of crackers.
        // e.g. first mail box we try with some number of crackers (some c)
        // A. It blows up, so we know the min num for it to blow is between 1 and c (not inclusive)
        //    also we are left with mailBoxes - 1
        // B. It doesnt, then we know at least c + 1 crackers are needed to blow it
        //    we still got the same num of mailBoxes

        int index = lower * 100 + upper * 100000 + mailBoxes;
        
        if (memoized[index] != -1) return memoized[index];
        if (mailBoxes == 1) return crackerSum(lower, upper);
        if (upper <= lower) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = lower + 1; i < upper + 1; i++) {
            int destroyed = solve(mailBoxes - 1, lower, i - 1, memoized); // A
            int pass = solve(mailBoxes, i, upper, memoized); // B
            double max = i + Math.max(destroyed, pass); 
            min = (int) Math.min(max, min);
        }
        
        return memoized[index] = min;
    }

    int crackerSum(int lower, int upper) {
        // basically sum of upper bound minus sum of lower bound
        // bit shift 1 divides by 2
        return ((upper * (upper + 1)) - (lower * (lower + 1))) >> 1;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WeakVertices {
    
    public static void main(String[] args) {
        new WeakVertices();
    }

    WeakVertices() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = -1;
        while ((n = sc.getInt()) != -1) {
            char[][] arr = new char[n][n];           
            for (int i = 0; i < n; i++) 
                for (int j = 0; j < n; j++) 
                    arr[i][j] = sc.getWord().charAt(0);
            for (int i = 0; i < n; i++)
                if (!isTriangle(i, arr)) sb.append(i + " ");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());        
        sc.close();
    }

    boolean isTriangle(int i, char[][] arr) {
        for (int j = 0; j < arr.length; j++) 
            if (arr[i][j] == '1')
                for (int k = 0; k < arr.length; k++)
                    if (arr[j][k] == '1' && arr[k][i] == '1') 
                        return true;
        return false;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ACMContestScoring {
    
    public static void main(String[] args) {
        new ACMContestScoring();
    }

    ACMContestScoring() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = -1, r = 0, total = 0;
        int[] arr = new int[26];
        boolean[] arr2 = new boolean[26];
        while ((m = sc.getInt()) != -1) {
            char p = sc.getWord().charAt(0), o = sc.getWord().charAt(0);
            if (!arr2[p - 65] && o == 'r') {
                arr[p - 65] += m;
                arr2[p - 65] = true;
                total += arr[p - 65];
                r++;
            } else if (o == 'w') {
                arr[p - 65] += 20;
            }
        }
        System.out.printf("%d %d\n", r, total);        
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class AboveAverage {
    
    public static void main(String[] args) {
        new AboveAverage();
    }

    AboveAverage() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            double total = 0.0, p = 0.0;
            int n2 = sc.getInt();
            int[] arr = new int[n2];
            while (--n2 >= 0) {
                arr[n2] = sc.getInt();
                total += arr[n2];
            }
            for (int i : arr) 
                if (i > total / arr.length) p++;
            sb.append(String.format("%.3f", p * 100 / arr.length) + "%").append("\n");
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class AddingWords {
    
    public static void main(String[] args) {
        new AddingWords();
    }

    AddingWords() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> hmap = new HashMap<>();
        Map<Integer, String> hmap2 = new HashMap<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            if (tmp[0].equals("def")) {
                hmap2.remove(hmap.get(tmp[1]));
                hmap.put(tmp[1], Integer.parseInt(tmp[2]));
                hmap2.put(Integer.parseInt(tmp[2]), tmp[1]);
            } else if (tmp[0].equals("calc")) {
                
                int total = 0;
                if (hmap.containsKey(tmp[1])) {
                    total += hmap.get(tmp[1]);
                    for (int i = 2; i < tmp.length - 1; i += 2) {
                        if (hmap.containsKey(tmp[i + 1])) {
                            int a = hmap.get(tmp[i + 1]);
                            if (tmp[i].equals("+")) {
                                total += a;
                            } else total -= a;      
                        } else {
                            total = Integer.MIN_VALUE;
                            break;
                        }
                    }
                } else {
                    total = Integer.MIN_VALUE;
                }        

                sb.append(s.substring(5, s.length()));
                sb.append(" ");
                sb.append(hmap2.containsKey(total) ? hmap2.get(total) : "unknown");
                sb.append("\n");
            } else if (tmp[0].equals("clear")) {
                hmap.clear();
                hmap2.clear();
            }
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class StandOnZanzibar {
    
    public static void main(String[] args) {
        new StandOnZanzibar();
    }

    StandOnZanzibar() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int next = 0, prev = 1, imported = 0;
            while ((next = sc.getInt()) != 0) {
                imported += (int) Math.max(0, next - (prev * 2));
                prev = next;
            }
            sb.append(imported).append("\n");
        }
        System.out.println(sb.toString());        
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class MusicalScales {
    
    public static void main(String[] args) {
        new MusicalScales();
    }

    MusicalScales() {
        answer();
    }

    static final String[] MUSICAL_NOTES 
        = new String[] {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", 
                        "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};     

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> scales = buildScales();       
        int n = sc.getInt();
        HashSet<String> set = new HashSet<>();
        while (n-- > 0) {
            set.add(sc.getWord());
        }
        boolean add = true;
        for (ArrayList<String> al : scales) {
            for (String s : set) 
                if (!al.contains(s)) add = false;
            if (add) sb.append(al.get(0)).append(" ");
            add = true;
        }
         
        System.out.println(sb.length() == 0 ? "none" : sb.toString().trim());        
        sc.close();
    }

    ArrayList<ArrayList<String>> buildScales() {
        ArrayList<ArrayList<String>> scales = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 12; i++) {
            ArrayList<String> scale = new ArrayList<>();
            // tone, tone, semitone, tone, tone, tone, semitone
            scale.add(MUSICAL_NOTES[i]);
            scale.add(MUSICAL_NOTES[i + 2]);
            scale.add(MUSICAL_NOTES[i + 4]);
            scale.add(MUSICAL_NOTES[i + 5]);
            scale.add(MUSICAL_NOTES[i + 7]);
            scale.add(MUSICAL_NOTES[i + 9]);
            scale.add(MUSICAL_NOTES[i + 11]);
            scale.add(MUSICAL_NOTES[i + 12]);
            scales.add(scale);
        }
        return scales;
    }
}

///////////////////////////////////////////////////////////////////////////////

class HonourThyApaxianParent {
    
    public static void main(String[] args) {
        new HonourThyApaxianParent();
    }

    HonourThyApaxianParent() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        String y = sc.getWord(), p = sc.getWord();
        
        char end = y.charAt(y.length() - 1);
        if (end == 'e') {
            sb.append(y).append("x").append(p);
        } else if (end == 'a' || end == 'i' || end == 'o' || end == 'u') {
            sb.append(y.substring(0, y.length() - 1)).append("ex").append(p);
        } else if (y.substring(y.length() - 2, y.length()).equals("ex")) {
            sb.append(y).append(p);
        }else sb.append(y).append("ex").append(p);

        System.out.println(sb.toString());        
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RacingAroundTheAlphabet {
    
    public static void main(String[] args) {
        new RacingAroundTheAlphabet();
    }

    RacingAroundTheAlphabet() {
        answer();
    }

    static final double SPEED = 15.0; // feet / second
    static final double PICK_UP = 1.0; // second
    static final double STEP = Math.PI * 60 / 28; // feet

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> circle = new ArrayList<>();
        fillCircle(circle);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            double total = PICK_UP;
            char[] arr = sc.nextLine().toCharArray();
            for (int i = 0; i < arr.length - 1; i++) {
                int one = circle.indexOf(arr[i]);
                int two = circle.indexOf(arr[i + 1]);
                int a = Math.min(one, two);
                int b = Math.max(one, two);
                int diff = b - a;
                total += Math.min(diff, 28 - diff) * STEP / SPEED;
                total += PICK_UP; 
            }
            sb.append(total).append("\n");
        }

        System.out.println(sb.toString());        
        sc.close();
    }

    void fillCircle(ArrayList<Character> circle) {
        for (int i = 0; i < 26; i++)
            circle.add((char) ('A' + i));
        circle.add(' ');
        circle.add('\'');
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PrimaryRegisters {
    
    public static void main(String[] args) {
        new PrimaryRegisters();
    }

    PrimaryRegisters() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int[] registers = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
        int[] read = new int[] {sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt(), sc.getInt()};
        int total = registers[0] - 1 - read[0];
        for (int i = 1; i < registers.length; i++) 
            total += (registers[i] - 1 - read[i]) * fakeFactorial(i - 1, registers);
        System.out.println(total);
        sc.close();
    }

    int fakeFactorial(int i, int[] registers) {
        int x = 1;
        for (int j = 0; j <= i; j++)
            x *= registers[j];
        return x;
    }

}

///////////////////////////////////////////////////////////////////////////////

class LuhnsChecksumAlgorithm {
    
    public static void main(String[] args) {
        new LuhnsChecksumAlgorithm();
    }

    LuhnsChecksumAlgorithm() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(check(sc.getWord().toCharArray()) ? "PASS" : "FAIL").append("\n");
        System.out.println(sb.toString());
        sc.close();
    }

    boolean check(char[] arr) {
        // 1. Start from right end, multiply every second by 2
        // 2. if product is more than 2, plus together
        // 3. Add all up aft
        // 4. If divisible by 10, pass. else fail
        int total = 0;
        boolean second = false;
        for (int i = arr.length - 1 ; i > - 1; i--) {
            int x = Integer.parseInt(String.valueOf(arr[i]));
            if (second) {            
                x *= 2;
                x = x > 9 ? (x % 10) + (x / 10) : x;
                second = false;
            } else {
                second = true;
            }
            total += x;
        }
        return total % 10 == 0;
    }

}

///////////////////////////////////////////////////////////////////////////////

class GoatRope {
    
    public static void main(String[] args) {
        new GoatRope();
    }

    GoatRope() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        Point2 goat = new Point2(sc.getDouble(), sc.getDouble());
        Point2 one = new Point2(sc.getDouble(), sc.getDouble());
        Point2 two = new Point2(sc.getDouble(), sc.getDouble());

        double t = 0;
        if (one.x <= goat.x && goat.x <= two.x) { // If the goat is between the x length of the house
            if (Math.abs(goat.y - one.y) < Math.abs(goat.y - two.y)) {
                t = Math.abs(goat.y - one.y);
            } else t = Math.abs(goat.y - two.y);
        } else if (one.y <= goat.y && goat.y <= two.y) { // If the goat between the y length of the house
            if (Math.abs(goat.x - one.x) < Math.abs(goat.x - two.x)) {
                t = Math.abs(goat.x - one.x);
            } else t = Math.abs(goat.x - two.x);
        } else { // If the goat inbetween neither of the x or y length
            double cX = 0;
            double cY = 0;
            if (Math.abs(goat.x - one.x) <= Math.abs(goat.x - two.x)) {
                cX = one.x;
            } else cX = two.x;
            if (Math.abs(goat.y - one.y) <= Math.abs(goat.y - two.y)) {
                cY = one.y;
            } else cY = two.y;
            t = goat.distanceTo(new Point2(cX, cY));
        }
        System.out.println(t);
        sc.close();
    }

}

class Point2 {
    double x, y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point2 p) {
        return Math.sqrt(Math.pow(this.y - p.y ,2) + Math.pow(this.x - p.x ,2)); 
    }
}

///////////////////////////////////////////////////////////////////////////////

class Relocation {
    
    public static void main(String[] args) {
        new Relocation();
    }

    Relocation() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.getInt(), q = sc.getInt();
        
        HashMap<Integer, Integer> companies = new HashMap<>();
        for (int i = 1; i <= n; i++)
            companies.put(i, sc.getInt());
        
        while (q-- > 0) {
            int num = sc.getInt();
            if (num == 1) {
                companies.put(sc.getInt(), sc.getInt());
            } else {
                sb.append(Math.abs(companies.get(sc.getInt()) - companies.get(sc.getInt()))).append("\n");
            }
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FreeFood {
    
    public static void main(String[] args) {
        new FreeFood();
    }

    FreeFood() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int tt = 0, n = sc.getInt();
        int[] days = new int[365 + 1];
        while (n-- > 0) {
            int start = sc.getInt(), end = sc.getInt();
            for (int i = start; i <= end; i++)
                days[i]++;
        }
        for (int i = 1; i < days.length; i++)
            tt += days[i] > 0 ? 1 : 0;
        System.out.println(tt);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class AliceInTheDigitalWorld {
    
    public static void main(String[] args) {
        new AliceInTheDigitalWorld();
    }

    AliceInTheDigitalWorld() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int datasets = sc.getInt();
        while (datasets-- > 0) { // Iterate datasets
            int n = sc.getInt(), m = sc.getInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++)
                data[i] = sc.getInt();

            int max = 0, index = 0;
            while (index < n) { // Iterate the dataset
                int local_max = 0, mCount = 0, nextStartIndex = 0; 

                while (index < n)  { 
                    if (data[index] < m) { // minimum m condition
                        if (mCount == 0) local_max = 0; // In scenario where first index is m
                        index++;
                        break;
                    }
                    local_max += data[index];
                    if (data[index] == m) {
                        mCount++;
                        if (mCount == 1) {
                            nextStartIndex = index + 1; // The will be our next start point
                        } else if (mCount == 2) {
                            local_max -= m;
                            index = nextStartIndex; // We have seen 2 m, that means we restart from our prev recorded
                            break;
                        }
                    }
                    index++;
                }
                max = Math.max(local_max, max);
            }
            System.out.println(max);
        }

    }

}

///////////////////////////////////////////////////////////////////////////////

class AlmostPerfect {
    
    public static void main(String[] args) {
        new AlmostPerfect();
    }

    AlmostPerfect() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = sc.getInt(), x = findSum(n);
            sb.append(n).append(" ");
            if (x == n) {
                sb.append("perfect");
            } else if (Math.abs(x - n) <= 2) {
                sb.append("almost perfect");
            } else {
                sb.append("not perfect");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    int findSum(int n) {
        int x = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    x += i;
                } else x += i + (n / i);
            } 
        }        
        return x - n;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ANewAlphabet {
    
    public static void main(String[] args) {
        new ANewAlphabet();
    }

    ANewAlphabet() {
        answer();
    }

    void answer() { 
        char[] s = new java.util.Scanner(System.in).nextLine().toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, String> dict = buildMap();
        for (char c : s) {
            if (dict.containsKey(c)) {
                sb.append(dict.get(c));
            } else sb.append(c);
        }            
        System.out.println(sb.toString());
    }

    HashMap<Character, String> buildMap() {
        HashMap<Character, String> dict = new HashMap<>();
        dict.put('a',"@");
        dict.put('b',"8");
        dict.put('c',"(");
        dict.put('d',"|)");
        dict.put('e',"3");
        dict.put('f',"#");
        dict.put('g',"6");
        dict.put('h',"[-]");
        dict.put('i',"|");
        dict.put('j',"_|");
        dict.put('k',"|<");
        dict.put('l',"1");
        dict.put('m',"[]\\/[]");
        dict.put('n',"[]\\[]");
        dict.put('o',"0");
        dict.put('p',"|D");
        dict.put('q',"(,)");
        dict.put('r',"|Z");
        dict.put('s',"$");
        dict.put('t',"\'][\'");
        dict.put('u',"|_|");
        dict.put('v',"\\/");
        dict.put('w',"\\/\\/");
        dict.put('x',"}{");
        dict.put('y',"`/");
        dict.put('z',"2");
        return dict;
    }

}

///////////////////////////////////////////////////////////////////////////////

class APrizeNoOneCanWin {
    
    public static void main(String[] args) {
        new APrizeNoOneCanWin();
    }

    APrizeNoOneCanWin() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), min = sc.getInt(), x = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.getInt();
        Arrays.sort(arr); // Ascending order VERY impt
        if (n == 1) { // Need minimum two, doesn't matter cost
            x = 1;
        } else if (arr[arr.length - 1] + arr[arr.length - 2] <= min) { // Top 2 sum smaller than m, the rest xfm smaller than m
            x = n;
        } else { // iterate through the rest, if the sum is bigger than m, break;
            for (int i = 0; i < arr.length - 1; i++)
                if (arr[i] + arr[i + 1] > min) {
                    x = i + 1; // because i started from 0
                    break;
                }
        }        
        System.out.println(x);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class JanitorTroubles {
    
    public static void main(String[] args) {
        new JanitorTroubles();
    }

    JanitorTroubles() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        System.out.println(brahmaguptaFormula(sc.getDouble(), sc.getDouble(), sc.getDouble(), sc.getDouble()));
        sc.close();
    }

    double brahmaguptaFormula(double a, double b, double c, double d) {
        double s = semiperimeter(a, b, c, d);
        return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d));
    }

    double semiperimeter(double a, double b, double c, double d) {
        return (a + b + c + d) / 2;
    }

}

///////////////////////////////////////////////////////////////////////////////

class TaiFormula {
    
    public static void main(String[] args) {
        new TaiFormula();
    }

    TaiFormula() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        double area = 0;

        double prevX = sc.getDouble(), prevY = sc.getDouble(),
                nextX = 0, nextY = 0; 

        while (n-- > 0) {
            nextX = sc.getDouble();
            nextY = sc.getDouble(); 
            area += trapezoidArea(prevX, prevY, nextX, nextY);
            prevX = nextX;
            prevY = nextY;
        }
        System.out.println(area / 1000);
        sc.close();
    }

    double trapezoidArea(double x1, double y1, double x2, double y2) {
        return 1/2.0 * (y1 + y2) * (x2 - x1);
    }

}

///////////////////////////////////////////////////////////////////////////////

class ArmyStrengthEasy {
    
    public static void main(String[] args) {
        new ArmyStrengthEasy();
    }

    ArmyStrengthEasy() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int g = sc.getInt(), m = sc.getInt();
            ArrayList<Integer> gArmy = new ArrayList<>();
            ArrayList<Integer> mArmy = new ArrayList<>();

            for (int i = 0; i < g; i++)
                gArmy.add(sc.getInt());

            for (int i = 0; i < m; i++)
                mArmy.add(sc.getInt());

            Collections.sort(gArmy);
            Collections.sort(mArmy);

            while (gArmy.size() > 0 && mArmy.size() > 0) {
                int gWeak = gArmy.get(0), mWeak = mArmy.get(0);
                if (gWeak > mWeak) {
                    mArmy.remove(0);
                } else if (mWeak > gWeak) {
                    gArmy.remove(0);
                } else {
                    mArmy.remove(0);
                }
            }

            if (gArmy.size() == 0) {
                sb.append("MechaGodzilla");
            } else sb.append("Godzilla");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class ArmyStrengthHard {
    
    public static void main(String[] args) {
        new ArmyStrengthHard();
    }

    ArmyStrengthHard() {
        answer();
    }

    // 0.63s
    // void answer() { 
    //     Kattio sc = new Kattio(System.in);
    //     StringBuilder sb = new StringBuilder();
    //     int t = sc.getInt();
    //     while (t-- > 0) {
    //         int g = sc.getInt(), m = sc.getInt();
    //         Queue<Integer> gArmy = new PriorityQueue<>();
    //         Queue<Integer> mArmy = new PriorityQueue<>();

    //         for (int i = 0; i < g; i++)
    //             gArmy.add(sc.getInt());

    //         for (int i = 0; i < m; i++)
    //             mArmy.add(sc.getInt());
            
    //         while (gArmy.size() > 0 && mArmy.size() > 0) {
    //             int gWeak = gArmy.poll(), mWeak = mArmy.poll();
    //             if (gWeak > mWeak) {
    //                 gArmy.add(gWeak);
    //             } else if (mWeak > gWeak) {
    //                 mArmy.add(mWeak);
    //             } else {
    //                 gArmy.add(gWeak);
    //             }
    //         }

    //         if (gArmy.size() == 0) {
    //             sb.append("MechaGodzilla");
    //         } else sb.append("Godzilla");
    //         sb.append("\n");
    //     }
    //     System.out.println(sb.toString());
    //     sc.close();
    // }

    // 0.30
    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int g = sc.getInt(), m = sc.getInt();
            int gMax = 0, mMax = 0;

            for (int i = 0; i < g; i++)
                gMax = Math.max(gMax, sc.getInt());

            for (int i = 0; i < m; i++)
                mMax = Math.max(mMax, sc.getInt());
            
            if (mMax > gMax) {
                sb.append("MechaGodzilla");
            } else sb.append("Godzilla");
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FiftyShadesOfPink {
    
    public static void main(String[] args) {
        new FiftyShadesOfPink();
    }

    FiftyShadesOfPink() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), total = 0;
        while (n-- > 0) {
            String s = sc.getWord().toLowerCase();
            total += s.contains("pink") || s.contains("rose") ? 1 : 0;
        }
        System.out.println(total == 0 ? "I must watch Star Wars with my daughter" : total);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class LostLineup {
    
    public static void main(String[] args) {
        new LostLineup();
    }

    LostLineup() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 2; i <= n; i++)
            arr[sc.getInt() + 1] = i;
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class DrunkVigenere {
    
    public static void main(String[] args) {
        new DrunkVigenere();
    }

    DrunkVigenere() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        String c = sc.getWord(), k = sc.getWord(), out = "";
        int len = c.length();
        for (int i = 0; i < len; i++) {
            char cChar = c.charAt(i), kChar = k.charAt(i);
            if (i % 2 == 0) { // backward
                int x = (cChar - kChar) + 65;
                if (x < 65) x += 26;
                out += String.valueOf((char) x);
            } else { // forward
                int x = (cChar + kChar) - 65;
                if (x > 90) x -= 26;
                out += String.valueOf((char) x);
            }
        }
        System.out.println(out);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class GreedyPolygons {
    
    public static void main(String[] args) {
        new GreedyPolygons();
    }

    GreedyPolygons() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            double sides = sc.getDouble(), initial_length = sc.getDouble(), expansion = sc.getDouble(), grabs = sc.getDouble();
            sb.append(newArea(sides, initial_length, expansion, grabs)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    double newArea(double sides, double initial_length, double expansion, double grabs) {
        return polygonArea(sides, initial_length) + (grabs * nSidesQuadrilateralAreas(sides, initial_length, expansion)) + nSidesCornerAreas(expansion, grabs);
    }

    double nSidesCornerAreas(double expansion, double grabs) {
        return Math.PI * Math.pow(expansion * grabs, 2);   
    }

    double nSidesQuadrilateralAreas(double sides, double initial_length, double expansion) {
        return sides * initial_length * expansion;
    }


    double polygonArea(double sides, double length) {
        return (Math.pow(length, 2) * sides) / (4 * Math.tan(Math.PI / sides));
    }

}

///////////////////////////////////////////////////////////////////////////////

class BachetsGame {
    
    public static void main(String[] args) {
        new BachetsGame();
    }

    BachetsGame() {
        answer();
    }

    void answer() { 
        // http://web.mit.edu/sp.268/www/nim.pdf
        // Combinatorial Game
        // 1. There are 2 players
        // 2. There is a set, usually finite, of possible positions of the game
        // 3. The rules of the game specify for both players and each position which moves to other positions are legal moves.
        // 4. If the rules make it such that both players have the same options of moving from each position, the game is Impartial, else Partizan
        // 5. Players alternate moving
        // 6. The game ends when a position is reached such that the player to move has no possible moves. 
        //    > Normal-play > win
        //    > Misere-play > lose
        // 7. Game ends in a finite number of moves no matter how it is played
        //
        // > Normal-play, player who takes last move wins
        // > Misere-play, player who takes last move loses
        // Types of Combinatorial games
        // > Impartial game
        // > Partizan game
        //
        // This is an impartial game that is normal-play

        // P-position, N-position and Terminal position

        // P-position > Secures a win for Previous player (the one who just moved) | Losing position
        // N-position > Secures a win for the Next player | Winning position
        // Terminal position > No moves left

        // E.g. Nim > Normal-play (last move wins), 
        // (0,0,1) is considered a N-position as the next player will take 1, leaving (0,0,0) and be considered the winner
        // (1,1,0) is considered a P-position 

        // How to find out whether a Nim position is N or P?
        // > We work backwards from the end of game to the beginning
        // > This is called "Backwards induction"
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();    
        while (sc.hasMoreTokens()) {
            int n = sc.getInt(), m = sc.getInt();
            
            int[] options = new int[m];
            char[] states = new char[n + 1];

            for (int i = 0; i < m; i++)
                options[i] = sc.getInt();
            Arrays.sort(options);
            // P = P-position
            // N = N-position
            // T = Terminal-position
            Arrays.fill(states, 'P'); // 1. Label every terminal position as P, so we just label everything as P
            
            for (int i = 0; i <= n; i++) {
                if (states[i] == 'P') { // 2. Label every position that can reach an P as N
                // This is the "How an N can reach a P"
                    if (i + options[m - 1] <= n) {  // ensuring that the maximum state set to N is not greater or == to n
                        for (int j = 0; j < m; j++)
                            states[i + options[j]] = 'N';
                    } else {
                        for (int j = 0; j < m; j++)
                            if (i + options[j] <= n) states[i + options[j]] = 'N';
                    }
                }
            }

            sb.append(states[n] == 'P' ? "Ollie wins" : "Stan wins").append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SchoolSpirit {
    
    public static void main(String[] args) {
        new SchoolSpirit();
    }

    SchoolSpirit() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] students = new int[n];
        for (int i = 0; i < students.length; i++)
            students[i] = sc.getInt();
        
        double group = groupScores(students);
        double averageG = averageG(students, group);
        System.out.println(group);
        System.out.println(averageG);

        sc.close();        
    }

    double averageG(int[] arr, double group) {
        double averageG = 0;
        for (int i = 0; i < arr.length; i++) {
            int iter = 0;
            double local_averageG = 0;
            for (int j = 0; j < arr.length; j++)
                if (i != j) local_averageG += arr[j] * Math.pow(.8, iter++);
            // int[] tmp = new int[arr.length - 1];
            // for (int j = 0; j < i; j++)
            //     tmp[j] = arr[j];
            // for (int j = i + 1; j < arr.length; j++)
            //     tmp[j - 1] = arr[j];
            // System.out.println(Arrays.toString(tmp));
            averageG += local_averageG / 5.0;
        }
        return averageG / arr.length;
    }

    double groupScores(int[] arr) {
        double group = 0;
        for (int i = 0 ; i < arr.length; i++) 
            group += arr[i] * Math.pow(.8, i);
        return group / 5.0;
    }
    
}

///////////////////////////////////////////////////////////////////////////////
class Billiard {
    
    public static void main(String[] args) {
        new Billiard();
    }

    Billiard() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double a = 0, b = 0, s = 0, m = 0, n = 0;
        while ((a = sc.getInt()) != 0 && (b = sc.getInt()) != 0 && (s = sc.getInt()) != 0 && (m = sc.getInt()) != 0 && (n = sc.getInt()) != 0) {
            // a -> hort side
            // b -> vert side
            // s -> time
            // m -> bounces off vert side
            // n -> bounces off horizontal side

            double hortDist = a * m, vertDist = b * n;
            
            double angleA = Math.round(Math.toDegrees(Math.atan(vertDist / hortDist) * 100.0)) / 100.0;
            double distTravel = Math.sqrt(Math.pow(hortDist, 2) + Math.pow(vertDist, 2));
            double speed = distTravel / s;

            sb.append(String.format("%.2f", angleA)).append(" ").append(String.format("%.2f", speed)).append("\n");
        }   
        System.out.println(sb.toString()); 
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IdentifyingMapTiles {
    
    public static void main(String[] args) {
        new IdentifyingMapTiles();
    }

    IdentifyingMapTiles() {
        answer();
    }

    void answer() { 
        String s = new java.util.Scanner(System.in).nextLine();
        int x = 0, y = 0, len = s.length(), mult = 1;
        for (int i = len - 1; i >= 0; i--) {
            char curr = s.charAt(i);

            if (curr == '1' || curr == '3') x += mult;
            if (curr == '2' || curr == '3') y += mult;
            mult *= 2;
        }
        System.out.printf("%d %d %d", len, x, y);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SodaSlurper {
    
    public static void main(String[] args) {
        new SodaSlurper();
    }

    SodaSlurper() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int e = sc.getInt(), f = sc.getInt(), c = sc.getInt();
        int empty = e + f, bottles = -1;
        while (empty > 0) {
            empty -= c;
            empty++;
            bottles++;
        }
        System.out.println(bottles == -1 ? 0 : bottles);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Prva {
    
    public static void main(String[] args) {
        new Prva();
    }

    Prva() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++)
            arr[i] = sc.getWord().toCharArray();

        ArrayList<String> al = addWords(arr);

        // System.out.println(al.toString());
        System.out.println(Collections.min(al));
        
        sc.close();
    }

    ArrayList<String> addWords(char[][] arr) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String tmp = "";
            for (int j = 0; j < arr[i].length; j++) {
                tmp += arr[i][j];
            }
            checkInput(tmp, al);
        }
        for (int i = 0; i < arr[0].length; i++) {
            String tmp = "";           
            for (int j= 0; j < arr.length; j++) {
                tmp += arr[j][i];
            }
            checkInput(tmp, al); 
        }
        return al;
    }
    
    void checkInput(String tmp, ArrayList<String> al) {
        String[] tmp2 = tmp.split("#");
        for (int i = 0; i < tmp2.length; i++) {
            if (tmp2[i].length() >= 2) al.add(tmp2[i]);
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class CardTrick {
    
    public static void main(String[] args) {
        new CardTrick();
    }

    CardTrick() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            ArrayDeque<Integer> deck = new ArrayDeque<>();            
            // Working backwards, just reversing the process
            while (n > 0) {
                deck.offerFirst(n); // Add card to deck, put on the top
                for (int i = 0; i < n; i++)
                    deck.offerFirst(deck.pollLast()); // Move last card to front
                n--;
            }
            sb.append(deck.toString().replaceAll("[\\[\\],]", "")).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Prsteni {
    
    public static void main(String[] args) {
        new Prsteni();
    }

    Prsteni() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int rings = sc.getInt();
        int[] radius = new int[rings];
        double relation = 1;
        for (int i = 0; i < rings; i++)
            radius[i] = sc.getInt();
        for (int i = 0; i < rings - 1; i++) {
            double x = radius[i] * relation;
            double y = radius[i + 1];
            relation = x / y;
            sb.append(fractions(x,y)).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    String fractions(double x, double y) {
        double divisor = gcd(x, y);
        return String.valueOf((int) (x / divisor) + "/" + (int) (y / divisor));
    }

    double gcd(double x, double y) {
        if (y > x) return gcd(y, x);
        if (Math.abs(y) < 0.001) return x;
        return gcd(y, x - Math.floor(x / y) * y);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Parking {
    
    public static void main(String[] args) {
        new Parking();
    }

    Parking() {
        answer();
    }

    void answer() {     
        Kattio sc = new Kattio(System.in);
        int total = 0, a = sc.getInt(), b = sc.getInt() * 2, c = sc.getInt() * 3;
        int[] time = new int[101];
        int s1 = sc.getInt(), e1 = sc.getInt(), 
            s2 = sc.getInt(), e2 = sc.getInt(),
            s3 = sc.getInt(), e3 = sc.getInt();
        addTime(s1, e1, time);
        addTime(s2, e2, time);
        addTime(s3, e3, time);
        for (int i = 1; i < time.length; i++) {
            if (time[i] == 0) continue;
            if (time[i] == 1) {
                total += a;
            } else if (time[i] == 2) {
                total += b;
            } else if (time[i] == 3) {
                total += c;
            }
        }
        System.out.println(total);
        sc.close();
    }

    void addTime(int s, int e, int[] time) {
        for (int i = s; i < e; i++) 
            time[i]++;
    } 
    
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class DRMMessages {
    
    public static void main(String[] args) {
        new DRMMessages();
    }

    DRMMessages() {
        answer();
    }

    void answer() { 
        char[] tmp = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] part1 = Arrays.copyOfRange(tmp, 0, tmp.length / 2);
        char[] part2 = Arrays.copyOfRange(tmp, tmp.length / 2, tmp.length);
        
        rotateChars(part1);
        rotateChars(part2);
        mergeChars(part1, part2);
        System.out.println(java.util.Arrays.toString(part1).replaceAll("[\\[\\],\\s+]",""));
    }

    void rotateChars(char[] part) {
        int rot = 0;
        for (char c : part)
            rot += c;
        rot -= part.length * 65;
        for (int i = 0; i < part.length; i++)
            part[i] = (char) (((part[i] - 65 + rot) % 26) + 65);
    }

    void mergeChars(char[] part1, char[] part2) {
        for (int i = 0; i < part1.length; i++)
            part1[i] = (char) (((part1[i] - 65 + part2[i] - 65) % 26) + 65);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class YingAndYangStones {
    
    public static void main(String[] args) {
        new YingAndYangStones();
    }

    YingAndYangStones() {
        answer();
    }

    void answer() { 
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] arr2 = new int[88];
        for (char c : arr) 
            arr2[c]++;
        System.out.println(arr2[66] == arr2[87] ? 1 : 0);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TheKeyToCryptography {
    
    public static void main(String[] args) {
        new TheKeyToCryptography();
    }

    TheKeyToCryptography() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        String cipher = sc.getWord(), secret = sc.getWord(), plain = "";
        int clen = cipher.length();
        for (int i = 0; i < clen; i++) {
            int c = cipher.charAt(i) - secret.charAt(i);
            c = c < 0 ? c + 26 : c;
            c += 65;
            plain += (char) c;
            secret += (char) c;
        }
        System.out.println(plain);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SecretMessage {
    
    public static void main(String[] args) {
        new SecretMessage();
    }

    SecretMessage() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char[] cipher = sc.getWord().toCharArray();
            int len = (int) Math.ceil(Math.sqrt(cipher.length));
            char[][] map = new char[len][len];
            int iter = 0;
            for (int i = 0; i < len; i++) 
                for (int j = 0; j < len; j++) 
                    map[i][j] = iter < cipher.length ? cipher[iter++] : '*';      
            // for (int i = 0; i < len / 2; i++) {
            //     for (int j = 0; j < len / 2; j++) {
            //         char temp = map[i][j];
            //         map[i][j] = map[len - 1 - j][i];
            //         map[len - 1 - j][i] = map[len - 1 - i][len - 1 - j];
            //         map[len - 1 - i][len - 1 - j] = map[j][len - 1 - i];
            //         map[j][len - 1 - i] = temp;
            //     }
            // }
            // for (int i = 0; i < len; i++) {
            //     for (int j = 0; j < len; j++) {
            //         sb.append(map[i][j]);
            //     }
            // } 
            for (int i = 0; i < len; i++) {
                for (int j = len - 1; j >= 0; j--) {
                    sb.append(map[j][i]);
                }
            }              
            sb.append("\n");       
        }
        System.out.println(sb.toString().replaceAll("[*]", ""));
        sc.close();
    }   

}

///////////////////////////////////////////////////////////////////////////////

class ClosingTheLoop {
    
    public static void main(String[] args) {
        new ClosingTheLoop();
    }

    ClosingTheLoop() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            int s = sc.getInt(), total = 0;
            ArrayList<Integer> blue = new ArrayList<>();
            ArrayList<Integer> red = new ArrayList<>();
            while (s-- > 0) {
                String tmp = sc.getWord();
                int len = Integer.parseInt(tmp.substring(0, tmp.length() - 1));
                if (tmp.charAt(tmp.length() - 1) == 'B') {
                    blue.add(len);
                } else red.add(len);
            }
            Collections.sort(blue);
            Collections.sort(red);
            if (blue.size() > red.size()) {
                while (blue.size() != red.size()) {
                    blue.remove(0);
                }
            } else if (red.size() > blue.size()) {
                while (blue.size() != red.size()) {
                    red.remove(0);
                }
            }
            // System.out.println(blue.toString());
            // System.out.println(red.toString());
            for (Integer x : blue)
                total += x;
            for (Integer x : red)
                total += x; 
            total -= (blue.size() + red.size());
            sb.append("Case #" + i + ": " + total).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BookingARoom {
    
    public static void main(String[] args) {
        new BookingARoom();
    }

    BookingARoom() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        boolean[] booked = new boolean[sc.getInt() + 1];
        int n = sc.getInt(), room = -1;
        while (n-- > 0)
            booked[sc.getInt()] = true;
        for (int i = 1; i < booked.length; i++)
            if (!booked[i]) {
                room = i; 
                break;
            }
        System.out.println(room == - 1 ? "too late" : room);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Ants {
    
    public static void main(String[] args) {
        new Ants();
    }

    Ants() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int test = sc.getInt();
        while (test-- > 0) {
            int l = sc.getInt(), n = sc.getInt(), min = 0, max = 0;
                        
            // Base thoughts behind algorithm
            // 1. Check whether between i or l - i is the largest or least
            //    is pretty straightforward as we are just comparing the 
            //    ant position to either end. 
            // 2. The next is a little trickier in my opinion as it involves
            //    thinking about how the scenario plays out. I imagine it that
            //    when we take the Math.max of either the min or max, it is about
            ///   getting the last ant off the pole. Therefore the min and max time
            //    it takes for that last end to get off the pole.
            // 
            // Naturally, using Math.min will give us 0 on both ends as having no ants 
            // fall off the pole takes no time at all.
            //    
            while (n-- > 0) {
                int x = sc.getInt();
                min = Math.max(min, Math.min(x, l - x));
                max = Math.max(max, Math.max(x, l - x));
            }
            
            sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AwkwardParty {
    
    public static void main(String[] args) {
        new AwkwardParty();
    }

    AwkwardParty() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), min = n;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) 
            hmap.put(i, sc.getInt());
        List<Entry<Integer, Integer>> list = new ArrayList<>(hmap.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                if (e1.getValue() == e2.getValue()) {
                    return e1.getKey() - e2.getKey();
                }
                return e1.getValue() - e2.getValue();
            }
        });
        int currVal = -1, currInd = -1;
        for (Entry<Integer, Integer> e : list) {
            int nextVal = e.getValue(), nextInd = e.getKey();  
            if (currVal != nextVal) {
                currVal = nextVal;
                currInd = nextInd;
                continue;
            } else {
                min = Math.min(min, nextInd - currInd);
            }
        }
        System.out.println(min);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BabyBites {
    
    public static void main(String[] args) {
        new BabyBites();
    }

    BabyBites() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        boolean isSense = true;
        int n = sc.getInt();
        Pattern p = Pattern.compile("mumble");
        for (int i = 1; i <= n; i++) {
            String s = sc.getWord();
            Matcher m = p.matcher(s);
            if (!m.matches() && i != Integer.parseInt(s)) {
                isSense = false;
                break;
            }
        }
        System.out.println(isSense ? "makes sense" : "something is fishy");
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Babelfish {
    
    public static void main(String[] args) {
        new Babelfish();
    }

    Babelfish() {
        answer();
    }

    void answer() { 
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> hmap = new HashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) break;
            String[] arr = s.split("\\s+");
            hmap.put(arr[1], arr[0]);
        }
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            sb.append(hmap.containsKey(s) ? hmap.get(s) : "eh").append("\n");
        }
        System.out.println(sb.toString());
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BankQueue {
    
    public static void main(String[] args) {
        new BankQueue();
    }

    BankQueue() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), t = sc.getInt(), total = 0;
        int[] count = new int[t + 1];
        while (n-- > 0) {
            int c = sc.getInt(), ct = sc.getInt();
            for (int i = ct; i >= 0; i--) 
                if (c > count[i]) {
                    int temp = c;
                    c = count[i];
                    count[i] = temp;
                }
        }
        for (int i : count)
            total += i;
        System.out.println(total);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Bard {
    
    public static void main(String[] args) {
        new Bard();
    }

    Bard() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt(), e = sc.getInt(), songCount = 1;

        int[] know = new int[n + 1]; // 0 not a villager
        
        while (e-- > 0) {
            int k = sc.getInt();
            int[] tmp = new int[k];
            for (int i = 0; i < k; i++)
                tmp[i] = sc.getInt();
            Arrays.sort(tmp);
            if (tmp[0] == 1) {
                songCount++;
                for (int i : tmp)
                    know[i]++;
            } else {
                for (int i : tmp)
                    know[i] = songCount;
            }
        }
        sb.append(1).append("\n");
        for (int i = 2; i < n + 1; i++)
            if (know[i] == songCount) sb.append(i).append("\n");
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BattleSimulation {
    
    public static void main(String[] args) {
        new BattleSimulation();
    }

    BattleSimulation() {
        answer();
    }

    void answer() {
        System.out.println(
            new java.util.Scanner(System.in).nextLine()
                .replaceAll("RBL|RLB|BLR|BRL|LRB|LBR", "C")
                .replaceAll("R", "S")
                .replaceAll("B", "K")
                .replaceAll("L", "H"));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BoundingRobots {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int w = 0, l = 0;
        while ((w = sc.getInt()) != 0 && (l = sc.getInt()) != 0) {
            int n = sc.getInt();
            int thinkx = 0, thinky = 0, actualx = 0, actualy = 0;
            while (n-- > 0) {
                char direction = sc.getWord().charAt(0);
                int steps = sc.getInt();
                if (direction == 'u') {
                    thinky += steps;
                    if (actualy + steps > l - 1) {
                        actualy = l - 1;
                    } else actualy += steps;
                } else if (direction == 'd') {
                    thinky -= steps;
                    if (actualy - steps < 0) {
                        actualy = 0;
                    } else actualy -= steps;
                } else if (direction == 'l') {
                    thinkx -= steps;
                    if (actualx - steps < 0) {
                        actualx = 0;
                    } else actualx -= steps;
                } else if (direction == 'r') {
                    thinkx += steps;
                    if (actualx + steps > w - 1) {
                        actualx = w - 1;
                    } else actualx += steps;
                }
            }
            sb.append("Robot thinks ").append(thinkx).append(" ").append(thinky).append("\n");
            sb.append("Actually at ").append(actualx).append(" ").append(actualy).append("\n\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FalseSenseOfSecurity {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<Character, String> letterToMos = letterToMos();   
        HashMap<String, Character> mosToLetter = mosToLetter();       
        HashMap<String, Integer> mosToLength = mosToLength();
        while (sc.hasMoreTokens()) {
            char[] arr = sc.getWord().toCharArray();
            String encode = "";
            int[] digits = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String tmp = letterToMos.get(arr[i]);
                encode += tmp;
                digits[i] = mosToLength.get(tmp);
            }
            for (int i = 0; i < digits.length / 2; i++) {
                int tmp = digits[i];
                digits[i] = digits[digits.length - i - 1];
                digits[digits.length - i - 1] = tmp;
            }
            int curr = 0;
            for (int i = 0; i < digits.length; i++) 
                sb.append(mosToLetter.get(encode.substring(curr, curr += digits[i])));
            sb.append("\n");
        }       
        System.out.println(sb.toString());
        sc.close();     
    }

    static HashMap<String, Integer> mosToLength() {
        HashMap<String, Integer> mosToLength = new HashMap<>();     
        mosToLength.put(".-", 2);
        mosToLength.put("-...", 4);
        mosToLength.put("-.-.", 4);
        mosToLength.put("-..", 3);
        mosToLength.put(".", 1);
        mosToLength.put("..-.", 4);
        mosToLength.put("--.", 3);
        mosToLength.put("....", 4);
        mosToLength.put("..", 2);
        mosToLength.put(".---", 4);
        mosToLength.put("-.-", 3);
        mosToLength.put(".-..", 4);
        mosToLength.put("--", 2);
        mosToLength.put("-.", 2);
        mosToLength.put("---", 3);
        mosToLength.put(".--.", 4);
        mosToLength.put("--.-", 4);
        mosToLength.put(".-.", 3);
        mosToLength.put("...", 3);
        mosToLength.put("-", 1);
        mosToLength.put("..-", 3);
        mosToLength.put("...-", 4);
        mosToLength.put(".--", 3);
        mosToLength.put("-..-", 4);
        mosToLength.put("-.--", 4);
        mosToLength.put("--..", 4);
        mosToLength.put("..--", 4);
        mosToLength.put(".-.-", 4);
        mosToLength.put("---.", 4);
        mosToLength.put("----", 4);
        return mosToLength; 
    }

    static HashMap<Character, String> letterToMos() {
        HashMap<Character, String> letterToMos = new HashMap<>();     
        letterToMos.put('A',".-");
        letterToMos.put('B',"-...");
        letterToMos.put('C',"-.-.");
        letterToMos.put('D',"-..");
        letterToMos.put('E',".");
        letterToMos.put('F',"..-.");
        letterToMos.put('G',"--.");
        letterToMos.put('H',"....");
        letterToMos.put('I',"..");
        letterToMos.put('J',".---");
        letterToMos.put('K',"-.-");
        letterToMos.put('L',".-..");
        letterToMos.put('M',"--");
        letterToMos.put('N',"-.");
        letterToMos.put('O',"---");
        letterToMos.put('P',".--.");
        letterToMos.put('Q',"--.-");
        letterToMos.put('R',".-.");
        letterToMos.put('S',"...");
        letterToMos.put('T',"-");
        letterToMos.put('U',"..-");
        letterToMos.put('V',"...-");
        letterToMos.put('W',".--");
        letterToMos.put('X',"-..-");
        letterToMos.put('Y',"-.--");
        letterToMos.put('Z',"--..");
        letterToMos.put('_',"..--");
        letterToMos.put(',',".-.-");
        letterToMos.put('.',"---.");
        letterToMos.put('?',"----");
        return letterToMos; 
    }

    static HashMap<String, Character> mosToLetter() {
        HashMap<String, Character> mosToLetter = new HashMap<>();     
        mosToLetter.put(".-", 'A');
        mosToLetter.put("-...", 'B');
        mosToLetter.put("-.-.", 'C');
        mosToLetter.put("-..", 'D');
        mosToLetter.put(".", 'E');
        mosToLetter.put("..-.", 'F');
        mosToLetter.put("--.", 'G');
        mosToLetter.put("....", 'H');
        mosToLetter.put("..", 'I');
        mosToLetter.put(".---", 'J');
        mosToLetter.put("-.-", 'K');
        mosToLetter.put(".-..", 'L');
        mosToLetter.put("--", 'M');
        mosToLetter.put("-.", 'N');
        mosToLetter.put("---", 'O');
        mosToLetter.put(".--.", 'P');
        mosToLetter.put("--.-", 'Q');
        mosToLetter.put(".-.", 'R');
        mosToLetter.put("...", 'S');
        mosToLetter.put("-", 'T');
        mosToLetter.put("..-", 'U');
        mosToLetter.put("...-", 'V');
        mosToLetter.put(".--", 'W');
        mosToLetter.put("-..-", 'X');
        mosToLetter.put("-.--", 'Y');
        mosToLetter.put("--..", 'Z');
        mosToLetter.put("..--", '_');
        mosToLetter.put(".-.-", ',');
        mosToLetter.put("---.", '.');
        mosToLetter.put("----", '?');
        return mosToLetter; 
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EulersNumber {
        
    public static void main(String[] args) {
        System.out.println(String.format("%.15f", euler(Double.parseDouble(new java.util.Scanner(System.in).nextLine()))));
    }

    static double euler(double n) {
        double out = 0, fact = 1;
        if (n > 17) n = 17;
        for (int i = 1; i <= n + 1; i++) {
            out += 1 / (fact);
            fact *= i;
        }
        return out;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Exam {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int friend_correct = sc.getInt(), mine_correct_max = 0;
        char[] mine = sc.getWord().toCharArray(), friend = sc.getWord().toCharArray();
        int friend_wrong = friend.length - friend_correct;
        int len = mine.length;
        // Either way, i am always right
        for (int i = 0; i < mine.length; i++) {
            if (mine[i] == friend[i] && friend_correct > 0) {
                friend_correct--;
                mine_correct_max++;
            } else if (mine[i] != friend[i] && friend_wrong > 0) {
                friend_wrong--;
                mine_correct_max++;
            }            
        }
        System.out.println(mine_correct_max);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class LineThemUp {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String[] original = new String[n];
        for (int i = 0; i < n; i++)
            original[i] = sc.getWord();
        boolean ascend = false, descend = false;
        for (int i = 0; i < original.length - 1; i++) {
            int com = original[i].compareTo(original[i + 1]);
            if (com > 0) {
                descend = true;
            } else if (com < 0) {
                ascend = true;
            }
            if (ascend && descend) break;
        }

        if (ascend && descend) {
            System.out.println("NEITHER");
        } else if (descend) {
            System.out.println("DECREASING");
        } else if (ascend) {
            System.out.println("INCREASING");
        } 
        sc.close();
    }  

}

///////////////////////////////////////////////////////////////////////////////

class OddGnome {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int g = sc.getInt();
            int[] arr = new int[g];
            for (int i = 0; i < g; i++)
                arr[i] = sc.getInt();
            int i = 0;
            for (; i < g - 1; i++)
                if (arr[i + 1] != arr[i] + 1) break;
            sb.append(i + 2).append("\n");
        }
        System.out.println(sb.toString());
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MissingNumbers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        boolean[] miss = new boolean[200 + 1];
        int last = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.getInt();
            if (i == n - 1) last = x;
            miss[x] = true;
        }
        for (int i = 1; i <= last; i++)
            if (!miss[i]) sb.append(i).append("\n");
        System.out.println(sb.length() == 0 ? "good job" : sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HydrasHeads {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int h = 0, t = 0;

        while ((h = sc.getInt()) != 0 && (t = sc.getInt()) != 0) {
            sb.append(kill(h, t)).append("\n");
        }   
        System.out.println(sb.toString());
        sc.close();
    }

    static int kill(int h, int t) {
        // 1. Can't kill Hydra
        // 2. ONLY if has 2 heads, then Hydra is dead. Next check takes care of this in advance.
        if (t == 0) return -1;
        // 1. t % 2. Cut 2 tails > 1 new head. Therefore, checking if heads can grow
        // 2. If the head can grow, h (current heads) + (t / 2) (newly received heads), is it % 2 == 0
        //    If can % 2 == 0, it means can be killed > Cut 2 heads > Nothing happens
        // 3. Moves are as calculated, t / 2 > cut the tails, (h + (t / 2)) / 2, cut the heads
        if (t % 2 == 0 && (h + (t / 2)) % 2 == 0) return t / 2 + (h + (t / 2)) / 2;
        return 1 + kill(h, t + 1); 
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Hangman {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String word = java.util.Arrays.stream(sc.getWord().split("")).distinct().reduce("", (x,y) -> x + y);
        char[] permute = sc.getWord().toCharArray();
        int win = word.length(), curr = 0;
        int death = 10;
        for (char c : permute) {
            if (word.contains(String.valueOf(c))) {
                curr++;
            } else death--;
            if (curr == win || death == 0) break;
        }
        
        System.out.println(death == 0 ? "LOSE" : "WIN");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DifferentDistances {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double x1 = 0;
        while ((x1 = sc.getDouble()) != 0) {
            double y1 = sc.getDouble(), x2 = sc.getDouble(), y2 = sc.getDouble(), p = sc.getDouble();
            sb.append(String.format("%.10f", pnorm(x1, y1, x2, y2, p))).append("\n");
        }        
        System.out.println(sb.toString());
        sc.close();
    }

    static double pnorm(double x1, double y1, double x2, double y2, double p) {
        return Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1.0 / p); 
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class T9Spelling {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> hmap = createMap();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        for (int j = 1; j <= n; j++) {
            char[] arr = sc.nextLine().toCharArray();
            String[] tmp = new String[arr.length];
            for (int i = 0; i < tmp.length; i++)
                tmp[i] = hmap.get(arr[i]);
            sb.append("Case #" + j + ": ");
            for (int i = 0; i < tmp.length - 1; i++)
                sb.append(tmp[i]).append(tmp[i].contains(tmp[i + 1]) || tmp[i + 1].contains(tmp[i]) ? " " : "");
            sb.append(tmp[tmp.length - 1]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    static HashMap<Character, String> createMap() {
        HashMap<Character, String> hmap = new HashMap<>();
        hmap.put('a', "2");
        hmap.put('b', "22");
        hmap.put('c', "222");
        hmap.put('d', "3");
        hmap.put('e', "33");
        hmap.put('f', "333");
        hmap.put('g', "4");
        hmap.put('h', "44");
        hmap.put('i', "444");
        hmap.put('j', "5");
        hmap.put('k', "55");
        hmap.put('l', "555");
        hmap.put('m', "6");
        hmap.put('n', "66");
        hmap.put('o', "666");
        hmap.put('p', "7");
        hmap.put('q', "77");
        hmap.put('r', "777");
        hmap.put('s', "7777");
        hmap.put('t', "8");
        hmap.put('u', "88");
        hmap.put('v', "888");
        hmap.put('w', "9");
        hmap.put('x', "99");
        hmap.put('y', "999");
        hmap.put('z', "9999");
        hmap.put(' ', "0");
        return hmap;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SomeSum {
    
    public static void main(String[] args) {
        System.out.println(sumthing(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static String sumthing(int n) {
        // 1 EITHER
        // 1+2 odd
        // 1+2+3 / 2+3+4 EITHER
        // 1+2+3+4 even
        // 1+2+3+4+5 EITHER
        // 1+2+3+4+5+6 odd
        // 1+2+3+4+5+6+7 EITHER
        // 1+2+3+4+5+6+7+8 even
        // 1+2+3+4+5+6+7+8+9 EITHER
        // 1+2+3+4+5+6+7+8+9+10 odd
        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 9) return "Either";
        if (n == 2 || n == 6 || n == 10) return "Odd";
        return "Even";
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Mjehuric {
    
    public static void main(String[] args) {
        System.out.println(bubbleSort(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String bubbleSort(int[] arr) {
        StringBuilder sb = new StringBuilder();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) 
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sorted = false;
                    sb.append(java.util.Arrays.toString(arr).replaceAll("[\\[\\],]", "")).append("\n");
                }
        }
        return sb.toString().trim();        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class LeftBeehind {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = sc.getInt(), y = sc.getInt();
            if (x == 0 && y == 0) {
                break;
            } else if (x + y == 13) {
                sb.append("Never speak again.");
            } else if (x > y) {
                sb.append("To the convention.");
            } else if (y > x) {
                sb.append("Left beehind.");
            } else {
                sb.append("Undecided.");
            }
            sb.append("\n");
        } 
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HelpAPhDCandidateOut {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            String s = sc.getWord();
            if (s.contains("+")) {
                int tots = 0;
                int[] tmp = java.util.Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).toArray();
                for (int i = 0; i < tmp.length; i++)
                    tots += tmp[i];
                sb.append(tots);
            } else sb.append("skipped");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class JewelryBox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(String.format("%.10f", findMaxVol(sc.getInt(), sc.getInt()))).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

    static double findMaxVol(int x, int y) {
        double firstRoot = rootPos(x, y);
        double secondRoot = rootNeg(x, y);
        if (determineMax(x, y, firstRoot)) {
            return findVolume(x, y, firstRoot);
        }
        return findVolume(x, y, secondRoot);
    }

    static double findVolume(int x, int y, double h) {
        return (x - (2 * h)) * (y - (2 * h)) * h;
    }

    static boolean determineMax(int x, int y, double root) {
        return 4 * ((6 * root) - (double) x - (double) y) < 0;
    }

    static double rootPos(int x, int y) {
        int a = 12, b = -4 * (x + y), c = x * y;
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    static double rootNeg(int x, int y) {
        int a = 12, b = -4 * (x + y), c = x * y;
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BoatParts {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), n = sc.getInt();
        Set<String> set = new HashSet<>();
        int days = 0;
        for (int i = 1; i <= n; i++) {
            set.add(sc.getWord());
            if (set.size() == p && days == 0) {
                days = i;
            }
        }
        System.out.println(days == 0 ? "paradox avoided" : days);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Eligibility {
    
    public static void main(String[] args) throws Exception {
        Kattio sc = new Kattio(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        Date first = dateFormat.parse("2009/12/31");
        Date second = dateFormat.parse("1990/12/31");
        while (n-- > 0) {
            String name = sc.getWord(), start = sc.getWord(), birth = sc.getWord();
            int courses = sc.getInt();
            Date startDate = dateFormat.parse(start);
            Date birthDate = dateFormat.parse(birth);      
            sb.append(name).append(" ");
            if (startDate.after(first) || birthDate.after(second)) {
                sb.append("eligible");
            } else if (courses > 40) {
                sb.append("ineligible");
            } else {
                sb.append("coach petitions");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class BaconEggsAndSpam {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            
            HashMap<String, ArrayList<String>> hmap = new HashMap<>();
            Set<String> tmpfoodlist = new HashSet<>();
            ArrayList<String> namelist = new ArrayList<>();
            while (n-- > 0) {
                String[] tmp = sc.nextLine().split("\\s+");
                ArrayList<String> work = new ArrayList<>();
                for (int i = 1; i < tmp.length; i++)
                    work.add(tmp[i]);
                String name = tmp[0];
                namelist.add(name);
                hmap.put(name, work); 
                for (String s : work)
                    tmpfoodlist.add(s);
            }
            Collections.sort(namelist);
            ArrayList<String> foodlist = new ArrayList<>(tmpfoodlist);
            Collections.sort(foodlist);
            for (String food : foodlist) {
                sb.append(food).append(" ");
                for (String name : namelist) {
                    if (hmap.get(name).contains(food)) sb.append(name).append(" ");
                }
                sb.append("\n");
            }

            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EbAltoSaxophonePlayer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        char[][] notes = new char[][] {
            //    1   2   3   4   5   6   7   8   9   10
            {'c','0','1','1','1','0','0','1','1','1','1'},
            {'d','0','1','1','1','0','0','1','1','1','0'},
            {'e','0','1','1','1','0','0','1','1','0','0'},
            {'f','0','1','1','1','0','0','1','0','0','0'},
            {'g','0','1','1','1','0','0','0','0','0','0'},
            {'a','0','1','1','0','0','0','0','0','0','0'},
            {'b','0','1','0','0','0','0','0','0','0','0'},
            {'C','0','0','1','0','0','0','0','0','0','0'},
            {'D','1','1','1','1','0','0','1','1','1','0'},
            {'E','1','1','1','1','0','0','1','1','0','0'},
            {'F','1','1','1','1','0','0','1','0','0','0'},
            {'G','1','1','1','1','0','0','0','0','0','0'},
            {'A','1','1','1','0','0','0','0','0','0','0'},
            {'B','1','1','0','0','0','0','0','0','0','0'}
        };
        while (n-- > 0) {
            String s = sc.nextLine();
            int[] fingers = new int[11];
            if (s.length() != 0) {
                char[] arr = s.toCharArray();
                char[] prev = new char[11];
                Arrays.fill(prev, '0');
                for (char c : arr)
                    for (char[] note : notes)
                        if (note[0] == c) {
                            for (int i = 1; i < 11; i++)
                                if (prev[i] == '0' && note[i] == '1')
                                    fingers[i]++;
                            prev = note;
                            break;
                        }         
            }
            sb.append(Arrays.toString(fingers).replaceAll("[\\]\\[,]","").substring(2));
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }    

}

///////////////////////////////////////////////////////////////////////////////

class Soylent {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt(), y = x / 400;
            if (y * 400 < x) y++;    
            sb.append(y).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FallingApart {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = -1 * sc.getInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            arr[i] *= -1;
        int a = 0, b = 0;
        for (int i = 0; i < n; i++)
            if (i % 2 == 0) {
                a += arr[i];
            } else b += arr[i];
        System.out.printf("%d %d\n", a, b);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Shopaholic {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getLong();
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Long x, Long y) {
                return x < y ? 1 : x > y ? -1 : 0;
            }
        });
        Long dis = 0L;
        int lim = (n / 3) * 3;
        for (int i = 0; i < lim; i += 3)
            dis += arr[i + 2];
        System.out.println(dis);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BabylonianNumbers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            String[] arr = sc.getWord().replaceAll(",", ", ").split(",");
            long val = 0;
            long mult = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i].equals(" ")) arr[i] = "0";
                val += Long.parseLong(arr[i].trim()) * mult;
                mult *= 60;
            }
            sb.append(val).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ASCIIAddition {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        HashMap<Integer, String> hmap2 = new HashMap<>();
        String zero = "xxxxxx...xx...xx...xx...xx...xxxxxx";
        String one = "....x....x....x....x....x....x....x";
        String two = "xxxxx....x....xxxxxxx....x....xxxxx";
        String three = "xxxxx....x....xxxxxx....x....xxxxxx";
        String four = "x...xx...xx...xxxxxx....x....x....x";
        String five = "xxxxxx....x....xxxxx....x....xxxxxx";
        String six = "xxxxxx....x....xxxxxx...xx...xxxxxx";
        String seven = "xxxxx....x....x....x....x....x....x";
        String eight = "xxxxxx...xx...xxxxxxx...xx...xxxxxx";
        String nine = "xxxxxx...xx...xxxxxx....x....xxxxxx";
        String plus = ".......x....x..xxxxx..x....x.......";
        hmap.put(zero, 0);
        hmap.put(one, 1);
        hmap.put(two, 2);
        hmap.put(three, 3);
        hmap.put(four, 4);
        hmap.put(five, 5);
        hmap.put(six, 6);
        hmap.put(seven, 7);
        hmap.put(eight, 8);
        hmap.put(nine, 9);
        hmap.put(plus, -1);
        
        hmap2.put(0, zero);
        hmap2.put(1, one);
        hmap2.put(2, two);
        hmap2.put(3, three);
        hmap2.put(4, four);
        hmap2.put(5, five);
        hmap2.put(6, six);
        hmap2.put(7, seven);
        hmap2.put(8, eight);
        hmap2.put(9, nine);
        hmap2.put(-1, plus);

        char[][] arr = new char[7][];
        String s = "";
        for (int i = 0; i < 7; i++)
            arr[i] = sc.getWord().toCharArray();
        for (int i = 0; i < arr[0].length; i += 5) {
            if (i != 0) i++;
            String tmp = "";
            for (int j = 0; j < 7; j++) {
                tmp += arr[j][i];
                tmp += arr[j][i + 1];
                tmp += arr[j][i + 2];
                tmp += arr[j][i + 3];
                tmp += arr[j][i + 4];
            }
            s += hmap.get(tmp);
        }
        String sum = String.valueOf(Arrays.stream(s.split("-1")).mapToInt(Integer::parseInt).sum());

        String[] print = new String[] {"", "", "", "", "", "", ""};
        for (char c : sum.toCharArray()) {
            String p = hmap2.get(Character.getNumericValue(c));
            print[0] += p.substring(0, 5) + ".";
            print[1] += p.substring(5, 10) + ".";
            print[2] += p.substring(10, 15) + ".";
            print[3] += p.substring(15, 20) + ".";
            print[4] += p.substring(20, 25) + ".";
            print[5] += p.substring(25, 30) + ".";
            print[6] += p.substring(30, 35) + ".";
        }
        
        for (String a : print) 
            System.out.println(a.substring(0, a.length() - 1));
        sc.close();     
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Alphabet {
    
    public static void main(String[] args) {
        char[] original = new java.util.Scanner(System.in).nextLine().toCharArray();
        char[] target = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(26 - lcs(original, target, original.length, target.length));
    }

    // Longest common subsequence, i couldnt achieve the recursive soln
    static int lcs(char[] one, char[] two, int lenone, int lentwo) {
        int[][] mtx = new int[lenone + 1][lentwo + 1];
        for (int i = 1; i < lenone + 1; i++) {
            for (int j = 1; j < lentwo + 1; j++) {
                if (one[i - 1] == two[j - 1]) {
                    mtx[i][j] = 1 + mtx[i - 1][j - 1];
                } else {
                    mtx[i][j] = Math.max(mtx[i - 1][j], mtx[i][j - 1]);
                }
            }
        }
        return mtx[lenone][lentwo];
    }
    
}


///////////////////////////////////////////////////////////////////////////////

class RunLengthEncodingRun {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String letter = sc.getWord(), phrase = sc.getWord(), output = "";
        char[] arr = phrase.toCharArray();
        if (letter.equals("E")) {            
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    count++;
                    i++;
                } 
                output += arr[i] + "" + count;
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                int x = Character.getNumericValue(arr[i + 1]);
                for (int j = 0; j < x; j++) 
                    output += arr[i];
            }
        }
        System.out.println(output);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class JustAMinute {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        double totalm = 0, totals = 0, average = 0;
        for (int i = 0; i < n; i++) {
            double m = sc.getDouble(), s = sc.getDouble();
            totalm += m * 60;
            totals += s;
        }
        System.out.println((average = totals / totalm) <= 1.0 ? "measurement error" : String.format("%.10f", average));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HeirsDilemma {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        System.out.println(check(sc.getInt(), sc.getInt()));
        sc.close();
    }

    static int check(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int x = i;
            boolean[] different = new boolean[10];
            boolean fail = false;
            while (x > 0) {
                int digit = x % 10;
                if (different[digit] || digit == 0 || i % digit != 0) {
                    fail = true;
                    break;
                }
                different[digit] = true;
                x /= 10;
            }
            if (!fail) count++;

        }
        return count;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Volim {
    
    // It doesnt read it on the values cause i break it off halfway
    // kattis accepts this so yeh
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int k = sc.getInt(), n = sc.getInt(), timeElapsed = 0;
        final int limit = (60 * 3) + 30, playertotal = 8;
        while (n-- > 0) {
            int t = sc.getInt();
            String w = sc.getWord();
            timeElapsed += t;
            if (timeElapsed >= limit) break;
            if (w.equals("T")) k++;
        }
        System.out.println((k % playertotal) == 0 ? 8 : (k % playertotal));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Veci {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine()));
    }

    static int foo(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int org = Integer.parseInt(s);
        permute(list, s, 0, s.length() - 1);
        Collections.sort(list);
        for (Integer i : list)
            if (i > org) return i;
        return 0;
    }

    static void permute(ArrayList<Integer> list, String s, int l, int r) {
        if (l == r) {
            list.add(Integer.parseInt(s));
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(list, s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    static String swap(String s, int i, int j) {
        char tmp = 0;
        char[] arr = s.toCharArray();
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return String.valueOf(arr);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PizzaCrust {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static double foo(int[] arr) {
        int r = arr[0], c = arr[1];
        return (Math.pow(r - c, 2) / Math.pow(r, 2)) * 100;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HalfACookie {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Kattio sc = new Kattio(System.in);
        while (sc.hasMoreTokens()) {
            double r = sc.getDouble(), x = sc.getDouble(), y = sc.getDouble();
            double hammerDistFromOrigin = pythagorasHypotenuse(x, y);
            if (hammerDistFromOrigin < r) {
                double cookie_whole = circleArea(r);
                double chord = 2 * pythagorasSide(r, hammerDistFromOrigin);
                double triangle_area = triangleArea(chord, hammerDistFromOrigin);
                double theta = angleBetweenLengths(r, hammerDistFromOrigin);
                double sector = (theta / (2 * Math.PI)) * cookie_whole;
                double segment1 = sector - triangle_area;
                double segment2 = cookie_whole - segment1;
                sb.append(String.format("%.6f", segment2)).append(" ").append(String.format("%.6f", segment1));
            } else {
                sb.append("miss");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }

    static double angleBetweenLengths(double radius, double height) {
        return Math.acos(height / radius) * 2;
    }

    static double triangleArea(double base, double height) {
        return (1/2.0) * height * base;
    }

    static double pythagorasSide(double hypotenuse, double other) {
        return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(other, 2));
    }

    static double pythagorasHypotenuse(double other1, double other2) {
        return Math.sqrt(Math.pow(other1, 2) + Math.pow(other2, 2));
    }

    static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ReverseRot {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        char[] target = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            char[] arr = sc.getWord().toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                int c = 0;
                if (arr[i] == '_') {
                    c = (26 + n) % 28;
                } else if (arr[i] == '.') {
                    c = (27 + n) % 28;
                } else {
                    c = ((arr[i] - 65) + n) % 28;
                }                
                sb.append(target[c]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}


///////////////////////////////////////////////////////////////////////////////

class SavingForRetirement {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bobAge = arr[0];
        int bobRetire = arr[1];
        int bobSave = arr[2];
        int bobMoney = (bobRetire - bobAge) * bobSave;
        int aliceAge = arr[3];
        int aliceRetire = aliceAge;
        int aliceSave = arr[4];
        int aliceMoney = 0;
        while (aliceMoney <= bobMoney) 
            aliceMoney = (++aliceRetire - aliceAge) * aliceSave; 
        System.out.println(aliceRetire);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Statistics {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int caseCount = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + caseCount++ + ": ");
            ArrayList<Integer> list = new ArrayList<>();
            int n = sc.getInt();
            while (n-- > 0)
                list.add(sc.getInt());
            int max = Collections.max(list);
            int min = Collections.min(list);
            int range = max - min;
            sb.append(min).append(" ").append(max).append(" ").append(range).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MosquitoMultiplication {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int m = sc.getInt(), p = sc.getInt(), l = sc.getInt(), e = sc.getInt(), r = sc.getInt(), s = sc.getInt(), n = sc.getInt();
            while (n-- > 0) {
                int tmpM = p / s; // pupae that survived become mosquitos :(
                int tmpP = l / r; // larvae that survived become pupae :/
                int tmpL = m * e; // mosquito all give birth to one egg each :|
                m = tmpM;
                p = tmpP;
                l = tmpL;
            }
            sb.append(m);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FridayThe13th {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        // 1 Sun
        // 2 Mon
        // 3 Tues
        // 4 Wed
        // 5 Thurs
        // 6 Fri
        // 7 Sat
        // 8 Sun
        // 9 Mon
        // 10 Tues
        // 11 Wed
        // 12 Thurs
        // 13 Fri
        // 14 Sat
        while (t-- > 0) {
            int d = sc.getInt(), m = sc.getInt(), elapsed = 13, count = 0;
            while (m -- > 0) {
                int days = sc.getInt();
                if (days >= 13 && elapsed % 7 == 6) count++;
                elapsed += days;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AnotherBrickInTheWall {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int h = sc.getInt(), w = sc.getInt(), n = sc.getInt(), currw = 0;
        boolean completed = false;
        while (n-- > 0) {
            int brick = sc.getInt();
            currw += brick;
            if (currw > w || completed) {
                break;
            } else if (currw == w) {
                currw = 0;
                h--;
            } 
            if (h == 0 && currw == 0) {
                completed = true;
            }
        }
        System.out.println(completed ? "YES" : "NO");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ThreeDPrintedStatues {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static int foo(int n) {
        if (n == 1) return 1;
        int printer = 1, days = 1;
        while (printer < n) {
            printer *= 2;
            days++;
        }
        return days;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AmalgamatedArtichokes {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray()));
    }

    static double foo(double[] arr) {
        double p = arr[0], a = arr[1], b = arr[2], c = arr[3], d = arr[4], n = arr[5];
        double max_decline = 0.0;
        double max_price = priceFormula(p, a, b, c, d, 1);        
        for (int i = 2; i <= n; i++) {
            double next_max_price = priceFormula(p, a, b, c, d, i);        
            max_decline = Math.max(max_decline, max_price - next_max_price);
            max_price = Math.max(max_price, next_max_price);
        }
        return max_decline;
    }

    static double priceFormula(double p, double a, double b, double c, double d, double n) {
        return p * ( Math.sin((a * n) + b) + Math.cos((c * n) + d) + 2 );
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TheOwlAndTheFox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int org = sc.getInt();
            int sum = sumOfDigits(org);
            if (sum == 1) {
                sb.append(0);
            } else {
                sum -= 1;
                int i = org - 1;
                for (; i >= 0; i--) 
                    if (sumOfDigits(i) == sum) break; 
                sb.append(i);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
    static int sumOfDigits(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (char c : s.toCharArray()) 
            sum += c - '0';
        return sum;
    }

    // public static void main(String[] args) {
    //     Kattio sc = new Kattio(System.in);
    //     StringBuilder sb = new StringBuilder();
    //     int n = sc.getInt();
    //     while (n-- > 0) {
    //         int org = sc.getInt();
    //         int sum = sumOfDigits(org);
    //         sum -= 1;
    //         int i = org - 1;
    //         for (; i >= 0; i--) 
    //             if (sumOfDigits(i) == sum) break; 
    //         sb.append(i).append("\n");
    //     }
    //     System.out.println(sb.toString());
    //     sc.close();
    // }
    
    // static HashMap<Integer, Integer> sumMap = new HashMap<>();

    // static int sumOfDigits(int n) {
    //     if (sumMap.containsKey(n)) return sumMap.get(n);
    //     if (n < 10) return n;
    //     int sum = (n % 10) + sumOfDigits(n / 10);
    //     sumMap.put(n, sum);
    //     return sum;
    // }

}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class ThisAintYourGrandpasCheckerboard {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            board[i] = sc.getWord().toCharArray();
        }
        System.out.println(rowColCheck(board) && threeCheck(board) ? 1 : 0);
        sc.close();
    }

    static boolean rowColCheck(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            int rb = 0, rw = 0, cb = 0, cw = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'B') rb++;
                else rw++;
                if (board[j][i] == 'B') cb++;
                else cw++;
            }
            if (rb != rw || cb != cw) return false;
        }
        return true;
    }

    static boolean threeCheck(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = 0; j < n - 3; j++) {
                if ((board[i][j] == 'B' && board[i + 1][j] == 'B' && board[i + 2][j] == 'B') 
                    || (board[i][j] == 'W' && board[i + 1][j] == 'W' && board[i + 2][j] == 'W')
                    || (board[i][j] == 'B' && board[i][j + 1] == 'B' && board[i][j + 2] == 'B')
                    || (board[i][j] == 'W' && board[i][j + 1] == 'W' && board[i][j + 2] == 'W')) return false;
            }
        }
        return true;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PervasiveHeartMonitor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[a-zA-Z]+");
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            String name = "";
            double total = 0;
            int count = 0;
            for (String s : arr) {
                Matcher m = p.matcher(s);
                if (m.matches()) {
                    name += s + " ";
                } else {
                    total += Double.parseDouble(s);
                    count++;
                }
            }
            sb.append(String.format("%.6f", total / count)).append(" ").append(name.trim()).append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CompoundWords {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        List<String> original = new ArrayList<>();
        Set<String> collect = new HashSet<>();        
        while (sc.hasMoreTokens()) {
            original.add(sc.getWord());
        }
        for (int i = 0; i < original.size(); i++) {
            for (int j = 0; j < original.size(); j++) {
                if (i != j) collect.add(original.get(i) + original.get(j));
            }
        }
        List<String> output = new ArrayList<>(collect);
        Collections.sort(output);
        for (String s : output)
            System.out.println(s);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ExactlyElectrical {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int startx = sc.getInt(), starty = sc.getInt();
        int endx = sc.getInt(), endy = sc.getInt();
        int charge = sc.getInt();
        int mindist = Math.abs(startx - endx) + Math.abs(starty - endy);
        String out = "";
        
        // 1. Charge needs to be 0
        // 2. Additionally, if the distance is lesser and its difference to the charge is mod 2 == 0
        // Why mod 2 is because assuming the vehicle reached its destination, if its mod 2, it can do
        // a stupid move up and down to drain its battery to get to 0
        if (mindist <= charge && (charge - mindist) % 2 == 0) {
            out = "Y";
        } else {
            out = "N";
        }
        
        System.out.println(out);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AnthonyAndDiablo {
    
    public static void main(String[] args) {
        double[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+"))
                            .mapToDouble(Double::parseDouble)
                            .toArray();
        double A = arr[0];
        double N = arr[1];
        double r = N / (2 * Math.PI); // Let n be the circumferance of circle
        double a = Math.PI * r * r;
        if (a >= A) {
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class UnlockPattern {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                arr[i][j] = sc.getInt();            
        int steps = 1;
        double dist = 0;
        while (steps < 9) {
            int currx = 0, curry = 0, nextx = 0, nexty = 0;
            for (int i = 0; i < 3; i++) 
                for (int j = 0; j < 3; j++) 
                    if (arr[i][j] == steps) {
                        currx = i;
                        curry = j;
                    } else if (arr[i][j] == steps + 1) {
                        nextx = i;
                        nexty = j;
                    }
            if (currx == nextx) {
                dist += Math.abs(curry - nexty);
            } else if (curry == nexty) {
                dist += Math.abs(currx - nextx);
            } else {
                dist += euclidean(currx, curry, nextx, nexty);
            }
            steps++;
        }
        System.out.println(dist);
        sc.close();
    }

    static double euclidean(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class UnbearableZoo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0, i = 1;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            sb.append("List " + i++ + ":").append("\n");
            ArrayList<String> animalList = new ArrayList<>();
            while (n-- > 0) {
                String[] animal = sc.nextLine().split("\\s+");
                animalList.add(animal[animal.length - 1].toLowerCase());
            }
            Collections.sort(animalList);
            String curr = animalList.get(0);
            int count = 1;
            for (int j = 1; j < animalList.size(); j++) {
                if (animalList.get(j).equals(curr)) {
                    count++;
                } else {
                    sb.append(curr);
                    sb.append(" | ");
                    sb.append(count);
                    sb.append("\n");
                    curr = animalList.get(j);
                    count = 1;
                }
            }
            sb.append(curr);
            sb.append(" | ");
            sb.append(count);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Ostgotska {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine().split("\\s+")));
    }

    static String foo(String[] input) {
        double count = 0;
        for (int i = 0; i < input.length; i++)
            if (input[i].contains("ae")) count++;
        return count / input.length >= 0.4 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska";
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Karte {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLine().toCharArray()));
    }

    static String foo(char[] input) {
        int p = 13, k = 13, h = 13, t = 13;
        for (int i = 0; i < input.length; i += 3) {
            if (input[i] == 'P') p--;
            else if (input[i] == 'K') k--;
            else if (input[i] == 'H') h--;
            else if (input[i] == 'T') t--;
            for (int j = i + 3; j < input.length; j += 3) {
                if ((input[i] + "" + input[i + 1] + "" + input[i + 2]).equals(input[j] + "" + input[j + 1] + "" + input[j + 2]))
                        return "GRESKA";
            }
        }
        return p + " " + k + " " + h + " " + t;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Kafkaesque {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int prev = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int curr = sc.getInt();
            if (prev > curr) count++;
            prev = curr;
        }
        System.out.println(count);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HotHike {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int start = arr.length - 1 - 2;
        int end = 0;
        int best = 0;
        int max = Integer.MAX_VALUE;
        for (int i = start; i >= end; i--) {
            int b = Math.max(arr[i], arr[i + 2]);
            if (b <= max) {
                max = b;
                best = i;
            }            
        }
        System.out.printf("%d %d", best + 1, max);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AToweringProblem {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] boxes = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            boxes[i] = arr[i];
            sum += arr[i];
        }
        java.util.Arrays.sort(boxes);    
        int h1 = arr[6], h2 = arr[7];
        int i = 0, j = 0, k = 0;
        boolean pass = false;
        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 5; j++) {
                for (k = j + 1; k < 6; k++) {
                    if (boxes[i] + boxes[j] + boxes[k] == h1) {
                        pass = true;
                        break;
                    }
                }
                if (pass) break;                    
            }                
            if (pass) break;
        }
        for (int l = 5; l >= 0; l--)
            if (l == i || l == j || l == k) System.out.print(boxes[l] + " ");
        for (int l = 5; l >= 0; l--)
            if (l != i && l != j && l != k) System.out.print(boxes[l] + " ");

    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Tetration {
    
    public static void main(String[] args) {
        System.out.println(String.format("%.6f", foo(Double.parseDouble(new java.util.Scanner(System.in).nextLine()))));
    }

    static double foo(double N) {
        // Tetrating a number a by 5 is just a^a^a^a^a
        // In this case we want to find a powered to infinity
        // NOTE: we are given N, NOT a. basically the result
        // 1. a^infinity = N
        // 2. a^(a^infinity) = N
        // We sub 1 into 2,
        // a^N = N
        // a^(N * 1/N) = N^(1/N)
        // a = N^(1/N)
        return Math.pow(N, 1/N);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ASCIIFigureRotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = Integer.parseInt(sc.nextLine())) != 0) {
            String[] drawing = new String[n];
            int maxlen = 0;
            for (int i = 0; i < n; i++) {
                drawing[i] = sc.nextLine();
                if (drawing[i].length() > maxlen) 
                    maxlen = drawing[i].length();
            }
            for (int j = 0; j < maxlen; j++) {
                String s = "";
                for (int i = drawing.length - 1; i >= 0; i--) {
                    if (j > drawing[i].length() - 1) {
                        s += ' ';
                    } else {
                        s += swap(drawing[i].charAt(j));
                    }
                }    
                sb.append(removeTrailingWhites(s)).append("\n");    
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2));
        sc.close();
    }

    static String removeTrailingWhites(String s) {
        int i = s.length() - 1;
        while (s.charAt(i) == 0 || s.charAt(i) == ' ') i--;
        return s.substring(0, i + 1);
    }

    static char swap(char c) {
        if (c == '-') return '|';
        if (c == '|') return '-';
        return c;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EraseSecurely {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String o = sc.getWord();
        String d = sc.getWord();
        boolean success = false;
        if (n % 2 == 0) {
            success = o.equals(d);
        } else {
            String tmp = "";
            for (char c : o.toCharArray())
                tmp += c == '1' ? '0' : '1';
            success = tmp.equals(d);
        }
        System.out.println(success ? "Deletion succeeded" : "Deletion failed");
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class MoscowDream {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), n = sc.getInt();
        String ans = "NO";
        if (a != 0 && b != 0 && c != 0 && a + b + c >= n && n >= 3) ans = "YES";
        System.out.println(ans);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FlyingSafely {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int cases = sc.getInt();
        while (cases-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            
            while (m-- > 0) {
                sc.getInt();
                sc.getInt();
            }
                
            sb.append(n - 1);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Sok {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        double a = sc.getDouble(), b = sc.getDouble(), c = sc.getDouble();
        double i = sc.getDouble(), j = sc.getDouble(), k = sc.getDouble();

        double limiter = a / i;
        if (limiter > b / j) limiter = b / j;
        if (limiter > c / k) limiter = c / k;

        a -= limiter * i;
        b -= limiter * j;
        c -= limiter * k;

        System.out.printf("%.6f %.6f %.6f", a, b, c);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MirrorImages {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int t = 1; t <= n; t++) {
            int r = sc.getInt(), c = sc.getInt();
            char[][] matrix = new char[r][c];
            for (int i = 0; i < r; i++) 
                matrix[i] = sc.getWord().toCharArray();
            
            // Left to right
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c / 2; j++) {
                    char tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][c - 1 - j];
                    matrix[i][c - 1 - j] = tmp;
                }
            }

            // Top to bottom
            for (int i = 0; i < r / 2; i++) {
                for (int j = 0; j < c; j++) {
                    char tmp = matrix[i][j];
                    matrix[i][j] = matrix[r - 1 - i][j];
                    matrix[r - 1 - i][j] = tmp;
                }
            }   

            sb.append("Test " + t).append("\n");
            for (int i = 0; i < r; i++)
                sb.append(new String(matrix[i])).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DasBlinkenlights {
    
    public static void main(String[] args) {
        int[] pqs = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(lcm(pqs[0], pqs[1]) <= pqs[2] ? "yes" : "no" );
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        // No need abs as time is positive
        return (a * b) / gcd(a, b);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FlexibleSpaces {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int w = sc.getInt(), p = sc.getInt();
        int[] partitions = new int[p];
        boolean[] width = new boolean[w + 1];
        width[w] = true;
        for (int i = 0; i < p; i++)
            partitions[i] = sc.getInt();
        for (int i = 0; i < p; i++) {
            width[partitions[i]] = true;
            width[w - partitions[i]] = true;
            for (int j = i + 1; j < p; j++) 
                width[partitions[j] - partitions[i]] = true;
        }
        for (int i = 1; i < w + 1; i++)
            if (width[i]) System.out.print(i + " ");
        sc.close();   
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Howl {
    
    public static void main(String[] args) {
        // System.out.println(new java.util.Scanner(System.in).nextLine() + "O"); // 0.35
        // System.out.println(new Kattio(System.in).getWord() + "O"); // 0.22
        // System.out.println(new Kattio(System.in).getWord().concat("O")); // 0.20
        System.out.println(new String(new Kattio(System.in).getWord()).concat("O")); // 0.19
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SumOfTheOthers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            int target = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                int sum = 0;
                target = arr[i];
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) sum += arr[j];
                }
                if (sum == target) break;
            }
            System.out.println(target);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Heliocentric {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int i = 1;
        while (sc.hasMoreTokens()) {
            int earth = sc.getInt(), mars = sc.getInt();
            int count = 0;
            while (earth % 365 != 0 || mars % 687 != 0) {
                earth++;
                mars++;
                count++;
            }
            System.out.printf("Case %d: %d\n", i++, count);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EpigDanceOff {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++)
            arr[i] = sc.getWord().toCharArray();
        
        int moves = 0;
        for (int i = 0; i < c; i++) {
            int dollar = 0, under = 0;
            for (int j = 0; j < r; j++) {
                if (arr[j][i] == '$') {
                    dollar++;
                } else under++;
            }
            if (under == r) moves++;
            if (i == c - 1 && dollar > 0) moves++;
        }
        System.out.println(moves);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Egypt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            int a = 1, b = 2, c = 0;    
            if (arr[0] > arr[1] && arr[0] > arr[2]) {
                c = arr[0];
                a = arr[1];
                b = arr[2];
            } else if (arr[1] > arr[0] && arr[1] > arr[2]) {
                c = arr[1];
                a = arr[0];
                b = arr[2];
            } else if (arr[2] > arr[0] && arr[2] > arr[1]) {
                c = arr[2];
                a = arr[0];
                b = arr[1];
            }
            boolean right = c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            sb.append(right ? "right" : "wrong");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class MusicalNotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] arr = filterString(sc.nextLine());
        
        char[][] sheet = new char[14][arr.length];
        fillSheet(sheet, arr.length);
        for (int i = 0; i < arr.length; i++) 
            if (Character.isAlphabetic(arr[i]))
                sheet[foo(arr[i])][i] = '*';
        for (int i = 0; i < sheet.length; i++) 
            System.out.printf("%s: %s\n", bar(i), new String(sheet[i]));
        sc.close();
    }

    static char[] filterString(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && Character.isAlphabetic(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) {
                int lim = Character.getNumericValue(s.charAt(i + 1));
                for (int j = 0; j < lim; j++) 
                    out += s.charAt(i);
            } else if (!Character.isDigit(s.charAt(i))) {
                out += s.charAt(i);
            }
        }
        return out.toCharArray();
    }

    static void fillSheet(char[][] sheet, int n) {
        char[] line = "-".repeat(n).toCharArray();
        char[] space = " ".repeat(n).toCharArray();
        sheet[1] = Arrays.copyOf(line, n); 
        sheet[3] = Arrays.copyOf(line, n); 
        sheet[5] = Arrays.copyOf(line, n); 
        sheet[7] = Arrays.copyOf(line, n);  
        sheet[9] = Arrays.copyOf(line, n); 
        sheet[13] = Arrays.copyOf(line, n);  
        sheet[0] = Arrays.copyOf(space, n);
        sheet[2] = Arrays.copyOf(space, n);
        sheet[4] = Arrays.copyOf(space, n);
        sheet[6] = Arrays.copyOf(space, n);
        sheet[8] = Arrays.copyOf(space, n);
        sheet[10] = Arrays.copyOf(space, n);
        sheet[11] = Arrays.copyOf(space, n);
        sheet[12] = Arrays.copyOf(space, n);
    }

    static String bar(int i) {
        switch(i) {
            case 0: return "G";
            case 1: return "F";
            case 2: return "E";
            case 3: return "D";
            case 4: return "C";
            case 5: return "B";
            case 6: return "A";
            case 7: return "g";
            case 8: return "f";
            case 9: return "e";
            case 10: return "d";
            case 11: return "c";
            case 12: return "b";
            case 13: return "a";
            default: return "";
        }
    }

    static int foo(char c) {
        switch(c) {
            case 'G': return 0;
            case 'F': return 1;
            case 'E': return 2;                                                 
            case 'D': return 3;
            case 'C': return 4;                                                          
            case 'B': return 5;
            case 'A': return 6;                                                          
            case 'g': return 7;
            case 'f': return 8;                                                           
            case 'e': return 9;
            case 'd': return 10;                                                           
            case 'c': return 11;                                                           
            case 'b': return 12;                                                           
            case 'a': return 13;
            default: return -1;
        }
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HeightOrdering {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            ArrayList<Integer> students = new ArrayList<>();
            students.add(sc.getInt());
            int steps = 0;
            for (int j = 0; j < 19; j++) {
                int x = sc.getInt();
                int k = students.size() - 1;
                for (; k >= 0; k--) 
                    if (x > students.get(k)) break;
                steps += students.size() - ++k;
                students.add(k, x);
            }
            sb.append(i).append(" ").append(steps).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ToLower {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), t = sc.getInt();
        int correct = 0;
        while (p-- > 0) {
            int localCorrect = 0;
            for (int i = 0; i < t; i++) {
                boolean pass = true;
                String s = sc.getWord();
                for (int j = 1; j < s.length(); j++)
                    if (Character.isUpperCase(s.charAt(j))) {
                        pass = false;
                        break;
                    }
                if (pass) localCorrect++;
            }
            if (localCorrect == t) correct++;
        }
        System.out.println(correct);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Oktalni {
    
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        while (s.length() % 3 != 0) 
            s = "0".concat(s);
        for (int i = 0; i < s.length(); i += 3) 
            sb.append(map(s.substring(i, i + 3)));
        System.out.println(sb.toString());
    }

    static char map(String s) {
        switch(s) {
            case "000" : return '0';
            case "001" : return '1';
            case "010" : return '2';
            case "011" : return '3';
            case "100" : return '4';
            case "101" : return '5';
            case "110" : return '6';
            case "111" : return '7';
            default: return ' ';
        }
    }    
}

///////////////////////////////////////////////////////////////////////////////

class PaulEigon {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int total = arr[1] + arr[2];
        int turn = total / arr[0];
        System.out.println(turn % 2 == 0 ? "paul" : "opponent");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HittingTheTargets {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.getInt();
        TargetShape[] arr = new TargetShape[m];
        for (int i = 0; i < m; i++) {
            String s = sc.getWord();
            if (s.equals("rectangle")) {
                arr[i] = new TargetRectangle(new TargetPoint(sc.getDouble(), sc.getDouble()), new TargetPoint(sc.getDouble(), sc.getDouble()));
            } else {
                arr[i] = new TargetCircle(new TargetPoint(sc.getDouble(), sc.getDouble()), sc.getDouble());
            }
        }

        int n = sc.getInt();
        while (n-- > 0) {
            TargetPoint p = new TargetPoint(sc.getDouble(), sc.getDouble());
            int count = 0;
            for (TargetShape ts : arr)
                if (ts.isInside(p)) count++;
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

interface TargetShape {
    boolean isInside(TargetPoint o);
}

class TargetPoint {
    private final double x;
    private final double y;

    public TargetPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(TargetPoint o) {
        return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2));
    }

    public boolean xBetween(TargetPoint p1, TargetPoint p3) {
        return p1.x <= this.x && this.x <= p3.x;
    }

    public boolean yBetween(TargetPoint p1, TargetPoint p3) {
        return p1.y <= this.y && this.y <= p3.y;
    }

}

class TargetRectangle implements TargetShape {
    private final TargetPoint bottoml;   
    private final TargetPoint topr;   

    public TargetRectangle(TargetPoint bottoml, TargetPoint topr) {
        this.bottoml = bottoml;
        this.topr = topr;
    }

    @Override
    public boolean isInside(TargetPoint o) {
        return o.xBetween(this.bottoml, this.topr) && o.yBetween(this.bottoml, this.topr);
    }

}

class TargetCircle implements TargetShape {
    private final TargetPoint centre;
    private final double radius;

    public TargetCircle(TargetPoint centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public boolean isInside(TargetPoint o) {
        return this.centre.distanceTo(o) <= radius;
    }

}

///////////////////////////////////////////////////////////////////////////////

class A1Paper {
    
    static final double A2LongEdge = Math.pow(2, -3.0 / 4);
    static final double A2ShortEdge = Math.pow(2, -5.0 / 4);

    public static void main(String[] args) {
        // Taping by the longedge is the best method
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        long[] papers = new long[n - 1];
        for (int i = 0; i < n - 1; i++)
            papers[i] = sc.getLong();
        
        double tapeCount = 0;
        long paperCount = 1; // Start from 1 as we represent 1 A2 paper

        double constructLongEdge = A2LongEdge;
        double constructShortEdge = A2ShortEdge;

        for (int i = 0; i < n - 1 && paperCount > 0; i++) {
            // 3. Tape length of long edges
            tapeCount += paperCount * constructLongEdge;

            // 1. The amount of paper required for that size to get an A1
            paperCount *= 2;
            paperCount -= papers[i];

            // 2. Go to next paper size
            double tmp = constructLongEdge;
            constructLongEdge = constructShortEdge;
            constructShortEdge = tmp / 2;

        }

        System.out.println(paperCount > 0 ? "impossible" : tapeCount);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SimonSays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            if (s.startsWith("simon says ")) sb.append(s.substring(11, s.length()));
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BlackFriday {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] players = new int[n];
        int[] distinct = new int[7];
        for (int i = 0; i < n; i++) {
            int x = sc.getInt();
            players[i] = x;
            distinct[x]++;
        }
        int unique = -1;
        for (int i = 6; i > 0; i--) 
            if (distinct[i] == 1) {
                unique = i;
                break;
            }
        if (unique == -1) {
            System.out.println("none");    
        } else {
            for (int i = 0; i < n; i++)
                if (players[i] == unique) {
                    unique = i + 1;
                    break;
                }
            System.out.println(unique);
        }
        sc.close();        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ToiletSeat {
    
    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int up = 0, down = 0, like = 0;

        for (int i = 2; i < arr.length; i++) 
            if (arr[i] == 'D') up+= 2;
        if (arr[0] == 'D') {
            up += 1;
        } 
        if (arr[0] == 'U' && arr[1] == 'D') {
            up += 2;
        }

        for (int i = 2; i < arr.length; i++) 
            if (arr[i] == 'U') down+= 2;
        if (arr[0] == 'U') {
            down += 1;
        } 
        if (arr[0] == 'D' && arr[1] == 'U') {
            down += 2;
        }

        char curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (curr != arr[i]) like++;
            curr = arr[i];
        }

        System.out.printf("%d\n%d\n%d\n", up, down, like);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class NumbersOnATree {
    
    public static void main(String[] args) {

        // class Node {
        //     final int value;
        //     Node left;
        //     Node right;

        //     Node(int value) {
        //         this.value = value;
        //         this.left = null;
        //         this.right = null;
        //     }
        // }

        // class Tree {
        //     void insert(Node node, int value) {
        //         if (value < node.value) {
        //             if (node.left == null) {
        //                 node.left = new Node(value);
        //             } else {
        //                 insert(node.left, value);
        //             }
        //         } else if (value > node.value) {
        //             if (node.right == null) {
        //                 node.right = new Node(value);
        //             } else {
        //                 insert(node.right, value);
        //             }
        //         }
        //     }
        // }

        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        int rootVal = 0;
        int ans = 0;
        int height = Integer.parseInt(arr[0]);
        for (int i = 0; i <= height; i++)
            rootVal += Math.pow(2, i);

        if (arr.length == 1) {
            ans = rootVal;
        } else {
            int len = arr[1].length();
            int pow = 1;
            for (int i = 0; i < len; i++)
                if (arr[1].charAt(i) == 'L') {
                    rootVal -= pow;
                    pow *= 2;                    
                } else {
                    rootVal -= pow + 1;
                    pow *= 2;
                    pow++; // children on the right side will be smaller by 1 as compared to left
                }
            ans = rootVal;
            // Node root = new Node(rootVal);
            // Tree tree = new Tree();
            // for (int i = root.value; i > 0; i--)
            //     tree.insert(root, i);
        }
        System.out.println(ans);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SimpleAddition {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        BigInteger a = new BigInteger(sc.getWord());
        BigInteger b = new BigInteger(sc.getWord());
        System.out.println(a.add(b).toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SidewaysSorting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        Comparator<String> com = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        };
        StringBuilder sb = new StringBuilder();
        int r = 0, c = 0;
        while ((r = sc.getInt()) != 0 && (c = sc.getInt()) != 0) {
            char[][] arr = new char[r][c];
            for (int i = 0; i < r; i++)
                arr[i] = sc.getWord().toCharArray();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < c; i++) {
                String s = "";
                for (int j = 0; j < r; j++)  {
                    s += arr[j][i];
                }     
                list.add(s);
            }
            Collections.sort(list, com);
            arr = new char[c][r];
            for (int i = 0; i < c; i++)
                arr[i] = list.get(i).toCharArray();

            for (int i = 0; i < r; i++) {
                String s = "";
                for (int j = 0; j < c; j++)  {
                    s += arr[j][i];
                }     
                sb.append(s);
                sb.append("\n");
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class KittenOnATree {
    
    public static void main(String[] args) {

        class Node {
            int value;
            List<Integer> branches = new ArrayList<>();

            Node(int value) {
                this.value = value;
            }

            void addBranch(int i) {
                this.branches.add(i);
            }

            boolean searchBranch(int i) {
                return this.branches.contains(i);
            }          

        }

        Scanner sc = new Scanner(System.in);
        int kitten = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();        
        ArrayList<Node> al = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.length() == 2 && Integer.parseInt(s) == -1) break;
            int[] arr = Arrays.stream(s.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Node n = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++)
                n.addBranch(arr[i]);
            al.add(n);
        }
        while (true) {
            int next = -1;
            sb.append(kitten).append(" ");
            for (Node n : al) {
                if (n.searchBranch(kitten)) {
                    next = n.value;
                    break;
                }
            }
            if (next == -1) break;
            kitten = next;
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ScalingRecipes {
    
    public static void main(String[] args) {

        class Ingredient {
            String name;
            double weight;
            double percentage;

            public Ingredient(String name, double weight, double percentage) {
                this.name = name;
                this.weight = weight;
                this.percentage = percentage;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        for (int i = 1; i <= t; i++) {
            sb.append("Recipe # " + i).append("\n");
            int r = sc.getInt(), p = sc.getInt(), d = sc.getInt();
            Ingredient[] ingredients = new Ingredient[r];
            double scalingFactor = ((double) d) / p;
            double scalingWeight = 0;
            for (int j = 0; j < r; j++) {
                ingredients[j] = new Ingredient(sc.getWord(), sc.getDouble(), sc.getDouble());
                if (ingredients[j].percentage == 100.0) scalingWeight = scalingFactor * ingredients[j].weight;
            }

            for (int j = 0; j < r; j++) {
                Ingredient in = ingredients[j];
                sb.append(in.name).append(" ").append((Math.round(in.percentage * scalingWeight / 10) / 10.0)).append("\n");
            }

            sb.append("----------------------------------------").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BossBattle {
    
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        // 1 1
        // 2 1
        // 3 1
        // 4 2
        // 5 3
        // 6 4
        // 7 5
        System.out.println(n <= 3 ? 1 : n - 2);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Vauvau {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), d = sc.getInt();
        int p = sc.getInt(), m = sc.getInt(), g = sc.getInt();
        int cycle1 = a + b, cycle2 = c + d;
        System.out.printf("%s\n%s\n%s\n", 
                            getAttack(p, cycle1, cycle2, a, c),
                            getAttack(m, cycle1, cycle2, a, c),
                            getAttack(g, cycle1, cycle2, a, c));
        sc.close();
    }

    static String getAttack(int person, int cycle1, int cycle2, int a, int c) {
        int p1 = 0;
        int c1 = person % cycle1;
        int c2 = person % cycle2;
        if (c1 > 0 && c1 <= a) p1++;
        if (c2 > 0 && c2 <= c) p1++;

        String print = "";
        if (p1 == 0) {
            print = "none";
        } else if (p1 == 1) {
            print = "one";
        } else {
            print = "both";
        }

        return print;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CountingClauses {
    
    public static void main(String[] args) {
        System.out.println(new java.util.Scanner(System.in).nextInt() < 8 ? "unsatisfactory" : "satisfactory");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EenyMeeny {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> kids = new ArrayList<>();
        ArrayList<String> teamA = new ArrayList<>();
        ArrayList<String> teamB = new ArrayList<>();
        int ro = sc.nextLine().split("\\s+").length - 1; 
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
            kids.add(sc.nextLine());
        int prevPos = 0;
        for (int i = 0; i < n; i++)
            prevPos = addToTeam(prevPos, ro, kids, i % 2 == 0 ? teamA : teamB);
        print(teamA);
        print(teamB);
        sc.close();
    }

    static void print(ArrayList<String> team) {
        System.out.println(team.size());        
        for (String s : team)
            System.out.println(s);
    }

    static int addToTeam(int prevPos, int ro, ArrayList<String> kids, ArrayList<String> team) {
        int i = (prevPos + ro) % kids.size();
        team.add(kids.remove(i));
        return i;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PachydermPeanutPacking {
    
    public static void main(String[] args) {
        class Point {

            final double x, y;

            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
            
        }
        
        class Box {

            final Point bottomLeft;
            final Point topRight;
            final String type;

            Box(Point bottomLeft, Point topRight, String type) {
                this.bottomLeft = bottomLeft;
                this.topRight = topRight;
                this.type = type;
            }

            boolean isInside(Point p) {
                return bottomLeft.x <= p.x && p.x <= topRight.x 
                        && bottomLeft.y <= p.y && p.y <= topRight.y; 
            }

            boolean isCorrectType(String type) {
                return this.type.equals(type);
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while ((n = sc.getInt()) != 0) {
            Box[] boxes = new Box[n];
            for (int i = 0; i < n; i++)
                boxes[i] = new Box(new Point(sc.getDouble(), sc.getDouble()), 
                                    new Point(sc.getDouble(), sc.getDouble()), 
                                    sc.getWord());
            int m = sc.getInt();
            while (m-- > 0) {
                Point p = new Point(sc.getDouble(), sc.getDouble());
                String type = sc.getWord();
                String pos = "";
                for (int i = 0; i < n; i++) {
                    if (boxes[i].isInside(p)) {
                        if (boxes[i].isCorrectType(type)) {
                            pos = "correct";
                        } else {
                            pos = boxes[i].type;
                        }
                        break;
                    }
                }
                sb.append(type);
                sb.append(" "); 
                sb.append(pos.equals("") ? "floor" : pos);
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class NineKnights {
    
    static final int BOARD_LENGTH = 5;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        for (int i = 0; i < BOARD_LENGTH; i++)
            board[i] = sc.getWord().toCharArray();
        System.out.println(check(board) ? "valid" : "invalid");
        sc.close();
    }

    static boolean check(char[][] board) {
        int knights = 0;
        for (int i = 0; i < BOARD_LENGTH; i++) 
            for (int j = 0; j < BOARD_LENGTH; j++) 
                if (isKnight(board, i, j)) {
                    knights++;
                    if (!valid(board, i, j)) return false;
                }
        return knights == 9;
    }

    static boolean valid(char[][] board, int i, int j) {

        if (inBoard(i - 1, j - 2) && isKnight(board, i - 1, j - 2)) return false;
        if (inBoard(i + 1, j - 2) && isKnight(board, i + 1, j - 2)) return false;
        if (inBoard(i - 2, j - 1) && isKnight(board, i - 2, j - 1)) return false;
        if (inBoard(i + 2, j - 1) && isKnight(board, i + 2, j - 1)) return false;
        
        if (inBoard(i - 1, j + 2) && isKnight(board, i - 1, j + 2)) return false;
        if (inBoard(i + 1, j + 2) && isKnight(board, i + 1, j + 2)) return false;
        if (inBoard(i - 2, j + 1) && isKnight(board, i - 2, j + 1)) return false;
        if (inBoard(i + 2, j + 1) && isKnight(board, i + 2, j + 1)) return false;

        return true;
    }

    static boolean isKnight(char[][] board, int i, int j) {
        return board[i][j] == 'k';   
    }
    
    static boolean inBoard(int i, int j) {
        return 0 <= i && i < BOARD_LENGTH && 0 <= j && j < BOARD_LENGTH;
    }

}

///////////////////////////////////////////////////////////////////////////////

class SortOfSorting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(0) == s2.charAt(0)) {
                    if (s1.charAt(1) == s2.charAt(1)) {
                        return 0;
                    }
                    return s1.charAt(1) - s2.charAt(1);
                }
                return s1.charAt(0) - s2.charAt(0);
            }
        };
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            ArrayList<String> al = new ArrayList<>();
            while (n-- > 0) 
                al.add(sc.getWord());
            Collections.sort(al, c);
            for (String s : al)
                sb.append(s).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Krizaljka {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        String a = arr[0], b = arr[1];
        int alen = a.length(), blen = b.length();
        int aind = -1, bind = -1;
        for (int i = 0; i < alen; i++)
            if (b.contains(String.valueOf(a.charAt(i)))) {
                aind = i;
                bind = b.indexOf(a.charAt(i));
                break;
            }
        for (int j = 0; j < blen; j++) {
            for (int i = 0; i < alen; i++) {
                if (i == aind) {
                    System.out.print(b.charAt(j));
                } else if (j == bind) {
                    System.out.print(a.charAt(i));
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GrandpaBernie {
    // 0.65.. how to be faster?
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, ArrayList<Integer>> hmap = new HashMap<>();
        int n = sc.getInt();
        while (n-- > 0) {
            String country = sc.getWord();
            int year = sc.getInt();
            
            if (hmap.containsKey(country)) {
                hmap.get(country).add(year);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(year);
                hmap.put(country, al);
            }
        }
        int q = sc.getInt();
        Set<String> spoken = new HashSet<>();
        while (q-- > 0) {
            String country = sc.getWord();
            int count = sc.getInt() - 1;
            if (!spoken.contains(country)) 
                Collections.sort(hmap.get(country));    
            sb.append(hmap.get(country).get(count));
            sb.append("\n");
            spoken.add(country);
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AlphabetAnimals {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String first = sc.getWord();
        String answer = "";
        char last = first.charAt(first.length() - 1);
        int n = sc.getInt();
        String[] animals = new String[n];
        for (int i = 0; i < n; i++)
            animals[i] = sc.getWord();
        boolean pass = false, win = false;
        for (int i = 0; i < n; i++) {
            if (last == animals[i].charAt(0)) {
                boolean pass2 = true;
                char newLast = animals[i].charAt(animals[i].length() - 1);
                for (int j = 0; j < n; j++) {
                    if (newLast == animals[j].charAt(0) && i != j) {
                        pass2 = false;
                        break;
                    }
                }
                if (pass2) {
                    pass = true;
                    win = true;
                    answer = animals[i];
                } else if (!pass) {
                    pass = true;
                    answer = animals[i];
                }
            }
            if (win) break;
        }
        if (pass) {
            if (win) {
                System.out.println(answer + "!");
            } else {
                System.out.println(answer);
            } 
        } else {
            System.out.println("?");
        }
        sc.close(); 
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Beehives {
    
    public static void main(String[] args) {

        class Hive {    
            double x, y;

            Hive(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Hive h) {
                return Math.sqrt(Math.pow(this.y - h.y, 2) + Math.pow(this.x - h.x, 2));
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        double d = 0.0;
        int n = 0;
        while ((d = sc.getDouble()) != 0.0 && (n = sc.getInt()) != 0) {
            Hive[] hives = new Hive[n];
            int sour = 0, sweet = 0;
            for (int i = 0; i < n; i++)
                hives[i] = new Hive(sc.getDouble(), sc.getDouble());
            for (int i = 0; i < n; i++) {
                boolean sourFlag = false;
                for (int j = 0; j < n; j++) {
                    if (i != j && hives[i].distanceTo(hives[j]) <= d) {
                        sourFlag = true;
                        break;
                    }
                }
                if (sourFlag) {
                    sour++;
                } else {
                    sweet++;
                }
            }
            sb.append(sour).append(" sour, ").append(sweet).append(" sweet").append("\n");
        } 
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CookingWater {
    
    public static void main(String[] args) {
        // Edward: "A watched pot never boils", 
        // The moment he looks away, anytime between a and b, the
        // water can start to boil.
        // We know for sure it is boiling at b.
        // find intersection between each boiling process
        // if all the boiling proccesses intersect, gunilla has a point
        // if not edward is right

        // if the latest A point is later than the earliest B point
        // it shows that edward is right as the water still has
        // not started boiling even after some other B's timing!
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        int maxA = sc.getInt(), minB = sc.getInt();
        while (n-- > 0) {
            maxA = Math.max(maxA, sc.getInt());
            minB = Math.min(minB, sc.getInt());
        }
        System.out.println(maxA - minB > 0 ? "edward is right" : "gunilla has a point"); 
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PrintingCosts {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hmap = new HashMap<>();
        setMap(hmap);
        while (sc.hasNextLine()) {
            char[] arr = sc.nextLine().toCharArray();
            int x = 0;
            for (char c : arr)
                x += hmap.get(c);
            sb.append(x).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void setMap(HashMap<Character, Integer> hmap) {
        hmap.put(' ', 0);
        hmap.put('!', 9);
        hmap.put('"', 6);
        hmap.put('#', 24);
        hmap.put('$', 29);
        hmap.put('%', 22);
        hmap.put('&', 24);
        hmap.put('\'', 3);
        hmap.put('(', 12);
        hmap.put(')', 12);
        hmap.put('*', 17);
        hmap.put('+', 13);
        hmap.put(',', 7);
        hmap.put('-', 7);
        hmap.put('.', 4);
        hmap.put('/', 10);
        hmap.put('0', 22);
        hmap.put('1', 19);
        hmap.put('2', 22);
        hmap.put('3', 23);
        hmap.put('4', 21);
        hmap.put('5', 27);
        hmap.put('6', 26);
        hmap.put('7', 16);
        hmap.put('8', 23);
        hmap.put('9', 26);
        hmap.put(':', 8);
        hmap.put(';', 11);
        hmap.put('<', 10);
        hmap.put('=', 14);
        hmap.put('>', 10);
        hmap.put('?', 15);
        hmap.put('@', 32);
        hmap.put('A', 24);
        hmap.put('B', 29);
        hmap.put('C', 20);
        hmap.put('D', 26);
        hmap.put('E', 26);
        hmap.put('F', 20);
        hmap.put('G', 25);
        hmap.put('H', 25);
        hmap.put('I', 18);
        hmap.put('J', 18);
        hmap.put('K', 21);
        hmap.put('L', 16);
        hmap.put('M', 28);
        hmap.put('N', 25);
        hmap.put('O', 26);
        hmap.put('P', 23);
        hmap.put('Q', 31);
        hmap.put('R', 28);
        hmap.put('S', 25);
        hmap.put('T', 16);
        hmap.put('U', 23);
        hmap.put('V', 19);
        hmap.put('W', 26);
        hmap.put('X', 18);
        hmap.put('Y', 14);
        hmap.put('Z', 22);
        hmap.put('[', 18);
        hmap.put('\\', 10);
        hmap.put(']', 18);
        hmap.put('^', 7);
        hmap.put('_', 8);
        hmap.put('`', 3);
        hmap.put('a', 23);
        hmap.put('b', 25);
        hmap.put('c', 17);
        hmap.put('d', 25);
        hmap.put('e', 23);
        hmap.put('f', 18);
        hmap.put('g', 30);
        hmap.put('h', 21);
        hmap.put('i', 15);
        hmap.put('j', 20);
        hmap.put('k', 21);
        hmap.put('l', 16);
        hmap.put('m', 22);
        hmap.put('n', 18);
        hmap.put('o', 20);
        hmap.put('p', 25);
        hmap.put('q', 25);
        hmap.put('r', 13);
        hmap.put('s', 21);
        hmap.put('t', 17);
        hmap.put('u', 17);
        hmap.put('v', 13);
        hmap.put('w', 19);
        hmap.put('x', 13);
        hmap.put('y', 24);
        hmap.put('z', 19);
        hmap.put('{', 18);
        hmap.put('|', 12);
        hmap.put('}', 18);
        hmap.put('~', 9);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Mia {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p11 = 0, p12 = 0, p21 = 0, p22 = 0;
        while ((p11 = sc.getInt()) != 0 && (p12 = sc.getInt()) != 0 
                && (p21 = sc.getInt()) != 0 && (p22 = sc.getInt()) != 0) {
                    int player1 = calculate(p11, p12);
                    int player2 = calculate(p21, p22);

                    if (player1 == player2) {
                        sb.append("Tie.");
                    } else if (player1 > player2) {
                        sb.append("Player 1 wins.");
                    } else {
                        sb.append("Player 2 wins.");
                    }
                    sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
        
    }

    static int calculate(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        if (a == 2 && b == 1) return a * b * 123456;

        if (a == b) return ((a * 10) + b) * 1000;

        return (a * 10) + b;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AnotherCandies {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();           
        while (t-- > 0) {
            long n = sc.getLong();
            BigInteger nBig = BigInteger.valueOf(n);
            BigInteger total = BigInteger.ZERO;

            for (int i = 0; i < n; i++)
                total = total.add(BigInteger.valueOf(sc.getLong()));

            sb.append(total.mod(nBig).equals(BigInteger.ZERO) ? "YES" : "NO").append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Backspace {
    
    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int sblen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                sb.deleteCharAt(--sblen);
            } else {
                sb.append(arr[i]);
                sblen++;
            }
        }
        System.out.println(sb.toString());            
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FerryLoading3 {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        while (c-- > 0) {
            int capacity = sc.getInt(), travel = sc.getInt(), cars = sc.getInt();
            ArrayDeque<Integer> leftBank = new ArrayDeque<>();
            ArrayDeque<Integer> rightBank = new ArrayDeque<>();
            int[] carArr = new int[cars];
            for (int i = 0; i < cars; i++) {
                int arrival = sc.getInt();
                String bank = sc.getWord();
                if (bank.equals("left")) {
                    leftBank.add(arrival); 
                    leftBank.add(i);
                } else {
                    rightBank.add(arrival);
                    rightBank.add(i);
                }
                
            }

            int currTime = 0;
            boolean left = true;
            while (!leftBank.isEmpty() || !rightBank.isEmpty()) {
                int leftFirst = leftBank.isEmpty() ? Integer.MAX_VALUE : leftBank.peek();
                int rightFirst = rightBank.isEmpty() ? Integer.MAX_VALUE : rightBank.peek();
                int currCap = 0;
                if (left && leftFirst <= currTime) {
                    while (!leftBank.isEmpty() && leftBank.peek() <= currTime && currCap < capacity) {
                        leftBank.poll();
                        carArr[leftBank.poll()] = currTime + travel;
                        currCap++;
                    }     
                    left = !left;
                    currTime += travel;
                } else if (!left && rightFirst <= currTime) {
                    while (!rightBank.isEmpty() && rightBank.peek() <= currTime && currCap < capacity) {
                        rightBank.poll();                
                        carArr[rightBank.poll()] = currTime + travel;        
                        currCap++;
                    }
                    left = !left;
                    currTime += travel;
                } else if (leftFirst < rightFirst) {
                    currTime = currTime < leftFirst ? leftFirst : currTime;
                    if (!left) {
                        left = !left;
                        currTime += travel;
                    }
                } else if (rightFirst < leftFirst) {
                    currTime = currTime < rightFirst ? rightFirst : currTime;
                    if (left) {
                        left = !left;
                        currTime += travel;
                    }
                } else {
                    currTime = currTime < leftFirst ? leftFirst : currTime;
                } 
            }
            for (int i : carArr)
                sb.append(i).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Preludes {
    
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("A#", "Bb");
        hmap.put("Bb", "A#");
        hmap.put("C#", "Db");
        hmap.put("Db", "C#");
        hmap.put("D#", "Eb");
        hmap.put("Eb", "D#");
        hmap.put("F#", "Gb");
        hmap.put("Gb", "F#");
        hmap.put("G#", "Ab");
        hmap.put("Ab", "G#");
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + i++ + ": ");
            String key = sc.getWord(), tonality = sc.getWord();
            if (hmap.containsKey(key)) {
                sb.append(hmap.get(key));
                sb.append(" ");
                sb.append(tonality);
            } else {
                sb.append("UNIQUE");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EngineeringEnglish {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) sb.append(" ");
                String s = arr[i];
                if (set.contains(s.toLowerCase())) {
                    sb.append(".");
                } else {
                    sb.append(s);
                    set.add(s.toLowerCase());
                }
            }            
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WhichBaseIsItAnyway {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            int dec = sc.getInt();
            sb.append(i)
                .append(" ").append(getOctal(dec))
                .append(" ").append(dec)
                .append(" ").append(getHexa(dec))
                .append("\n");            
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int getOctal(int n) {
        int pow = 0, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 7) return 0;
            sum += digit * Math.pow(8, pow++);
            n /= 10;
        }
        return sum;
    }

    static int getHexa(int n) {
        int pow = 0, sum = 0;
        while (n > 0) {
            sum += (n % 10) * Math.pow(16, pow++);
            n /= 10;
        }
        return sum;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ParadoxWithAverages {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int ncs = sc.getInt(), ne = sc.getInt(), funny = 0;
            int[] cs = new int[ncs];
            double csaverage = 0, etotal = 0, eaverage = 0;
            for (int i = 0; i < ncs; i++)
                csaverage += cs[i] = sc.getInt();
            for (int i = 0; i < ne; i++)
                etotal += sc.getInt();
            csaverage /= ncs;
            eaverage = etotal / ne;
            for (int i = 0; i < ncs; i++) {
                double csTmp = ((csaverage * ncs) - cs[i]) / (ncs - 1);
                double eaTmp = (etotal + cs[i]) / (ne + 1);
                if (csTmp > csaverage && eaTmp > eaverage) funny++;
            }
            sb.append(funny).append("\n");
        }  
        System.out.print(sb.toString());
        sc.close();
    }
    
    
}

///////////////////////////////////////////////////////////////////////////////

class Parket {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String foo(int[] arr) {
        int r = arr[0], b = arr[1], total = r + b;
        int i = 3;
        for (; i < total; i++) {
            if (total % i == 0 
                && ((total / i) - 2) * (i - 2) == b) break;
        }
        return (int) Math.max(i, total / i) + " " + (int) Math.min(i, total / i);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ClimbingWorm {
    
    public static void main(String[] args) {
        System.out.println(
            foo(
                java.util.Arrays.stream(
                    new java.util.Scanner(System.in)
                        .nextLine()
                        .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray()));
    }

    static int foo(int[] arr) {
        int a = arr[0], b = arr[1], h = arr[2], c = 0;
        while (h > 0) {
            c++;
            h -= a;
            if (h <= 0) break;
            h += b;
        }
        return c;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FerryLoading4 {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        while (c-- > 0) {
            int l = sc.getInt() * 100, m = sc.getInt();
            ArrayDeque<Integer> leftBank = new ArrayDeque<>();
            ArrayDeque<Integer> rightBank = new ArrayDeque<>();
            while (m-- > 0) {
                int len = sc.getInt();
                String bank = sc.getWord();
                if (bank.equals("left")) {
                    leftBank.add(len);
                } else rightBank.add(len);
            }
            int moves = 0;
            boolean left = true;
            while (!leftBank.isEmpty() || !rightBank.isEmpty()) {
                int tmpl = l;
                if (left) {
                    while (!leftBank.isEmpty() && tmpl - leftBank.peek() > 0) {
                        tmpl -= leftBank.poll();
                    }
                } else {
                    while (!rightBank.isEmpty() && tmpl - rightBank.peek() > 0) {
                        tmpl -= rightBank.poll();
                    }
                }
                left = !left;
                moves++;
            }
            sb.append(moves).append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RaggedRight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while (sc.hasNextLine()) 
            al.add(sc.nextLine().length());
        int max = Collections.max(al);
        int sum = 0;
        for (int i = 0; i < al.size() - 1; i++)
            sum += Math.pow(max - al.get(i), 2);
        System.out.println(sum);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Server {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), t = sc.getInt(), c = 0;
        while (n-- > 0) {
            int x = sc.getInt();
            t-= x;
            if (t < 0) {
                break;
            } else c++;
        }
        System.out.println(c);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TemperatureConfusion {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0], d = arr[1];
        // F = (9/5) * C + 32
        // C = (5/9)(F - 32)
        // C = (5/9)F - (5/9)32
        // C = (5/9)F - (160/9)
        // C = (5/9)(n/d) - (160/9)
        // C = (5n/9d) - (160d/9d)
        // C = (5n - 160d)/(9d);
        int newn = (5 * n) - (160 * d);
        int newd = 9 * d;
        int g = gcd(newn, newd);
        newn /= g;
        newd /= g;
        if (newd < 0) {
            newn *= -1;
            newd *= -1;
        }
        System.out.printf("%d/%d\n", newn, newd);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Splat {
    
    public static void main(String[] args) {

        class Point {
            double x,y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            }
        }

        class Circle {
            double radius;
            Point centre;
            String color;

            Circle(double volume, Point centre, String color) {
                this.radius = Math.sqrt(volume / Math.PI);
                this.centre = centre;
                this.color = color;
            }

            boolean isInside(Point p) {
                return this.centre.distanceTo(p) <= this.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        int c = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (c-- > 0) {
            int n = sc.getInt();
            Circle[] colors = new Circle[n];
            for (int i = 0; i < n; i++) {
                Point p = new Point(sc.getDouble(), sc.getDouble());
                double volume = sc.getDouble();
                String color = sc.getWord();
                colors[i] = new Circle(volume, p, color);
            }
            int m = sc.getInt();
            while (m-- > 0) {
                String ans = "";
                Point p = new Point(sc.getDouble(), sc.getDouble());
                for (Circle drop : colors)
                    if (drop.isInside(p)) ans = drop.color;
                sb.append(ans.equals("") ? "white" : ans);
                sb.append("\n");
            }
        }
        System.out.print(sb.toString().trim());
        sc.close();        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SavingDaylight {
    
    public static void main(String[] args) throws Exception {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        while (sc.hasMoreTokens()) {
            String month = sc.getWord(), day = sc.getWord(), year = sc.getWord();
            Calendar start = Calendar.getInstance(), end = Calendar.getInstance();;
            start.setTime(sdf.parse(sc.getWord())); 
            end.setTime(sdf.parse(sc.getWord())); 
            int hours = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
            int mins = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
            if (mins < 0) {
                hours--;
                mins += 60;
            }
            sb.append(month).append(" ");
            sb.append(day).append(" ");
            sb.append(year).append(" ");
            sb.append(hours).append(" hours ");
            sb.append(mins).append(" minutes");
            sb.append("\n");
        }       
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HiddenPassword {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        char[] p = arr[0].toCharArray();
        char[] s = arr[1].toCharArray();
        ArrayList<Character> plist = new ArrayList<>();
        ArrayList<Character> slist = new ArrayList<>();
        for (char c : p)
            plist.add(c);
        for (char c : s)
            slist.add(c);
        char curr = plist.get(0);
        for (char c : slist) {
            if (curr == c) {
                plist.remove(0);
                if (plist.size() == 0) break;
                curr = plist.get(0);
            } else if (plist.size() > 0 && plist.contains(c)) {
                break;
            }
        }
        System.out.println(plist.size() == 0 ? "PASS" : "FAIL");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Bus {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int k = sc.getInt(), p = 1;
            while (k-- > 0) {
                p += .5;
                p *= 2;
            }
            p--;
            sb.append(p).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CompletingTheSquare {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

        }

        Kattio sc = new Kattio(System.in);
        Point a = new Point(sc.getInt(), sc.getInt());
        Point b = new Point(sc.getInt(), sc.getInt());
        Point c = new Point(sc.getInt(), sc.getInt());
        Point ans = new Point(0, 0);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        if (ab == bc) {
            ans.x = a.x + c.x - b.x;
            ans.y = a.y + c.y - b.y;
        } else if (bc == ca) {
            ans.x = b.x + a.x - c.x;
            ans.y = b.y + a.y - c.y;
        } else if (ca == ab) {
            ans.x = c.x + b.x - a.x;
            ans.y = c.y + b.y - a.y;
        }
        System.out.printf("%d %d\n", ans.x, ans.y);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Conformity {
    
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), limit = 5, max = 0, count = 0;
        HashMap<Long, Integer> hmap = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int[] arr = new int[limit];
            long l = 0L;
            for (int i = 0; i < limit; i++)
                arr[i] = sc.getInt();
            Arrays.sort(arr);
            for (int i = 0; i < limit; i++)
                l += arr[i] * Math.pow(100, i);
            hmap.put(l, hmap.containsKey(l) ? hmap.get(l) + 1 : 1);
        }
        for (Entry<Long, Integer> e : hmap.entrySet())
            max = Math.max(max, e.getValue());
        for (Entry<Long, Integer> e : hmap.entrySet())
            if (e.getValue() == max) count += e.getValue();
        System.out.println(count);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CoconutSplat {
    
    public static void main(String[] args) {

        class Player {
            int index;
            int strikes;

            Player(int index) {
                this.index = index;
                this.strikes = 0;
            }

            Player(int index, int strikes) {
                this.index = index;
                this.strikes = strikes;
            }
        }

        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int syllabus = arr[0], playerCount = arr[1];
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 1; i <= playerCount; i++)
            players.add(new Player(i));
        int i = 0;
        while (players.size() > 1) {
            i = (i + syllabus - 1) % players.size();
            if (players.get(i).strikes == 0) {
                players.get(i).strikes = 1;
                players.add(i + 1, new Player(players.get(i).index, 1));
            } else if (players.get(i).strikes == 1) {
                players.get(i).strikes = 2;
                i++;
            } else {
                players.remove(i);
            }
        }
        System.out.println(players.get(0).index);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Peragrams {
    
    public static void main(String[] args) {
        char[] word = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] letters = new int[26];
        int count = 0;
        for (char c : word)
            letters[c - 'a']++;
        for (int i = 0; i < 26; i++)
            if (letters[i] % 2 == 1) count++;
        // If there are more than needed, then minus because u need to remove
        // the other "redundant" ones minimally
        if (word.length % 2 == 0) { // odd words, one count of char to be odd
            if (count > 1) count--;
        } else {
            if (count > 0) count--; // even words, all chars even num
        }
        System.out.println(count);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BrokenSwords {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[] slats = new int[4];
        int n = sc.getInt();
        while (n-- > 0) {
            char[] arr = sc.getWord().toCharArray();
            for (int i = 0; i < 4; i++)
                if (arr[i] == '0') slats[i]++;
        }
        int tb = slats[0] + slats[1];
        int lr = slats[2] + slats[3];
        int made = tb > lr ? lr / 2 : tb / 2;
        lr -= made * 2;
        tb -= made * 2;
        System.out.printf("%d %d %d\n", made, tb, lr);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ARationalSequence3 {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int target = sc.getInt();
            int[] foo = new int[] {0, 1};
            bar(target, foo);
            sb.append(foo[0] + "/" + foo[1]);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void bar(int n, int[] foo) {
        if (n > 0) bar(n / 2, foo);
        // left child = p numerator / (p numerator + p denominator)
        // right child = (p numerator + p denominator) / p denominator  
        if (n % 2 == 0) { // left child
            foo[1] += foo[0];
        } else { // right child
            foo[0] += foo[1];
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class Timebomb {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        String zero = "*****\n*   *\n*****";
        String one = "     \n     \n*****";
        String two = "* ***\n* * *\n*** *";
        String three = "* * *\n* * *\n*****";
        String four = "***  \n  *  \n*****";
        String five = "*** *\n* * *\n* ***";
        String six = "*****\n* * *\n* ***";
        String seven = "*    \n*    \n*****";
        String eight = "*****\n* * *\n*****";
        String nine = "*** *\n* * *\n*****";
        Scanner sc = new Scanner(System.in);
        hmap.put(zero, 0);
        hmap.put(one, 1);
        hmap.put(two, 2);
        hmap.put(three, 3);
        hmap.put(four, 4);
        hmap.put(five, 5);
        hmap.put(six, 6);
        hmap.put(seven, 7);
        hmap.put(eight, 8);
        hmap.put(nine, 9);
        int r = 5, sum = 0;
        char[][] arr = new char[r][];
        for (int i = 0; i < r; i++)
            arr[i] = sc.nextLine().toCharArray();
        for (int j = 0; j < arr[0].length; j += 4) {
            String s = "";
            for (int i = 0; i < r; i++) 
                s += arr[i][j];
            s += "\n";
            for (int i = 0; i < r; i++) 
                s += arr[i][j + 1];
            s += "\n";
            for (int i = 0; i < r; i++) 
                s += arr[i][j + 2];
            if (hmap.containsKey(s)) {
                sum *= 10;
                sum += hmap.get(s);
            } else {
                sum = 1;
                break;
            }
        }
        System.out.println(sum % 6 == 0 ? "BEER!!" : "BOOM!!");
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WheresMyInternet {
    
    public static void main(String[] args) {

        class Node {
            int value;
            ArrayList<Integer> children;
            Node(int value) {
                this.value = value;
                this.children = new ArrayList<>();
            }
        }
        
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.getInt(), m = sc.getInt();
        
        ArrayList<Node> nodes = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        nodes.add(new Node(0)); // space filler
        for (int i = 1; i <= n; i++) // Instantiate houses
            nodes.add(new Node(i));

        while (m-- > 0) { // Read in connections
            int head = sc.getInt(), tail = sc.getInt();
            nodes.get(head).children.add(tail);
            nodes.get(tail).children.add(head);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(); // Breath first search
        queue.offer(1);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int c : nodes.get(curr).children) 
                if (!visited[c]) {
                    visited[c] = true;
                    queue.offer(c);
                }
        }

        for (int i = 2; i < n + 1; i++) // check print
            if (!visited[i]) sb.append(i).append("\n");

        System.out.println(sb.length() == 0 ? "Connected" : sb.toString().trim());
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ImperialMeasurement {
    
    public static void main(String[] args) {
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        System.out.println(thouToAnything(anythingToThou(Double.parseDouble(arr[0]), arr[1]), arr[3]));
    }

    static double anythingToThou(double x, String s) {
        switch(s) {
            case "th": case "thou": return x * 1;
            case "in": case "inch": return x * (1 * 1000);
            case "ft": case "foot": return x * (1 * 1000 * 12);
            case "yd": case "yard": return x * (1 * 1000 * 12 * 3);
            case "ch": case "chain": return x * (1 * 1000 * 12 * 3 * 22);
            case "fur": case "furlong": return x * (1 * 1000 * 12 * 3 * 22 * 10);
            case "mi": case "mile": return x * (1 * 1000 * 12 * 3 * 22 * 10 * 8);
            case "lea": case "league": return x * (1 * 1000 * 12 * 3 * 22 * 10 * 8 * 3);
            default: return 0;
        }
    }

    static double thouToAnything(double x, String s) {
        switch(s) {
            case "th": case "thou": return x / 1;
            case "in": case "inch": return x / (1 * 1000);
            case "ft": case "foot": return x / (1 * 1000 * 12);
            case "yd": case "yard": return x / (1 * 1000 * 12 * 3);
            case "ch": case "chain": return x / (1 * 1000 * 12 * 3 * 22);
            case "fur": case "furlong": return x / (1 * 1000 * 12 * 3 * 22 * 10);
            case "mi": case "mile": return x / (1 * 1000 * 12 * 3 * 22 * 10 * 8);
            case "lea": case "league": return x / (1 * 1000 * 12 * 3 * 22 * 10 * 8 * 3);
            default: return 0;
        }
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ZipfsSong {
    
    public static void main(String[] args) {

        // 0.65s
        class Song implements Comparable<Song> {
            
            String title;
            int pos;
            long quality;

            Song(long timesPlayed, int i, String title) {
                this.title = title;
                this.pos = i;
                this.quality = -1 * i * timesPlayed;
            }

            @Override
            public int compareTo(Song s) {
                if (this.quality == s.quality) {
                    return this.pos - s.pos;
                }
                return Long.valueOf(this.quality).compareTo(Long.valueOf(s.quality));
            }

            @Override
            public String toString() {
                return this.title;
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        ArrayList<Song> album = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
            album.add(new Song(sc.getLong(), i, sc.getWord()));
        Collections.sort(album);
        for (int i = 0; i < m; i++)
            System.out.println(album.get(i));
        sc.close();

        // not working :(
        // class Song implements Comparable<Song> {

        //     int index;
        //     Long quality;

        //     Song(int index, long timesPlayed) {
        //         this.index = index;
        //         this.quality = Long.valueOf(-1 * index * timesPlayed);
        //     }

        //     @Override
        //     public int compareTo(Song s) {
        //         if (this.quality == s.quality) {
        //             return this.index - s.index;
        //         }
        //         return this.quality.compareTo(s.quality);
        //     }
        // }

        // Kattio sc = new Kattio(System.in);
        // int n = sc.getInt(), m = sc.getInt();
        // SortedMap<Song, String> sm = new TreeMap<>();
        // for (int i = 1; i <= n; i++)
        //     sm.put(new Song(i, sc.getLong()), sc.getWord());
        // Iterator i = sm.entrySet().iterator();
        // while (i.hasNext() && m-- > 0) 
        //     System.out.println(((Entry) i.next()).getValue());
        // sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class LooRolls {
    
    public static void main(String[] args) {
        long[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        long count = 0, x = 0;
        while ((x = arr[0] % arr[1]) != 0) {
            arr[1] -= x;
            count++;
        }            
        System.out.println(++count);            
    }
    
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class GetToWork {
    
    public static void main(String[] args) {

        class Town {
            int people;
            int carsUsed;
            ArrayList<Integer> cars = new ArrayList<>();

            public void calculateCarsUsed() {
                Collections.sort(this.cars, Collections.reverseOrder());
                for (Integer i : cars) {
                    this.people -= i;
                    this.carsUsed++;
                    if (this.people <= 0) break;
                }
            }

            @Override
            public String toString() {
                return this.carsUsed + "";
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int c = sc.getInt();
        for (int i = 1; i <= c; i++) {
            int n = sc.getInt(), t = sc.getInt(), e = sc.getInt();
            boolean impossible = false;
            Town[] towns = new Town[n];      
            for (int j = 0; j < n; j++)
                towns[j] = new Town();      
            for (int j = 0; j < e; j++) {
                int h = sc.getInt(), p = sc.getInt();
                if (h != t) {
                    towns[h - 1].cars.add(p);
                    towns[h - 1].people++;
                }
            }
            for (Town town : towns) {
                town.calculateCarsUsed();
                if (town.people > 0) {
                    impossible = true;
                    break;
                }
            }
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");    
            sb.append(impossible ? "IMPOSSIBLE" : Arrays.toString(towns).replaceAll("[\\[\\],]", ""));
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FroshWeek2 {
    
    public static void main(String[] args) {
        // Kattio sc = new Kattio(System.in);
        // int n = sc.getInt(), m = sc.getInt();
        // Integer[] task = new Integer[n];
        // Integer[] rest = new Integer[m];
        // for (int i = 0; i < n; i++)
        //     task[i] = sc.getInt();
        // for (int i = 0; i < m; i++)
        //     rest[i] = sc.getInt();
        // Arrays.sort(task, Collections.reverseOrder());
        // Arrays.sort(rest, Collections.reverseOrder());
        // int i = 0, j = 0, count = 0;
        // while (i < n && j < m) {
        //     if (task[i] <= rest[j]) {
        //         j++;
        //         count++;
        //     }
        //     i++;
        // }
        // System.out.println(count);
        // sc.close();

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int[] task = new int[n];
        int[] rest = new int[m];
        for (int i = 0; i < n; i++)
            task[i] = sc.getInt();
        for (int i = 0; i < m; i++)
            rest[i] = sc.getInt();
        radixSort(task);
        radixSort(rest);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (task[i] <= rest[j]) {
                j++;
                count++;
            }
            i++;
        }
        System.out.println(count);
        sc.close();
    }

    static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int pow = 1; max / pow > 0; pow *= 10)
            countingSort(arr, pow);
    }

    static int getMax(int[] arr) {
        int max = arr[0], n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    static void countingSort(int[] arr, int pow) {
        int i = 0, n = arr.length;
        int[] res = new int[n], count = new int[10]; // base 10
        
        for (i = 0; i < 10; i++)
            count[i] = 0;

        for (i = 0; i < n; i++) 
            count[getDigitCount(arr, i, pow)]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i > -1; i--) {
            int digitCount = getDigitCount(arr, i, pow);
            res[count[digitCount] - 1] = arr[i];
            count[digitCount]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = res[i];
    }

    static int getDigitCount(int[] arr, int i, int pow) {
        return 9 - ((arr[i] / pow) % 10);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FroshWeek {
    
    static long count = 0;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] students = new int[n];
        for (int i = 0; i < n; i++)
            students[i] = sc.getInt();
        mergeSort(students, 0, n - 1);
        System.out.println(count);
        // System.out.println(Arrays.toString(students));
        sc.close();
    }

    static void merge(int[] arr, int l, int r, int m) {
        int leftlen = m - l + 1, rightlen = r - m;

        int left[] = new int[leftlen];
        int right[] = new int[rightlen];

        for (int i = 0; i < leftlen; i++)
            left[i] = arr[l + i];
        for (int i = 0; i < rightlen; i++)
            right[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < leftlen && j < rightlen) {
            if (left[i] > right[j]) {
                arr[k] = right[j++];
                count += leftlen - i;
            } else {
                arr[k] = left[i++];
            }
            k++;
        }

        while (i < leftlen) 
            arr[k++] = left[i++];
        while (j < rightlen)
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // find mid pnt
            mergeSort(arr, l, m); // left half
            mergeSort(arr, m + 1, r); // right half
            merge(arr, l, r, m); // merge back
        }
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Marko {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Integer, String> hmap = new HashMap<>();
        String two = "abc",
                three = "def",
                four = "ghi",
                five = "jkl",
                six = "mno",
                seven = "pqrs",
                eight = "tuv",
                nine = "wxyz";
        hmap.put(2, two);
        hmap.put(3 , three);
        hmap.put(4 , four);
        hmap.put(5 , five);
        hmap.put(6 , six);
        hmap.put(7 , seven);
        hmap.put(8 , eight);
        hmap.put(9 , nine);
        int n = sc.getInt();
        String[] dict = new String[n];
        for (int i = 0; i < n; i++)
            dict[i] = sc.getWord();
        char[] nums = sc.getWord().toCharArray();
        boolean[] check = new boolean[10];
        for (int i = 0; i < nums.length; i++) {
            int digit = Character.getNumericValue(nums[i]);
            check[digit] = true;
        }
        String checker = "";
        for (int i = 2; i < 10; i++)
            if (check[i]) checker += hmap.get(i); 
        Pattern p = Pattern.compile("[" + checker + "]+");
        int count = 0;
        for (String s : dict) {
            if (s.length() != nums.length) continue;
            Matcher m = p.matcher(s);
            if (m.matches()) count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Okvir {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int m = sc.getInt(), n = sc.getInt();
        int u = sc.getInt(), l = sc.getInt(), r = sc.getInt(), d = sc.getInt();
        int bigR = m + d + u, bigC = n + l + r;
        char[][] mtx = new char[bigR][bigC];
        String one = "", two = "";
        for (int i = 0; i < bigC; i++)
            one += i % 2 == 0 ? "#" : ".";
        for (int i = 0; i < bigC; i++)
            two += i % 2 == 0 ? "." : "#";
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
        for (int i = 0; i < bigR; i++)
            mtx[i] = Arrays.copyOf(i % 2 == 0 ? oneArr : twoArr, bigC);
        for (int i = u; i < bigR - d; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = l; j < bigC - r; j++) {
                mtx[i][j] = tmp[j - l];
            }
        }
        for (int i = 0; i < bigR; i++)
            System.out.println(new String(mtx[i]));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GreedilyIncreasingSubsequence {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        while (n-- > 0) {
            int curr = sc.getInt();
            if (max < curr) {
                max = curr;
                list.add(max);
            }
        }
        System.out.println(list.size());
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        sc.close();
    }   

}

///////////////////////////////////////////////////////////////////////////////

class Yoda {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String a = sc.getWord(), b = sc.getWord();
        if (a.length() > b.length()) {
            b = "0".repeat(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            a = "0".repeat(b.length() - a.length()) + a;
        }
        int n = a.length();
        String aleft = "", bleft = "";
        for (int i = 0; i < n; i++) {
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            int ai = Character.getNumericValue(ac);
            int bi = Character.getNumericValue(bc);
            if (ai > bi) {
                aleft += ac;
            } else if (bi > ai) {
                bleft += bc;
            } else {
                aleft += ac;
                bleft += bc; 
            }
        }
        System.out.println(aleft.equals("") ? "YODA" : Integer.parseInt(aleft));
        System.out.println(bleft.equals("") ? "YODA" : Integer.parseInt(bleft));        
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Warehouse {
    
    public static void main(String[] args) {       
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                if (e1.getValue() == e2.getValue()) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return e2.getValue() - e1.getValue();
            }
        };
        int t = sc.getInt();
        while (t-- > 0) {
            HashMap<String, Integer> hmap = new HashMap<>();
            int n = sc.getInt();
            while (n-- > 0) {
                String name = sc.getWord();
                int count = sc.getInt();
                hmap.put(name, (hmap.containsKey(name) ? hmap.get(name) : 0) + count);
            }
            List<Entry<String, Integer>> list = new ArrayList<>(hmap.entrySet());
            Collections.sort(list, comp);
            sb.append(list.size()).append("\n");
            for (Entry<String, Integer> e : list) 
                sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Recount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        String s = "";
        while (!(s = sc.nextLine()).equals("***")) 
            hmap.put(s, (hmap.containsKey(s) ? hmap.get(s) : 0) + 1);
        String name = "";
        int max = 0;
        boolean runoff = false;
        Iterator i = hmap.entrySet().iterator();
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<String, Integer> e = (Entry<String, Integer>) i.next();
            if (max < e.getValue()) {
                max = e.getValue();
                name = e.getKey();
            }
        }
        i = hmap.entrySet().iterator();
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<String, Integer> e = (Entry<String, Integer>) i.next();
            if (max == e.getValue() && !name.equals(e.getKey())) {
                runoff = true;
                break;
            }
        }
        System.out.println(runoff ? "Runoff!" : name);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MovingDay {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), v = sc.getLong(), max = 0;
        while (n-- > 0) 
            max = Math.max(sc.getLong() * sc.getLong() * sc.getLong(), max);
        System.out.println(max - v);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ConvexPolygonArea {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int m = sc.getInt();
            Point[] p = new Point[m];
            for (int i = 0; i < m; i++)
                p[i] = new Point(sc.getInt(), sc.getInt());
            int total = 0;
            for (int i = 0; i < m; i++) {
                Point p1 = p[i];
                Point p2 = i == m - 1 ? p[0] : p[i + 1];
                total += (p1.x * p2.y) - (p1.y * p2.x);
            }
            sb.append(total / 2.0).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MarsWindow {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static String foo(int n) {
        Calendar c = Calendar.getInstance();
        Calendar t = Calendar.getInstance();
        c.set(2018, 3, 1);
        t.set(n, 1, 1);
        while (c.get(Calendar.YEAR) < t.get(Calendar.YEAR)) 
            c.add(Calendar.MONTH, 26);
        return c.get(Calendar.YEAR) == t.get(Calendar.YEAR) ? "yes" : "no";
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ZebrasAndOcelots {
    
    static final int BINARY_BASE = 2;

    public static void main(String[] args) {
        // A.k.a how to zerorise a binary number e.g. 
        // 010, ZOZ
        // 1001, OZZO
        // 1. 1001 9
        // 2. 1000 8
        // 3. 0111 7 
        // 4. 0110 6
        // 5. 0101 5
        // 6. 0100 4
        // 7. 0011 3 
        // 8. 0010 2
        // 9. 0001 1
        // 10. 0000 0
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[] magic = new char[n];
        for (int i = 0; i < n; i++)
            magic[i] = sc.getWord().charAt(0) == 'Z' ? '0' : '1';
        System.out.println(Long.parseLong(new String(magic), BINARY_BASE)); // n = 60, integer max val 2^31 - 1
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WoodCutting {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            long[] wood = new long[n];
            for (int i = 0; i < n; i++) {
                int w = sc.getInt();
                while (w-- > 0)
                    wood[i] += sc.getLong();
            }
            Arrays.sort(wood);
            long totalWait = 0L, accumulate = 0;
            for (long l : wood) 
                totalWait += accumulate += l;
            sb.append(String.format("%.10f", totalWait / (double) n)).append("\n");
        }  
        System.out.print(sb.toString());
        sc.close(); 
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Watchdog {
    
    public static void main(String[] args) {

        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Point) {
                    Point p = (Point) obj;
                    return p.x == this.x && this.y == p.y;
                }
                return false;
            }

            @Override
            public String toString() {
                return this.x + " " + this.y;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int s = sc.getInt(), h = sc.getInt();
            ArrayList<Point> hatches = new ArrayList<>();
            while (h-- > 0)
                hatches.add(new Point(sc.getInt(), sc.getInt()));
            boolean pass = false;
            Point p = null;
            for (int i = 1; i < s && !pass; i++) {
                for (int j = 1; j < s && !pass; j++) {
                    p = new Point(i, j);
                    if (hatches.contains(p)) continue;
                    int l = Math.min(Math.min(i, s - i), Math.min(j, s - j)); // to not fall off
                    pass = true;
                    for (Point hatch : hatches) {
                        if (p.distanceTo(hatch) > l) {
                            pass = false;
                            break;
                        }
                    }
                }
            }
            sb.append(pass ? p : "poodle").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WatchOutForThoseHailstones {
    
    static HashMap<Long, Long> memoized = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(foo(Long.parseLong(new java.util.Scanner(System.in).nextLine())));
    }

    static long foo(long n) {
        if (memoized.containsKey(n)) return memoized.get(n); 
        if (n == 1) return 1;
        memoized.put(n, n % 2 == 0 ? foo(n / 2) : foo(3 * n + 1));
        return n + memoized.get(n);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TurtleMaster {
    
    static final int BOARD_LENGTH = 8;

    public static void main(String[] args) {

        class Turtle {
            int x, y;
            int facing; // 0 1 2 3, east, south, west, north
            boolean bug;

            Turtle() {
                this.x = 7;
                this.y = 0;
                this.facing = 0;
                this.bug = false;
            }

            void turn(char c) {
                if (c == 'L') {
                    this.facing += 3;
                } else {
                    this.facing += 1;
                }
                this.facing %= 4;
            }

            void forward(char[][] board) {
                int[] arr = getForward();
                int nx = arr[0], ny = arr[1];
                if (0 <= nx && nx < BOARD_LENGTH && 0 <= ny && ny < BOARD_LENGTH) {
                    this.x = nx;
                    this.y = ny;
                    if (board[this.x][this.y] == 'C' || board[this.x][this.y] == 'I') {
                        this.bug = true;
                    } 
                } else {
                    this.bug = true;
                }                
            }

            void fire(char[][] board) {
                int[] arr = getForward();
                int nx = arr[0], ny = arr[1];
                if (0 <= nx && nx < BOARD_LENGTH && 0 <= ny && ny < BOARD_LENGTH && board[nx][ny] == 'I') {
                    board[nx][ny] = '.';            
                } else {
                    this.bug = true;
                }
            }

            private int[] getForward() {
                int nx = this.x, ny = this.y;
                if (this.facing == 0) {
                    ny++;
                } else if (this.facing == 1) {
                    nx++;
                } else if (this.facing == 2) {
                    ny--;
                } else if (this.facing == 3) {
                    nx--;
                }
                return new int[] {nx, ny};
            }

            void move(char[][] board, char action) {
                if (action == 'L' || action == 'R') {
                    turn(action);
                } else if (action == 'F') {
                    forward(board);
                } else if (action == 'X') {
                    fire(board);
                }
            }
            
        }

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[BOARD_LENGTH][BOARD_LENGTH];
        for (int i = 0; i < BOARD_LENGTH; i++)
            board[i] = sc.nextLine().toCharArray();
        char[] instructions = sc.nextLine().toCharArray();
        Turtle turtle = new Turtle();
        for (char c : instructions) {
            // System.out.println(turtle.x + " " + turtle.y);
            turtle.move(board, c);
            if (turtle.bug) break;
        }
        System.out.println(!turtle.bug && board[turtle.x][turtle.y] == 'D' ? "Diamond!" : "Bug!");
        sc.close();
    }
    
}

// ///////////////////////////////////////////////////////////////////////////////

class TwoZeroFourEight {

    static final int BOARD_LENGTH = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[BOARD_LENGTH][BOARD_LENGTH];
        readBoard(sc, board);
        move(sc, board);
        print(board);
        sc.close();
    }

    static void move(Scanner sc, int[][] board) {
        // 0 left
        // 1 up
        // 2 right
        // 3 down
        int m = Integer.parseInt(sc.nextLine());
        if (m == 0) {
            left(board);    
        } else if (m == 1) {
            up(board);
        } else if (m == 2) {
            right(board);
        } else if (m == 3) {
            down(board);
        } 
    }

    static void left(int[][] board) {
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = 0; c < BOARD_LENGTH; c++) {
                if (board[r][c] != 0) {
                    for (int i = c + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][c] == board[r][i]) {
                            board[r][c] += board[r][i];
                            board[r][i] = 0;
                            break;
                        } else if (board[r][i] != 0) {
                            break;
                        }
                }
            }
        }
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = 0; c < BOARD_LENGTH; c++) {
                if (board[r][c] == 0) {
                    for (int i = c + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void up(int[][] board) {
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = 0; r < BOARD_LENGTH; r++) {
                if (board[r][c] != 0) {
                    for (int i = r + 1; i < BOARD_LENGTH; i++) 
                        if (board[r][c] == board[i][c]) {
                            board[r][c] += board[i][c];
                            board[i][c] = 0;
                            break;
                        } else if (board[i][c] != 0) {
                            break;
                        }
                }
            }
        }
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = 0; r < BOARD_LENGTH; r++) {
                if (board[r][c] == 0) {
                    for (int i = r + 1; i < BOARD_LENGTH; i++) 
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void right(int[][] board) {
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = BOARD_LENGTH - 1; c >= 0; c--) {
                if (board[r][c] != 0) {
                    for (int i = c - 1; i >= 0; i--) 
                        if (board[r][c] == board[r][i]) {
                            board[r][c] += board[r][i];
                            board[r][i] = 0;
                            break;
                        } else if (board[r][i] != 0) {
                            break;
                        }
                }
            }
        }
        for (int r = 0; r < BOARD_LENGTH; r++) {
            for (int c = BOARD_LENGTH - 1; c >= 0; c--) {
                if (board[r][c] == 0) {
                    for (int i = c - 1; i >= 0; i--)
                        if (board[r][i] != 0) {
                            board[r][c] = board[r][i];
                            board[r][i] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void down(int[][] board) {
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = BOARD_LENGTH - 1; r >= 0; r--) {
                if (board[r][c] != 0) {
                    for (int i = r - 1; i >= 0; i--) 
                        if (board[r][c] == board[i][c]) {
                            board[r][c] += board[i][c];
                            board[i][c] = 0;
                            break;
                        } else if (board[i][c] != 0) {
                            break;
                        }
                }
            }
        }
        for (int c = 0; c < BOARD_LENGTH; c++) {
            for (int r = BOARD_LENGTH - 1; r >= 0; r--) {
                if (board[r][c] == 0) {
                    for (int i = r - 1; i >= 0; i--) 
                        if (board[i][c] != 0) {
                            board[r][c] = board[i][c];
                            board[i][c] = 0;
                            break;
                        }
                }
            }
        }
    }

    static void print(int[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++)
            System.out.println(Arrays.toString(board[i]).replaceAll("[\\[\\],]", ""));
    }

    static void readBoard(Scanner sc, int[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i++) 
            board[i] = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}

///////////////////////////////////////////////////////////////////////////////

class AListGame {
    
    public static void main(String[] args) {
        System.out.println(foo(Integer.parseInt(new java.util.Scanner(System.in).nextLine())));
    }

    static int foo(int n) {
        int count = 0;
        for (int y = 2; y <= Math.sqrt(n); y++) {
            if (n % y == 0) {
                n /= y;
                count++;
                y--;
            }
        }
        return count + 1;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TreeInsertion {
    
    public static void main(String[] args) {

        // Binary search tree
        class Node {
            int value;
            int children;
            Node left;
            Node right;

            Node(int value) {
                this.value = value;
                this.children = 1;
                this.left = null;
                this.right = null;
            }

            boolean hasRight() {
                return this.right != null;
            }

            boolean hasLeft() {
                return this.left != null;
            }

        }

        class Tree {

            Node root;
            
            Tree() {
                this.root = null;
            }

            void insert(int value) {
                this.root = insertHelper(this.root, value);
            }

            Node insertHelper(Node node, int value) {
                if (node == null) {
                    node = new Node(value);
                    return node;
                }
                if (value < node.value) {
                    node.left = insertHelper(node.left, value);
                } else if (value >= node.value) {
                    node.right = insertHelper(node.right, value);
                }
                node.children++;
                return node;
            }

            BigInteger getPermutations() {
                BigInteger[][] mtx = new BigInteger[100 + 1][100 + 1]; // children count holder
                for (int i = 0; i < mtx.length; i++) 
                    Arrays.fill(mtx[i], BigInteger.ONE);
                for (int i = 1; i < mtx.length; i++) 
                    for (int j = 1; j < mtx.length; j++) 
                        mtx[i][j] = mtx[i - 1][j].add(mtx[i][j - 1]);

                for (int i = 1; i < mtx.length; i++) {
                    for (int j = 1; j < mtx.length; j++) {
                        System.out.print(mtx[i][j] + " ");
                        if (j == 10) break;
                    }
                    System.out.println();
                    if (i == 10) break;
                }    

                return permuteHelper(mtx, this.root);
            }

            BigInteger permuteHelper(BigInteger[][] mtx, Node node) {
                BigInteger permutations = BigInteger.ONE;
                if (node != null) {
                    if (node.hasLeft() && node.hasRight()) 
                        permutations = mtx[node.left.children][node.right.children]; // left + right children
                    permutations = permutations
                                        .multiply(permuteHelper(mtx, node.left))
                                        .multiply(permuteHelper(mtx, node.right));
                }
                return permutations;
            }

        }

        // counting permutations is just factorial

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            Tree tree = new Tree();
            while (n-- > 0) 
                tree.insert(sc.getInt());
            sb.append(tree.getPermutations()).append("\n");
        }
        System.out.print(sb.toString());                    
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SavingPrincessPeach {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), y = sc.getInt(), distinct = 0;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < y; i++)
            arr[sc.getInt()] = true;
        for (int i = 0; i < n; i++) 
            if (arr[i]) {
                distinct++;
            } else {
                System.out.println(i);
            }
        System.out.printf("Mario got %d of the dangerous obstacles.", distinct);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TimeTravellingTemperatures {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray()));
    }
    
    static String foo(double[] arr) {
        double a = 0.0, b = arr[0];
        double da = 1.0, db = arr[1];
        if (db == 1) {
            if (b == 0) {
                return "ALL GOOD";
            }
            return "IMPOSSIBLE";
        }
        return String.format("%.10f", - (a - b) / (da - db));
    }

}

///////////////////////////////////////////////////////////////////////////////

class Cetiri {
    
    public static void main(String[] args) {
        System.out.println(foo(Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static int foo(int[] arr) {
        Arrays.sort(arr);
        int constant = Math.min(arr[1] - arr[0], arr[2] - arr[1]);
        int[] arr2 = new int[] {arr[0], arr[0] + constant, arr[0] + 2 * constant, arr[0] + 3 * constant};
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            if (x != arr[0] && x != arr[1] && x != arr[2]) {
                return x;
            }
        }        
        return arr[0];
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EarlyWinter {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), dm = sc.getInt(), count = 0;;
        for (; count < n; count++) 
            if (sc.getInt() <= dm) break;
        System.out.println(count == n ? "It had never snowed this early!" : "It hadn't snowed this early in " + count + " years!");
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class JumbledCompass {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int t1 = sc.getInt(), t2 = sc.getInt();
        int clockwise = (360 - t1 + t2) % 360, anticlockwise = 360 - clockwise;
        if (clockwise <= anticlockwise) {
            System.out.println(clockwise);
        } else {
            System.out.println(-anticlockwise);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Prerequisites {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int k = sc.getInt();
            if (k == 0) break;
            int m = sc.getInt();
            ArrayList<Integer> freddie = new ArrayList<>();
            boolean pass = true;
            while (k-- > 0) 
                freddie.add(sc.getInt());
            while (m-- > 0) {
                int c = sc.getInt(), min = sc.getInt(), count = 0;
                while (c-- > 0) {
                    int x = sc.getInt();
                    if (freddie.contains(x)) count++;
                }
                if (count < min) pass = false;
            }         
            sb.append(pass ? "yes" : "no").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Deathstar {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                sc.getInt();
            for (int j = i; j < n; j++) {
                int x = sc.getInt();
                arr[i] |= x;
                arr[j] |= x;
            }
        }
        System.out.println(java.util.Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Vacuumba {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int m = sc.getInt();
            double x = 0, y = 0, angle = 90;
            while (m-- > 0) {
                double theta = sc.getDouble(), distance = sc.getDouble();
                angle += theta;
                angle %= 360;
                theta = angle;
                theta = Math.toRadians(theta);
                // 1st quadrant
                x += Math.cos(theta) * distance; // cah
                y += Math.sin(theta) * distance; // soh
            }
            sb.append(String.format("%.6f", x));
            sb.append(" ");
            sb.append(String.format("%.6f", y));
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EspressoBucks {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        char[][] map = new char[n][m];
        boolean[][] filled = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = tmp[j];
                if (tmp[j] == '#') filled[i][j] = true;
            }
        }
        solve(map, filled);
        print(map);
        sc.close();
    }

    static void solve(char[][] map, boolean[][] filled) {
        for (int i = 0; i < filled.length; i++) {
            for (int j = 0; j < filled[i].length; j++) {
                if (!filled[i][j]) {
                    fill(filled, i, j);
                    fill(filled, i + 1, j);
                    fill(filled, i - 1, j);
                    fill(filled, i, j + 1);
                    fill(filled, i, j - 1);
                    map[i][j] = 'E';
                }
            }
        }
    }

    static void fill(boolean[][] filled, int i, int j) {
        if (0 <= i && i < filled.length && 0 <= j && j < filled[0].length) 
            filled[i][j] = true;
    }

    static void print(char[][] map) {
        for (int i = 0; i < map.length; i++)
            System.out.println(Arrays.toString(map[i]).replaceAll("[\\[\\],\\s]", ""));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TextureAnalysis {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        String s = "";
        int test = 1;
        while (!(s = sc.getWord()).equals("END")) {
            boolean even = true;
            if (s.length() > 3) {
                char[] arr = s.toCharArray();
                int whitecount = 0;
                for (int i = 1; i < arr.length && arr[i] != '*'; i++)
                    whitecount++;
                int testcount = 0;
                for (int i = 1; i < arr.length; i++)
                    if (arr[i] == '*') {
                        if (whitecount != testcount) {
                            even = false;
                            break;
                        }
                        testcount = 0;
                    } else {
                        testcount++;
                    }
            }            
            sb.append(test++);
            sb.append(even ? " EVEN" : " NOT EVEN").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ColoringSocks {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int s  = sc.getInt(), c = sc.getInt(), k = sc.getInt();
        int[] socks = new int[s];
        for (int i = 0; i < s; i++)
            socks[i] = sc.getInt();
        Arrays.sort(socks); // impt
        int washingmachines = 1;
        int capacity = c - 1;
        int smallestsock = socks[0];
        for (int i = 1; i < socks.length; i++) {
            int sock = socks[i];
            if (capacity == 0 // max cap
                || sock - smallestsock > k) { // will decolourise
                washingmachines++;
                capacity = c;
                smallestsock = sock;
            }
            capacity--;
        }
        System.out.println(washingmachines);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IRepeatMyself {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            int len = s.length();
            int i = 1;
            for (; i <= len; i++) 
                if (s.equals(s.substring(0, i).repeat((len / i) + 1).substring(0, len))) break;              
            sb.append(i);
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Bits {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0)
            sb.append(foo(sc.getInt())).append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static int foo(int n) {
        int count = 0;
        while (n > 0) {
            count = Math.max(count, bar(n));
            n /= 10;
        }
        return count;
    }

    static int bar(int n) {
        int count = 0;
        while (n > 0) {
            // if ((n & 1) == 1) count++;
            // n = n >>> 1;
            count++;
            n &= n - 1;
        }
        return count;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SecureDoors {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        while (n-- > 0) {
            String action = sc.getWord(), name = sc.getWord();
            String print = name;
            if (action.equals("entry")) {
                print += " entered";
                if (al.contains(name)) {
                    print += " (ANOMALY)";
                } else {
                    al.add(name);
                }
            } else {
                print += " exited";
                if (al.contains(name)) {
                    al.remove(al.indexOf(name));
                } else {
                    print += " (ANOMALY)";
                }
            }
            sb.append(print).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BottledUpFeelings {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int s = arr[0], v1 = Math.max(arr[1], arr[2]), v2 = Math.min(arr[1], arr[2]);
        int i = s / v1, j = 0;
        boolean f = false;
        for (; i >= 0; i--) {
            if ((s - (i * v1)) % v2 == 0) {
                j = (s - (i * v1)) / v2;
                f = true;
                break;
            }
        }
        System.out.println(f ? i + " " + j : "Impossible");
    }
}

///////////////////////////////////////////////////////////////////////////////

class BusySchedule {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Integer[]> com = new Comparator<>() {
            @Override
            public int compare(Integer[] arr1, Integer[] arr2) {
                // 0 1 2, hour, minute, am 0 pm 1
                if (arr1[2] == arr2[2]) {
                    if (arr1[0] != arr2[0]) {
                        if (arr1[0] == 12) {
                        return -1;
                        } else if (arr2[0] == 12) {
                            return 1;
                        } else {
                            return arr1[0] - arr2[0];
                        }   
                    }                    
                    return arr1[1] - arr2[1];
                }
                return arr1[2] - arr2[2];
            }
        };
        while (true) {
            int n = sc.getInt();
            if (n == 0) break;
            ArrayList<Integer[]> al = new ArrayList<>();
            while (n-- > 0) {
                Integer[] arr = new Integer[3];
                int[] arr2 = Arrays.stream(sc.getWord().split(":")).mapToInt(Integer::parseInt).toArray();
                arr[0] = arr2[0];
                arr[1] = arr2[1];
                arr[2] = sc.getWord().equals("a.m.") ? 0 : 1;
                al.add(arr);
            }
            Collections.sort(al, com);
            for (Integer[] arr : al) 
                sb.append(arr[0])
                    .append(":")
                    .append(arr[1] < 10 ? "0" + arr[1] : arr[1])
                    .append(" ")
                    .append(arr[2] == 0 ? "a.m." : "p.m.")
                    .append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Slatkisi {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println((int) (Math.round((double) arr[0] / Math.pow(10, arr[1])) * Math.pow(10, arr[1])));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CharacterDevelopment {
    
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        // power set size = 2^n.
        // -x to remove singular sets
        // -1 for empty set
        System.out.println((int) Math.pow(2, x) - x - 1);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GuessTheNumber {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int x = (1 + 1000) / 2;
        System.out.println(x);
        String ans = sc.getWord();
        int lbound = 1, ubound = 1000;
        while (!ans.equals("correct")) {
            if (ans.equals("lower")) {
                ubound = x;
                x = (lbound + ubound) / 2;
            } else {
                lbound = x;
                x = (lbound + ubound + 1) / 2;
            }
            System.out.println(x);
            ans = sc.getWord();
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WERTYU {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> hmap = new HashMap<>();

        hmap.put(' ', ' ');

        hmap.put('=', '-');
        hmap.put('-', '0');
        hmap.put('0', '9');
        hmap.put('9', '8');
        hmap.put('8', '7');
        hmap.put('7', '6');
        hmap.put('6', '5');
        hmap.put('5', '4');
        hmap.put('4', '3');
        hmap.put('3', '2');
        hmap.put('2', '1');
        hmap.put('1', '1');

        hmap.put('\\',']');
        hmap.put(']','[');
        hmap.put('[','P');
        hmap.put('P','O');
        hmap.put('O','I');
        hmap.put('I','U');
        hmap.put('U','Y');
        hmap.put('Y','T');
        hmap.put('T','R');
        hmap.put('R','E');
        hmap.put('E','W');
        hmap.put('W','Q');
        hmap.put('Q','Q');

        hmap.put('\'',';');
        hmap.put(';','L');
        hmap.put('L','K');
        hmap.put('K','J');
        hmap.put('J','H');
        hmap.put('H','G');
        hmap.put('G','F');
        hmap.put('F','D');
        hmap.put('D','S');
        hmap.put('S','A');
        hmap.put('A','A');

        hmap.put('/','.');
        hmap.put('.',',');
        hmap.put(',','M');
        hmap.put('M','N');
        hmap.put('N','B');
        hmap.put('B','V');
        hmap.put('V','C');
        hmap.put('C','X');
        hmap.put('X','Z');
        hmap.put('Z','Z');

        while (sc.hasNextLine()) {
            char[] arr = sc.nextLine().toCharArray();
            for (int i = 0; i < arr.length; i++) 
                arr[i] = hmap.get(arr[i]);
            System.out.println(new String(arr));
        }
        sc.close();
        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BeatTheSpread {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int sum = sc.getInt(), diff = sc.getInt();
            int a = (sum + diff) / 2;
            int b = sum - a;
            if (a >= 0 && b >= 0 && a + b == sum && Math.abs(a - b) == diff) {
                sb.append(Math.max(a, b) + " " + Math.min(a, b));
            } else {
                sb.append("impossible");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BiasedStandings {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            long sum = 0;
            int[] arr = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                sc.getWord();
                arr[i] = sc.getInt();
            }
            Arrays.sort(arr);
            for (int i = 1; i < n + 1; i++) 
                sum += Math.abs(i - arr[i]);           
            sb.append(sum).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class NotAmused {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> com = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        };
        int days = 1;
        while (sc.hasMoreTokens()) {
            sc.getWord();
            HashMap<String, Integer> timecard = new HashMap<>();
            while (true) {
                String action = sc.getWord();
                if (action.equals("CLOSE")) break;
                String name = sc.getWord();
                int time = sc.getInt();
                timecard.put(name, (timecard.containsKey(name) ? timecard.get(name) : 0) + (action.equals("ENTER") ? -time : time));
            }
            ArrayList<Entry<String, Integer>> list = new ArrayList<>(timecard.entrySet());
            Collections.sort(list, com);
            sb.append("Day ");
            sb.append(days++);
            sb.append("\n");
            for (Entry<String, Integer> e : list)
                sb.append(e.getKey()).append(" $").append(String.format("%.2f", ((double) e.getValue()) / 10)).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FastFoodPrizes {
    
    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int cases = sc.getInt();
        while (cases-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            HashMap<int[], Integer> prizes = new HashMap<>();
            while (n-- > 0) {
                int k = sc.getInt();
                int[] tmp = new int[k];
                for (int i = 0; i < k; i++)
                    tmp[i] = sc.getInt();
                prizes.put(tmp, sc.getInt());                
            }
            int[] stickers = new int[m + 1];
            for (int i = 1; i < m + 1; i++) 
                stickers[i] = sc.getInt();
            Iterator iter = prizes.entrySet().iterator();
            int total = 0;
            while (iter.hasNext()) {
                @SuppressWarnings("unchecked")
                Entry<int[], Integer> e = (Entry<int[], Integer>) iter.next();
                int[] arr = e.getKey();
                int prize = e.getValue();
                int min = stickers[arr[0]];
                for (int i = 1; i < arr.length; i++)
                    min = Math.min(stickers[arr[i]], min);
                for (int i = 0; i < arr.length; i++)
                    stickers[arr[i]] -= min;
                total += min * prize;
            }
            sb.append(total).append("\n");
        }        
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IBoard {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            boolean leftone = false, rightzero = false;
            for (char c : arr) 
                for (int i = 0; i < 7; i++) {
                    if (c % 2 == 0) {
                        rightzero = !rightzero;
                    } else {
                        leftone = !leftone;
                    }
                    c /= 2;
                }
            sb.append(rightzero || leftone ? "trapped" : "free").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}

///////////////////////////////////////////////////////////////////////////////

class SafeHouses {
    
    public static void main(String[] args) {

        class Point {
            int x, y;
            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            int distanceTo(Point p) {
                // manhatten distance
                return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
            }
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), max = 0;
        char[][] grid = new char[n][n];
        ArrayList<Point> houses = new ArrayList<>();
        ArrayList<Point> spies = new ArrayList<>();
        for (int i = 0; i < n; i++)
            grid[i] = sc.getWord().toCharArray();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 'H') {
                    houses.add(new Point(i, j));
                } else if (grid[i][j] == 'S') {
                    spies.add(new Point(i, j));
                }
        for (Point s : spies) {
            int min = Integer.MAX_VALUE;
            for (Point h : houses)
                min = Math.min(min, s.distanceTo(h));
            max = Math.max(max, min);
        }
        System.out.println(max);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class KnightSearch {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = 0;
        String s = sc.getWord(), target = "ICPCASIASG";
        char[][] board = new char[n][n];
        boolean yes = false;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                board[i][j] = s.charAt(k++);
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                if (board[i][j] == s.charAt(0) && foo(board, i, j, 1, target, n)) {
                    yes = true;
                    break;
                }
        System.out.println(yes ? "YES" : "NO");
        sc.close();
    }

    static boolean foo(char[][] board, int i, int j, int iter, String target, int n) {
        if (iter == target.length()) return true;
        char c = target.charAt(iter);
        if (
            (isValidCoordinate(i - 1, j - 2, n) && board[i - 1][j - 2] == c && foo(board, i - 1, j - 2, iter + 1, target, n)) 
            || (isValidCoordinate(i + 1, j - 2, n) && board[i + 1][j - 2] == c && foo(board, i + 1, j - 2, iter + 1, target, n))
            || (isValidCoordinate(i - 2, j - 1, n) && board[i - 2][j - 1] == c && foo(board, i - 2, j - 1, iter + 1, target, n)) 
            || (isValidCoordinate(i + 2, j - 1, n) && board[i + 2][j - 1] == c && foo(board, i + 2, j - 1, iter + 1, target, n))
            || (isValidCoordinate(i - 1, j + 2, n) && board[i - 1][j + 2] == c && foo(board, i - 1, j + 2, iter + 1, target, n)) 
            || (isValidCoordinate(i + 1, j + 2, n) && board[i + 1][j + 2] == c && foo(board, i + 1, j + 2, iter + 1, target, n))
            || (isValidCoordinate(i - 2, j + 1, n) && board[i - 2][j + 1] == c && foo(board, i - 2, j + 1, iter + 1, target, n)) 
            || (isValidCoordinate(i + 2, j + 1, n) && board[i + 2][j + 1] == c && foo(board, i + 2, j + 1, iter + 1, target, n))
        ) return true;
        return false;
    }

    static boolean isValidCoordinate(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HappyHappyPrimePrime {
    
    static HashMap<Integer, Integer> hmap = new HashMap<>();

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int x = sc.getInt();
            sb.append(x).append(" ");
            sb.append(isHappyPrime(x) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int powerPerDigit(int n) {
        if (hmap.containsKey(n)) return hmap.get(n);
        int x = 0;
        while (n > 0) {
            x += (int) Math.pow((n % 10), 2);
            n /= 10;
        }
        hmap.put(n, x);
        return x;
    }

    static boolean isHappyPrime(int n) {
        if (!isPrime(n)) return false;
        ArrayList<Integer> al = new ArrayList<>();
        while (n > 1 && !al.contains(n)) {
            al.add(n);
            n = powerPerDigit(n);
        }
        return n == 1;
    }

    static boolean isPrime(int n) {
        if (n == 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(x -> n % x == 0);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RollCall {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        ArrayList<String[]> al = new ArrayList<>();
        Map<String, Integer> firstMap = new HashMap<>();
        Comparator<String[]> comp = new Comparator<>() {
            @Override
            public int compare(String[] arr1, String[] arr2) {
                if (arr1[1].equals(arr2[1])) {
                    return arr1[0].compareTo(arr2[0]);
                }
                return arr1[1].compareTo(arr2[1]);
            }
        };
        while (sc.hasMoreTokens()) {
            String first = sc.getWord(), last = sc.getWord();
            al.add(new String[] {first, last});
            firstMap.put(first, firstMap.containsKey(first) ? firstMap.get(first) + 1 : 1);
        }
            
        Collections.sort(al, comp);
        for (String[] arr : al) {
            if (firstMap.get(arr[0]) > 1) {
                System.out.println(arr[0] + " " + arr[1]);
            } else {
                System.out.println(arr[0]);
            }
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Metaprogramming {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            String action = sc.getWord();
            if (action.equals("define")) {
                int value = sc.getInt();
                String pointer = sc.getWord();
                hmap.put(pointer, value);
            } else if (action.equals("eval")) {
                String var1 = sc.getWord();
                String operator = sc.getWord();
                String var2 = sc.getWord();
                if (!hmap.containsKey(var1) || !hmap.containsKey(var2)) {
                    sb.append("undefined");
                } else {
                    int v1 = hmap.get(var1), v2 = hmap.get(var2);
                    if (operator.equals("<")) {
                        sb.append(v1 < v2);
                    } else if (operator.equals(">")) {
                        sb.append(v1 > v2);
                    } else if (operator.equals("=")) {
                        sb.append(v1 == v2);
                    }
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HtoO {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Character, Integer> instore = new HashMap<>();
        HashMap<Character, Integer> outstore = new HashMap<>();
        char[] input = sc.getWord().toCharArray();
        int n = sc.getInt();
        char[] output = sc.getWord().toCharArray();
        addToMap(input, instore);
        addToMap(output, outstore);
        multiplyInput(input, instore, n);
        if (checkMoleculesAvailability(instore, outstore)) {
            int create = Integer.MAX_VALUE;
            Iterator iter = outstore.entrySet().iterator();
            while (iter.hasNext()) {
                Entry e = (Entry) iter.next();
                int outrequirements = (Integer) e.getValue();
                int inputmaterials = instore.get((Character) e.getKey());
                // System.out.println(inputmaterials + " " + outrequirements);
                // System.out.println();
                create = Math.min(create, inputmaterials / outrequirements);
            }
            System.out.println(create);        
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    static boolean checkMoleculesAvailability(HashMap<Character, Integer> instore, HashMap<Character, Integer> outstore) {
        Iterator iter = outstore.entrySet().iterator();
        while (iter.hasNext()) 
            if (!instore.containsKey((Character)((Entry) iter.next()).getKey())) return false;
        return true;
    }

    static void multiplyInput(char[] arr, HashMap<Character, Integer> hmap, int n) {
        for (Entry<Character, Integer> e : hmap.entrySet()) 
            hmap.put(e.getKey(), e.getValue() * n);
    }

    static void addToMap(char[] arr, HashMap<Character, Integer> hmap) {
        for (int i = 0; i < arr.length; i++) {
            char letter = arr[i];
            String num = "";
            while (++i < arr.length && Character.isDigit(arr[i]))
                num += arr[i];
            i--;
            hmap.put(letter, (hmap.containsKey(letter) ? hmap.get(letter) : 0) + (num.equals("") ? 1 : Integer.parseInt(num)));
            // System.out.println(letter + " " + hmap.get(letter));
        }
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PermutationEncryption {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] key = new int[n];
            for (int i = 0; i < n; i++)
                key[i] = sc.nextInt() - 1;
            sc.nextLine();
            char[] msg = sc.nextLine().toCharArray();
            char[] encrypt = new char[(int) (Math.ceil(msg.length / (double) n) * n)];
            Arrays.fill(encrypt, ' ');
            for (int i = 0; i < msg.length; i += n) 
                for (int j = 0; j < n; j++) 
                    if (i + key[j] < msg.length)
                        encrypt[i + j] = msg[i + key[j]]; 
            sb.append("'");
            sb.append(new String(encrypt));
            sb.append("'");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class QuiteAProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) 
            sb.append(sc.nextLine().toLowerCase().contains("problem") ? "yes" : "no").append("\n");
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BestCompressionEver {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray()));
    }

    static String foo(long[] arr) {
        arr[1] += 1;
        arr[1] = 1L << arr[1]; // Power function, new cool. think of 1 as 2^0. << is signed right bit shift operator.
        arr[1] -= 1;
        return arr[0] <= arr[1] ? "yes" : "no";
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DaylightSavingTime {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            char c = sc.getWord().charAt(0);
            int d  = sc.getInt();
            int h = sc.getInt(), m = sc.getInt();
            if (c == 'B') {
                m -= d;
                while (m < 0) {
                    h--;
                    m += 60;
                }
            } else {
                m += d;
                while (m >= 60) {
                    h++;
                    m -= 60;
                }
            }
            if (h >= 24) h -= 24;
            if (h < 0) h += 24;
            sb.append(h).append(" ").append(m).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Perket {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        ArrayList<Integer> sour = new ArrayList<>();
        ArrayList<Integer> bitter = new ArrayList<>();
        int n = sc.getInt();
        for (int i = 0; i < n; i++) {
            sour.add(sc.getInt());
            bitter.add(sc.getInt());
        }
        int combinations = (int) Math.pow(2, n);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < combinations; i++) {
            boolean[] combination = getCombination(i, n);
            min = Math.min(min, getMin(combination, sour, bitter));
        }
        System.out.println(min);
        sc.close();
    }

    static int getMin(boolean[] combination, ArrayList<Integer> sour, ArrayList<Integer> bitter) {
        int sourTotal = 1, bitterTotal = 0;
        for (int i = 0; i < combination.length; i++) {
            if (combination[i]) {
                sourTotal *= sour.get(i);
                bitterTotal += bitter.get(i);
            }
        }
        return Math.abs(sourTotal - bitterTotal);
    }

    static boolean[] getCombination(int i, int n) {
        boolean[] arr = new boolean[n];
        int j = 0;
        for (; i > 0; i /= 2) 
            arr[j++] = i % 2 == 1;
        return arr;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class KnightJump {
    
    static final int[] rarr = new int[] {2, 2, -2, -2, 1, 1, -1, -1};
    static final int[] carr = new int[] {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        char[][] board = new char[n][n];
        int[][] counts = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int ki = -1, kj = -1;
        for (int i = 0; i < n; i++) {
            board[i] = sc.getWord().toCharArray();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'K') {
                    ki = i;
                    kj = j;
                }
                counts[i][j] = -1;
            }
        }
        foo(board, counts, visited, ki, kj, n);
        // for (int i = 0; i < n; i++)
        //     System.out.println(Arrays.toString(counts[i]));
        System.out.println(counts[0][0]);
        sc.close();
    }

    static void foo(char[][] board, int[][] counts, boolean[][] visited, int i, int j, int n) {

        class Point {
            int x, y;
            int count;
            public Point(int x, int y, int count) {
                this.x = x;
                this.y = y;
                this.count = count;
            }
        }

        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(i, j, 0);
        queue.offer(start);
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (validBounds(p.x, p.y, n) && !visited[p.x][p.y] && board[p.x][p.y] != '#') {
                visited[p.x][p.y] = true;
                counts[p.x][p.y] = p.count;
                for (int k = 0; k < 8; k++) 
                    queue.offer(new Point(p.x + rarr[k], p.y + carr[k], p.count + 1));
            }
        }
    }

    static boolean validBounds(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SantaKlas {
    
    public static void main(String[] args) {
        System.out.println(foo(java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()));
    }

    static String foo(int[] arr) {
        int h = arr[0], v = arr[1];
        if (v <= 180) return "safe";
        return String.valueOf((int) (h / Math.cos(Math.toRadians(v) + (Math.PI / 2))));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IWannaBeTheVeryBest {
    
    public static void main(String[] args) {

        class Pokenom {
            int id;
            Long attack;
            Long defense;
            Long health;

            Pokenom(int id, Long attack, Long defense, Long health) {
                this.id = id;
                this.attack = attack;
                this.defense = defense;
                this.health = health;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Pokenom) {
                    return this.id == (((Pokenom) obj).id);
                }
                return false;
            }
        }

        Kattio sc = new Kattio(System.in);
        Comparator<Pokenom> attackComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.attack.compareTo(p1.attack);
            }
        };
        Comparator<Pokenom> defenseComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.defense.compareTo(p1.defense);
            }
        };
        Comparator<Pokenom> healthComp = new Comparator<>() {
            @Override
            public int compare(Pokenom p1, Pokenom p2) {
                return p2.health.compareTo(p1.health);
            }
        };
        int n = sc.getInt(), k = sc.getInt();
        ArrayList<Pokenom> pokenoms = new ArrayList<>();
        Set<Pokenom> chosen = new HashSet<>();
        for (int i = 0; i < n; i++)
            pokenoms.add(new Pokenom(i, sc.getLong(), sc.getLong(), sc.getLong()));
        Collections.sort(pokenoms, attackComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        Collections.sort(pokenoms, defenseComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        Collections.sort(pokenoms, healthComp);
        for (int i = 0; i < k; i++)
            chosen.add(pokenoms.get(i));
        System.out.println(chosen.size());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Kutevi {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int factor = 360;
        int n = sc.getInt(), k = sc.getInt();
        while (n-- > 0) 
            factor = gcd(factor, sc.getInt());
        while (k-- > 0) 
            if (sc.getInt() % factor == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        System.out.print(sb.toString());
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Sanic {
    
    public static void main(String[] args) {
        System.out.println(new java.util.Scanner(System.in).nextDouble() - 1);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class DrinkingSong {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        String s = sc.getWord();
        while (n > 0) {
            if (n == 1) {
                System.out.printf("1 bottle of %s on the wall, 1 bottle of %s.\n", s, s);
            } else {
                System.out.printf("%d bottles of %s on the wall, %d bottles of %s.\n", n, s, n, s);
            }
            
            n--;
            if (n == 1) {
                System.out.printf("Take one down, pass it around, 1 bottle of %s on the wall.\n", s);
            } else if (n == 0) {
                System.out.printf("Take it down, pass it around, no more bottles of %s.\n", s);
            } else {
                System.out.printf("Take one down, pass it around, %d bottles of %s on the wall.\n", n, s);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Crne {
    
    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLong()));
    }

    static long foo(long n) {
        long a = n / 2, b = a;
        if (a + b < n) b++;
        a++;
        b++;
        return a * b;
        // 1 2
        // 2 4
        // 3 6
        // 4 8
        // 5 12
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WordsForNumbers {
    
    private static final String[] oneToTwenty = new String[] {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", 
                                                                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = new String[] {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};                                                    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine())
            sb.append(foo(sc.nextLine())).append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static String foo(String s) {
        String[] arr = s.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (isNumeric(arr[i])) {
                arr[i] = convert(arr[i]).trim().replaceAll("\\s+", "-");
                if (i == 0) {
                    arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1, arr[i].length());
                }
            }
        }
        String ss = "";
        for (String sss : arr) 
            ss += sss + " ";
        return ss.trim();
    }

    static String convert(String s) {
        int i = Integer.parseInt(s);
        if (i == 0) return "zero";
        String ss = "";
        if (i < 20) {
            ss = oneToTwenty[i];
        } else {
            ss = oneToTwenty[i % 10];
            i /= 10;
            ss = tens[i] + ss;
        }
        return ss;
    }

    static boolean isNumeric(String s) {
        if (s == null) return false;
        try {
            int i = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IHateTheNumberNine {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        BigInteger eight = BigInteger.valueOf(8);
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger modFactor = BigInteger.valueOf(1000000007);
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(eight.multiply(nine.modPow(BigInteger.valueOf(sc.getLong()).subtract(BigInteger.ONE), modFactor)).mod(modFactor)).append("\n");
        System.out.print(sb.toString());
        sc.close();    
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class OpenSource {
    
    static final Comparator<Entry<String, Set<String>>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Set<String>> e1, Entry<String, Set<String>> e2) {
                if (e1.getValue().size() == e2.getValue().size()) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return e2.getValue().size() - e1.getValue().size();
            }
        };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        HashMap<String, Set<String>> projectList = new HashMap<>();
        HashMap<String, Integer> studentCount = new HashMap<>();
        
        String currProject = "";
        Set<String> currSet = null;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            } else if (s.equals("1")) {
                studentsToProject(projectList, studentCount, currProject, currSet);
                removeGreedyStudents(projectList, studentCount);
                writeToOut(projectList, sb);
                currProject = "";
                currSet = null;
                projectList.clear();
                studentCount.clear();
            } else if (isProject(s)) {
                if (currSet != null) 
                    studentsToProject(projectList, studentCount, currProject, currSet);
                currSet = new HashSet<>();
                currProject = s;
            } else {
                currSet.add(s);
            }
        }   
        System.out.print(sb.toString());
        sc.close();
    }
    
    static void studentsToProject(HashMap<String, Set<String>> projectList, HashMap<String, Integer> studentCount, String currProject, Set<String> currSet) {
        projectList.put(currProject, currSet);
                    for (String student : currSet) 
                        studentCount.put(student, (studentCount.containsKey(student) ? studentCount.get(student) : 0) + 1);
    }

    static void writeToOut(HashMap<String, Set<String>> projectList, StringBuilder sb) {
        ArrayList<Entry<String, Set<String>>> al = new ArrayList<>(projectList.entrySet());
        Collections.sort(al, comp);
        for (Entry<String, Set<String>> e : al) 
            sb.append(e.getKey()).append(" ").append(e.getValue().size()).append("\n");
    }   

    static void removeGreedyStudents(HashMap<String, Set<String>> projectList, HashMap<String, Integer> studentCount) {
        for (Entry<String, Set<String>> project : projectList.entrySet()) {
            Set<String> set = project.getValue();
            for (Entry<String, Integer> student : studentCount.entrySet()) 
                if (set.contains(student.getKey()) && student.getValue() > 1)
                    set.remove(student.getKey());                    
        }
    }

    static boolean isProject(String s) {
        for (char c : s.toCharArray()) 
            if ((65 > c || c > 90) && c != 32) return false;
        return true;
    }

}

///////////////////////////////////////////////////////////////////////////////

class TheBackslashProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            while (n-- > 0) 
                s = s.replace("\\", "\\\\")
                        .replace("!", "\\!")
                        .replace("\"", "\\\"")
                        .replace("#", "\\#")
                        .replace("$", "\\$")
                        .replace("%", "\\%")
                        .replace("&", "\\&")
                        .replace("'", "\\'")
                        .replace("(", "\\(")
                        .replace(")", "\\)")
                        .replace("*", "\\*")
                        .replace("[", "\\[")
                        .replace("]", "\\]");
            sb.append(s).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GCDs {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> tmp = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            arr.add(sc.getInt());        
            set.add(arr.get(i));
        }
        while (arr.size() > 1) { // need more than 2 to do gcd
            for (int i = 0; i < arr.size() - 1; i++) {
                int x = gcd(arr.get(i), arr.get(i + 1)); // gcd of gcd, further reducing, because we are finding the common divisors for an entire range as well
                tmp.add(x);
                set.add(x);
            }
            arr = new ArrayList<>(tmp);
            tmp = new HashSet<>();
        }
        System.out.println(set.size());
        sc.close();
    }

    static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Putovanje {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), c = sc.getInt(), max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        for (int i = 0; i < n; i++) {
            int localmax = 0, eaten = 0;
            for (int j = i; j < n; j++) {
                if (eaten + arr[j] <= c) {
                    eaten += arr[j];
                    localmax++;
                }
            }
            max = Math.max(max, localmax);
        }
        System.out.println(max);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class JudgingTroubles {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> dom = new HashMap<>();
        HashMap<String, Integer> kattis = new HashMap<>();
        int n = sc.getInt(), count = 0, nn = n;
        String s = "";
        while (nn-- > 0)
            dom.put(s = sc.getWord(), (dom.containsKey(s) ? dom.get(s) : 0) + 1);
        while (n-- > 0)
            kattis.put(s = sc.getWord(), (kattis.containsKey(s) ? kattis.get(s) : 0) + 1);
        for (Entry<String, Integer> e : dom.entrySet()) 
            count += Math.min(e.getValue(), kattis.containsKey(e.getKey()) ? kattis.get(e.getKey()) : 0);            
        System.out.println(count);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DogAndGopher {
    
    public static void main(String[] args) {

        class Point {
            double x, y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }

            boolean isEmpty() {
                return this.x == Double.MAX_VALUE && this.y == Double.MAX_VALUE;
            }

        }

        Kattio sc = new Kattio(System.in);
        Point gopher = new Point(sc.getDouble(), sc.getDouble());
        Point dog = new Point(sc.getDouble(), sc.getDouble());
        Point escape = new Point(Double.MAX_VALUE, Double.MAX_VALUE);
        while (sc.hasMoreTokens()) {
            Point hole = new Point(sc.getDouble(), sc.getDouble());
            double gopherDistance = gopher.distanceTo(hole);
            double dogDistance = dog.distanceTo(hole) / 2;
            if (gopherDistance < dogDistance) {
                escape = hole;
                break;
            }
        }
        System.out.println(escape.isEmpty() ? "The gopher cannot escape." : "The gopher can escape through the hole at (" + String.format("%.3f", escape.x) + "," + String.format("%.3f", escape.y) + ").");
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Doorman {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt(), men = 0, women = 0;
        sc.nextLine();
        char[] arr = sc.nextLine().toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        for (char c : arr)
            al.add(c);
        while (true) {
            boolean stuck = true;
            if (Math.abs(men + 1 - women) <= diff) {
                if (!al.isEmpty()) {
                    if (al.get(0) == 'M') {
                        al.remove(0);
                        stuck = false;
                        men++;
                    } else if (al.size() > 1 && al.get(1) == 'M') {
                        al.remove(1);
                        stuck = false;
                        men++;
                    }
                }
            }   
            if (stuck && Math.abs(men - women - 1) <= diff) {
                if (!al.isEmpty()) {
                    if (al.get(0) == 'W') {
                        al.remove(0);
                        stuck = false;
                        women++;
                    } else if (al.size() > 1 && al.get(1) == 'W') {
                        al.remove(1);
                        stuck = false;
                        women++;
                    }
                }
            }
            if (stuck || al.isEmpty()) break;
        }
        System.out.println(men + women);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ICanGuesstheDataStructure {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = sc.getInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.getInt();
                arr[i][1] = sc.getInt();
            }
            boolean stack = isStack(arr);
            boolean queue = isQueue(arr);
            boolean priorityqueue = isPriorityQueue(arr);
            int c = (stack ? 1 : 0) + (queue ? 1 : 0) + (priorityqueue ? 1 : 0);
            // System.out.println(stack + " " + queue + " " + priorityqueue);
            if (c == 0) {
                sb.append("impossible");
            } else if (c > 1) {
                sb.append("not sure");
            } else if (stack) {
                sb.append("stack");
            } else if (queue) {
                sb.append("queue");
            } else if (priorityqueue) {
                sb.append("priority queue");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean isStack(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    stack.push(ar[1]);
                    break;
                case 2:
                    if (stack.isEmpty()) return false;
                    int x = stack.pop();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }

    static boolean isQueue(int[][] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    queue.offer(ar[1]);
                    break;
                case 2:
                    if (queue.isEmpty()) return false;
                    int x = queue.poll();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }

    static final Comparator<Integer> comp = new Comparator<>() {
        @Override
        public int compare(Integer i1, Integer i2) {
            return i2.compareTo(i1);
        }
    };

    static boolean isPriorityQueue(int[][] arr) {
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(comp);
        for (int[] ar : arr) {
            int op = ar[0];
            switch(op) {
                case 1:
                    priorityqueue.offer(ar[1]);
                    break;
                case 2:
                    if (priorityqueue.isEmpty()) return false;
                    int x = priorityqueue.poll();
                    if (x != ar[1]) return false;
                    break;
                default: return false;
            }
        }
        return true;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EventPlanning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int participants = sc.getInt(), budget = sc.getInt(), hotels = sc.getInt(), weeks = sc.getInt();
        int min = Integer.MAX_VALUE;
        while (hotels-- > 0) {
            int price = sc.getInt();
            for (int i = 0; i < weeks; i++) {
                int beds = sc.getInt(), totalCost = 0;
                if (beds >= participants && (totalCost = participants * price) <= budget) 
                    min = Math.min(totalCost, min);
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? "stay home" : min);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TheGrandAdventure {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) 
            sb.append(run(sc.getWord().toCharArray()) ? "YES" : "NO").append("\n");
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean run(char[] arr) {
        Stack<Character> bag = new Stack<>();
        for (char c : arr) {
            switch (c) {
                case '$': // Money
                case '|': // Incense
                case '*': // Gem
                    bag.push(c);
                    break;
                case 't': // Trader
                    if (bag.isEmpty() || bag.pop() != '|') return false;
                    break;
                case 'j': // Jeweler
                    if (bag.isEmpty() || bag.pop() != '*') return false;
                    break;
                case 'b': // Banker
                    if (bag.isEmpty() || bag.pop() != '$') return false;
                    break;
                case '.':
                    break;
            }
        }
        return bag.isEmpty();
    }
        
}

///////////////////////////////////////////////////////////////////////////////

class DeliciousBubbleTea {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int teaTypes = sc.getInt();
        int[] prices = new int[teaTypes];
        for (int i = 0; i < teaTypes; i++)
            prices[i] = sc.getInt();
        int toppingTypes = sc.getInt();
        int[] toppings = new int[toppingTypes];
        for (int i = 0; i < toppingTypes; i++)
            toppings[i] = sc.getInt();
        ArrayList<Integer> totalPrices = new ArrayList<>();
        for (int i = 0; i < teaTypes; i++) {
            int toppingCounts = sc.getInt();
            while (toppingCounts-- > 0)
                totalPrices.add(prices[i] + toppings[sc.getInt() - 1]);
        }
        int wallet = sc.getInt();
        int min = Collections.min(totalPrices);
        System.out.println((wallet / min) > 0 ? (wallet / min) - 1 : 0);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PizzaHawaii {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        Comparator<Entry<String, Integer>> comp = new Comparator<>(){
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        };
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            HashMap<String, Integer> foreignIngredients = new HashMap<>();
            HashMap<String, Integer> englishIngredients = new HashMap<>();
            while (n-- > 0) {
                String pizza = sc.getWord();
                int pizzaCode = pizza.hashCode();
                int foreignCount = sc.getInt();
                String ingredient = "";
                while (foreignCount-- > 0) 
                    foreignIngredients.put(ingredient = sc.getWord(), (foreignIngredients.containsKey(ingredient) ? foreignIngredients.get(ingredient) : 0) + pizzaCode);
                int englishCount = sc.getInt();
                while (englishCount-- > 0) 
                    englishIngredients.put(ingredient = sc.getWord(), (englishIngredients.containsKey(ingredient) ? englishIngredients.get(ingredient) : 0) + pizzaCode);               
            }
            ArrayList<Entry<String, Integer>> foreignList = new ArrayList<>(foreignIngredients.entrySet());
            ArrayList<Entry<String, Integer>> englishList = new ArrayList<>(englishIngredients.entrySet());
            Collections.sort(foreignList, comp);
            Collections.sort(englishList, comp);
            for (int i = 0; i < foreignList.size(); i++) 
                for (int j = 0; j < englishList.size(); j++) 
                    if (foreignList.get(i).getValue().equals(englishList.get(j).getValue())) 
                        sb.append("(").append(foreignList.get(i).getKey()).append(", ").append(englishList.get(j).getKey()).append(")").append("\n");           
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ThankGodItsFriday {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().replaceAll("\\s+", "");
        boolean special = s.equals("29FEB");

        GregorianCalendar gregCal = (GregorianCalendar) GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMM");
        Date date = sdf.parse(s);
        int targetFirstDay = translateToInt(sc.nextLine());
        
        ArrayList<Integer> years = new ArrayList<>();
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        start.set(2000, 0, 1);
        end.set(2100, 0, 1);
        
        while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == targetFirstDay) 
                if (special) {
                    if (gregCal.isLeapYear(start.get(Calendar.YEAR)))
                        years.add(start.get(Calendar.YEAR));    
                } else {
                    years.add(start.get(Calendar.YEAR));
                }
                
            start.add(Calendar.YEAR, 1);    
        }
                
        if (special) {
            start.set(2000, 2, 0);
        } else {
            start.setTime(date);
        }
        int yes = 0, no = 0;
        for (int year : years) {
            System.out.println(start.getTime());
            start.set(Calendar.YEAR, year);
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                yes++;
            } else {
                no++;
            }
        }

        if (yes > 1) {
            if (no > 1) {
                System.out.println("not sure");
            } else {
                System.out.println("TGIF");
            }
        } else {
            System.out.println(":(");
        }
        
        sc.close();
    }

    static int translateToInt(String s) {
        switch(s) {
            case "MON": return Calendar.MONDAY;
            case "TUE": return Calendar.TUESDAY;
            case "WED": return Calendar.WEDNESDAY;
            case "THU": return Calendar.THURSDAY;
            case "FRI": return Calendar.FRIDAY;
            case "SAT": return Calendar.SATURDAY;
            case "SUN": return Calendar.SUNDAY;
            default: return -1;
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class Thanos {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            long p = sc.getLong(), r = sc.getLong(), f = sc.getLong(), count = 0;
            while (p <= f) {
                p *= r;
                count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BinarySearchTree {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        int[] counts = new int[300000 + 1];
        long currCount = 0;
        TreeSet<Integer> set = new TreeSet<>();
        while(n-- > 0) {
            int x = sc.getInt();
            set.add(x);
            Integer left = set.lower(x); 
            Integer right = set.higher(x);
            int count = 0;
            count = left != null ? Math.max(count, counts[left]) : count;
            count = right != null ? Math.max(count, counts[right]) : count;
            currCount += count;
            counts[x] = ++count;
            sb.append(currCount).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CurseTheDarkness {
    
    public static void main(String[] args) {

        class Point {
            double x, y;
            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            double distanceTo(Point p) {
                return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
            }
        }

        class Candle {

            Point centre;
            double radius = 8.0;
            public Candle(Point centre) {
                this.centre = centre;
            }

            boolean isCovers(Point p) {
                return p.distanceTo(this.centre) <= this.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.getInt();
        while (m-- > 0) {
            Point book = new Point(sc.getDouble(), sc.getDouble());
            int n = sc.getInt();
            boolean light = false;
            while (n-- > 0) 
                if (new Candle(new Point(sc.getDouble(), sc.getDouble())).isCovers(book)) 
                        light = true;
                
            sb.append(light ? "light a candle" : "curse the darkness").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Natrij {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int current = Integer.parseInt(sc.nextLine().replaceAll(":", ""));
        int explode = Integer.parseInt(sc.nextLine().replaceAll(":", ""));
        if (explode / 10000 < current / 10000) explode += 240000;
        int hours = (explode / 10000) - (current / 10000);
        int minutes = ((explode % 10000) / 100) - ((current % 10000) / 100);
        int seconds = (explode % 100) - (current % 100);
        if (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }        
        if (hours == 0 && minutes == 0 && seconds == 0) hours = 24;
        System.out.printf("%s:%s:%s", 
                hours < 10 ? "0" + hours : hours, 
                minutes < 10 ? "0" + minutes: minutes, 
                seconds < 10 ? "0" + seconds : seconds);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Kolone {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        sc.getInt();
        sc.getInt();
        char[] left = reverse(sc.getWord().toCharArray()), right = sc.getWord().toCharArray();
        int n = sc.getInt();
        int leftants = left.length;
        int rightants = right.length;
        int totalants = leftants + rightants;
        char[][] ants = new char[totalants][1];
        int i = 0;
        for (; i < leftants; i++) 
            ants[i] = new char[] {left[i], 'l'};
        for (; i < totalants; i++) 
            ants[i] = new char[] {right[i - leftants], 'r'};
        while (n-- > 0) {
            for (int j = 0; j < totalants - 1; j++) {
                if (ants[j][1] == 'l' && ants[j + 1][1] == 'r') {
                    char[] tmp = ants[j];
                    ants[j] = ants[j + 1];
                    ants[j + 1] = tmp;
                    j++;
                }
            }
        }
        String s = "";
        for (char[] arr : ants)
            s += arr[0];
        System.out.println(s);
        sc.close();
    }

    static char[] reverse(char[] arr) {
        char[] arr2 = new char[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) 
            arr2[--j] = arr[i];
        return arr2;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Natjecanje {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int teams = sc.getInt(), damaged = sc.getInt(), reserves = sc.getInt();
        int[] arr = new int[teams];
        Arrays.fill(arr, 1);
        for (int i = 0; i < damaged; i++)
            arr[sc.getInt() - 1]--;
        for (int i = 0; i < reserves; i++)
            arr[sc.getInt() - 1]++;
        for (int i = 0; i < teams; i++) 
            if (arr[i] == 0) {
                if (valid(i - 1, teams) && arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (valid(i + 1, teams) && arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                }
            }
        int min = 0;
        for (int i = 0; i < teams; i++)
            min += arr[i] == 0 ? 1 : 0;
        System.out.println(min);
        sc.close();
    }

    static boolean valid(int i, int n) {
        return 0 <= i && i < n;
    }
     
}

///////////////////////////////////////////////////////////////////////////////

class JumbledCommunication {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < 256; i++) 
            hmap.put((i ^ (i << 1)) % 256, i);
        int n = sc.getInt();
        while (n-- > 0) 
            System.out.printf("%d ", hmap.get(sc.getInt()));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RadioCommercials {
    
    public static void main(String[] args) {
        // Kadane's algorithm
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt();
        int[] arr = new int[n];
        int[] memoized = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        getMax(arr, visited, memoized, n - 1, p); // backwards
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(max, memoized[i]);
        System.out.println(max);
        sc.close();
    }

    static int getMax(int[] arr, boolean[] visited, int[] memoized, int i, int p) {
        if (i == 0) return Math.max(arr[i] - p, -p);
        if (visited[i]) return memoized[i];
        // Kadane's algorithm, finding the maximum of just two numbers, A[i] and (A[i] + local_maximum[i-1])
        memoized[i] = Math.max(arr[i], arr[i] + getMax(arr, visited, memoized, i - 1, p)) - p;
        visited[i] = true;
        return memoized[i];
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GoldbachsConjecture {
    
    public static void main(String[] args) {

        class Sum {
            int first, second;
            Sum(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] primes = new boolean[32001];
        getPrimes(primes);
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt();
            int first = x == 4 ? 2 : 1, second = 0;
            ArrayList<Sum> al = new ArrayList<>();
            while (first <= (second = x - first)) {
                if (primes[first] && primes[second]) 
                    al.add(new Sum(first, second));
                first += 2;
            }
            sb.append(x + " has " + al.size() + " representation(s)").append("\n");
            for (Sum sum : al)
                sb.append(sum.first + "+" + sum.second).append("\n");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void getPrimes(boolean[] primes) {
        for (int i = 2; i <= 32000; i++) 
            primes[i] = isPrime(i);
    }

    static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(x -> n % x == 0);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ClosestSum {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = 1;
        while (sc.hasMoreTokens()) {
            sb.append("Case " + t++ + ":").append("\n");
            int n = sc.getInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.getInt();
            int m = sc.getInt();
            while (m-- > 0) {
                int query = sc.getInt();
                int sum = arr[0] + arr[1];
                for (int i = 0; i < n; i++) 
                    for (int j = i + 1; j < n; j++) {
                        int localsum = arr[i] + arr[j];
                        if (Math.abs(query - sum) > Math.abs(query - localsum)) 
                            sum = localsum;
                    }
                sb.append("Closest sum to ")
                    .append(query)
                    .append(" is ")
                    .append(sum)
                    .append(".")
                    .append("\n");
            }

        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FractionalLotion {
    
    public static void main(String[] args) {

        // 1/x + 1/y = 1/n
        // 1/x = 1/n - 1/y
        // x = 1 / (1/n - 1/y);
        // x = 1 / ((y - n)/(n * y))
        // x = (n * y) / (y - n)

        // 1/n = 1/1
        // x = (1 * y) / (y - 1)

        // y must be > n, lower bound
        // x = (1 * 2) / (2 - 1) = 1 / 1

        // upper bound?
        // 1/n = 1/4
        
        // x = (4 * 5) / (5 - 4) = 20 / 1
        // x = (4 * 6) / (6 - 4) = 24 / 2
        // x = (4 * 7) / (7 - 4) = 28 / 3 X
        // x = (4 * 8) / (8 - 4) = 32 / 4
        // x = (4 * 9) / (9 - 4) = 36 / 5 X
        // x = (4 * 10) / (10 - 4) = 40 / 6 X
        // x = (4 * 11) / (11 - 4) = 44 / 7 X
        // x = (4 * 12) / (12 - 4) = 48 / 8 X
        // x = (4 * 13) / (13 - 4) = 52 / 9 X
        // x = (4 * 14) / (14 - 4) = 56 / 10 X
        // x = (4 * 15) / (15 - 4) = 60 / 11 X
        // x = (4 * 16) / (16 - 4) = 64 / 12 X

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            int n = Integer.parseInt(sc.getWord().split("/")[1]);
            int start = n + 1, end = n * 2, count = 0;
            for (int y = start; y <= end; y++)
                if ((n * y) % (y - n) == 0) count++;
            sb.append(count).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ElevatorTrouble {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int floors = arr[0], start = arr[1], goal = arr[2], up = arr[3], down = arr[4];
        long[] count = new long[floors + 1];
        boolean[] visited = new boolean[floors + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            int possibleUp = curr + up;
            int possibleDown = curr - down;
            calculateNext(count, visited, queue, curr, possibleUp);
            calculateNext(count, visited, queue, curr, possibleDown);
        }
        System.out.println(visited[goal] ? count[goal] : "use the stairs");
    }
    
    static void calculateNext(long[] count, boolean[] visited, Queue<Integer> queue, int curr, int possible) {
        if (0 < possible && possible < count.length && !visited[possible]) {
            visited[possible] = true;
            count[possible] = count[curr] + 1L;
            queue.offer(possible);
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class CombinationLock {
    
    static final int CALIBRATION_MARKS_TO_DEGREES = 360 / 40;
    static final int TOTAL_CALIBRATION_MARKS = 40;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int origin = 0, first = 0, second = 0, third = 0;
        while (true) {
            origin = sc.getInt();
            first = sc.getInt();
            second = sc.getInt();
            third = sc.getInt();
            if (origin == 0 && first == 0 && second == 0 && third == 0) break;
                    System.out.println(
                        ((2 * (TOTAL_CALIBRATION_MARKS)) // turn the dial clockwise 2 full turns
                        + turnToMark(origin, first) // stop at the first number of the combination
                        + TOTAL_CALIBRATION_MARKS // turn the dial counter-clockwise 1 full turn
                        + turnToMark(second, first) // continue turning counter-clockwise until the 2nd number is reached
                        + turnToMark(second, third)) // turn the dial clockwise again until the 3rd number is reached
                        * CALIBRATION_MARKS_TO_DEGREES
                    );
                }
        sc.close();
    }

    static int turnToMark(int start, int end) {
        return (TOTAL_CALIBRATION_MARKS + start - end) % TOTAL_CALIBRATION_MARKS;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Arithmetic {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        String s = sc.getWord();
        BigInteger n = new BigInteger(s, 8);
        System.out.println(n.toString(16));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class FBIUniversalControlNumbers {
    
    private static final HashMap<Character, Character> confusionMap = new HashMap<>();
    private static final HashMap<Character, Integer> easyMap = new HashMap<>();
    private static final int[] computation = new int[]{2, 4, 5, 7, 8, 10, 11, 13};

    public static void main(String[] args) {

        confusionMap.put('B','8');
        confusionMap.put('G','C');
        confusionMap.put('I','1');
        confusionMap.put('O','0');
        confusionMap.put('Q','0');
        confusionMap.put('S','6');
        confusionMap.put('U','Y');
        confusionMap.put('Y','V');
        confusionMap.put('Z','2');
        
        easyMap.put('0', 0);
        easyMap.put('1', 1);
        easyMap.put('2', 2);
        easyMap.put('3', 3);
        easyMap.put('4', 4);
        easyMap.put('5', 5);
        easyMap.put('6', 6);
        easyMap.put('7', 7);
        easyMap.put('8', 8);
        easyMap.put('9', 9);
        easyMap.put('A', 10); 
        easyMap.put('C', 11);
        easyMap.put('D', 12);
        easyMap.put('E', 13);
        easyMap.put('F', 14);
        easyMap.put('H', 15);
        easyMap.put('J', 16);
        easyMap.put('K', 17);
        easyMap.put('L', 18);
        easyMap.put('M', 19);
        easyMap.put('N', 20);
        easyMap.put('P', 21);
        easyMap.put('R', 22);
        easyMap.put('T', 23);
        easyMap.put('V', 24);
        easyMap.put('W', 25);
        easyMap.put('X', 26);

        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            sb.append(sc.getInt()).append(" ");
            char[] arr = sc.getWord().toCharArray();
            for (int i = 0; i < arr.length; i++) 
                arr[i] = confusionMap.containsKey(arr[i]) ? confusionMap.get(arr[i]) : arr[i];
            int checkSum = 0;
            for (int i = 0; i < arr.length - 1; i++) 
                checkSum += easyMap.get(arr[i]) * computation[i];
            checkSum %= 27;
            if (checkSum == easyMap.get(arr[arr.length - 1])) {
                long decimal = 0;
                for (int i = arr.length - 1; i > 0 ; i--) 
                    decimal += Math.pow(27, arr.length - 1 - i) * easyMap.get(arr[i - 1]);                   
                sb.append(decimal);
            } else {
                sb.append("Invalid");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ChartingProgress {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("")) {
                action(al, sb);
            } else {
                al.add(s);
            }                     
        }
        action(al, sb);
        System.out.print(sb.toString());
        sc.close();
    }
    
    static void action(ArrayList<String> al, StringBuilder sb) {
        char[][] mtx = new char[al.size()][];
        for (int i = 0; i < al.size(); i++)
            mtx[i] = al.get(i).toCharArray();
        int[] arr = new int[mtx[0].length];
        for (int i = 0; i < mtx[0].length; i++)
            for (int j = 0; j < mtx.length; j++)
                if (mtx[j][i] == '*') {
                    arr[i] = mtx.length - 1 - j;
                    break;
                }
        Arrays.sort(arr);
        for (int i = 0; i < mtx[0].length; i++)
            for (int j = 0; j < mtx.length; j++)
                    mtx[j][i] = arr[i] == j ? '*' : '.';
        for (int i = mtx.length - 1; i >= 0; i--)
            sb.append(new String(mtx[i])).append("\n");
        sb.append("\n");
        al.clear();
    }

}

///////////////////////////////////////////////////////////////////////////////

class CodeCleanups {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), dirty = 0, pushes = 0, count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int j = 0;
        for (int i = 1; i <= 365 + 1; i++) {
            if (dirty < 20) { // strictly less than 20
                dirty += pushes; // accumulate pushes
                if (j < arr.length && arr[j] == i) {
                    pushes++;
                    j++;
                }
            } else { 
                dirty = 0;
                pushes = 0;
                count++;
                i -= 2; 
                if (arr[j - 1] == i + 1) j--;
                // it hit 20 and above today, so we should have cleared the day b4. 
                // i-- to move to previous day where it was still < 20
                // i-- again as to counter the i++ of the days running. 
                // So the next iteration will be yesterday
            }
        }
        if (dirty > 0) count++;
        System.out.println(count);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CompetitiveArcadeBasketball {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        HashMap<String, Integer> hmap = new HashMap<>();
        ArrayList<String> winners = new ArrayList<>();
        String name = "";
        int n = sc.getInt(), p = sc.getInt(), m = sc.getInt();
        while (n-- > 0)
            hmap.put(sc.getWord(), 0);
        while (m-- > 0) {
            hmap.put((name = sc.getWord()), hmap.get(name) + sc.getInt());
            if (!winners.contains(name) && hmap.get(name) >= p)
                winners.add(name);
        }
        if (winners.size() == 0) {
            System.out.println("No winner!");
        } else {
            for (String s : winners)
                System.out.printf("%s wins!\n", s);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ConversationLog {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Set<String>> setMap = new HashMap<>();
        HashMap<String, Integer> stringCount = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String[] arr = sc.nextLine().split("\\s+");
            String name = arr[0];
            Set<String> set = new HashSet<>();
            if (setMap.containsKey(name))
                set = setMap.get(name);
            setMap.put(name, set);
            for (int i = 1; i < arr.length; i++) {
                set.add(arr[i]);
                stringCount.put(arr[i], (stringCount.containsKey(arr[i]) ? stringCount.get(arr[i]) : 0) + 1);
            }            

        }
        ArrayList<Entry<String, Set<String>>> setList = new ArrayList<>(setMap.entrySet());
        Set<String> set = setList.get(0).getValue();
        for (int i = 1; i < setList.size(); i++)
            set.retainAll(setList.get(i).getValue());
        if (set.size() == 0) {
            System.out.println("ALL CLEAR");
        } else {
            ArrayList<Entry<String, Integer>> stringList = new ArrayList<>(stringCount.entrySet());
            Collections.sort(stringList, new Comparator<>() {
                @Override
                public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                    return e1.getValue() == e2.getValue() ? e1.getKey().compareTo(e2.getKey()) : e2.getValue().compareTo(e1.getValue());
                }
            });
            for (Entry<String, Integer> e : stringList)
                if (set.contains(e.getKey())) 
                    System.out.println(e.getKey());
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CostumeContest {
    
    public static void main(String[] args) {

        class Costume implements Comparable<Costume> {
            private String name;
            private int count;

            Costume(String name) {
                this.name = name;
                this.count = 1;
            }

            void addCount() {
                this.count += 1;
            }

            boolean sameCount(Costume c) {
                return this.count == c.count;
            }

            @Override
            public int compareTo(Costume c) {
                return this.count == c.count ? this.name.compareTo(c.name) : this.count - c.count;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                } else if (obj instanceof Costume) {
                    return ((Costume) obj).name.equals(this.name);
                }
                return false;
            }

            @Override
            public String toString() {
                return this.name;
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<Costume> al = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.getWord();
            Costume c = new Costume(name);
            if (al.contains(c)) {
                al.get(al.indexOf(c)).addCount();
            } else {
                al.add(c);
            }
        }   
        Collections.sort(al);
        Costume c = al.get(0);
        for (Costume cc : al)
            if (c.sameCount(cc)) {
                System.out.println(cc);
            } else break;

    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PermutedArithmeticSequence {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        while (n-- > 0) {
            int nn = sc.getInt();
            int[] nnn = new int[nn];
            for (int nnnn = 0; nnnn < nn; nnnn++) 
                nnn[nnnn] = sc.getInt();
            boolean nnnnnn = checkArithmeticSequence(nnn);
            if (nnnnnn) {
                sb.append("arithmetic"); 
            } else {
                Arrays.sort(nnn);
                if (checkArithmeticSequence(nnn)) {
                    sb.append("permuted arithmetic");
                } else {
                    sb.append("non-arithmetic");
                }
            }
            sb.append("\n");            
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean checkArithmeticSequence(int[] n) {
        int nn = n[0] - n[1];
        for (int i = 0; i < n.length - 1; i++)
            if (nn != n[i] - n[i + 1]) return false;
        return true;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TrainPassengers {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int c = sc.getInt(), n = sc.getInt();
        System.out.println(foo(c, n, sc) ? "possible" : "impossible");
        sc.close();
    }

    static boolean foo(int c, int n, Kattio sc) {
        int currCapacity = c, left = 0, entered = 0, stay = 0;
        for (int i = 0; i < n; i++) {
            left = sc.getInt();
            entered = sc.getInt();
            stay = sc.getInt();
            currCapacity += left - entered;
            if (i == 0 && left > 0) {
                return false;
            } else if (i == n - 1 && (currCapacity != c || stay > 0)) {
                return false;
            } else if (currCapacity < 0 || currCapacity > c) {
                return false;
            } else if (currCapacity > 0 && stay > 0) {
                return false;
            }
        }
        return true;
    }

    
}

///////////////////////////////////////////////////////////////////////////////

class Sort {
    
    static final HashMap<Integer, Integer> hmap = new HashMap<>();
    static final HashMap<Integer, Integer> hmap2 = new HashMap<>();

    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return hmap.get(i2) == hmap.get(i1) ? hmap2.get(i1) - hmap2.get(i2) : hmap.get(i2) - hmap.get(i1);
            }
        };
        Kattio sc = new Kattio(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.getInt(), c = sc.getInt(), i = 0;
        while (n-- > 0) {
            int x = sc.getInt();
            al.add(x);
            hmap.put(x, (hmap.containsKey(x) ? hmap.get(x) : 0) + 1);
            if (!hmap2.containsKey(x)) 
                hmap2.put(x, i++);
            
        }
        Collections.sort(al, comp);
        System.out.println(al.toString().replaceAll("[\\[\\],]", ""));
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PopularVote {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            int total = 0, highest = 0, index = 0;
            for (int i = 1; i <= n; i++) {
                int x = sc.getInt();
                total += x;
                if (x > highest) {
                    highest = x;
                    index = i;
                } else if (x == highest) {
                    index = -1;
                }
            }
            if (index == -1) {
                sb.append("no winner");
            } else if (highest > total / 2) {
                sb.append("majority winner " + index);
            } else {
                sb.append("minority winner " + index);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class WizardOfOdds {
    
    public static void main(String[] args) {
        // probability tree height
        String[] arr = new java.util.Scanner(System.in).nextLine().split("\\s+");
        BigInteger n = new BigInteger(arr[0]);
        BigInteger k = new BigInteger(arr[1]);
        System.out.println(BigInteger.valueOf(2).pow(k.intValue()).compareTo(n) >= 0 ? "Your wish is granted!" : "You will become a flying monkey!");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Darts {
    
    public static void main(String[] args) {
        int[] scores = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] radiuses = new int[10];
        for (int i = 0; i < 10; i++)
            radiuses[i] = 20 * (11 - scores[i]);
        Kattio sc = new Kattio(System.in);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt(), total = 0;
            while (n-- > 0) {
                double distance = distance(sc.getDouble(), sc.getDouble());
                for (int i = 0; i < 10; i++)
                    if (distance <= radiuses[i]) {
                        total += scores[i];
                        break;
                    }
            }
            System.out.println(total);
        }
        sc.close();
    }

    static double distance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
}


///////////////////////////////////////////////////////////////////////////////

class PhoneList {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.getWord();
            Arrays.sort(arr);
            sb.append(check(arr) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static boolean check(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1].startsWith(arr[i])) return false;
        return true;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ExactChange {
    
    static final int MAX_PRICE = 10000;
    static final int MAX_BILL = 10000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int price = sc.getInt() - 1, n = sc.getInt();
            int[] wallet = IntStream.range(0, n).map(x -> sc.getInt()).toArray();
            int[] prices = IntStream.range(0, 10000 + 1).map(x -> x == 0 ? 0 : Integer.MAX_VALUE).toArray();
            for (int bill : wallet) {
                int tmpprice = price;
                while (tmpprice-- > 0) {
                    if (prices[tmpprice] <= MAX_PRICE && tmpprice + bill <= MAX_BILL && prices[tmpprice + bill] > prices[tmpprice] + 1)
                        prices[tmpprice + bill] = prices[tmpprice] + 1;
                }
            }
            while (++price < prices.length) 
                if (prices[price] < Integer.MAX_VALUE) break;
            sb.append(price).append(" ").append(prices[price]).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Inflation {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] balloons = new int[n];
        int[] helium = new int[n];
        for (int i = 0; i < n; i++) {
            helium[i] = sc.getInt();
            balloons[i] = i + 1;
        }
        Arrays.sort(helium);
        boolean fail = false;
        for (int i = 0; i < n; i++) {
            balloons[i] -= helium[i];
            if (balloons[i] < 0) {
                fail = true;
                break;
            } 
        }
        if (fail) {
            System.out.println("impossible");
        } else {
            double frac = 0;
            for (int i = 0; i < n; i++)
                frac = Math.max(frac, balloons[i] / ((double) i + 1));
            System.out.println(1 - frac);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Simplicity {

    public static void main(String[] args) {
        char[] arr = new java.util.Scanner(System.in).nextLine().toCharArray();
        int[] count = new int[26];
        for (char c : arr) count[c - 97]++;
        java.util.Arrays.sort(count);
        System.out.println(java.util.stream.IntStream.range(0, 26 - 2).map(x -> count[x]).reduce(0, (x,y) -> x + y));
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DigitalDisplay {
    
    public static void main(String[] args) {
        ArrayList<HashMap<Character, String>> alMaps = createMaps();
        StringBuilder sb = new StringBuilder();
        Kattio sc = new Kattio(System.in);
        String s = "end";
        while (!(s = sc.getWord()).equals("end")) {
            char[] arr = s.toCharArray();
            for (HashMap<Character, String> hm : alMaps)
                sb.append(hm.get(arr[0]))
                    .append("  ")
                    .append(hm.get(arr[1]))
                    .append(hm.get(arr[2]))
                    .append(hm.get(arr[3]))
                    .append("  ")
                    .append(hm.get(arr[4]))
                    .append("\n");
            sb.append("\n");
            sb.append("\n");
        }
        sb.append("end");
        System.out.println(sb.toString());
        sc.close();
    }

    static ArrayList<HashMap<Character, String>> createMaps() {
        HashMap<Character, String> firstLine = new HashMap<>();
        HashMap<Character, String> secondLine = new HashMap<>();
        HashMap<Character, String> thirdLine = new HashMap<>();
        HashMap<Character, String> fourthLine = new HashMap<>();
        HashMap<Character, String> fifthLine = new HashMap<>();
        HashMap<Character, String> sixthLine = new HashMap<>();
        HashMap<Character, String> seventhLine = new HashMap<>();
        writeFirst(firstLine);
        writeSecond(secondLine);
        writeThird(thirdLine);
        writeFourth(fourthLine);
        writeFifth(fifthLine);
        writeSixth(sixthLine);
        writeSeventh(seventhLine);
        ArrayList<HashMap<Character, String>> al = new ArrayList<>();
        al.add(firstLine);
        al.add(secondLine);
        al.add(thirdLine);
        al.add(fourthLine);
        al.add(fifthLine);
        al.add(sixthLine);
        al.add(seventhLine);
        return al;
    }

    static void writeFirst(HashMap<Character, String> hmap) {
        hmap.put('0', "+---+");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "+   +");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "+---+");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }

    static void writeSecond(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "    |");
        hmap.put('3', "    |");
        hmap.put('4', "|   |");
        hmap.put('5', "|    ");
        hmap.put('6', "|    ");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "|   |");
        hmap.put(':', "     ");
    }

    static void writeThird(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "    |");
        hmap.put('3', "    |");
        hmap.put('4', "|   |");
        hmap.put('5', "|    ");
        hmap.put('6', "|    ");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "|   |");
        hmap.put(':', "  o  ");
    }

    static void writeFourth(HashMap<Character, String> hmap) {
        hmap.put('0', "+   +");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "+---+");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "    +");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }

    static void writeFifth(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "|    ");
        hmap.put('3', "    |");
        hmap.put('4', "    |");
        hmap.put('5', "    |");
        hmap.put('6', "|   |");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "    |");
        hmap.put(':', "  o  ");
    }

    static void writeSixth(HashMap<Character, String> hmap) {
        hmap.put('0', "|   |");
        hmap.put('1', "    |");
        hmap.put('2', "|    ");
        hmap.put('3', "    |");
        hmap.put('4', "    |");
        hmap.put('5', "    |");
        hmap.put('6', "|   |");
        hmap.put('7', "    |");
        hmap.put('8', "|   |");
        hmap.put('9', "    |");
        hmap.put(':', "     ");
    }

    static void writeSeventh(HashMap<Character, String> hmap) {
        hmap.put('0', "+---+");
        hmap.put('1', "    +");
        hmap.put('2', "+---+");
        hmap.put('3', "+---+");
        hmap.put('4', "    +");
        hmap.put('5', "+---+");
        hmap.put('6', "+---+");
        hmap.put('7', "    +");
        hmap.put('8', "+---+");
        hmap.put('9', "+---+");
        hmap.put(':', "     ");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Tram {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), nn = n, nnn = 0L;
        while (n-- > 0)
            nnn -= sc.getLong() - sc.getLong();
        System.out.printf("%.6f", nnn / (double) nn);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class StickySituation {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getLong();
        Arrays.sort(arr);
        System.out.println(bar(arr, n) ? "possible" : "impossible");
        sc.close();        
    }

    static boolean bar(long[] arr, int n) {
        for (int i = 0; i < n - 2; i++) 
            if (foo(arr[i], arr[i + 1], arr[i + 2])) return true;
        return false;
    }

    static boolean foo(long a, long b, long c) {
        return a + b > c && b + c > a && c + a > b;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Reseto {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0], k = arr[1], target = -1;
        boolean[] nums = new boolean[n + 1];
        int i = 2;
        while (k > 0) {
            while (nums[i] && i < n + 1) i++;
            for (int j = i; j < n + 1 && k > 0; j += i) 
                if (!nums[j]) {
                    nums[j] = true;
                    k--;
                    target = j;
                }
        }
        System.out.println(target);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GameofThrowns {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int[] arr = new int[100 + 1];
        int n = sc.getInt(), k = sc.getInt(), i = 1;
        while (k-- > 0) {
            String s = sc.getWord();
            if (s.equals("undo")) {
                i -= sc.getInt();
            } else {
                int x = 0;
                arr[i + 1] = (x = (arr[i] + Integer.parseInt(s)) % n) < 0 ? x + n : x;
                i++;
            }
        }
        System.out.println(arr[i]);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DASort {

    // e.g.
    // 1 5 2 4 3 6
    // 1 2 3 4 5 6
    // finding out how many are already nicely sorted in order
    // it would be easier if the numbers are strictly ascending by 1
    // to get around that we have 2 arrays

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int p = sc.getInt();
        while (p-- > 0) {
            sb.append(sc.getInt()).append(" ");
            int n = sc.getInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) 
                arr2[i] = arr[i] = sc.getInt();
            Arrays.sort(arr);
            int j = 0;
            for (int i = 0; i < n; i++)
                if (arr2[i] == arr[j]) j++;
            sb.append(n - j).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DVDs {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int k = sc.getInt();
        while (k-- > 0) {
            int n = sc.getInt(), j = 1;
            for (int i = 0; i < n; i++)
                if (sc.getInt() == j) j++;
            sb.append(n - j + 1).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class EatingOut {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int m = arr[0], a = arr[1], b = arr[2], c = arr[3];
        System.out.println(a + b + c <= 2 * m ? "possible" : "impossible"); // max is 2 people pick same item
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ParsingHex {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        Set<Character> hexas = new HashSet<>();
        hexas.add('0');
        hexas.add('1');
        hexas.add('2');
        hexas.add('3');
        hexas.add('4');
        hexas.add('5');
        hexas.add('6');
        hexas.add('7');
        hexas.add('8');
        hexas.add('9');
        hexas.add('A');
        hexas.add('B');
        hexas.add('C');
        hexas.add('D');
        hexas.add('E');
        hexas.add('F');
        hexas.add('a');
        hexas.add('b');
        hexas.add('c');
        hexas.add('d');
        hexas.add('e');
        hexas.add('f');
        StringBuilder sb = new StringBuilder();
        while (sc.hasMoreTokens()) {
            char[] arr = sc.getWord().toCharArray();
            for (int i = 0; i < arr.length - 2; i++)
                if (arr[i] == '0' && (arr[i + 1] == 'x' || arr[i + 1] == 'X') && hexas.contains(arr[i + 2])) {
                    String s = "";
                    i += 2;
                    while (i < arr.length && hexas.contains(arr[i]))
                        s += arr[i++];
                    sb.append("0x").append(s).append(" ").append(Long.parseLong(s, 16)).append("\n");
                }
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HIndex {
    
    public static void main(String[] args) {
        // Get largest
        // H papers
        // H citations, min 
        // Reverse access
        // because it is sorted as ascending, any paper that is comes from the start if is bigger than the 
        // max h (num of papers aka n), will fail the condition
        // "Your H-Index is the largest number H such that you have H papers with at least H citations."
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), hmax = n;
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++)
            arr[i] = sc.getInt();
        Arrays.sort(arr);
        for (; hmax > 0; hmax--) 
            if (arr[hmax] < n - hmax + 1) break;
        System.out.println(n - hmax);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class VerifyThisYourMajesty {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        boolean[][] board = new boolean[n][n];
        for (int i = 0; i < n; i++)
            board[sc.getInt()][sc.getInt()] = true;
        System.out.println(solve(board, n) ? "CORRECT" : "INCORRECT");
        sc.close();
    }   

    static boolean solve(boolean[][] board, int n) {
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n ; j++)
                if (board[i][j] && !check(board, i, j, n)) return false;
        return true;
    }

    static boolean check(boolean[][] board, int i, int j, int n) {
        return checkHorizontal(board, i, j, n) 
                && checkVertical(board, i, j, n)
                && checkRightDiagonal(board, i, j, n)
                && checkLeftDiagonal(board, i, j, n);
    }

    static boolean checkHorizontal(boolean[][] board, int i, int j, int n) {
        for (int jj = 0; jj < n; jj++)
            if (jj != j && board[i][jj]) return false;
        return true;
    }

    static boolean checkVertical(boolean[][] board, int i, int j, int n) {
        for (int ii = 0; ii < n; ii++)
            if (ii != i && board[ii][j]) return false;
        return true;
    }

    static boolean checkRightDiagonal(boolean[][] board, int i, int j, int n) {
        int ii = i + 1, jj = j - 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii++;
            jj--;
        }
        ii = i - 1;
        jj = j + 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii--;
            jj++;
        }
        return true;
    }

    static boolean checkLeftDiagonal(boolean[][] board, int i, int j, int n) {
        int ii = i - 1, jj = j - 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii--;
            jj--;
        }
        ii = i + 1;
        jj = j + 1;
        while (isValidRange(ii, jj, n)) {
            if (i != ii && j != jj && board[ii][jj]) return false;
            ii++;
            jj++;
        }
        return true;
    }
    
    static boolean isValidRange(int i, int j, int n) {
        return 0 <= i && i < n && 0 <= j && j < n;
    }

}

///////////////////////////////////////////////////////////////////////////////

class RhymingSlang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<String[]> wordEndings = new ArrayList<>();
        String common = sc.nextLine();
        int e = Integer.parseInt(sc.nextLine());
        while (e-- > 0) 
            wordEndings.add(sc.nextLine().split("\\s+"));
        int p = Integer.parseInt(sc.nextLine());
        while (p-- > 0) 
            foo(wordEndings, sc.nextLine(), common, sb);
        System.out.print(sb.toString());
        sc.close();
    }

    static void foo(ArrayList<String[]> wordEndings, String phrase, String common, StringBuilder sb) {
        for (String[] arr : wordEndings) 
                for (String s : arr)
                    if (phrase.endsWith(s))
                        for (String ss : arr)
                            if (common.endsWith(ss)) {
                                sb.append("YES").append("\n"); 
                                return; 
                            }            
        sb.append("NO").append("\n");  
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Incognito {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            Set<String> categories = new HashSet<>();
            HashMap<String, Integer> attributesCount = new HashMap<>();
            while (n-- > 0) {
                sc.getWord();
                String attribute = sc.getWord();
                attributesCount.put(attribute, (attributesCount.containsKey(attribute) ? attributesCount.get(attribute) : 1) + 1);
                categories.add(attribute);
            }
            sb.append(categories.stream().mapToInt(x -> attributesCount.get(x)).reduce(1, (x, y) -> x * y) - 1).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class HardwoodSpecies {
    
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            String tree = "";
            double total = 0;
            int[] count = new int[10000 + 1];
            TreeMap<String, Integer> indexer = new TreeMap<>();
            while ((tree = br.readLine()) != null) {
                if (!indexer.containsKey(tree)) 
                    indexer.put(tree, indexer.size());
                count[indexer.get(tree)]++;
                total++;
            }
            for (Entry<String, Integer> e : indexer.entrySet())
                out.println(e.getKey() + " " + (count[e.getValue()] * 100 / total));
            out.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }        
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GuessingGame {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] nums = new boolean[10 + 1];
        int guess = 0;
        while ((guess = sc.getInt()) != 0) {
            sc.getWord();
            String response = sc.getWord();
            if (response.equals("on")) {
                sb.append(nums[guess] ? "Stan is dishonest" : "Stan may be honest").append("\n");
                nums = new boolean[10 + 1];
            } else {
                if (response.equals("low")) {
                    for (int i = guess; i > 0; i--)
                        nums[i] = true;
                } else if (response.equals("high")) {
                    for (int i = guess; i < 10 + 1; i++)
                        nums[i] = true;
                }
            }
        }   
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class GoodMorning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int[] arr = Arrays.stream(sc.getWord().split("")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RedRover {
    
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        int n = s.length();
        int min = n;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                String sub = s.substring(i, j);
                String macroed = s.replace(sub, "M");
                min = Math.min(min, sub.length() + macroed.length());
            }
        System.out.println(min);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PeaSoupAndPancakes {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean yeh = false;
        String straunt = "";
        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            straunt = br.readLine();
            ArrayList<String> al = new ArrayList<>();
            while (k-- > 0)
                al.add(br.readLine());
            if (al.contains("pea soup") && al.contains("pancakes")) {
                yeh = true;
                break;
            }
        }
        System.out.println(yeh ? straunt : "Anywhere is fine I guess");
        br.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Shiritori {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() - 1;
        Set<String> words = new HashSet<>();
        String curr = sc.getWord();
        boolean first = false, fair = true;
        while (n-- > 0) {
            words.add(curr);
            String next = sc.getWord();
            if (words.contains(next) || curr.charAt(curr.length() - 1) != next.charAt(0)) {
                fair = false;
                break;
            }
            curr = next;
            first = !first;
        }
        System.out.println(fair ? "Fair Game" : first ? "Player 1 lost" : "Player 2 lost");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class MusicYourWay {
    
    public static void main(String[] args) throws IOException {
        
        class Song {
            String[] attributes;

            public Song(String[] attributes) {
                this.attributes = attributes;
            }

            @Override
            public String toString() {
                return Arrays.toString(this.attributes).replace(",", "").replace("[", "").replace("]", "");
            }

        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String attribIn = br.readLine();
        List<String> attributeTypes = Arrays.asList(attribIn.split("\\s+"));
        int m = Integer.parseInt(br.readLine());
        Song[] songs = new Song[m];
        for (int i = 0; i < m; i++) 
            songs[i] = new Song(br.readLine().split("\\s+"));
        
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int sortIndex = attributeTypes.indexOf(br.readLine());
            Arrays.sort(songs, new Comparator<>() {
                @Override
                public int compare(Song s1, Song s2) {
                    return s1.attributes[sortIndex].compareTo(s2.attributes[sortIndex]);
                }
            });
            out.println(attribIn);
            for (Song s : songs)
                out.println(s);
            out.println();
        }

        out.close();
        br.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class BestRelayTeam {
    
    public static void main(String[] args) {

        class Runner implements Comparable<Runner> {
            String name;
            double first, other;

            public Runner(String name, double first, double other) {
                this.name = name;
                this.first = first;
                this.other = other;
            }
            
            @Override
            public String toString() {
                return this.name;
            }

            @Override
            public int compareTo(Runner r) {
                return (int) ((this.other - r.other) * 10000);
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        double bestTime = Double.MAX_VALUE;
        Runner[] runners = new Runner[n];
        Runner[] coolestTeam = new Runner[4];
        for (int i = 0; i < n; i++)
            runners[i] = new Runner(sc.getWord(), sc.getDouble(), sc.getDouble());
        Arrays.sort(runners);
        for (int i = 0; i < n; i++) {
            double time = runners[i].first;
            Runner[] tmp = new Runner[4];
            tmp[0] = runners[i];
            int l = 1;
            for (int j = 0; j < n && l < 4; j++) {
                if (j == i) continue;
                time += runners[j].other;
                tmp[l] = runners[j];
                l++;
            }
            if (bestTime > time) {
                bestTime = time;
                coolestTeam = Arrays.copyOf(tmp, 4);
            }
        }
        System.out.println(bestTime);
        Arrays.stream(coolestTeam).forEach(System.out::println);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TrollHunt {
    
    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bridges = arr[0] - 1, knights = arr[1], needed = arr[2], groups = knights / needed; // it wont go to that bridge that it used to conduct its "shady business"
        System.out.println(bridges % groups == 0 ? bridges / groups : bridges / groups + 1);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CandleBox {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        // Rita starts at 4.. so 4 + 5 + 6 + 7
        // Theo starts at 3.. so 3 + 4 + 5 + 6
        HashMap<Integer, Integer> ritaMap = new HashMap<>();
        HashMap<Integer, Integer> theoMap = new HashMap<>();
        ritaMap.put(4, 4);
        for (int i = 5; i < 100; i++) 
            ritaMap.put(i, (int) (((i - 3) / 2.0) * (i + 4)));
        theoMap.put(3, 3);
        for (int i = 4; i < 100; i++) 
            theoMap.put(i, (int) (((i - 2) / 2.0) * (i + 3)));
        int diff = sc.getInt(), rita = sc.getInt(), theo = sc.getInt();
        int r = 3 + diff, t = 3, rVal = ritaMap.get(r), tVal = theoMap.get(t);
        while (rVal < rita) {
            if (rita - rVal == tVal - theo) break;
            rVal = ritaMap.get(r);
            tVal = theoMap.get(t);
            r++;
            t++;
        }
        System.out.println(rita - rVal);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SocialRunning {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        int min = arr[0] + arr[n - 2]; // clue in qn, 3 to 0 alone, 1 to 2 alone. First alone obvious, second last alone > iterate through example will see
        for (int i = 1; i < n; i++)
            min = Math.min(min, arr[i] + arr[(n - 2 + i) % n]);
        System.out.println(min);        
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class RotateAndCut {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt();
            String s = sc.getWord();
            int len = s.length();
            if (len < 4) {
                sb.append(s);
            } else {
                int start = 0, end = len;
                boolean flip = false;
                for (int i = 0; i < n; i++) {
                    int diff = len / 4;
                    if (flip) {
                        end -= diff;
                    } else {
                        start += diff;
                    }
                    len = end - start;
                    if (len < 4) break;
                    flip = !flip;
                }
                sb.append(s.substring(start, end));
            }

            sb.append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class IntegerDivision {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        long n = sc.getLong(), d = sc.getLong();
        HashMap<Long, Long> hmap = new HashMap<>();
        while (n-- > 0) {
            long quotient = sc.getLong() / d;
            hmap.put(quotient, (hmap.containsKey(quotient) ? hmap.get(quotient) : 0L) + 1L);
        }
        Iterator i = hmap.entrySet().iterator();
        long count = 0;
        while (i.hasNext()) {
            @SuppressWarnings("unchecked")
            Entry<Long, Long> e = (Entry) i.next();
            long val = e.getValue();
            // combinations
            // n! / ((n - 2)! * 2!)
            // n * (n - 1) / 2;
            count += val * (val - 1) / 2;
        }
        System.out.println(count);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class DeathAndTaxes {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int stockCount = 0;
        double costPerStock = 0;
        double earnings = 0;
        boolean dead = false;
        while (!dead) {
            String cmd = sc.getWord();
            switch (cmd) {
                case "buy": 
                    if (stockCount == 0) {
                        stockCount = sc.getInt();
                        costPerStock = sc.getDouble();
                    } else {
                        int boughtStock = sc.getInt();
                        double boughtPrice = sc.getDouble();
                        double oldHoldings = stockCount * costPerStock;
                        double newHoldings = boughtStock * boughtPrice;
                        stockCount += boughtStock;
                        costPerStock = (oldHoldings + newHoldings) / stockCount;
                    }                    
                    break;
                case "sell": 
                    stockCount -= sc.getInt();
                    sc.getInt();
                    break;
                case "split": 
                    int split = sc.getInt();
                    stockCount *= split;
                    costPerStock /= split;
                    break;
                case "merge": 
                    int merge = sc.getInt();
                    stockCount /= merge;
                    costPerStock *= merge;
                    break;
                case "die": 
                    double soldPrice = sc.getDouble();
                    if (soldPrice - costPerStock < 0) {
                        earnings = stockCount * soldPrice;
                    } else {
                        earnings = stockCount * (soldPrice - ((soldPrice - costPerStock) * 0.3));
                    }
                    dead = true;
                    break;
            }
            // System.out.println(stockCount + " " + costPerStock);
        }
        System.out.printf("%.2f\n", earnings);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Forests {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int p = sc.getInt(), t = sc.getInt();
        HashMap<Integer, Set<Integer>> hmap = new HashMap<>();
        for (int i = 1; i <= p; i++)
            hmap.put(i, new TreeSet<>());
        int in = t * p;
        while (sc.hasMoreTokens()) 
            hmap.get(sc.getInt()).add(sc.getInt()); 
        Set<Set<Integer>> opinions = new HashSet<>();
        for (Set<Integer> s : hmap.values())
            opinions.add(s);
        System.out.println(opinions.size());
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Platforme {
    
    public static void main(String[] args) {
        class Platform implements Comparable<Platform> {
            int height, left, right;
            double leftSupport, rightSupport;
            
            public Platform(int height, int left, int right) {
                this.height = height;
                this.left = left;
                this.right = right;
                this.leftSupport = left + 0.5;
                this.rightSupport = right - 0.5;
            }

            public boolean isBetween(double x) {
                return this.left <= x && x <= this.right;
            }

            @Override
            public int compareTo(Platform p) {
                return p.height - this.height;
            }

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        Platform[] platforms = new Platform[n + 1];
        for (int i = 0; i < n; i++)
            platforms[i] = new Platform(sc.getInt(), sc.getInt(), sc.getInt());
        platforms[n] = new Platform(0, 0, 10000);
        Arrays.sort(platforms);
        int total = 0;
        for (int i = 0; i < n; i++) {
            Platform p = platforms[i];
            boolean left = false, right = false;
            for (int j = i + 1; j < n + 1; j++) {
                Platform o = platforms[j];
                if (o.height == p.height) continue;
                if (!left && o.isBetween(p.leftSupport)) {
                    left = true;
                    total += p.height - o.height;    
                }
                if (!right && o.isBetween(p.rightSupport)) {
                    right = true;
                    total += p.height - o.height;    
                }
                if (left && right) break;
            }
        }
        System.out.println(total);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class CalculatingDartScores {
    
    private final static String[] section = new String[] {"single", "double", "triple"};
    private final static int[] scores = new int[60];

    public static void main(String[] args) {
        System.out.print(foo(new java.util.Scanner(System.in).nextInt()));
    }

    static String foo(int score) {
        StringBuilder sb = new StringBuilder();
        if (score < 0 || score > 180) return "impossible";
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;
        for (int i = 3; i < 60; i += 3) {
            scores[i] = scores[i - 3] + 1;
            scores[i + 1] = scores[i - 2] + 2;
            scores[i + 2] = scores[i - 1] + 3;
        }
        boolean f = false;
        for (int i = 0; i < 60 && !f; i++) {
            if (score == scores[i]) {
                toOut(sb, i);
                f = true;
            }
            for (int j = 0; j < 60 && !f; j++) {
                if (score == scores[i] + scores[j]) {   
                    toOut(sb, i);
                    toOut(sb, j);
                    f = true;
                }
                for (int k = 0; k < 60 && !f; k++) {
                    if (score == scores[i] + scores[j] + scores[k]) {   
                        toOut(sb, i);
                        toOut(sb, j);
                        toOut(sb, k);
                        f = true;
                    }
                }
            }
        }
        return f ? sb.toString() : "impossible\n";
    }

    static void toOut(StringBuilder sb, int x) {
        sb.append(section[x % 3]).append(" ").append(x / 3 + 1).append("\n");
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TextEncryption {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            char[] inArr = br.readLine().replaceAll("\\s+", "").toUpperCase().toCharArray();
            if (inArr.length < n) {
                sb.append(new String(inArr));
            } else {
                char[] outArr = new char[inArr.length];
                int j = 0, k = 0;
                for (int i = 0; i < inArr.length; i++) {
                    outArr[j] = inArr[i];
                    j += n;
                    if (j >= inArr.length) 
                        j = ++k % inArr.length;
                }
                sb.append(new String(outArr));
            }
            sb.append("\n");
            n = Integer.parseInt(br.readLine());
        }
        System.out.print(sb.toString());
        br.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class TheLastProblem {
    
    public static void main(String[] args) {
        System.out.printf("Thank you, %s, and farewell!\n", new java.util.Scanner(System.in).nextLine());
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Islands {
    
    private static int r;
    private static int c;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        r = sc.getInt();
        c = sc.getInt();
        char[][] map = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        int count = 0;
        for (int i = 0; i < r; i++)
            map[i] = sc.getWord().toCharArray();
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)
                if (map[i][j] == 'L' && !visited[i][j]) {
                    walk(map, visited, i, j);
                    count++;
                }
        System.out.println(count);
        sc.close();
    }

    static void walk(char[][] map, boolean[][] visited, int i, int j) {
        if (!visited[i][j] && (map[i][j] == 'L' || map[i][j] == 'C')) {
            visited[i][j] = true;
            if (isValidRange(i + 1, j))
                walk(map, visited, i + 1, j);
            if (isValidRange(i - 1, j))
                walk(map, visited, i - 1, j);
            if (isValidRange(i, j + 1))
                walk(map, visited, i, j + 1);
            if (isValidRange(i, j - 1))
                walk(map, visited, i, j - 1);
        }
    }

    static boolean isValidRange(int i, int j) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ExamRedistribution {
    
    public static void main(String[] args) {

        class Room implements Comparable<Room> {
            int roomNumber;
            int students;

            Room(int roomNumber, int students) {
                this.roomNumber = roomNumber;
                this.students = students;
            }

            @Override
            public int compareTo(Room r) {
                return r.students - this.students;
            }
            
        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), totalStudents = 0;
        Room[] rooms = new Room[n];
        for (int i = 1; i <= n; i++) {
            int students = sc.getInt();
            rooms[i - 1] = new Room(i, students);
            totalStudents += students;
        }
        Arrays.sort(rooms);
        if (totalStudents < rooms[0].students * 2) {
            System.out.println("impossible");
        } else {
            for (int i = 0; i < n; i++)
                System.out.printf("%d ", rooms[i].roomNumber);
        }
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class PrimaryArithmetic {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = sc.getInt(), y = sc.getInt();
            if (x == 0 && y == 0) break;
            int count = foo(x, y);
            if (count == 0) {
                sb.append("No carry operation.");
            } else if (count == 1) {
                sb.append("1 carry operation.");
            } else {
                sb.append(count).append(" carry operations.");
            }
            sb.append("\n");
        } 
        System.out.print(sb.toString());
        sc.close();
    }

    static int foo(int x, int y) {
        int count = 0, carry = 0;
        while (x > 0 || y > 0) {
            int digitSum = x % 10 + y % 10 + carry;
            x /= 10;
            y /= 10;
            if (digitSum > 9) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        return count;
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class ReducedIDNumbers {
    
    private final static int LIMIT = (int) Math.pow(10, 6) ;
 
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.getInt();
        Set<Integer> set = new HashSet<>();
        int i = 1;
        for (; i < LIMIT; i++) {
            for (int j : arr)
                set.add(j % i);
            if (set.size() == arr.length) break;
            set.clear();
        }
        System.out.println(i);
        sc.close();
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class AnagramCounting {
    
    static final BigInteger[] factorials = new BigInteger[101];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        iniFact();
        while (sc.hasMoreTokens()) {
            String org = sc.getWord();
            BigInteger total = factorials[org.length()];
            int[] letters = new int[123];
            for (char c : org.toCharArray())
                letters[c]++;
            for (int i : letters)
                total = total.divide(factorials[i]);
            sb.append(total).append("\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static void iniFact() {
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i < 101; i++)
            factorials[i] = BigInteger.valueOf(i).multiply(factorials[i - 1]);
    }
    
}

///////////////////////////////////////////////////////////////////////////////
// https://www.youtube.com/watch?v=wU6udHRIkcc
// Key points for this question
// 1. parents: To help us locate the parent of any one index. Think of it as a tree within an array. A parent will be noted as -1. 
//             E.g. if the array {-1, 0, 1}. Then pos 0 is a parent, pos 1 is a direct child of pos 0 and pos 2 is a direct child of pos 1.
// 2. connections: To record down the extent of each parent
// 3. HashMap used to record indexes of friends
// 4. getParent function
//    Recursive function that helps us locate the root/first parent of the particular index. 
//    This makes EVERYTHING faster. Because now you do not have to continuously run through the entire tree 
//    which incurs massive cost. 
//    **Note the 2nd return of the function as we assign those in the path of this graph the parent value
//      Following the previous example {-1, 0, 1}, this will become {-1, 0, 0} as both are children or pos 0.
// 5. union function
//    Rather straightforward function as we locate the root/first parent of each index. If they are the same,
//    it lets us know that including this edge will cause a cycle and we do not want that, therefore the union is not performed.
//    ** A cycle is unwanted is not the only reason. Another reason would be that these two people have already made a prior connection
//       through the current graph that they are already a part of, therefore there is no need to count them again (double counting).
//
//    The union function itself is very simple. It can work both ways. We assign the any one of the parent's they value of the other.
//    Now, one of the parents loses its root identity of -1, and is joined to the other. 
//    We merely add the connections of the first and second together to receive a new total.
//    In mine, the first parent is adopted by the second. Therefore second connections are increased by the first.
//
//    Bad practice, i returned the connections to be printed via the union function. yes i got lazy.
//
// 6. Thank you indian man from youtube, it was a really helpful video.
class VirtualFriends {
    
    private static final int[] parents = new int[2 * 100000];
    private static final int[] connections = new int[2 * 100000];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int f = sc.getInt();
            for (int i = 0; i <= f * 2; i++) {
                parents[i] = i;
                connections[i] = 1;
            }
            HashMap<String, Integer> indexes = new HashMap<>();
            for (int i = 0, index = 0; i < f; i++) {
                String first = sc.getWord(), second = sc.getWord();
                if (!indexes.containsKey(first)) indexes.put(first, index++);
                if (!indexes.containsKey(second)) indexes.put(second, index++);
                sb.append(union(indexes.get(first), indexes.get(second))).append("\n");
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }

    static int getParent(int index) {
        if (parents[index] == index) return index;
        return parents[index] = getParent(parents[index]);
    }

    static int union(int first, int second) {
        first = getParent(first);
        second = getParent(second);
        if (first != second) {
            parents[first] = second;
            connections[second] += connections[first];
        }
        return connections[second];
    }
    
}

///////////////////////////////////////////////////////////////////////////////
// Similar to VirtualFriends concept. However the linking of each element
// requires a double list to promote efficiency

class JoinStrings {
     
    static final PrintWriter out = new PrintWriter(System.out);
     
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(); // n cannot be bigger than 1 because n can == 1;
        String[] input = new String[n];
        ArrayList<LinkedList<Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            input[i] = sc.getWord();
            list.add(new LinkedList<>());
        }
        int start = 0;
        while (--n > 0) 
            list.get(start = sc.getInt() - 1).add(sc.getInt() - 1);
        print(input, list, start);
        out.close();
        sc.close();
    }

    static void print(String[] input, ArrayList<LinkedList<Integer>> list, int index) {
        out.print(input[index]);
        for (int i : list.get(index)) 
            print(input, list, i);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class SwapToSort {
// Very similar to virtual friends, probably should have done this before that
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = sc.getInt();
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        while (k-- > 0) 
            union(arr, sc.getInt() - 1, sc.getInt() - 1);
        boolean pass = true;
        for (int i = 0; i < n; i++)
            if (searchParent(arr, i) != searchParent(arr, n - 1 - i)) {
                pass = false;
                break;
            }
        System.out.println(pass ? "Yes" : "No");
        sc.close();
    }

    static void union(int[] arr, int a, int b) {
        a = searchParent(arr, a);
        b = searchParent(arr, b);
        if (a != b) {
            arr[a] = b;
        }
    }

    static int searchParent(int[] arr, int i) {
        if (arr[i] == -1) return i;
        return arr[i] = searchParent(arr, arr[i]);
    }
    
}

///////////////////////////////////////////////////////////////////////////////

class Doubleplusgood {

    public static void main(String[] args) {
        // Nodes are the numbers
        // Each branch represents either + or "+"
        long[] nums = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split("\\+")).mapToLong(Long::parseLong).toArray();
        int numlen = nums.length;
        int totalCombinations = (1 << (numlen - 1)); // Get the total number of leaves with relation to the height
        HashSet<Long> sums = new HashSet<>();
        for (int i = 0; i < totalCombinations; i++) { // Going through leaf by leaf
            long sum = 0, currNum = 0;
            String path = Integer.toBinaryString(i);
            path = "0".repeat(numlen - path.length() - 1) + path;
            // Generating combinations as binary sequence e.g. 0000, 0001, 0010, 0011 ... 
            // These represent the path to the result. 
            // A 0 means left / +, and 1 means right / "+"
            currNum = nums[0]; // first num;
            for (int j = 1; j < numlen; j++) { // operators
                if (path.charAt(j - 1) == '1') { // String
                    long pow = 10;
                    while (nums[j] % pow != nums[j])
                        pow *= 10;
                    currNum *= pow;
                    currNum += nums[j];
                } else { // Integer
                    sum += currNum;
                    currNum = nums[j];
                }
            }
            sum += currNum; // last num
            sums.add(sum);
        }
        System.out.println(sums.size());
    }

}

///////////////////////////////////////////////////////////////////////////////

class PalindromicPassword {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        boolean[] palindrome = new boolean[1000000]; // 0 - 100000 - 999999
        for (int i = 100000; i <= 999999; i++) 
            palindrome[i] = isPalindrome(i);
        int n = sc.getInt();
        while (n-- > 0) {
            int x = sc.getInt(), down = 0, up = 0;
            for (up = x; up <= 999999; up++)
                if (isPalindrome(up)) break;
            for (down = x; down >= 99999; down--)
                if (isPalindrome(down)) break;                
            if (up - x > x - down) {
               out.println(down);
            } else if (up - x < x - down) {
                out.println(up);
            } else {
                out.println((int) Math.min(down, up)); 
            }
        }
        out.close();
        sc.close();
    }

    static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        s = "0".repeat(6 - s.length()) + s;
        return s.charAt(0) == s.charAt(5) && s.charAt(1) == s.charAt(4) && s.charAt(2) == s.charAt(3);
    }

}

///////////////////////////////////////////////////////////////////////////////

class AssigningWorkstations {

    public static void main(String[] args) {

        class Researcher implements Comparable<Researcher> {
            int start, end;

            Researcher(int start, int stay) {
                this.start = start;
                this.end = start + stay;
            }

            @Override
            public int compareTo(Researcher other) {
                return this.start - other.start;
            }            

        }

        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        Researcher[] researchers = new Researcher[n];
        PriorityQueue<Integer> machines = new PriorityQueue<>();
        Queue<Integer> tmpQueue = new LinkedList<>(); // need not be sorted as elements should already be sorted due to usage
        int unlocks = 0;
        for (int i = 0; i < n; i++) 
            researchers[i] = new Researcher(sc.getInt(), sc.getInt());
        Arrays.sort(researchers);
        for (int i = 0; i < n; i++) {   
            Researcher r = researchers[i];
            while (!machines.isEmpty() && machines.peek() <= r.start) // check that machines are within usage range of researcher, machine not being used and haven't been locked
                tmpQueue.add(machines.poll() + m);
            while (!tmpQueue.isEmpty() && tmpQueue.peek() < r.start) // check that these machines are not locked before the researcher can use it
                tmpQueue.poll();
            if (!tmpQueue.isEmpty()) { // if it is not empty, it suggest that there is machine available to be used.
                tmpQueue.poll();
            } else {
                unlocks++;
            }
            machines.offer(r.end);
        }
        System.out.println(n - unlocks);
        sc.close();   
    }

}

///////////////////////////////////////////////////////////////////////////////

class WelcomeToCodeJamEasy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        char[] target = "welcome to code jam".toCharArray();
        for (int i = 1; i <= n; i++)
            out.printf("Case #%d: %s\n", i, makeNice(play(br.readLine(), target, 0)));
        out.close();
        br.close();
    }

    static String makeNice(int x) {
        if (x == 0) return "0000";
        int y = x, c = 0;
        while (x > 0) {
            x /= 10;
            c++;
        }
        return "0".repeat(4 - c) + y;
    }

    static int play(String input, char[] target, int index) {
        int count = 0;
        if (index < target.length - 1) {
            for (int i = 0; i < input.length(); i++)
                if (input.charAt(i) == target[index])
                    count += play(input.substring(i, input.length()), target, index + 1);
        } else {
            for (char c : input.toCharArray())
                count += c == 'm' ? 1 : 0; // if it ends with 'm', it is a possible end
        }
        return count;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ProgressiveScramble {

    static final HashMap<Character, Integer> charToInt = new HashMap<>();
    static final HashMap<Integer, Character> intToChar = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        buildMaps();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String opt = sc.next();
            String s = sc.nextLine().substring(1);
            out.println(opt.equals("e") ? encrypt(s) : decrypt(s));
        }
        out.close();
        sc.close();
    }

    static String encrypt(String s) {
        int len = s.length();
        int[] nums = new int[len];
        char[] encrypted = new char[len];
        for (int i = 0; i < len; i++)
            nums[i] = charToInt.get(s.charAt(i));
        for (int i = 1; i < len; i++)
            nums[i] += nums[i - 1];
        for (int i = 0; i < len; i++)
            nums[i] %= 27;
        for (int i = 0; i < len; i++)
            encrypted[i] = intToChar.get(nums[i]);
        return new String(encrypted);
    }

    static String decrypt(String s) {
        int len = s.length();
        int[] nums = new int[len];
        char[] decrypted = new char[len];
        for (int i = 0; i < len; i++)
            nums[i] = charToInt.get(s.charAt(i));
        int hold = 0;
        for (int i = 0; i < len; i++) {
            nums[i] -= hold;
            while (nums[i] < 0) nums[i] += 27;
            hold += nums[i];
        }
        for (int i = 0; i < len; i++)
            decrypted[i] = intToChar.get(nums[i]);
        return new String(decrypted);
    }

    static void buildMaps() {
        charToInt.put(' ', 0);
        charToInt.put('a', 1);
        charToInt.put('b', 2);
        charToInt.put('c', 3);
        charToInt.put('d', 4);
        charToInt.put('e', 5);
        charToInt.put('f', 6);
        charToInt.put('g', 7);
        charToInt.put('h', 8);
        charToInt.put('i', 9);
        charToInt.put('j', 10);
        charToInt.put('k', 11);
        charToInt.put('l', 12);
        charToInt.put('m', 13);
        charToInt.put('n', 14);
        charToInt.put('o', 15);
        charToInt.put('p', 16);
        charToInt.put('q', 17);
        charToInt.put('r', 18);
        charToInt.put('s', 19);
        charToInt.put('t', 20);
        charToInt.put('u', 21);
        charToInt.put('v', 22);
        charToInt.put('w', 23);
        charToInt.put('x', 24);
        charToInt.put('y', 25);
        charToInt.put('z', 26);

        intToChar.put(0, ' ');
        intToChar.put(1, 'a');
        intToChar.put(2, 'b');
        intToChar.put(3, 'c');
        intToChar.put(4, 'd');
        intToChar.put(5, 'e');
        intToChar.put(6, 'f');
        intToChar.put(7, 'g');
        intToChar.put(8, 'h');
        intToChar.put(9, 'i');
        intToChar.put(10, 'j');
        intToChar.put(11, 'k');
        intToChar.put(12, 'l');
        intToChar.put(13, 'm');
        intToChar.put(14, 'n');
        intToChar.put(15, 'o');
        intToChar.put(16, 'p');
        intToChar.put(17, 'q');
        intToChar.put(18, 'r');
        intToChar.put(19, 's');
        intToChar.put(20, 't');
        intToChar.put(21, 'u');
        intToChar.put(22, 'v');
        intToChar.put(23, 'w');
        intToChar.put(24, 'x');
        intToChar.put(25, 'y');
        intToChar.put(26, 'z');
    }

}

///////////////////////////////////////////////////////////////////////////////

class DriversDilemma {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        double c = sc.getDouble() / 2.0, x = sc.getDouble(), m = sc.getDouble();
        double[][] chart = new double[6][2];
        for (int i = 0; i < 6; i++)
            chart[i] = new double[]{sc.getDouble(), sc.getDouble()};
        boolean yes = false;
        int i = 5;
        for (; i >= 0; i--) {
            double totalTime = m / chart[i][0];
            double moveConsumption = m / chart[i][1];
            double leakConsumption = x * totalTime;
            if (c - moveConsumption - leakConsumption > 0) {
                yes = true;
                break;
            }
        }
        System.out.printf("%s %s", yes ? "YES" : "NO", yes ? (int) chart[i][0] : "");
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class GettingGold {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int c = sc.getInt(), r = sc.getInt();
        char[][] map = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        int[] player = new int[2];
        readMap(map, player, sc, r, c);
        System.out.println(play(map, visited, player[0], player[1], r, c));
        sc.close();
        
    }

    static int play(char[][] map, boolean[][] visited, int i, int j, int r, int c) {
        int gold = 0;
        if (!visited[i][j]) {
            visited[i][j] = true;
            if (map[i][j] == 'T' || map[i][j] == '#') return 0;
            if (map[i][j] == 'G') gold += 1;
            int leftx = i, lefty = j - 1;
            int rightx = i, righty = j + 1;
            int upx = i - 1, upy = j;
            int downx = i + 1, downy = j;
            boolean inLeft = isInMap(leftx, lefty, r, c);
            boolean inRight = isInMap(rightx, righty, r, c);
            boolean inUp = isInMap(upx, upy, r, c);
            boolean inDown = isInMap(downx, downy, r, c);
            if ((inLeft && map[leftx][lefty] == 'T') 
                || (inRight && map[rightx][righty] == 'T')
                || (inUp && map[upx][upy] == 'T')
                || (inDown && map[downx][downy] == 'T')) return gold;
            gold += (inLeft ? play(map, visited, leftx, lefty, r, c) : 0) 
                    + (inRight ? play(map, visited, rightx, righty, r, c) : 0)
                    + (inUp ? play(map, visited, upx, upy, r, c) : 0)
                    + (inDown ? play(map, visited, downx, downy, r, c) : 0);
        }        
        return gold;
    }

    static boolean isInMap(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

    static void readMap(char[][] map, int[] player, Kattio sc, int r, int c) {
        for (int i = 0; i < r; i++) {
            char[] arr = sc.getWord().toCharArray();
            for (int j = 0; j < c; j++) {
                map[i][j] = arr[j];
                if (arr[j] == 'P') {
                    player[0] = i;
                    player[1] = j;
                }
            }
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class BestCompromise {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt(), m = sc.getInt();
            double[] averages = new double[m];
            for (int i = 0; i < n; i++)  {
                char[] arr = sc.getWord().toCharArray();
                for (int j = 0; j < m; j++)
                    averages[j] += arr[j] == '1' ? 1 : 0;
            }
            for (double d : averages) 
                out.print(d / n < 0.5 ? '0' : '1');
            out.print("\n");
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class VariableArithmetic {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        HashMap<String, Integer> variables = new HashMap<>();
        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            if (input.contains("=")) {
                String[] arr = input.split(" = ");
                variables.put(arr[0], Integer.parseInt(arr[1]));
            } else {
                String[] arr = input.split(" \\+ ");
                List<String> list = new ArrayList<>();
                int sum = 0;
                for (String variable : arr)
                    if (variables.containsKey(variable)) {
                        sum += variables.get(variable);
                    } else if (isNumeric(variable)) {
                        sum += Integer.parseInt(variable);
                    } else {
                        list.add(variable);
                    }
                out.println((sum == 0 ? "" : (sum + (list.size() == 0 ? "" : " + "))) + list.toString().replaceAll("[\\[\\]]", "").replaceAll(",\\s"," + ")); 
            }
        }
        out.close();
        br.close();
    }

    static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ConquestCampaign {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt(), n = sc.getInt();
        int[][] map = new int[r][c];
        for (int i = 0; i < n; i++)
            map[sc.getInt() - 1][sc.getInt() - 1] = 1;
        System.out.println(conquer(map, r, c));
        sc.close();
    }

    static int conquer(int[][] map, int r, int c) {
        boolean win = false;
        int days = 0;
        while (!win) {
            win = true;
            days++;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++)
                    if (map[i][j] == days) {
                        if (withinMap(i + 1, j, r, c) && map[i + 1][j] == 0) map[i + 1][j] = days + 1;
                        if (withinMap(i - 1, j, r, c) && map[i - 1][j] == 0) map[i - 1][j] = days + 1;
                        if (withinMap(i, j + 1, r, c) && map[i][j + 1] == 0) map[i][j + 1] = days + 1;
                        if (withinMap(i, j - 1, r, c) && map[i][j - 1] == 0) map[i][j - 1] = days + 1;
                        win = false;
                    }
            }      
        }
        return --days;
    }

    static boolean withinMap(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Beekeeper {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Comparator<Entry<String, Integer>> comp = new Comparator<>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };
        int n = 0;
        while ((n = sc.getInt()) != 0) {
            HashMap<String, Integer> hmap = new HashMap<>();
            while (n-- > 0) {
                String s = sc.getWord();
                char[] arr = s.toCharArray();
                int count = 0;
                for (int i = 0; i < arr.length - 1; i++) 
                    if (arr[i] == arr[i + 1] 
                        && (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' 
                        || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'y')) count++;
                hmap.put(s, count);
            }            
            ArrayList<Entry<String, Integer>> list = new ArrayList<>(hmap.entrySet());
            out.println(Collections.max(list, comp).getKey());
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Pripreme {

    public static void main(String[] args) {
        // Cannot lecture a team at the same time
        // it the team that takes the longest time to understand longer
        // than the sum of all other teams combined, it will take a total of the max * 2 e.g. in sample 2
        // if it is lesser, optimal plan can proceed normally as shown in sample 1 and 3
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        int max = 0;
        long sum = 0L;
        while (n-- > 0) {
            int x = sc.getInt();
            max = (int) Math.max(x, max);
            sum += x;
        }
        System.out.println(max >= sum - max ? max * 2 : sum);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class EvenUpSolitaire {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        LinkedList<Integer> cards = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int card = sc.getInt();
            if (!cards.isEmpty() && ((card + cards.peekFirst()) % 2 == 0)) 
                cards.pollFirst();
            else cards.addFirst(card);
        }
        System.out.println(cards.size());
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class DisastrousDowntime {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), k = sc.getInt(), requests = 1 * k, minRequests = 1;
        int[] arr = new int[n];
        arr[0] = sc.getInt();
        for (int i = 1, j = 0; i < n; i++) {
            arr[i] = sc.getInt();
            for (; j < n && arr[j] + 1000 <= arr[i]; j++)
                minRequests--;
            minRequests++;
            requests = Math.max(requests, minRequests);
        }
        System.out.println((int) Math.ceil(requests / (double) k));
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class LockedTreasure {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[][] combinations = new int[31][31];
        for (int i = 1; i < 31; i++) // start from 1 to match input
            combinations[i][1] = 1;
        for (int i = 1; i < 31; i++)
            combinations[1][i] = 1;
        for (int i = 2; i < 31; i++)
            for (int j = 2; j < 31; j++)
                combinations[i][j] = j <= i ? combinations[i - 1][j] + combinations[i - 1][j - 1] : 1; // binomial theorem. limit is n and can iterate from any 1 to m            
        int t = sc.getInt();
        while (t-- > 0)
            out.println(combinations[sc.getInt()][sc.getInt()]);
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class DirtyDriving {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt();
        int[] cars = new int[n];
        for (int i = 0; i < n; i++)
            cars[i] = sc.getInt();
        Arrays.sort(cars);
        int min = 0;
        for (int i = 0; i < n; i++)
            min = Math.max(min, p * (i + 1) - (cars[i] - cars[0]));
        System.out.println(min);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class PlayfairCipher {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[][] table = createTable(br.readLine());
        char[] msg = prepareMessage(br.readLine());
        out.println(encrypt(table, msg));
        out.close();
        br.close();        
    }

    static String encrypt(char[][] table, char[] msg) {
        for (int i = 0; i < msg.length; i += 2) {
            int[] a = getRowColumn(table, msg[i]);
            int[] b = getRowColumn(table, msg[i + 1]);
            int arow = a[0], acol = a[1];
            int brow = b[0], bcol = b[1];
            if (arow == brow) {
                msg[i] = table[arow][(acol + 1) % 5];
                msg[i + 1] = table[brow][(bcol + 1) % 5];
            } else if (acol == bcol) {
                msg[i] = table[(arow + 1) % 5][acol];
                msg[i + 1] = table[(brow + 1) % 5][bcol];
            } else {
                msg[i] = table[arow][bcol];
                msg[i + 1] = table[brow][acol];
            }
        }
        return new String(msg).toUpperCase();
    }

    static int[] getRowColumn(char[][] table, char c) {
        int i = 0, j = 0;
        while (i < 5 && table[i][j] != c) {
            j++;
            if (j == 5) {
                i++;
                j = 0;
            }
        }
        return new int[] {i, j};
    }

    static char[] prepareMessage(String msg) {
        msg = msg.replaceAll("\\s+", "");
        ArrayList<Character> tmp = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            if (i == msg.length() - 1) {
                tmp.add(msg.charAt(i));
                tmp.add('x');
            } else {
                char a = msg.charAt(i), b = msg.charAt(i + 1);
                tmp.add(a);
                if (a == b) {
                    tmp.add('x');
                } else {
                    tmp.add(b);
                    i++;
                }
            }
        }
        char[] encrypt = new char[tmp.size()];
        for (int i = 0; i < tmp.size(); i++)
            encrypt[i] = tmp.get(i);
        return encrypt;
    }

    static char[][] createTable(String key) {
        char[][] table = new char[5][5];
        boolean[] letters = new boolean[26];
        letters[16] = true; // q
        Object[] tmp = Arrays.stream(key.split("")).filter(x -> !x.equals(" ")).distinct().toArray();
        int i = 0, j = 0;
        for (Object o : tmp) {
            table[i][j] = String.valueOf(o).charAt(0);
            letters[table[i][j] - 97] = true;
            j++;
            if (j == 5) {
                i++;
                j = 0;
            }
        }
        for (int k = 0; k < letters.length; k++) {
            if (!letters[k]) {
                table[i][j] = (char) (k + 97);
                j++;
                if (j == 5) {
                    i++;
                    j = 0;
                    if (i == 5) break;
                }
            }
        }
        // for (int x = 0; x < 5; x++) {
        //     for (int y = 0; y < 5; y++) {
        //         System.out.print(table[x][y] + " ");
        //     }
        //     System.out.println();
        // }            
        return table;
    }

}

///////////////////////////////////////////////////////////////////////////////

class CardboardContainer {

    public static void main(String[] args) {
        System.out.println(foo(new java.util.Scanner(System.in).nextLong()));
    }

    static long foo(long n) {
        ArrayList<Long> factors = new ArrayList<>((int) n);
        for (long i = 1; i * i <= n; i++)
            if (n % i == 0) {
                factors.add(i);
                factors.add(n / i);
            }
        Collections.sort(factors, Collections.reverseOrder());        
        long cost = Long.MAX_VALUE;
        int size = factors.size();
        for (int i = 0; i < size; i++) {
            long length = factors.get(i);
            long remainder = n / length;
            for (int j = 0; j < size; j++) {
                long breath = factors.get(j);
                if (remainder % breath == 0) {
                    long height = remainder / breath;
                    cost = Math.min(cost, 2L * (length * breath + breath * height + height * length));                        
                }
            }
        }            
        return cost;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ImmortalPorpoises {
// https://codeforces.com/blog/entry/14516?f0a28=1

    private static final HashMap<Long, Long> memoized = new HashMap<>();
    private static final long disappear = 1000000000L;

    public static void main(String[] args) {
        memoized.put(0L, 0L);
        memoized.put(1L, 1L);
        memoized.put(2L, 1L);
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        for (int i = 1; i <= n; i++) {
            sc.getInt();
            long index = sc.getLong();
            out.printf("%d %s\n", i, fib(index));
        }
        out.close();
        sc.close();
    }
    
    // Understanding the pattern
    // https://en.wikipedia.org/wiki/Fibonacci_number#Matrix_form
    // Formula is NOT mine, and it is dervied from matrix multiplcation.
    // Alot of math, but the main point is at the end where
    // F_2n - 1 = (F_n)^2 + (F_n - 1)^2 | n % 2 == 1
    // F_2n = (F_n - 1 + F_n + 1) * F_n | n % 2 == 0
    static long fib(long n) {
        // n value is too large, using Right triangles to further sub divide
        if (memoized.containsKey(n)) return memoized.get(n);
        long next = 0L;
        long k = n;
        if (n % 2 == 0) {
            k /= 2;
            next = fib(k) * (fib(k + 1) + fib(k - 1));
        } else {
            k += 1;
            k /= 2;
            next = (fib(k) * fib(k)) + (fib(k - 1) * fib(k - 1));
        }
        next %= disappear;
        memoized.put(n, next);
        return next;
    }

}

///////////////////////////////////////////////////////////////////////////////

class ICPCTeamSelection {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            int n = sc.getInt() * 3;
            ArrayList<Integer> al = new ArrayList<>(n);
            for (int i = 0; i < n; i++)
                al.add(sc.getInt());
            Collections.sort(al, Collections.reverseOrder());
            int s = 0;
            while (!al.isEmpty()) {
                s += al.get(1);
                al.remove(0);
                al.remove(0);
                al.remove(al.size() - 1);
            }
            out.println(s);
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class TheDragonOfLoowater {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();
            if (n == 0 && m == 0) break;
            int[] heads = new int[n];
            int[] knights = new int[m];
            int sumHeads = 0, sumKnights = 0;
            for (int i = 0; i < n; i++)
                sumHeads += heads[i] = sc.getInt();
            for (int i = 0; i < m; i++)
                sumKnights += knights[i] = sc.getInt();
            if (sumKnights < sumHeads || m < n) {
                out.println("Loowater is doomed!");
            } else {
                Arrays.sort(heads);
                Arrays.sort(knights);
                int h = 0, k = 0, cost = 0;
                for (; h < n; h++) {
                    if (k == m) break;
                    for (; k < m; k++)
                        if (heads[h] <= knights[k])  {
                            cost += knights[k++];
                            break;
                        }
                }
                if (k == m && h < n) {
                    out.println("Loowater is doomed!");
                } else {
                    out.println(cost);
                }                
            }
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FibonacciCycles {

    static final HashMap<Integer, Integer> fibs = new HashMap<>();

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int q = sc.getInt();
        while (q-- > 0) {
            int k = sc.getInt();
            int[] visited = new int[1000];
            Arrays.fill(visited, -1);
            int index = 2;
            while (true) {
                int value = fib(index, k) % k;
                if (visited[value] != -1) {
                    out.println(visited[value]);
                    break;
                }
                visited[value] = index;
                index++;
            }
            fibs.clear();
        }
        out.close();
        sc.close();
    }

    static int fib(int n, int k) {
        if (fibs.containsKey(n)) return fibs.get(n);
        if (n == 0 || n == 1) return 1;
        int x = (fib(n - 1, k) % k) + (fib(n - 2, k) % k);
        fibs.put(n, x);
        return x;
    }

}

///////////////////////////////////////////////////////////////////////////////

class MeowFactor {

    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        BigInteger n = new BigInteger(s);
        int start = 127;
        for (; start > 1; start--)
            if (n.mod(BigInteger.valueOf(start).pow(9)).equals(BigInteger.ZERO)) break;
        System.out.println(start);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Bishops {

    public static void main(String[] args) {
        // https://en.wikibooks.org/wiki/Chess/Puzzles/Placement/14_Bishops/Solution#:~:text=Since%2014%20bishops%20is%20possible,no%20two%20attack%20each%20other.v
        // placement is one straight line one each side, take away bishops at one side's rook ends.
        // 0 0
        // 1 1
        // 2 2
        // 3 4
        // 4 6 
        // 5 8
        // 6 10
        // 7 12
        // 8 14

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (sc.hasMoreTokens()) {
            int n = sc.getInt();
            out.println(n == 0 || n == 1 ? n : 2 * n - 2);
        }
        out.close();
        sc.close();
    }

}


///////////////////////////////////////////////////////////////////////////////

class PairingSocks {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt() * 2, moves = 0;
        Stack<Integer> original = new Stack<>(), auxiliary = new Stack<>();
        while (n-- > 0)
            original.push(sc.getInt());
        while (!original.isEmpty()) {
            moves++;
            if (!auxiliary.isEmpty() && auxiliary.peek().equals(original.peek())) {
                auxiliary.pop();
                original.pop();
            } else {
                auxiliary.push(original.pop());
            }            
        }
        System.out.println(auxiliary.isEmpty() ? moves : "impossible");
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Teque {

    private static int MAX_SIZE = 10000000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        int[] front = new int[MAX_SIZE + 1], back = new int[MAX_SIZE + 1];
        int frontStart = 5000000, frontEnd = 5000000, backStart = 5000000, backEnd = 5000000;
        while (n-- > 0) {
            int op = sc.getWord().length();
            int val = sc.getInt();
            if (op == 3) { // get
                int frontSize = frontEnd - frontStart;
                if (val < frontSize) {
                    out.println(front[frontStart + val + 1]);
                } else {
                    out.println(back[val - frontSize + backStart]);
                }
            } else if (op == 9) { // back
                back[backEnd] = val;
                backEnd++;
            } else if (op == 10) { // front
                front[frontStart] = val;
                frontStart--;
            } else if (op == 11) { // middle
                int frontSize = frontEnd - frontStart;
                int backSize = backEnd - backStart;
                int mid = (frontSize + backSize + 1) / 2;
                while (mid > frontSize) {
                    frontEnd++;
                    front[frontEnd] = back[backStart];
                    backStart++;
                    frontSize = frontEnd - frontStart;
                }
                while (mid < frontSize) {
                    backStart--;
                    back[backStart] = front[frontEnd];
                    frontEnd--;
                    frontSize = frontEnd - frontStart;
                }
                frontEnd++;
                front[frontEnd] = val;
            }
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class CatalanNumbers {
// https://en.wikipedia.org/wiki/Catalan_number
// C_n + 1 = ((2(2n + 1)) / (n + 2)) * C_n
// C_n = ((2(2(n - 1) + 1)) / (n - 1 + 2)) * C_n - 1
// C_n = ((2(2(n - 1) + 1)) / (n - 1 + 2)) * C_n - 1
// C_n = ((2(2n - 2 + 1))) / (n + 1)) * C_n - 1
// C_n = ((2(2n - 1))) / (n + 1)) * C_n - 1

    private final static BigInteger[] memoized = new BigInteger[5001];

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        memoized[0] = BigInteger.ONE;
        memoized[1] = BigInteger.ONE;
        int n = sc.getInt();
        while (n-- > 0)
            out.println(catalan(sc.getInt()));
        out.close();
        sc.close();
    }

    static BigInteger catalan(int n) {
        if (memoized[n] != null) return memoized[n];
        if (n > 20) catalan(n - 20);
        return memoized[n] = catalan(n - 1).multiply(BigInteger.valueOf(2 * (2 * n - 1))).divide(BigInteger.valueOf(n + 1));
    }

}

///////////////////////////////////////////////////////////////////////////////
// https://en.wikipedia.org/wiki/Catalan_number
// (1 / n + 1) * (2n choose n)
// (1 / n + 1) * ((2n)! / ((n + 1)! * (2n - n)!))
// (1 / n + 1) * ((2n)! / ((n + 1)! * n!))
// (1 / n + 1) * (n + 2 * n + 3 * .... 2n - 2 * 2n - 1 * 2n) / n!)

class CatalanSquare {

    public static void main(String[] args) {
        System.out.println(catalan(new java.util.Scanner(System.in).nextInt() + 1));
    }

    static BigInteger catalan(int n) {
        return combination(2 * n, n).divide(BigInteger.valueOf(n + 1));
    }

    static BigInteger combination(int n, int r) {
        BigInteger res = BigInteger.ONE;
        BigInteger bigN = BigInteger.valueOf(n);
        if (r > n - r) r = n - r; // e.g. 10C3 == 10C7
        for (int i = 0; i < r; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            BigInteger bigIPlus = BigInteger.valueOf(i + 1);
            res = res.multiply(bigN.subtract(bigI));
            res = res.divide(bigIPlus);
        }
        return res;
    }

}

///////////////////////////////////////////////////////////////////////////////

class CountingStars {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        while (sc.hasMoreTokens()) {
            int r = sc.getInt(), c = sc.getInt();
            char[][] sky = new char[r][c];
            boolean[][] visited = new boolean[r][c];
            for (int i = 0; i < r; i++)
                sky[i] = sc.getWord().toCharArray();
            int stars = 0;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    if (!visited[i][j] && sky[i][j] == '-') {
                        findStars(sky, visited, i, j, r, c);
                        stars++;
                    }
            out.printf("Case %d: %d\n", t++, stars);
        }
        out.close();
        sc.close();
    }

    static void findStars(char[][] sky, boolean[][] visited, int i, int j, int r, int c) {
        if (!visited[i][j]) {
            visited[i][j] = true;
            if (inImage(i + 1, j, r, c) && sky[i + 1][j] == '-') 
                findStars(sky, visited, i + 1, j, r, c);
            if (inImage(i - 1, j, r, c) && sky[i - 1][j] == '-') 
                findStars(sky, visited, i - 1, j, r, c);
            if (inImage(i, j + 1, r, c) && sky[i][j + 1] == '-') 
                findStars(sky, visited, i, j + 1, r, c);
            if (inImage(i, j - 1, r, c) && sky[i][j - 1] == '-') 
                findStars(sky, visited, i, j - 1, r, c);
        }
        
    }

    static boolean inImage(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Recenice {

    public static void main(String[] args) {

        class Number {

            String word;
            int value;
            int len;

            Number(int value, String word) {
                this.word = word;
                this.value = value;
                this.len = word.length();
            }

        }

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String word = toWord(i);
            System.out.println(word);
            numbers.add(new Number(i, word));
        }

        int n = sc.getInt(), dollar = 0, len = 0;
        String[] sentence = new String[n];
        for (int i = 0; i < n; i++) {
            sentence[i] = sc.getWord();
            len += sentence[i].length();
            if (sentence[i].equals("$")) dollar = i;
        }

        len -= 1;

        for (int i = len; i < 1000; i++) {
            Number x = numbers.get(i);
            if (x.len + len == x.value) {
                sentence[dollar] = x.word;
                break;
            }
        }

        out.print(sentence[0]);
        for (int i = 1; i < n; i++)
            out.printf(" %s", sentence[i]);
        out.close();
        sc.close();
    }

    static String toWord(int n) {
        if (n / 100 > 0) {
            int hundreds = n / 100;
            int tenths = (n % 100) / 10;
            int ones = n % 10;
            if (tenths == 0 && ones == 0) {
                return onesString(hundreds) + "hundred";
            } else if (tenths == 0) {
                return onesString(hundreds) + "hundred" + onesString(ones);
            } else if (ones == 0) {
                return onesString(hundreds) + "hundred" + tenMultiples(tenths);
            } else if (tenths == 1) {
                return onesString(hundreds) + "hundred" + teens(ones);
            } else {
                return onesString(hundreds) + "hundred" + tenMultiples(tenths) + onesString(ones);
            }
        } else if (n / 10 > 0) {
            int tenths = n / 10;
            int ones = n % 10;
            if (ones == 0) {
                return tenMultiples(tenths);
            } else if (tenths == 1) {
                return teens(ones);
            } else {
                return tenMultiples(tenths) + onesString(ones);
            }
        } else {
            return onesString(n);
        }
    }

    static String teens(int n) {
        switch (n) {
            case 1: return "eleven";
            case 2: return "twelve";
            case 3: return "thirteen";
            case 4: return "fourteen";
            case 5: return "fifteen";
            case 6: return "sixteen";
            case 7: return "seventeen";
            case 8: return "eighteen";
            case 9: return "nineteen";
            default: return "";
        }
    }

    static String tenMultiples(int n) {
        switch (n) {
            case 1: return "ten";
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }

    static String onesString(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class TreasureHunt {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int r = sc.getInt(), c = sc.getInt();
        char[][] area = new char[r][c];
        for (int i = 0; i < r; i++)
            area[i] = sc.getWord().toCharArray();
        int x = 0, y = 0, moves = 0;
        while (true) {
            if (!checkValid(x, y, r, c)) {
                moves = -1;
                break;
            }
            char move = area[x][y];
            area[x][y] = 'Z';
            if (move == 'N') {
                x--;
            } else if (move == 'S') {
                x++;
            } else if (move == 'W') {
                y--;
            } else if (move == 'E') {
                y++;
            } else if (move == 'T') {
                break;
            } else if (move == 'Z') {
                moves = -2;
                break;
            }
            moves++;
        }
        System.out.println(moves == -1 ? "Out" : moves == -2 ? "Lost" : moves);
        sc.close();
    }

    static boolean checkValid(int x, int y, int r, int c) {
        return 0 <= x && x < r && 0 <= y && y < c;
    }

}

///////////////////////////////////////////////////////////////////////////////

class CarouselRides {

    public static void main(String[] args) {

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            int n = sc.getInt(), m = sc.getInt();

            if (n == 0 && m == 0) break;

            int aa = 0, bb = 0;
            while (n-- > 0) {
                int a = sc.getInt(), b = sc.getInt();
                if (a > m) continue;
                double value1 = a / (double) b, value2 = aa / (double) bb;
                if (aa == 0 // first
                    || value1 > value2 // value of new greater than old
                    || value1 == value2 && a > aa) { // more tickets
                        aa = a;
                        bb = b;
                }          
            }
            out.println(aa == 0 ? "No suitable tickets offered" : "Buy " + aa + " tickets for $" + bb);      
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class GeneticSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            String[] tmp = br.readLine().split(" ");
            if (tmp.length == 1) break;

            String s = tmp[0], l = tmp[1];
            out.printf("%d %d %d\n", findOne(s, l), findTwo(s, l), findThree(s, l));
        }
        out.close();
        br.close();
    }

    static int findOne(String s, String l) {
        return findMatch(s, l);
    }

    static int findTwo(String s, String l) {
        int count = 0;
        HashSet<String> uniques = new HashSet<>();
        int slen = s.length();
        for (int i = 0; i < slen; i++) {
            String deleted = s.substring(0, i) + s.substring(i + 1, slen);
            if (!uniques.contains(deleted)) count += findMatch(deleted, l);                
            uniques.add(deleted);
        }
        return count;
    }

    static int findThree(String s, String l) {
        int count = 0;
        HashSet<String> uniques = new HashSet<>();
        char[] agct = new char[] {'A', 'G', 'C', 'T'};
        int slen = s.length(), agctlen = agct.length;
        for (int i = 0; i < slen + 1; i++) 
            for (int j = 0; j < agctlen; j++) {
                String inserted = s.substring(0, i) + agct[j] + s.substring(i, slen);
                if (!uniques.contains(inserted)) count += findMatch(inserted, l);
                uniques.add(inserted);
            }            
        return count;
    }

    static int findMatch(String s, String l) {
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(l);
        int count = 0;
        boolean first = true;
        while (m.find(first ? 0 : m.start() + 1)) {
            count++;
            first = false;
        }            
        return count;
    }

}

///////////////////////////////////////////////////////////////////////////////

class CrackingRSA {

    public static void main(String[] args) throws java.io.IOException {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.getInt();
        while (t-- > 0) {
            long n = sc.getLong(), e = sc.getLong();
            long p = n, q = 2L;
            for (; q <= p; q++) 
                if (p % q == 0) break;
            p /= q;
            long euler = (p - 1) * (q - 1);
            // a - b = k * c
            // (d * e) - 1 = k * euler, k is constant > remove
            // (d * e - 1) % euler == 0 
            long d = 1L;
            while (((d * e) - 1) % euler != 0)
                d++;
            out.println(d); 
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class ParadoxWithAveragesHard {
    
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.getInt();
        while (t-- > 0) {
            int ncs = sc.getInt(), ne = sc.getInt(), funny = 0;
            int[] cs = new int[ncs];
            double csaverage = 0, etotal = 0, eaverage = 0;
            for (int i = 0; i < ncs; i++)
                csaverage += cs[i] = sc.getInt();
            for (int i = 0; i < ne; i++)
                etotal += sc.getInt();
            csaverage /= ncs;
            eaverage = etotal / ne;
            for (int i = 0; i < ncs; i++) {
                double csTmp = ((csaverage * ncs) - cs[i]) / (ncs - 1);
                double eaTmp = (etotal + cs[i]) / (ne + 1);
                if (csTmp > csaverage && eaTmp > eaverage) funny++;
            }
            sb.append(funny).append("\n");
        }  
        System.out.print(sb.toString());
        sc.close();
    }  
    
}

///////////////////////////////////////////////////////////////////////////////

class NeighborhoodWatch {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt(), k = sc.getInt() + 2;
        long safety = gaussFormula((long) n);
        long[] safeHouses = new long[k];
        safeHouses[0] = 0L;
        safeHouses[k - 1] = n + 1;
        for (int i = 1; i < k - 1; i++)
            safeHouses[i] = sc.getLong();
        for (int i = 0; i < k - 1; i++) 
            safety -= gaussFormula(safeHouses[i + 1] - safeHouses[i] - 1); // any trip inbetween is not safe.
        out.println(safety);
        out.close();
        sc.close();
    }

    static long gaussFormula(long n) {
        return (n * (n + 1)) / 2L;
    }

}

///////////////////////////////////////////////////////////////////////////////

class AreYouListening {

    public static void main(String[] args) {

        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public double distanceTo(Point p) {
                return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
            }

        }

        class Circle {
            Point centre;
            int radius;

            Circle(Point centre, int radius) {
                this.centre = centre;
                this.radius = radius;
            }

            boolean inRange(Circle c) {
                return this.centre.distanceTo(c.centre) < this.radius + c.radius;
            }

        }

        Kattio sc = new Kattio(System.in);
        int cx = sc.getInt(), cy = sc.getInt(), n = sc.getInt();
        Circle me = new Circle(new Point(cx, cy), -1);
        Circle[] listening = new Circle[n];
        for (int i = 0; i < n; i++)
            listening[i] = new Circle(new Point(sc.getInt(), sc.getInt()), sc.getInt());
        int listeners = 0;
        while (listeners < 3) {
            listeners = 0;
            me.radius++;
            for (Circle c : listening) 
                if (me.inRange(c)) listeners++;
        }
        System.out.println(me.radius == 0 ? 0 : me.radius - 1);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Grid {

    static int[][] grid;
    static int[][] min;
    static int r;
    static int c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        r = Integer.parseInt(tmp[0]);
        c = Integer.parseInt(tmp[1]);
        grid = new int[r][c];
        min = new int[r][c];
        for (int i = 0; i < r; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < c; j++) {
                min[i][j] = Integer.MAX_VALUE;
                grid[i][j] = arr[j] - '0';
            }                
        }
        min[0][0] = 0;
        // for (int i = 0; i < r; i++)
        //     System.out.println(Arrays.toString(min[i]));
        System.out.println(walk());
        br.close();
    }

    static int walk() {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int i = tmp[0], j = tmp[1];
            int k = grid[i][j];
            int[][] moves = new int[][] {{i, j - k}, {i, j + k}, {i - k, j}, {i + k, j}};
            for (int[] move : moves) {
                int ii = move[0], jj = move[1];
                if (inRange(ii, jj, r, c)) {
                    if (min[ii][jj] == Integer.MAX_VALUE || min[ii][jj] > 1 + min[i][j]) {
                        min[ii][jj] = 1 + min[i][j]; 
                        queue.offer(move);
                    }
                }
            }    
        }        
        return min[r - 1][c - 1] == Integer.MAX_VALUE ? -1 : min[r - 1][c - 1];
    }

    static boolean inRange(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}

///////////////////////////////////////////////////////////////////////////////
// https://www.mathsisfun.com/algebra/matrix-inverse.html
class MatrixInverse {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        while (sc.hasMoreTokens()) {
            out.printf("Case %d:\n", t++);
            int a = sc.getInt(), b = sc.getInt(), c = sc.getInt(), d = sc.getInt();
            int determinant = a *d - b * c; // scalar value
            out.printf("%d %d\n", d / determinant, -b / determinant);
            out.printf("%d %d\n", -c / determinant, a / determinant);
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class TeacherEvaluation {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), p = sc.getInt(), nn = n;;
        int total = 0;
        for (int i = 0; i < n; i++)
            total += sc.getInt();
        if (p == 100) {
            System.out.println("impossible");
        } else {
            while (total / (double) nn < p) {
                nn++;
                total += 100;
            }
            System.out.println(nn - n);
        }        
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Geppetto {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        int total = 1 << n, pizzas = 0; 
        HashSet<Integer> set = new HashSet<>();
        while (m-- > 0)
            set.add(twoPowers(sc.getInt()) + twoPowers(sc.getInt())); // disallowed combis as binary
        for (int i = 0; i < total; i++) 
            if (validPizza(set, i)) pizzas++; 
        System.out.println(pizzas);
        sc.close();
    }

    static int twoPowers(int n) {
        return (1 << n) >> 1;
    }

    static boolean validPizza(HashSet<Integer> set, int i) {
        // & operator will surface those 1s that are similar. 
        // if they result in the disallowed pizza. cancel this pizza;
        for (Integer j : set)
            if ((i & j) == j) return false; 
        return true;
    }

}

///////////////////////////////////////////////////////////////////////////////

class Pseudoprimenumbers {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while (true) {
            String p = sc.getWord(), a = sc.getWord();
            if (p.equals("0")) break;
            BigInteger pp = new BigInteger(p), aa = new BigInteger(a);
            BigInteger ap = aa.modPow(pp, pp);
            out.println(!pp.isProbablePrime(1) && ap.equals(aa) ? "yes" : "no");
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class UmmCode {

    public static void main(String[] args) throws java.io.IOException {
        String[] s = new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in))
                        .readLine()
                        .replaceAll("[^a-zA-Z0-9 ]", "")
                        .split("\\s+");
        String x = "", res = "";
        for (int i = 0; i < s.length; i++)
            if (s[i].matches("^[um]*$")) 
                for (char c : s[i].toCharArray()) {
                    x += c == 'u' ? '1' : '0';
                    if (x.length() == 7) {
                        res += (char) Integer.parseInt(x, 2);
                        x = "";
                    }
                }                    
        System.out.println(res);
    }

}

///////////////////////////////////////////////////////////////////////////////

class RationalArithmetic {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt();
        while (n-- > 0) {
            long x1 = sc.getLong(), y1 = sc.getLong();
            char op = sc.getWord().charAt(0);
            long x2 = sc.getLong(), y2 = sc.getLong();
            if (op == '+' || op == '-') {
                x1 = x1 * y2;
                x2 = x2 * y1;
                y1 *= y2;
                x1 = op == '+' ? x1 + x2 : x1 - x2;
                long i = gcd(x1, y1);
                x1 /= i;
                y1 /= i;
                if (y1 < 0) {
                    y1 *= -1;
                    x1 *= -1;
                }
            } else if (op == '*' || op == '/') {
                if (op == '/') {
                    long tmp = x2;
                    x2 = y2;
                    y2 = tmp;
                }
                x1 *= x2;
                y1 *= y2;
                long i = gcd(x1, y1);
                x1 /= i;
                y1 /= i;
                if (y1 < 0) {
                    y1 *= -1;
                    x1 *= -1;
                }
            }
            out.printf("%d / %d\n", x1, y1);
        }
        out.close();
        sc.close();
    }

    static long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

}

///////////////////////////////////////////////////////////////////////////////

class HorrorFilmNight {

    private static final int MAX_DAYS = 1_000_000;

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        boolean[] emma = new boolean[MAX_DAYS], marcos = new boolean[MAX_DAYS];
        int k = sc.getInt(), films = 0;
        while (k-- > 0) 
            emma[sc.getInt()] = true;
        k = sc.getInt();
        while (k-- > 0) 
            marcos[sc.getInt()] = true;
        boolean eLike = true, mLike = true;
        for (int i = 0; i < MAX_DAYS; i++) 
            if ((emma[i] && marcos[i]) || (eLike && marcos[i]) || (mLike && emma[i])) {
                eLike = emma[i];
                mLike = marcos[i];
                films++;
            }
        System.out.println(films);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class Dyslectionary {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        PriorityQueue<String> words = new PriorityQueue<>();        
        int maxlen = 0;
        String s = "";
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                while (!words.isEmpty()) {
                    String word = reverse(words.poll());
                    out.printf("%s\n", " ".repeat(maxlen - word.length()) + word);
                }        
                out.println();
                maxlen = 0;
            } else {
                words.add(reverse(s));
                maxlen = Math.max(s.length(), maxlen);
            }            
        }
        while (!words.isEmpty()) {
            String word = reverse(words.poll());
            out.printf("%s\n", " ".repeat(maxlen - word.length()) + word);
        }            
        out.close();
        br.close();
    }

    static String reverse(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];            
            arr[arr.length - 1 - i] = tmp;
        }            
        return new String(arr);
    }

}

///////////////////////////////////////////////////////////////////////////////

class Digits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while (!(s = br.readLine()).equals("END")) {
            int len = s.length();
            if (len < 8 && Integer.parseInt(s) == len) {
                out.println(1);
            } else {
                int count = 2;
                int curr = String.valueOf(len).length(), prev = len;
                while (curr != prev) {
                    prev = curr;
                    curr = String.valueOf(prev).length();
                    count++;
                }   
                out.println(count);
            }
        }
        out.close();
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FourThought {
    
    static class Equation {
        char[] operations;

        Equation(char[] operations) {
            this.operations = operations;
        }        

        public String toString(int ans) {
            return String.format("4 %s 4 %s 4 %s 4 = %d", this.operations[0], this.operations[1], this.operations[2], ans); 
        }

    }

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Integer, Equation> equations = new HashMap<>();
        buildEquations(equations);
        int n = sc.getInt(), x = 0;
        while (n-- > 0) 
            out.println(equations.containsKey(x = sc.getInt()) ? equations.get(x).toString(x) : "no solution");
        out.close();
        sc.close();
    }

    static void buildEquations(HashMap<Integer, Equation> equations) {
        char[] operations = new char[]{'+','-','*','/'};
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++) {
                    char[] tmp = new char[] {operations[i], operations[j], operations[k]};
                    equations.put(evaluate(tmp), new Equation(tmp));
                }                    
    }

    static <T> void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static int evaluate(char[] operations) {
        // operations. + -1, - -2, *, -3, / -4
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(operationToInt(operations[0]));
        al.add(4);
        al.add(operationToInt(operations[1]));
        al.add(4);
        al.add(operationToInt(operations[2]));
        al.add(4);
        process(al, -3);
        process(al, -4);
        process(al, -1);
        process(al, -2);
        return al.get(0);
    }

    static void process(ArrayList<Integer> al, int op) {
        while (al.contains(op)) {
            int x = al.indexOf(op);
            int f = al.get(x - 1), g = al.get(x + 1);
            int res = 0;
            if (op == -1) {
                res = f + g;
            } else if (op == -2) {
                res = f - g;
            } else if (op == -3) {
                res = f * g;
            } else if (op == -4) {
                res = f / g;
            }            
            al.set(x, res);
            al.remove(x + 1);
            al.remove(x - 1);
        }
    }

    static int operationToInt(char c) {
        return c == '+' ? -1 : c == '-' ? -2 : c == '*' ? -3 : -4;
    }

}

///////////////////////////////////////////////////////////////////////////////

class NPuzzle {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Character, int[]> hmap = new HashMap<>();
        HashSet<Character> visited = new HashSet<>();

        hmap.put('A', new int[]{0, 0});
        hmap.put('B', new int[]{0, 1});
        hmap.put('C', new int[]{0, 2});
        hmap.put('D', new int[]{0, 3});

        hmap.put('E', new int[]{1, 0});
        hmap.put('F', new int[]{1, 1});
        hmap.put('G', new int[]{1, 2});
        hmap.put('H', new int[]{1, 3});

        hmap.put('I', new int[]{2, 0});
        hmap.put('J', new int[]{2, 1});
        hmap.put('K', new int[]{2, 2});
        hmap.put('L', new int[]{2, 3});

        hmap.put('M', new int[]{3, 0});
        hmap.put('N', new int[]{3, 1});
        hmap.put('O', new int[]{3, 2});
        hmap.put('.', new int[]{3, 3});
        
        int scatter = 0;
        for (int i = 0; i < 4; i++) {
            char[] tmp = sc.getWord().toCharArray();
            for (int j = 0; j < 4; j++) {
                int[] coor = hmap.get(tmp[j]);
                if (tmp[j] != '.' && !visited.contains(tmp[j]) 
                    && !(i == coor[0] && j == coor[1])) {
                    visited.add(tmp[j]);                    
                    scatter += Math.abs(i - coor[0]) + Math.abs(j - coor[1]);
                }                    
            }
        }          
        
        out.println(scatter);
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class TheWeightOfWords {

    public static void main(String[] args) {
        int[] arr = java.util.Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int l = arr[0], w = arr[1];
        if (l * 26 < w || l > w) {
            System.out.println("impossible");
        } else {
            char[] word = new char[l];
            Arrays.fill(word, 'a');
            int i = l;
            while (i < w) {
                for (int j = 0; j < l && i < w; j++, i++)
                    word[j]++;
            }
            System.out.println(new String(word));
        }
    }

}

///////////////////////////////////////////////////////////////////////////////

class PathTracing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char[][] grid = new char[2000][2000];
        int x = 1000, y = 1000;
        int maxx = x, minx = x, maxy= y, miny = y;
        grid[x][y] = 'S';
        String s = "";
        while ((s = br.readLine()) != null) {
            char m = s.charAt(0);
            if (m == 'u') {
                x--;
            } else if (m == 'd') {
                x++;
            } else if (m == 'l') {
                y--;
            } else if (m == 'r') {
                y++;
            }
            maxx = Math.max(x, maxx);
            minx = Math.min(x, minx);
            maxy = Math.max(y, maxy);
            miny = Math.min(y, miny);
            grid[x][y] = '*';
        }
        grid[x][y] = 'E';
        grid[1000][1000] = 'S';
        for (int i = miny - 1; i <= maxy + 1; i++)
            out.print('#');
        out.println();
        for (int i = minx; i <= maxx; i++) {
            out.print('#');
            for (int j = miny; j <= maxy; j++) 
                out.print(grid[i][j] == '\u0000' ? ' ' : grid[i][j]);
            out.print('#');
            out.println();
        }
        for (int i = miny - 1; i <= maxy + 1; i++)
            out.print('#');
        out.println();
        out.close();
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class RoomPainting {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt(), m = sc.getInt();
        PriorityQueue<Integer> store = new PriorityQueue<>();
        PriorityQueue<Integer> joe = new PriorityQueue<>();
        while (n-- > 0)
        // for (int i = 0; i < n; i++)
            store.offer(sc.getInt());
        while (m-- > 0)
        // for (int i = 0; i < m; i++)
            joe.offer(sc.getInt());
        long wasted = 0, can = store.poll();
        while (!joe.isEmpty()) {
            int need = joe.poll();
            while (can < need) 
                can = store.poll();
            wasted += can - need;
        }
        System.out.println(wasted);
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class SmallestMultiple {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            BigInteger common = new BigInteger(arr[0]);
            for (int i = 1; i < arr.length; i++)
                common = lcm(common, new BigInteger(arr[i]));
            out.println(common);
        }
        out.close();
        br.close();
    }

    static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(x.gcd(y));
    }

}

///////////////////////////////////////////////////////////////////////////////

class SelectGroup {

    private static final Map<String, Set<String>> groups = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] cmd = s.split(" ");
            if (cmd[0].equals("group")) {
                Set<String> set = new TreeSet<>();
                for (int i = 3; i < cmd.length; i++)
                    set.add(cmd[i]);
                groups.put(cmd[1], set);
            } else {
                out.println(evaluate(Arrays.stream(cmd).collect(Collectors.toList()), 0).toString().replaceAll("[\\[\\],]", ""));
            }
        }
        out.close();
        br.close();
    }

    static Set<String> evaluate(List<String> cmd, int i) {
        String curr = cmd.get(i);
        if (curr.equals("union") || curr.equals("intersection") || curr.equals("difference")) {
            char c = curr.charAt(0);
            Set<String> result = null;
            if (c == 'u') {
                result = union(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            } else if (c == 'i') {
                result = intersection(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            } else {
                result = difference(evaluate(cmd, i + 1), evaluate(cmd, i + 2));
            }
            cmd.remove(i);
            cmd.remove(i);
            return result;
        } 
        return groups.get(cmd.get(i));
    }

    static Set<String> union(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.addAll(s2);
        return set;
    }

    static Set<String> intersection(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.retainAll(s2);
        return set;
    }

    static Set<String> difference(Set<String> s1, Set<String> s2) {
        Set<String> set = new TreeSet<>(s1);
        set.removeAll(s2);
        return set;
    }

}

///////////////////////////////////////////////////////////////////////////////

class FundamentalNeighbours {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s), neighbour = 1;
            HashMap<Integer, Integer> primeFactors = new HashMap<>();
            getPrimeFactors(primeFactors, n);
            for (Entry<Integer, Integer> e : primeFactors.entrySet())
                neighbour *= (int) Math.pow(e.getValue(), e.getKey());
            out.printf("%d %d\n", n, neighbour);
        }
        out.close();
        br.close();
    }

    static void getPrimeFactors(HashMap<Integer, Integer> primeFactors, int n) {
        int count = 0;
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }

        if (count > 0) primeFactors.put(2, count);
        count = 0;

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) primeFactors.put(i, count);
            count = 0;
        }
        if (n > 2) primeFactors.put(n, 1);
    }

}

///////////////////////////////////////////////////////////////////////////////

class GalacticCollegiateProgrammingContest {

    public static void main(String[] args) {

        class Team implements Comparable<Team> {
            int a, b;

            Team() {
                this.a = 0;
                this.b = 0;
            }

            void addA() {
                this.a += 1;
            }

            void addB(int b) {
                this.b += b;
            }


            @Override
            public int compareTo(Team t) {
                return this.a == t.a ? t.b - this.b : this.a - t.a;
            }

            @Override
            public String toString() {
                return a + " " + b; 
            }

        }

        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.getInt(), m = sc.getInt();
        Team[] teams = new Team[n];
        HashSet<Integer> greaterThanOne = new HashSet<>();
        for (int i = 0; i < n; i++)
            teams[i] = new Team();
        Team favourite = teams[0];
        while (m-- > 0) {
            int t = sc.getInt() - 1, p = sc.getInt();
            teams[t].addA();
            teams[t].addB(p);
            // System.out.println(Arrays.toString(teams));
            if (t == 0) {
                greaterThanOne.removeIf(i -> favourite.compareTo(teams[i]) >= 0);
            } else if (favourite.compareTo(teams[t]) < 0) {
                greaterThanOne.add(t);
            }
            // System.out.println(greaterThanOne);
            out.println(greaterThanOne.size() + 1);
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class SelfSimilarStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) 
            out.println(selfSimilarDegree(s));
        out.close();
        br.close();
    }

    static int selfSimilarDegree(String s) {
        int i = 0, strlen = s.length();
        boolean similar = true;
        for (; i < strlen && similar; i++) {
            HashSet<String> visited = new HashSet<>();
            for (int j = 0; j < strlen - i && similar; j++) {
                String substr = s.substring(j, i + j + 1);
                if (!visited.contains(substr)) {
                    if (s.indexOf(substr) == s.lastIndexOf(substr)) 
                        similar = false;
                    visited.add(substr);   
                }                
            }
        }
        return i - 1;
    }

}

///////////////////////////////////////////////////////////////////////////////

class CandyDivision {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        long n = Long.parseLong(br.readLine());
        TreeSet<Long> set = new TreeSet<>();
        for (long i = 1; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                set.add(i - 1);
                if (n / i <= n) set.add(n / i - 1);
            };
        out.println(set.toString().replace("[", "").replace("]", "").replace(",", ""));
        out.close();
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class Sim {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] input = br.readLine().toCharArray();
            ArrayDeque<Character> front = new ArrayDeque<>();
            ArrayDeque<Character> back = new ArrayDeque<>();
            boolean b = true;
            for (char c : input) {
                if (c == '<') {
                    if (b) {
                        if (!back.isEmpty())
                            back.pollLast();
                    } else if (!b) {
                        if (!front.isEmpty())
                            front.pollLast();
                    }
                } else if (c == '[' || c == ']') {
                    b = c == ']';
                    while (!front.isEmpty())
                        back.offerFirst(front.pollLast());
                } else {
                    if (b) {
                        back.offerLast(c);
                    } else {
                        front.offerLast(c);
                    }
                }
            }
            while (!front.isEmpty())
                out.print(front.pop());
            while (!back.isEmpty())
                out.print(back.pop());
            out.println();
        }
        out.close();
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class PeriodicStrings {

    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        char[] input = s.toCharArray();
        int k = 1;
        boolean found = false;
        for (; k < input.length; k++) {
            if (input.length % k != 0) continue;
            found = true;
            String toMatch = s.substring(0, k);
            for (int i = 0; i < input.length; i += k) {
                for (int j = 0; j < k && j < input.length; j++)
                    if (toMatch.charAt(j) != input[i + j]) {
                        found = false;
                        break;
                    }
                if (!found) break;
                toMatch = toMatch.charAt(k - 1) + toMatch.substring(0, k - 1);
            }
            if (found) break;
        }     
        System.out.println(k);
    }

}

///////////////////////////////////////////////////////////////////////////////

class MissingGnomes {

    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> missing = new LinkedList<>();
        int n = sc.getInt(), m = sc.getInt();
        boolean[] arr = new boolean[n + 1];
        while (m-- > 0) {
            int x = sc.getInt();
            arr[x] = true;
            input.offer(x);
        }
        for (int i = 1; i < n + 1; i++)
            if (!arr[i]) missing.offer(i);
        while (!input.isEmpty() || !missing.isEmpty()) {
            if (input.isEmpty()) {
                out.println(missing.poll());
            } else if (missing.isEmpty()) {
                out.println(input.poll());
            } else if (input.peek() < missing.peek()) {
                out.println(input.poll());
            } else {
                out.println(missing.poll());
            }
        }
        out.close();
        sc.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FireFly {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]), h = Integer.parseInt(tmp[1]);
        long[] bottomHeights = new long[h], topHeights = new long[h];
        // Order of the spikes don't matter as the fly will crash into it either way
        // Count the num of spikes for varying heights
        /**
            0  1  2  3  4  5  6  0  1  2  3  4  5  6
            ________________________________________
                                 |  |  |  |  |  |  |  
            |  |                       |  |  |  |  |  
            |  |  |  |                       |  |  |  
            |  |  |  |  |  |                       |  
            |__|__|__|__|__|__|_____________________
         */

        for (int i = 0; i < n; i++) { 
            int x = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                bottomHeights[x - 1]++;
            } else {
                topHeights[h - x]++;
            }
        }
        // Summing can be viwed as crashing into a pillar.
        // For each consecutive sum, we are taking into account
        // the levels that contains these pillars and we choose to crash into them
        // incidently, the sums also cater for the pillars which are not of height, thus
        // not crashing into them.

        // We sum it backwards as it is akin to viewing it as the
        // longest spike in front while the shortest behind

        // We can see from the image that there is a clear solution
        // for a minimum number of crashes
        long carry = 0L;
        for (int i = h - 1; i >= 0; i--) 
            bottomHeights[i] = carry += bottomHeights[i];
        carry = 0L;
        for (int i = 0; i < h; i++) 
            topHeights[i] = carry += topHeights[i];
        System.out.println(best(bottomHeights, topHeights, h));
        br.close();
    }

    static String best(long[] bottomHeights, long[] topHeights, int h) {
        TreeMap<Long, Long> hmap = new TreeMap<>();
        for (int i = 0; i < h; i++) {
            long x = bottomHeights[i] + topHeights[i]; // Following previous explanation and image
            hmap.put(x, (hmap.containsKey(x) ? hmap.get(x) : 0) + 1);            
        }
        Entry<Long, Long> e = (Entry<Long, Long>) hmap.entrySet().iterator().next();
        return e.getKey() + " " + e.getValue();
    }

}

///////////////////////////////////////////////////////////////////////////////

class GregoryTheGrasshopper {

    private static final int[][] _MOVES = new int[][] {{-1, -2}, {1, -2}, 
                                                        {-2, -1}, {2, -1},
                                                        {-2, 1}, {2, 1},
                                                        {-1, 2}, {1, 2}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = "";
        while ((s = br.readLine()) != null) {
            String[] tmp = s.split(" ");
            int r = Integer.parseInt(tmp[0]);
            int c = Integer.parseInt(tmp[1]);
            int gr = Integer.parseInt(tmp[2]) - 1;
            int gc = Integer.parseInt(tmp[3]) - 1;
            int lr = Integer.parseInt(tmp[4]) - 1;
            int lc = Integer.parseInt(tmp[5]) - 1;
            int[][] grid = new int[r][c];
            grid[gr][gc] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{gr, gc});
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];
                for (int[] move : _MOVES) {
                    int new_r = i + move[0];
                    int new_c = j + move[1];
                    if (safe(new_r, new_c, r, c) && 
                            (grid[new_r][new_c] == 0 || grid[new_r][new_c] > grid[i][j] + 1)) {
                            grid[new_r][new_c] = grid[i][j] + 1;
                            queue.offer(new int[]{new_r, new_c});
                    }
                }
            }
            out.println(grid[lr][lc] == 0 ? "impossible" : grid[lr][lc] - 1);
        }
        out.close();
        br.close();
    }

    static boolean safe(int i, int j, int r, int c) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}

///////////////////////////////////////////////////////////////////////////////
// REFERENCED http://pc.fdi.ucm.es/swerc/SWERC-sols.pdf
// java's priority queue too slow, alternative could try guava? havent tried
class DistributingBallotBoxes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cities = new int[500000];
        while (true) {
            String s = br.readLine();
            if (s.equals("-1 -1")) break;
            String[] tmp = s.split(" ");
            int n = Integer.parseInt(tmp[0]), boxes = Integer.parseInt(tmp[1]);
            int min = 0, max = 0; // min and max people assigned to one box.
            for (int i = 0; i < n; i++) {
                cities[i] = Integer.parseInt(br.readLine());
                max = Math.max(max, cities[i]);
            }  
            br.readLine();
            while (min < max) {
                int avg = (min + max) / 2; // additional people per city
                int tmpBoxes = 0;
                for (int i = 0; i < n; i++)
                    tmpBoxes += (avg + cities[i] - 1) / avg;
                if (tmpBoxes > boxes) { // if there are too many boxes, it means we need to assign more people per box
                    min = avg + 1;
                } else { // Likewise, too little boxes, we assign less people overall
                    max = avg;
                }
            }
            System.out.println(min);
        }
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class FallingApples {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] tmp = br.readLine().split(" ");
        int r = Integer.parseInt(tmp[0]), c = Integer.parseInt(tmp[1]);
        char[][] grid = new char[r][c];
        for (int i = 0; i < r; i++) 
            grid[i] = br.readLine().toCharArray();
        for (int j = 0; j < c; j++) {
            int space = -1;
            for (int i = r - 1; i >= 0; i--) {
                if (space == -1) {
                    if (grid[i][j] == '.') {
                        space = i;
                    }
                } else if (grid[i][j] == '#') {
                    space = -1;
                } else if (grid[i][j] == 'a') {
                    grid[space][j] = 'a';
                    grid[i][j] = '.';
                    space--;
                }
            }
        }
        for (char[] arr : grid)
            out.println(new String(arr));
        out.close();
        br.close();
    }

}

///////////////////////////////////////////////////////////////////////////////

class MillionaireMadness {

    private static int r, c;
    private static int[][] moves = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public static void main(String[] args) {
        
        class Step implements Comparable<Step> {
            int x, y, cmp;

            Step(int x, int y, int cmp) {
                this.x = x;
                this.y = y;
                this.cmp = cmp;
            }

            @Override
            public int compareTo(Step s) {
                return this.cmp - s.cmp;
            }
        }

        Kattio sc = new Kattio(System.in);
        r = sc.getInt();
        c = sc.getInt();
        int[][] grid = new int[r][c];
        int[][] differences = new int[r][c];
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.getInt();
                differences[i][j] = Integer.MAX_VALUE;
            }
        PriorityQueue<Step> queue = new PriorityQueue<>();
        queue.offer(new Step(0, 0, 0));
        differences[0][0] = 0;
        while (!queue.isEmpty()) {
            Step curr = queue.poll();
            if (!visited[curr.x][curr.y]) {
                visited[curr.x][curr.y] = true;
                for (int[] move : moves) {
                    int rr = curr.x + move[0];
                    int cc = curr.y + move[1];
                    if (valid(rr, cc)) {
                        int diff = grid[rr][cc] - grid[curr.x][curr.y];
                        diff = Math.max(0, diff);
                        diff = Math.max(diff, differences[curr.x][curr.y]);
                        if (diff < differences[rr][cc]) {
                            differences[rr][cc] = diff;
                            queue.offer(new Step(rr, cc, diff));
                        }
                    }
                }
            }
        }

        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.print(differences[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(differences[r - 1][c - 1]);
        sc.close();
    }

    static boolean valid(int i, int j) {
        return 0 <= i && i < r && 0 <= j && j < c;
    }

}

///////////////////////////////////////////////////////////////////////////////

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

///////////////////////////////////////////////////////////////////////////////

class PublicGood {

  static class Building {
    char type;
    ArrayList<Building> connections;

    Building() {
      this.type = '\u0000';
      this.connections = new ArrayList<>();
    }

    void connect(Building b) {
      this.connections.add(b);
    }

    boolean hasNoConnections() {
      return this.connections.size() == 0;
    }

    void searchNext() {
      searchNextHelper(this, 'h');
    }

    private void searchNextHelper(Building b, char type) {
      b.type = type;
      for (Building bb : b.connections) 
        if (bb.type == '\u0000')
          searchNextHelper(bb, type == 'h' ? 'p' : 'h');
    }

    @Override
    public String toString() {
      return this.type == 'h' ? "house" : "pub";
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = tmp[0], m = tmp[1];

    Building[] buildings = IntStream.range(0, n)
      .mapToObj(x -> new Building())
      .toArray(Building[]::new);
    while (m-- > 0) {
      tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int x = tmp[0] - 1, y = tmp[1] - 1;
      buildings[x].connect(buildings[y]);
      buildings[y].connect(buildings[x]);
    }

    for (Building b : buildings) {
      if (b.hasNoConnections()) {
        out.println("Impossible");
        out.close();
        br.close();
        return;
      } else if (b.type == '\u0000') {
        b.searchNext();
      }
    }

    IntStream.range(0, n).mapToObj(x -> buildings[x] + (x == n - 1 ? "" : " ")).forEach(out::print);

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class MinimumScalarProduct {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int t = sc.getInt();
    for (int tt = 1; tt <= t; tt++) {
      int n = sc.getInt();
      long sum = 0;
      int[] v1 = new int[n];
      int[] v2 = new int[n];
      for (int i = 0; i < n; i++)
        v1[i] = sc.getInt();
      for (int i = 0; i < n; i++)
        v2[i] = sc.getInt();
      Arrays.sort(v1);
      Arrays.sort(v2);
      for (int i = 0; i < n; i++)
        sum += (long) v1[i] * (long) v2[n - 1 - i];
      out.printf("Case #%d: %d\n", tt, sum);
    }
    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class FunctionalFun {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String s = "";
    String[] tmp = null;
    while ((s = br.readLine()) != null) {
      Set<String> domain = new HashSet<>(), codomain = new HashSet<>();
      tmp = s.split(" ");
      for (int i = 1; i < tmp.length; i++)
        domain.add(tmp[i]);
      s = br.readLine();
      tmp = s.split(" ");
      for (int i = 1; i < tmp.length; i++)
        codomain.add(tmp[i]);

      HashMap<String, String> hmap = new HashMap<>();
      boolean function = true, injective = true, surjective = true;
      int n = Integer.parseInt(br.readLine());
      while (n-- > 0) {
        s = br.readLine();
        if (!function) continue;
        tmp = s.split(" -> ");
        if (hmap.containsKey(tmp[0])) {
          function = false;
        } else {
          if (hmap.containsValue(tmp[1])) {
            injective = false;
          }
          hmap.put(tmp[0], tmp[1]);
        }
      }
      surjective = new HashSet<>(hmap.values()).size() == codomain.size();
      if (!function) {
        out.println("not a function");
      } else if (injective && surjective) {
        out.println("bijective");
      } else if (injective) {
        out.println("injective");
      } else if (surjective) {
        out.println("surjective");
      } else {
        out.println("neither injective nor surjective");
      }
    }
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class EqualSumsEasy {

  private static final PrintWriter out = new PrintWriter(System.out);
  private static final HashMap<Integer, int[]> hmap = new HashMap<>();
  private static boolean found = false;

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);   
    int t = sc.getInt();
    for (int tt = 1; tt <= t; tt++) {
      out.printf("Case #%d:\n", tt);
      int n = sc.getInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++)
        arr[i] = sc.getInt();
      for (int i = 1; i <= n && !found; i++) 
        combination(arr, n, i);
      hmap.clear();   
      if (!found) out.println("Impossible");
      found = false;
    }
    out.close();
    sc.close();
  }

  static void combination(int[] arr, int n, int r) {
    int[] data = new int[r];
    combinationHelper(arr, data, 0, n - 1, 0, r);
  }

  static void combinationHelper(int[] arr, int[] data, int start, int end, int index, int r) {
    if (found) return;
    if (index == r) {
      int sum = 0;
      int[] tmp = Arrays.copyOfRange(data, 0, r);
      for (int i : tmp)
        sum += i;
      if (hmap.containsKey(sum)) {
        out.println(printable(tmp));
        out.println(printable(hmap.get(sum)));
        found = true;
      } else {
        hmap.put(sum, tmp);
      }
      return;
    }
    for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
      data[index] = arr[i];
      combinationHelper(arr, data, i + 1, end, index + 1, r);
    }
  }

  static String printable(int[] arr) {
    return Arrays.toString(arr).replaceAll("[\\[\\],]", "");
  }

}

///////////////////////////////////////////////////////////////////////////////

class GlitchBot {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    int x = sc.getInt(), y = sc.getInt();
    int n = sc.getInt();
    char[] moves = new char[n];
    int[] tmp = null;
    for (int i = 0; i < n; i++)
      moves[i] = sc.getWord().charAt(0);
    for (int i = 0; i < n; i++) {
      char c = moves[i];
      if (c != 'F') {
        moves[i] = 'F';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Forward");
          break;
        }
      } 
      if (c != 'R') {
        moves[i] = 'R';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Right");
          break;
        }
      }
      if (c != 'L') {
        moves[i] = 'L';
        tmp = walk(moves);
        if (check(x, y, tmp[0], tmp[1])) {
          System.out.printf("%d %s\n", i + 1, "Left");
          break;
        }
      }
      moves[i] = c;
    }
    sc.close();
  }

  static boolean check(int x1, int y1, int x2, int y2) {
    return x1 == x2 && y1 == y2;
  }

  static int[] walk(char[] moves) {
    int x = 0, y = 0, face = 0;
    for (char c : moves) 
      if (c == 'F') {
        if (face == 0) {
          y++;
        } else if (face == 1) {
          x++;
        } else if (face == 2) {
          y--;
        } else if (face == 3) {
          x--;
        }
      } else {
        face += c == 'R' ? 1 : -1;
        face = face < 0 ? face + 4 : face % 4;
      }
    return new int[] {x, y};
  }

}

///////////////////////////////////////////////////////////////////////////////

class CoastLength {

  private static final int[][] MOVES = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    int[] tmpi = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int r = tmpi[0] + 2, c = tmpi[1] + 2;
    int[][] grid = new int[r][c];
    boolean[][] visited = new boolean[r][c];
    for (int i = 1; i < r - 1; i++) {
      String[] tmps = br.readLine().split("");
      for (int j = 1; j < c - 1; j++)
        grid[i][j] = Integer.parseInt(tmps[j - 1]);
    }
    System.out.println(walk(grid, visited, r, c));
    br.close();
  }

  static int walk(int[][] grid, boolean[][] visited, int r, int c) {
    int sum = 0;
    Queue<int[]> queue = new LinkedList<>(); 
    queue.offer(new int[]{0, 0});
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      if (visited[curr[0]][curr[1]]) continue;
      visited[curr[0]][curr[1]] = true;
      for (int[] moves : MOVES) {
        int i = curr[0] + moves[0];
        int j = curr[1] + moves[1];
        if (valid(i, j, r, c)) {
          if (grid[i][j] == 1) {
            sum++;
          } else if (!visited[i][j]) {
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
    return sum;
  }

  static boolean valid(int i, int j, int r, int c) {
    return 0 <= i && i < r && 0 <= j && j < c;
  }

}

///////////////////////////////////////////////////////////////////////////////

class AssociationForControlOverMinds {

  private static final int[] ingredients = new int[500_501];

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    Arrays.fill(ingredients, -1);
    int n = sc.getInt(), concot = 0;
    while (n-- > 0) {
      int m = sc.getInt();
      int ingredientsCount = m, availIngredients = 0;
      HashSet<Integer> recipe = new HashSet<>();
      while (m-- > 0) 
        recipe.add(findSet(sc.getInt()));
      Iterator i = recipe.iterator();
      while (i.hasNext()) 
        availIngredients += getSize((int) i.next());         
      if (ingredientsCount == availIngredients) {
        concot++;
        i = recipe.iterator();
        int first = (int) i.next();
        while (i.hasNext())
          unionSet(first, (int) i.next());
      }
    }
    System.out.println(concot);
    sc.close();
  }  

  static int getSize(int i) {
    return -ingredients[findSet(i)];
  }

  static int findSet(int i) {
    if (ingredients[i] < 0) return i;
    return ingredients[i] = findSet(ingredients[i]);
  }

  static void unionSet(int i, int j) {
    i = findSet(i);
    j = findSet(j);
    if (i == j) return;
    ingredients[i] += ingredients[j];
    ingredients[j] = i;
  }

}

///////////////////////////////////////////////////////////////////////////////
// Cannot use negative indices to represent rank. Find too slow iteration.
// See 5950571

class UnionFind { 

  private int[] elements;
  private int[] sizes;

  public UnionFind(int n) {
    this.elements = new int[n];
    this.sizes = new int[n];
    for (int i = 0; i < n; i++) {
      this.elements[i] = i;
      this.sizes[i] = 1;
    }
  }

  public String checkSameSet(int x, int y) {
    return isSameSet(x, y) ? "yes\n" : "no\n";
  } 

  private boolean isSameSet(int x, int y) {
    return find(x) == find(y);
  }

  private int find(int x) {
    while (elements[x] != x) {
      elements[x] = elements[elements[x]];
      x = elements[x];
    }
    return x;
  }

  public void union(int x, int y) {
    x = find(x);
    y = find(y);
    if (x == y) return;
    if (sizes[x] > sizes[y]) {
      elements[y] = x;
      sizes[x] += sizes[y];
    } else {
      elements[x] = y;
      sizes[y] += x;
    }
  }   

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String in = br.readLine();
    int spaceIndex = in.lastIndexOf(' ');
    int n = Integer.parseInt(in.substring(0, spaceIndex));
    int q = Integer.parseInt(in.substring(spaceIndex + 1, in.length()));
    UnionFind uf = new UnionFind(n);
    while (q-- > 0) {
      in = br.readLine();
      spaceIndex = in.lastIndexOf(' ');
      char op = in.charAt(0);
      int a = Integer.parseInt(in.substring(2, spaceIndex));
      int b = Integer.parseInt(in.substring(spaceIndex + 1, in.length()));
      if (op == '?') {
        bw.write(uf.checkSameSet(a, b));
      } else {
        uf.union(a, b);
      }
    }
    bw.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class FloodIt {

  private static final char[] COLORS = new char[] {'1', '2', '3', '4', '5', '6'};
  private static final int[][] MOVES = new int[][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  private char[][] grid;
  private boolean[][] connected;
  private int len;

  private int[] changes = new int[COLORS.length];
  private int changeCount;

  FloodIt(char[][] grid) {
    this.grid = grid;
    this.connected = new boolean[grid.length][grid.length];
    this.len = grid.length;
  }

  void solve() {
    connected[0][0] = true;
    connect(this.grid[0][0]);
    boolean[][] tmp = new boolean[this.len][this.len];
    while (!gameFinish()) {
      char nextColor = '0';
      int nextCount = 0;
      for (char color : COLORS) {
        copy(connected, tmp);
        int currCount = simulateConnection(tmp, color);
        if (currCount > nextCount) {
          nextCount = currCount;
          nextColor = color;
        }
      }
      connect(nextColor);
      this.changes[Character.getNumericValue(nextColor) - 1]++;
      this.changeCount++;

      // for (boolean[] arr : this.connected)
      //   System.out.println(Arrays.toString(arr));
      // System.out.println();
      // for (char[] arr: this.grid)
      //   System.out.println(Arrays.toString(arr));
      // System.out.println();

    } 
  }

  void connect(char color) {
    char prev = this.grid[0][0];
    this.grid[0][0] = color;
    boolean[][] visited = new boolean[this.len][this.len];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      for (int[] move : MOVES)  {
        int i = curr[0] + move[0];
        int j = curr[1] + move[1];
        if (valid(i, j) && !visited[i][j]) {
          visited[i][j] = true;
          if (this.connected[i][j] || color == this.grid[i][j]) {
            this.connected[i][j] = true;
            this.grid[i][j] = color;
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
  }

  boolean gameFinish() {
    for (boolean[] arr : this.connected)
      for (boolean b : arr)
        if (!b) return false;
    return true;
  }

  int simulateConnection(boolean[][] tmp, char color) {
    int count = 0;
    boolean[][] visited = new boolean[this.len][this.len];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0});
    visited[0][0] = true;
    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      for (int[] move : MOVES)  {
        int i = curr[0] + move[0];
        int j = curr[1] + move[1];
        if (valid(i, j) && !visited[i][j]) {
          visited[i][j] = true;
          if (tmp[i][j] || this.grid[i][j] == color) {
            count++;
            queue.offer(new int[]{i, j});
          }
        }
      }
    }
    return count;
  }

  boolean valid(int i, int j) {
    return 0 <= i && i < this.len && 0 <= j && j < this.len;
  }


  void copy(boolean[][] original, boolean[][] duplicate) {
    for (int i = 0; i < original.length; i++)
      System.arraycopy(original[i], 0, duplicate[i], 0, original[i].length);
  }

  String print() {
    return this.changeCount + "\n" + Arrays.toString(this.changes).replaceAll("[\\[\\],]", "") + "\n";
  }

  public static void main(String[] args) throws IOException {
    Kattio sc = new Kattio(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = sc.getInt();
    while (t-- > 0) {
      int n = sc.getInt();
      char[][] grid = new char[n][n];
      for (int i = 0; i < n; i++)
        grid[i] = sc.getWord().toCharArray();
      FloodIt fi = new FloodIt(grid);
      fi.solve();
      bw.write(fi.print());
    }
    bw.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class BasicProgrammingTwo {

  private int[] arr;
  private final int len;

  public BasicProgrammingTwo(int[] arr) {
    this.arr = arr;
    this.len = arr.length;
  }

  public String test(int t) {
    switch (t) {
      case 1:
        return one();
      case 2:
        return two();
      case 3:
        return three();
      case 4:
        return four();
      case 5:
        return five();
    }
    return "";
  }

  private String one() {
    mergeSort();
    int magicNo = 7777;
    for (int i = 0; i < this.len && arr[i] <= magicNo; i++) { 
      int search = binarySearch(this.arr, 0, this.len - 1, magicNo - arr[i]);
      if (search != -1 && arr[search] != arr[i]) return "Yes";
    }
    return "No";
  }

  private String two() {
    HashSet<Integer> set = new HashSet<>();
    for (int i : this.arr) {
      if (set.contains(i)) return "Contains duplicate";
      set.add(i);
    }
    return "Unique";
  }

  private String three() {
    HashMap<Integer, Integer> hmap = new HashMap<>();
    int query = this.len / 2;
    for (int i : this.arr) {
      hmap.put(i, (hmap.containsKey(i) ? hmap.get(i) : 0) + 1);
      if (hmap.get(i) > query) return "" + i;
    }
    return "-1";
  }

  private String four() {
    mergeSort();
    int half = this.len / 2;
    return this.len % 2 == 0 ? this.arr[half - 1] + " " + this.arr[half] : "" + this.arr[half];
  }

  private String five() {
    mergeSort();
    int lower = 100, upper = 999;
    StringBuilder sb = new StringBuilder();
    for (int i : this.arr) 
      if (i > upper) {
        break;
      } else if (i >= lower) {
        sb.append(i).append(" ");
      }
    return sb.toString();
  }

  private int binarySearch(int[] arr, int low, int high, int query) {
    if (low > high) return -1;
    int mid = low + ((high - low) / 2);
    if (arr[mid] == query) return mid;
    if (arr[mid] > query) return binarySearch(arr, low, mid - 1, query);
    return binarySearch(arr, mid + 1, high, query);
  }

  private void mergeSort() {
    mergeSortHelper(this.arr, 0, this.len - 1);
  }

  private void mergeSortHelper(int[] arr, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      mergeSortHelper(arr, low, mid);
      mergeSortHelper(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public void merge(int[] arr, int low, int mid, int high) {
    int n = high - low + 1;    
    int left = low, right = mid + 1, tmpIdx = 0;
    int[] tmp = new int[n];
    while (left <= mid && right <= high)
      tmp[tmpIdx++] = arr[left] < arr[right] ? arr[left++] : arr[right++];
    while (left <= mid)
      tmp[tmpIdx++] = arr[left++];
    while (right <= high)
      tmp[tmpIdx++] = arr[right++];
    for (int i = 0; i < n; i++)
      arr[i + low] = tmp[i];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int t = Integer.parseInt(in[1]);
    int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    BasicProgrammingTwo bp = new BasicProgrammingTwo(arr);
    out.println(bp.test(t));
    out.close();
    br.close(); 
  }

}

///////////////////////////////////////////////////////////////////////////////

class KattisQuest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    TreeMap<Integer, PriorityQueue<Integer>> tmap = new TreeMap<>();

    while (n-- > 0) {

      String[] in = br.readLine().split(" ");
      int e = Integer.parseInt(in[1]);

      if (in[0].charAt(0) == 'a') {
        int g = Integer.parseInt(in[2]);
        if (tmap.containsKey(e)) {
          tmap.get(e).offer(g);
        } else {
          PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
          queue.offer(g);
          tmap.put(e, queue);
        }
      } else {
        Entry<Integer, PriorityQueue<Integer>> entry = null;
        long accumulate = 0;
        while ((entry = tmap.floorEntry(e)) != null) {
          PriorityQueue<Integer> queue = entry.getValue();
          accumulate += (long) queue.poll();
          if (queue.isEmpty()) tmap.remove(entry.getKey());
          e -= entry.getKey();
        }
        bw.write(accumulate + "\n");
      }

    }

    bw.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class BasicProgrammingOne {

  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static final PrintWriter out = new PrintWriter(System.out);

  private final int len;
  private final int op;
  private final String input;

  public BasicProgrammingOne(int n, int t, String input) {
    this.len = n;
    this.op = t;
    this.input = input;
  }

  public String run() {

    switch (this.op) {

      case 1:
        return one();
      case 2:
        return two();
      case 3:
        return three();
      case 4:
        return four();
      case 5:
        return five();
      case 6:
        return six();
      case 7:   
        return seven();
    }

    return "ERROR";
  }

  private String one() {
    return "7";
  }

  private String two() {
    String[] tmp = this.input.split(" ");
    int x = Integer.parseInt(tmp[0]), y = Integer.parseInt(tmp[1]);
    return x > y ? "Bigger" : x < y ? "Smaller" : "Equal";
  }

  private String three() {
    String[] tmp = this.input.split(" ");
    int x = Integer.parseInt(tmp[0]), y = Integer.parseInt(tmp[1]), z = Integer.parseInt(tmp[2]);
    int[] sort = new int[] {x, y, z};
    Arrays.sort(sort);
    return String.valueOf(sort[1]);
  }

  private String four() {
    BigInteger[] arr = toBigIntegerArray();
    BigInteger sum = BigInteger.ZERO;
    for (BigInteger i : arr)
      sum = sum.add(i);
    return sum.toString();
  }

  private String five() {
    BigInteger[] arr = toBigIntegerArray();
    BigInteger sum = BigInteger.ZERO;
    for (BigInteger i : arr)
      if (i.xor(BigInteger.ONE).equals(i.add(BigInteger.ONE)))
        sum = sum.add(i);
    return sum.toString();
  }

  private String six() {
    String[] tmp = this.input.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String s : tmp)
      sb.append((char) ((Integer.parseInt(s) % 26) + 'a'));
    return sb.toString();
  }

  private String seven() {
    int[] tmp = Arrays.stream(this.input.split(" ")).mapToInt(Integer::parseInt).toArray();
    boolean[] visited = new boolean[this.len];
    int i = 0, count = 0;
    while (count < this.len) {
      if (!validRange(i)) return "Out";
      if (visited[i]) return "Cyclic";
      visited[i] = true;
      i = tmp[i];
      count++;
    }
    return "Done";
  }

  private BigInteger[] toBigIntegerArray() {
    BigInteger[] arr = new BigInteger[this.len];
    String[] tmp = this.input.split(" ");
    for (int i = 0; i < this.len; i++)
      arr[i] = new BigInteger(tmp[i]);
    return arr;
  }

  private boolean validRange(int i) {
    return 0 <= i && i < this.len;
  }

  public static void main(String[] args) throws IOException {
    int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int n = tmp[0], t = tmp[1];
    String input = br.readLine();
    BasicProgrammingOne bpo = new BasicProgrammingOne(n, t, input);
    out.println(bpo.run());
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class DigitProduct {

  public static void main(String[] args) {
    System.out.println(foo(new java.util.Scanner(System.in).nextInt()));
  }

  static int foo(int n) {
    if (n < 10) return n;
    int product = 1;
    while (n > 0) {
      product *= n % 10 == 0 ? 1 : n % 10;
      n /= 10;
    }
    return foo(product);
  }

}

///////////////////////////////////////////////////////////////////////////////

class TowerConstruction {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    int n = sc.getInt();
    if (n == 1) {
      System.out.println(1);
    } else {
      int curr = sc.getInt();
      int towers = 1;
      n--;
      for (int i = 0; i < n; i++) {
        int next = sc.getInt();
        if (next > curr) 
          towers++;
        curr = next;
      }
      System.out.println(towers);
    }
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Accounting {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    HashMap<Integer, Integer> hmap = new HashMap<>();
    sc.getInt();
    int q = sc.getInt(), def = 0;
    while (q-- > 0) {
      char op = sc.getWord().charAt(0);
      if (op == 'S') {
        int i = sc.getInt(), x = sc.getInt();
        hmap.put(i, x);
      } else if (op == 'P') {
        int i = sc.getInt();
        out.printf("%d\n", hmap.containsKey(i) ? hmap.get(i) : def);
      } else if (op == 'R') {
        int x = sc.getInt();
        def = x;
        hmap.clear();
      }
    }
    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Fountain {

  private final int[] LEFTRIGHT = new int[]{-1, 1};

  private char[][] grid;
  private final int r;
  private final int c;

  public Fountain(char[][] grid, int r, int c) {

    this.grid = grid;
    this.r = r;
    this.c = c;

  }

  public void flow() {
    boolean flowed = true;
    while (flowed) {      
      flowed = false;

      for (int i = 0; i < this.r; i++) 

        for (int j = 0; j < this.c; j++) {

          if (this.grid[i][j] == '.') {

            if (i > 0 && this.grid[i - 1][j] == 'V') {

              this.grid[i][j] = 'V';
              flowed = true;

            }

            if (i < this.r - 1) {

              if (j < this.c - 1) {

                if (this.grid[i][j + 1] == 'V' && this.grid[i + 1][j + 1] == '#') {

                  this.grid[i][j] = 'V';
                  flowed = true;

                }

              } 

              if (j > 0) {

                if (this.grid[i][j - 1] == 'V' && this.grid[i + 1][j - 1] == '#') {

                  this.grid[i][j] = 'V';
                  flowed = true;

                }

              }

            }


            if (i < this.r - 1 && j > 0 
                && this.grid[i][j - 1] == 'V' && this.grid[i + 1][j - 1] == '#') {

              this.grid[i][j] = 'V';
              flowed = true;

                }

          }

        }

    }

  }

  public void printGrid() {

    PrintWriter out = new PrintWriter(System.out);

    for (char[] arr : this.grid) {

      for (char c : arr)
        out.print(c);

      out.print("\n");

    }

    out.close();
  }

  public static void main(String[] args) {

    Kattio sc = new Kattio(System.in);
    int r = sc.getInt(), c = sc.getInt();

    char[][] grid = new char[r][c];
    for (int i = 0; i < r; i++)
      grid[i] = sc.getWord().toCharArray();

    Fountain f = new Fountain(grid, r, c);
    f.flow();
    f.printGrid();

    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class RightOfWay {

  private final char arrive;
  private final char leave;
  private final char other;

  public RightOfWay(char arrive, char leave, char other) {
    this.arrive = arrive;
    this.leave = leave;
    this.other = other;
  }

  public String run() {
    return conditionOne() || conditionTwo() ? "Yes" : "No";
  }

  private boolean conditionOne() {
    return passingStraight() && otherApproachingRight();
  }

  private boolean conditionTwo() {
    return turningLeft() && (otherApproachingRight() || otherOpposite()); 
  }

  private boolean passingStraight() {
    return (this.arrive == 'N' && this.leave == 'S') 
      || (this.arrive == 'S' && this.leave == 'N')
      || (this.arrive == 'W' && this.leave == 'E')
      || (this.arrive == 'E' && this.leave == 'W');
  }

  private boolean otherApproachingRight() {
    return (this.arrive == 'N' && this.other == 'W') 
      || (this.arrive == 'E' && this.other == 'N')
      || (this.arrive == 'S' && this.other == 'E')
      || (this.arrive == 'W' && this.other == 'S');
  }

  private boolean turningLeft() {
    return (this.arrive == 'N' && this.leave == 'E') 
      || (this.arrive == 'E' && this.leave == 'S')
      || (this.arrive == 'S' && this.leave == 'W')
      || (this.arrive == 'W' && this.leave == 'N');
  }

  private boolean otherOpposite() {
    return (this.arrive == 'N' && this.other == 'S') 
      || (this.arrive == 'S' && this.other == 'N')
      || (this.arrive == 'W' && this.other == 'E')
      || (this.arrive == 'E' && this.other == 'W');
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tmp = sc.nextLine().split(" ");
    char arrive = tmp[0].charAt(0), leave = tmp[1].charAt(0), other = tmp[2].charAt(0);
    RightOfWay row = new RightOfWay(arrive, leave, other);
    System.out.println(row.run());
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class TornToPieces { 

  public static void main(String[] args) throws IOException {

    class Node {

      private final String value;
      private final String next;

      Node(String value, String next) {
        this.value = value;
        this.next = next;
      }

    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    Map<String, Set<String>> edges = new HashMap<>();
    Map<String, String> path = new HashMap<>();

    buildGraph(edges, br);

    String[] input = br.readLine().split(" ");
    String start = input[0], end = input[1];
    boolean valid = bfs(start, end, edges, path);

    out.println(valid ? writePath(path, start, end) : "no route found"); 

    out.close();
    br.close();
  }

  static String writePath(Map<String, String> path, String start, String end) {
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();
    stack.push(end);
    String curr = end;
    while (path.containsKey(curr)) 
      stack.push(curr = path.get(curr));
    while (!stack.isEmpty())
      sb.append(stack.pop()).append(" ");
    return sb.toString().substring(1, sb.length());
  }

  static boolean bfs(String start, String end, Map<String, Set<String>> edges, Map<String, String> path) {

    class Node {
      String value, next;
      Node(String value, String next) {
        this.value = value;
        this.next = next;
      }
    }

    Queue<Node> queue = new LinkedList<>();
    Set<String> visited = new HashSet<>();

    queue.offer(new Node(start, ""));

    while (!queue.isEmpty()) {

      Node curr = queue.poll();

      if (visited.contains(curr.value)) continue;
      visited.add(curr.value);

      path.put(curr.value, curr.next);
      for (String neighbour : neighboursOf(curr.value, edges)) {

        if (visited.contains(neighbour)) continue;

        if (neighbour.equals(end)) {
          path.put(neighbour, curr.value);
          return true;
        }

        queue.add(new Node(neighbour, curr.value));

      }

    }

    return false;

  }

  static Set<String> neighboursOf(String vertex, Map<String, Set<String>> edges) {
    return edges.getOrDefault(vertex, new HashSet<>());
  }

  static void buildGraph(Map<String, Set<String>> edges, BufferedReader br) throws IOException {

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {

      String[] tmp = br.readLine().split(" ");
      edges.putIfAbsent(tmp[0], new HashSet<>());

      for (int i = 1; i < tmp.length; i++) {

        edges.putIfAbsent(tmp[i], new HashSet<>());
        edges.get(tmp[i]).add(tmp[0]);
        edges.get(tmp[0]).add(tmp[i]);

      }

    }

  }

}

///////////////////////////////////////////////////////////////////////////////

class Keywords {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    HashSet<String> set = new HashSet<>();
    int n = Integer.parseInt(br.readLine());
    while (n-- > 0)
      set.add(br.readLine().toLowerCase().replaceAll("[-]", " "));
    out.println(set.size());
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Ladice {

  private final int[] roots;
  private final int[] occupied;
  private int queries;

  public Ladice(int n, int l) {
    this.roots = new int[l];
    this.occupied = new int[l];
    Arrays.fill(this.roots, -1);
    this.queries = n;
  }

  public void run(Kattio sc, PrintWriter out) {

    while (this.queries-- > 0) {
      int a = sc.getInt() - 1, b = sc.getInt() - 1;
      union(a, b);
      out.println(findSpace(a) ? "LADICA" : "SMECE"); 
    }

  }

  private int find(int a) {
    if (this.roots[a] < 0) return a;
    return this.roots[a] = find(this.roots[a]);
  }

  private void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a == b) return;
    this.roots[a] += this.roots[b];
    this.occupied[a] += this.occupied[b];
    this.roots[b] = a;
  }

  private boolean findSpace(int a) {
    a = find(a);
    this.occupied[a]++;
    if (this.occupied[a] > -this.roots[a]) { // Throw
      this.occupied[a]--;
      return false;
    } // Kept
    return true;
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = sc.getInt(), l = sc.getInt();
    Ladice ladice = new Ladice(n, l);
    ladice.run(sc, out);
    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class CircuitMath {

  void run(BufferedReader br, PrintWriter out) throws IOException {

    br.readLine();
    HashMap<Character, Character> hmap = new HashMap<>();
    char[] truthValues = br.readLine().toCharArray();
    for (int i = 0; i < truthValues.length; i += 2)
      hmap.put((char) ('A' + (i / 2)), truthValues[i]);

    char[] query = br.readLine().toCharArray();
    Stack<Character> values = new Stack<>();
    for (char c : query) {
      if (c == ' ') continue;
      if (isOperator(c)) {
        if (c == '-') {
          values.push(values.pop() == 'F' ? 'T' : 'F');
        } else {
          char second = values.pop();
          char first = values.pop();

          if (c == '+') {

            if (first == 'F' && second == 'F') {
              values.push('F');
            } else {
              values.push('T');
            }

          } else if (c == '*') {

            if (first == 'T' && second == 'T') {
              values.push('T');
            } else {
              values.push('F');
            }

          }

        }
      } else {
        values.push(hmap.get(c));
      }
    }

    out.println(values.peek());

  }

  boolean isOperator(char c) {
    return c == '+' || c == '*' || c == '-';
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    CircuitMath cm = new CircuitMath();
    cm.run(br, out);
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Calculator {

  private List<String> postFix;

  public String evaluate(String input) {

    this.postFix = new ArrayList<>();
    infixToPostfix(input);
    return String.format("%.2f", calculatePostfix());    

  }

  private double calculatePostfix() {

    Stack<Double> stack = new Stack<>();

    for (String s : this.postFix) {

      if (isNumeric(s)) {

        stack.push(Double.parseDouble(s));

      } else {

        char op = s.charAt(0);

        if (op == 'S') {

          stack.push(-stack.pop());

        } else {

          double second = stack.pop();
          double first = stack.pop();
          double result = 0.0;

          if (op == '+') {
            result = first + second;
          } else if (op == '-') {
            result = first - second;
          } else if (op == '*') {
            result = first * second;
          } else if (op == '/') {
            result = first / second;
          }

          stack.push(result);

        }

      }

    }

    return stack.peek();

  }

  private boolean isNumeric(String s) {
    try {
      Double.parseDouble(s);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  private void infixToPostfix(String input) {

    char[] arr = input.toCharArray();
    int len = arr.length;
    char prev = '\u0000';
    Stack<Character> symbols = new Stack<>();

    for (int i = 0; i < len; i++) {

      if (arr[i] == ' ') continue;

      char c = arr[i];      

      if (c == '-' && (prev == '\u0000' || prev == '(' || isOperator(prev))) {

        symbols.push('S');

      } else if (c == '(') {

        symbols.push(c);

      } else if (c == ')') {

        while (!symbols.isEmpty() && symbols.peek() != '(') 
          this.postFix.add("" + symbols.pop());
        symbols.pop();

      } else if (isOperator(c)) {

        while (!symbols.isEmpty() && compareRank(symbols.peek(), c))
          this.postFix.add("" + symbols.pop());
        symbols.push(c);

      } else {

        StringBuilder sb = new StringBuilder();
        for (; i < arr.length; i++) {
          if (arr[i] == ' ') continue;
          if (Character.isDigit(arr[i])) {
            sb.append(arr[i]);
          } else {
            i--;
            break;
          }
        }
        this.postFix.add(sb.toString());

      }

      prev = c;

    }

    while (!symbols.isEmpty())
      this.postFix.add("" + symbols.pop());

  }

  private boolean compareRank(char first, char second) {
    return operatorRank(first) >= operatorRank(second);
  }

  private int operatorRank(char c) {
    if (c == '+' || c == '-') return 1;
    if (c == '*' || c == '/') return 2;
    if (c == 'S') return 3;
    return 0;
  }

  private boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/' || c == 'S'; 
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    Calculator calculator = new Calculator();
    String s = "";
    while ((s = br.readLine()) != null)
      out.println(calculator.evaluate(s));
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class DoctorKattis {

  class Kat implements Comparable<Kat> {

    private final int id;
    private final String name;
    private int infection;
    private boolean treated;

    public Kat(int id, String name, int infection) {
      this.id = id;
      this.name = name;
      this.infection = infection;
      this.treated = false;
    }

    public void update(int x) {
      this.infection += x;
    }

    public void treat() {
      this.treated = true;
    }

    public boolean isTreated() {
      return this.treated;
    }

    @Override
    public String toString() {
      return this.name;
    }

    @Override
    public int compareTo(Kat k) {
      return this.infection == k.infection ? this.id - k.id : k.infection - this.infection;
    }

  }

  private final static int MAX_KATS = 200_000;
  private final static String EMPTY_CLINIC = "The clinic is empty";

  private final PriorityQueue<Kat> kats;
  private final HashMap<String, Kat> link;
  private int id;

  public DoctorKattis() {
    this.kats = new PriorityQueue<>(MAX_KATS);
    this.link = new HashMap<>(MAX_KATS);
    this.id = 0;
  }

  public void add(String name, int infection) {
    Kat kat = new Kat(id++, name, infection);
    this.kats.offer(kat);
    this.link.put(name, kat);
  }

  public void update(String name, int infection) {
    this.link.get(name).update(infection);
  }

  public void treat(String name) {
    this.link.get(name).treat();
  }

  public String query() {
    Kat kat;
    while ((kat = this.kats.peek()) != null)
      if (kat.isTreated()) {
        this.kats.poll();
      } else {
        return kat.toString();
      }
    return EMPTY_CLINIC;
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    DoctorKattis dk = new DoctorKattis();
    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {

      String[] tmp = br.readLine().split(" ");
      char op = tmp[0].charAt(0);

      if (op == '0') {
        dk.add(tmp[1], Integer.parseInt(tmp[2]));
      } else if (op == '1') {
        dk.update(tmp[1], Integer.parseInt(tmp[2]));
      } else if (op == '2') {
        dk.treat(tmp[1]);
      } else if (op == '3') {
        out.println(dk.query());
      }

    }

    out.close();
    br.close();

  }

}

///////////////////////////////////////////////////////////////////////////////

class JoinStrings2 {

  static class Node {
    public final String value;
    public Node next;

    public Node(String value) {
      this.value = value;
      this.next = null;
    }
  }

  private final Node[] heads;
  private final Node[] tails;
  private int printIndex;

  public JoinStrings2(Node[] heads, Node[] tails) {
    this.heads = heads;
    this.tails = tails;
    this.printIndex = -1;
  }

  public void join(Kattio sc) {
    int operations = this.heads.length - 1;
    int a = 0, b = 0;
    while (operations-- > 0) {
      a = sc.getInt() - 1;
      b = sc.getInt() - 1;
      this.tails[a].next = this.heads[b];
      this.tails[a] = this.tails[b];
    }
    this.printIndex = a;
  }

  public void print(PrintWriter out) {
    Node curr = this.heads[this.printIndex];
    while (curr != null) {
      out.print(curr.value);
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt();
    Node[] heads = new Node[n];
    Node[] tails = new Node[n];

    for (int i = 0; i < n; i++) {
      heads[i] = new Node(sc.getWord());
      tails[i] = heads[i];
    }

    JoinStrings2 js2 = new JoinStrings2(heads, tails);
    js2.join(sc);
    js2.print(out);

    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Prinova {

  private final int[] arr;
  private final int lower, upper;

  Prinova(int[] arr, int lower, int upper) {
    this.arr = arr;
    this.lower = isEven(lower) ? lower + 1: lower;
    this.upper = isEven(upper) ? upper - 1: upper;
  } 

  public int find() {
    sort();
    int max = abs(getNearest(this.lower) - this.lower);
    int identity = this.lower;

    int tmp = abs(getNearest(this.upper) - this.upper);
    if (tmp > max) {
      max = tmp;
      identity = this.upper;
    }

    int n = this.arr.length;
    for (int i = 0; i < n - 1; i++) {
      int mid = getMid(this.arr[i], this.arr[i + 1]);
      if (isEven(mid)) mid--;
      if (inRange(mid)) {
        int diff = abs(mid - this.arr[i]);
        if (diff > max) {
          max = diff;
          identity = mid;
        }
      }
      if (mid > this.upper) break;
    }

    return identity;
  }

  private int getMid(int a, int b) {
    return (a + b) / 2;
  }

  private int getNearest(int x) {
    int min = Integer.MAX_VALUE;
    int identity = 0;
    for (int i : this.arr)
      if (abs(i - x) < min) {
        identity = i;
        min = abs(i - x);
      }
    return identity;
  }

  private boolean inRange(int x) {
    return this.lower <= x && x <= this.upper;
  }

  private int abs(int x) {
    return x <= 0 ? 0 - x : x;
  }

  private boolean isEven(int x) {
    return (x & 1) == 0;
  }

  private void sort() {
    quickSort(0, this.arr.length - 1);
  }

  private void quickSort(int low, int high) {
    if (low < high) {
      int pivot = partition(low, high);
      quickSort(low, pivot - 1);
      quickSort(pivot + 1, high);
    }
  }

  private int partition(int low, int high) {
    int lessIndex = low;
    int greaterIndex = low + 1;
    while (greaterIndex <= high) {
      if (this.arr[greaterIndex] < this.arr[low]) {
        lessIndex++;
        int tmp = arr[greaterIndex];
        arr[greaterIndex] = arr[lessIndex];
        arr[lessIndex] = tmp;
      }
      greaterIndex++;
    }
    int tmp = arr[low];
    arr[low] = arr[lessIndex];
    arr[lessIndex] = tmp;
    return lessIndex;
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = sc.getInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.getInt();
    int lower = sc.getInt();
    int upper = sc.getInt();
    Prinova p = new Prinova(arr, lower, upper);
    out.println(p.find());
    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class ShortSell {

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt(), k = sc.getInt();
    long costMax = 0, profit = 0;
    for (int i = 0; i < n; i++) {
      long cost = sc.getLong();
      cost *= 100;
      cost += k * i;
      if (cost > costMax) {
        costMax = cost;
      } 
      if (costMax - cost > profit) { // If the max cost - current cost = new profit > old profit
        // System.out.printf("%d %d %d\n", costMax, cost, profit);
        profit = costMax - cost;
      }
    }

    profit -= k; // Inclusive k
    profit = profit < 0 ? 0 : profit;

    out.println(profit);
    out.close();
    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class KnigsOfTheForest {

  static class Contestant
  {
    int year;
    int strength;
    boolean karl;

    Contestant(int year, int strength, boolean karl)
    {
      this.year = year;
      this.strength = strength;
      this.karl = karl;
    }

    @Override
    public String toString()
    {
      return "[" + this.year + ", " + this.strength + ", " + this.karl + "]";
    }
  }

  public static void main(String[] args) {
    Kattio sc = new Kattio(System.in);

    int k = sc.getInt(), n = sc.getInt();
    int y = sc.getInt(), p = sc.getInt();
    int cutoffYear = 2011 + n - 1;
    int currYear = 2011;

    Comparator<Contestant> comp1 = new Comparator<Contestant>()
    {
      @Override
      public int compare(Contestant c1, Contestant c2)
      {
        return c1.year - c2.year;
      }
    };

    Comparator<Contestant> comp2 = new Comparator<Contestant>()
    {
      @Override
      public int compare(Contestant c1, Contestant c2)
      {
        return c2.strength - c1.strength;
      }
    };


    PriorityQueue<Contestant> queue1 = new PriorityQueue<>(comp1); 
    PriorityQueue<Contestant> queue2 = new PriorityQueue<>(comp2); 

    queue1.offer(new Contestant(y, p, true));  

    int a = n + k - 2;
    while (a-- > 0)
      queue1.offer(new Contestant(sc.getInt(), sc.getInt(), false));

    while (currYear <= cutoffYear && !queue1.isEmpty())
    {
      while (!queue1.isEmpty() && queue1.peek().year == currYear)
        queue2.offer(queue1.poll());

      if (!queue2.isEmpty() && queue2.poll().karl) break;
      currYear++;
    }

    System.out.println(currYear <= cutoffYear ? currYear : "unknown");

    sc.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class TheSetStackComputer 
{

  private Stack<HashSet<Object>> stack;
  private HashMap<HashSet<Object>, Integer> map;

  public TheSetStackComputer()
  {
    this.stack = new Stack<>();
    this.map = new HashMap<>();
  }

  public void push()
  {
    this.stack.push(new HashSet<>());
  }

  public void dup()
  {
    HashSet<Object> set = this.stack.pop();
    this.stack.push(set);
    this.stack.push(set);
  }

  public void union()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>(set1);
    set.addAll(set2);
    this.stack.push(set);
  }

  public void intersect()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>(set1);
    set.retainAll(set2);
    this.stack.push(set);
  }

  public void add()
  {
    HashSet<Object> set1 = this.stack.pop();
    HashSet<Object> set2 = this.stack.pop();
    HashSet<Object> set = new HashSet<>();

    if (this.map.containsKey(set1))
    {
      set.add(this.map.get(set1));
    }
    else
    {
      set.add(this.map.size());
      this.map.put(set1, this.map.size());
    }
    set.addAll(set2);
    this.stack.push(set);
  }

  public int size()
  {
    return this.stack.peek().size();  
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    TheSetStackComputer tssc = new TheSetStackComputer();

    int t = Integer.parseInt(br.readLine());
    int n = 0;
    char c = '\u0000';
    while (t-- > 0)
    {
      n = Integer.parseInt(br.readLine());
      while (n-- > 0)
      {
        c = br.readLine().charAt(0);
        if (c == 'P') tssc.push();
        if (c == 'D') tssc.dup();
        if (c == 'U') tssc.union();
        if (c == 'I') tssc.intersect();
        if (c == 'A') tssc.add();
        out.println(tssc.size());
      }
      out.println("***");
    }

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class Baloni {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    br.readLine();
    String[] tmp = br.readLine().split(" ");
    int[] counter = new int[1_000_000 + 1];
    int min = 0, x = 0;

    // 1 - based indexing
    for (String s : tmp)
    {
      x = Integer.parseInt(s);
      if (counter[x] > 0) 
      {
        counter[x]--; 
      }
      counter[x - 1]++; 
    }

    for (int i : counter)
    {
      min += i;
    }
    out.println(min);

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class WorkingAtTheRestaurant {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String s;
    String[] tmp;
    while ((s = br.readLine()) != null)
    {
      if (s.equals("0")) break;
      char c = '\u0000';
      int n = Integer.parseInt(s);
      int m = 0;
      int p1 = 0, p2 = 0;
      while (n-- > 0)
      {
        tmp = br.readLine().split(" ");
        c = tmp[0].charAt(0);
        m = Integer.parseInt(tmp[1]);

        if (c == 'D')
        {
          out.printf("DROP 2 %d\n", m);
          p2 += m;
        }
        else if (c == 'T')
        {
          if (p1 >= m)
          {
            out.printf("TAKE 1 %d\n", m);
            p1 -= m;
          }
          else
          {
            if (p1 > 0)
            {
              out.printf("TAKE 1 %d\n", p1);
              m -= p1;
              p1 = 0;
            }
            out.printf("MOVE 2->1 %d\n", p2);
            p1 = p2;
            p1 -= m;
            p2 = 0;
            out.printf("TAKE 1 %d\n", m);
          }
        }
      }
      out.println();
    }

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class StockPrices {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    int o = Integer.parseInt(br.readLine());
    int n = 0;
    String[] tmp;
    char c;
    int quantity;
    int cost;
    int lastDeal;
    TreeMap<Integer, Integer> sell; // Lowest
    TreeMap<Integer, Integer> buy; // Highest

    while (o-- > 0)
    {
      lastDeal = -1;
      n = Integer.parseInt(br.readLine());
      sell = new TreeMap<>();
      buy = new TreeMap<>();
      while (n-- > 0)
      {
        tmp = br.readLine().split(" ");
        c = tmp[0].charAt(0);
        quantity = Integer.parseInt(tmp[1]);
        cost = Integer.parseInt(tmp[4]);
        if (c == 'b')
        {
          buy.put(cost, buy.getOrDefault(cost, 0) + quantity);
        }
        else if (c == 's')
        {
          sell.put(cost, sell.getOrDefault(cost, 0) + quantity);
        }
        while (!buy.isEmpty() && !sell.isEmpty() && buy.lastKey() >= sell.firstKey())
        {
          Map.Entry<Integer, Integer> buyPrice = buy.lastEntry();
          Map.Entry<Integer, Integer> sellPrice = sell.firstEntry();

          buy.pollLastEntry();
          sell.pollFirstEntry();

          if (buyPrice.getValue() > sellPrice.getValue())
          {
            buy.put(buyPrice.getKey(), buyPrice.getValue() - sellPrice.getValue());
          }
          else if (buyPrice.getValue() < sellPrice.getValue())
          {
            sell.put(sellPrice.getKey(), sellPrice.getValue() - buyPrice.getValue());
          }

          lastDeal = sellPrice.getKey();
        }
        out.printf("%s %s %s\n", 
            sell.isEmpty() ? "-" : sell.firstKey(),
            buy.isEmpty() ? "-" : buy.lastKey(),
            lastDeal == -1 ? "-" : lastDeal);
      }
    }

    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class GolombRulers {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    ArrayList<Integer> missing;
    String s = "";
    boolean[] found;
    boolean not;
    int[] arr;
    while ((s = br.readLine()) != null)
    {
      missing = new ArrayList<>();
      not = false;
      found = new boolean[1_000_000];
      arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(arr);
      for (int i = arr.length - 1; i >= 0; i--)
      {
        for (int j = i - 1; j >= 0; j--)
        {
          int x = arr[i] - arr[j];
          if (found[x])
          {
            not = true;
            break;
          }
          else
          {
            found[x] = true;
          }
        }
        if (not) break;
      }

      if (not)
      {
        out.println("not a ruler");
      }
      else
      {
        for (int i = 1; i < arr[arr.length - 1]; i++)
        {
          if (!found[i]) missing.add(i);
        }
        if (missing.isEmpty())
        {
          out.println("perfect");
        }
        else
        {
          out.printf("missing %s\n", missing.toString().replaceAll("[\\[\\],]", ""));
        }
      }
    }
    out.close();
    br.close();
  }

}

///////////////////////////////////////////////////////////////////////////////

class MasteringMastermind {

  public static void main(String[] args) {
    String[] tmp = new Scanner(System.in).nextLine().split(" ");
    int n = Integer.parseInt(tmp[0]);

    char[] arr1 = tmp[1].toCharArray();
    char[] arr2 = tmp[2].toCharArray();
    int[] count1 = new int[26];
    int[] count2 = new int[26];
    int r = 0, s = 0;
    for (int i = 0; i < n; i++)
    {
      if (arr1[i] == arr2[i])
      {
        r++;
      } 
      else 
      {
        count1[arr1[i] - 65]++;
        count2[arr2[i] - 65]++;
      }
    }

    for (int i = 0; i < 26; i++)
      s += Math.min(count1[i], count2[i]);

    System.out.printf("%d %d\n", r, s);
  }
}

///////////////////////////////////////////////////////////////////////////////

class NatureReserve 
{
  class Edge
  {
    private int to;
    private int weight;
    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class TreeSetComparator implements Comparator<Edge>
  {
    @Override
    public int compare(Edge e1, Edge e2)
    {
      return e1.weight - e2.weight;
    }
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>());
      }
    }

    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));
    }

    public Long prims(int[] stations)
    {
      long total = 0L;
      
      boolean[] visited = new boolean[this.adjList.size()];
      PriorityQueue<Edge> queue = new PriorityQueue<>(new TreeSetComparator());

      for (int s : stations)
      {
        visited[s] = true;
        for (Edge e : this.adjList.get(s))
        {
          queue.add(e);
        }
      }

      Edge curr;
      while (!queue.isEmpty())
      {
        // curr = queue.pollFirst();
        curr = queue.poll();
        if (!visited[curr.to])
        {
          visited[curr.to] = true;
          total += curr.weight;

          for (Edge e : this.adjList.get(curr.to))
          {
            if (!visited[e.to])
            {
              queue.add(e);
            }
          }
        }
      }

      return total;
    }
  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);

    int t = sc.getInt();
    while (t-- > 0)
    {
      int n = sc.getInt(), m = sc.getInt(), l = sc.getInt(), s = sc.getInt();
      
      Graph graph = new Graph(n);      
      int[] stations = new int[s];
      for (int i = 0; i < s; i++)
      {
        stations[i] = sc.getInt();
      }

      while (m-- > 0)
      {
        graph.addEdge(sc.getInt(), sc.getInt(), sc.getInt() + l);
      }

      System.out.println(graph.prims(stations));
    }    

    sc.close();
  }

  public static void main(String[] args) 
  {
    new NatureReserve().run();  
  }
}

///////////////////////////////////////////////////////////////////////////////

class AWalkThroughTheForest {

  class Comp implements Comparator<Edge>
  {
    @Override
    public int compare(Edge e1, Edge e2)
    {
      return e1.weight - e2.weight;
    }
  }

  class Edge
  {
    int to;
    int weight;
    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>());
      }
    }

    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));      
    }

    public void dijkstra(int[] distance, int source)
    {
      PriorityQueue<Edge> queue = new PriorityQueue<>(new Comp());
      queue.offer(new Edge(source, 0));
      distance[source] = 0;

      Edge curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        if (distance[curr.to] >= curr.weight)
        {
          for (Edge e : this.adjList.get(curr.to))
          {
            if (distance[e.to] > distance[curr.to] + e.weight)
            {
              distance[e.to] = distance[curr.to] + e.weight;
              queue.offer(new Edge(e.to, distance[e.to]));
            }
          }
        }
      }
    }

    public int countPath(int[] paths, int[] distance, int destination)
    {
      if (paths[destination] == Integer.MIN_VALUE)
      {
        int ways = 0;
        for (Edge e : this.adjList.get(destination))
        {
          if (distance[e.to] > distance[destination])
          {
            ways += countPath(paths, distance, e.to);
          }
        }
        paths[destination] = ways;
      }
      return paths[destination];
    }

  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    while (true)
    {
      int n = sc.getInt();
      if (n == 0) break;
      int m = sc.getInt();
      Graph graph = new Graph(n);

      while (m-- > 0)
      {
        graph.addEdge(sc.getInt(), sc.getInt(), sc.getInt());
      }
      
      int[] distance = new int[n + 1];
      int[] paths = new int[n + 1];
      Arrays.fill(distance, Integer.MAX_VALUE);
      Arrays.fill(paths, Integer.MIN_VALUE);
      graph.dijkstra(distance, 2);
      paths[1] = 1;
      out.println(graph.countPath(paths, distance, 2));
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) {
    new AWalkThroughTheForest().run();
  }

}

///////////////////////////////////////////////////////////////////////////////

class LostMap {

  class Edge
  {
    int to;
    int weight;

    public Edge(int to, int weight)
    {
      this.to = to;
      this.weight = weight;
    }
  }

  class Node
  {
    int vertex;
    int key;
    public Node(int vertex, int key)
    {
      this.vertex = vertex;
      this.key = key;
    }    
  }

  class Graph
  {
    private ArrayList<ArrayList<Edge>> adjList;

    public Graph(int n)
    {
      this.adjList = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; i++)
      {
        this.adjList.add(new ArrayList<>(n / 2));
      }
    }
    
    public void addEdge(int origin, int destination, int weight)
    {
      this.adjList.get(origin).add(new Edge(destination, weight));
      this.adjList.get(destination).add(new Edge(origin, weight));
    }

    public void prims(int source, int[] parents)
    {
      PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>(){
        @Override
        public int compare(Node n1, Node n2)
        {
          return n1.key - n2.key;
        }
      });

      Node[] nodes = new Node[this.adjList.size()];
      boolean[] visited = new boolean[this.adjList.size()];

      for (int i = 1; i < nodes.length; i++)
      {
        nodes[i] = new Node(i, i == source ? 0 : Integer.MAX_VALUE);
        queue.offer(nodes[i]);
      }

      visited[source] = true;

      Node curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        visited[curr.vertex] = true;
        for (Edge e : this.adjList.get(curr.vertex))
        {
          if (nodes[e.to].key > e.weight)
          {
            queue.remove(nodes[e.to]);
            nodes[e.to].key = e.weight;
            queue.offer(nodes[e.to]);
            parents[e.to] = curr.vertex;
          }
        }
      }
    }
  }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    int n = sc.getInt(), x = -1;
    Graph graph = new Graph(n);
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        x = sc.getInt();
        if (i < j)
        {
          graph.addEdge(i, j, x);
        }
      }
    }

    int[] parents = new int[n + 1];
    Arrays.fill(parents, -1);
    graph.prims(1, parents);

    for (int i = 1; i < parents.length; i++)
    {
      if (parents[i] != -1)
      {
        System.out.printf("%d %d\n", parents[i], i);
      }
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) {
    new LostMap().run();
  }

}

///////////////////////////////////////////////////////////////////////////////

class BuildDependencies 
{
  public void run()
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    try 
    {
      int n = Integer.parseInt(br.readLine());

      HashMap<String, Integer> hmap = new HashMap<>(n);
      String[] files = new String[n];
      ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
      for (int i = 0; i < n; i++)
      {
        adjList.add(new ArrayList<>());
      }
      int[] deg = new int[n];

      String in;
      String[] inarr;
      String name;
      int colonIndex;
      int nameIndex;
      int depenIndex;
      while (n-- > 0)
      {
        in = br.readLine();
        colonIndex = in.lastIndexOf(":");
        name = in.substring(0, colonIndex);

        if (!hmap.containsKey(name))
        {
          hmap.put(name, hmap.size());          
        }
        nameIndex = hmap.get(name);

        if (colonIndex < in.length() - 1)
        {
          inarr = in.substring(colonIndex + 2, in.length()).split(" ");
          for (String s : inarr)
          {
            if (!hmap.containsKey(s))
            {
              hmap.put(s, hmap.size());              
            }   
            depenIndex = hmap.get(s); 
            adjList.get(depenIndex).add(nameIndex);
            
          }
          deg[nameIndex] += inarr.length;
        }
      }
      
      in = br.readLine();
      int sourceIndex = hmap.get(in);

      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0; i < deg.length; i++)
      {
        if (i == sourceIndex) continue;
        if (deg[i] == 0)
        {
          queue.offer(i);
        }
      }

      int curr;
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        for (Integer i : adjList.get(curr))
        {
          deg[i]--;
          if (i == sourceIndex) continue;
          if (deg[i] == 0)
          {
            queue.offer(i);
          }
        }
      }

      for (Map.Entry<String, Integer> e : hmap.entrySet())
      {
        files[e.getValue()] = e.getKey();
      }

      queue.offer(sourceIndex);
      while (!queue.isEmpty())
      {
        curr = queue.poll();
        out.println(files[curr]);
        for (Integer i : adjList.get(curr))
        {
          deg[i]--;
          if (deg[i] == 0)
          {
            queue.offer(i);
          }
        }
      }

      out.close();
      br.close();
    } 
    catch (IOException e) 
    {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) 
  {
    new BuildDependencies().run();        
  }
}

///////////////////////////////////////////////////////////////////////////////

class RunningMoM 
{

  private boolean DFS(String source, HashMap<String, ArrayList<String>> adjList, HashSet<String> visited)
  {
    visited.add(source);
    for (String s : adjList.get(source))
    {
      if (visited.contains(s)) return true;
      visited.add(s);
      if (DFS(s, adjList, visited)) return true;
      visited.remove(s);
    }
    return false;
  }

  // private boolean DFS(String source, HashMap<String, ArrayList<String>> adjList)
  // {
  //   Stack<String> stack = new Stack<>();
  //   HashSet<String> visited = new HashSet<>();
  //   stack.push(source);

  //   String curr;
  //   while (!stack.isEmpty())
  //   {
  //     curr = stack.pop();
      
  //     for (String neighbour : adjList.get(curr))
  //     {        
  //       if (!visited.contains(neighbour))
  //       {          
  //         visited.add(curr);
  //         stack.push(neighbour);
  //       }
  //       else
  //       {
  //         return true;
  //       }
  //     }
  //   }
  //   return false;
  // }

  public void run()
  {
    Kattio sc = new Kattio(System.in);
    PrintWriter out = new PrintWriter(System.out);

    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    int n = sc.getInt();
    String origin, destination;
    while (n-- > 0)
    {
      origin = sc.getWord();
      destination = sc.getWord();
      
      if (!adjList.containsKey(origin)) adjList.put(origin, new ArrayList<>());
      if (!adjList.containsKey(destination)) adjList.put(destination, new ArrayList<>());

      adjList.get(origin).add(destination);
    }

    String city;
    while (sc.hasMoreTokens())
    {
      city = sc.getWord();
      out.printf("%s %s\n", city, DFS(city, adjList, new HashSet<>()) ? "safe" : "trapped");
    }

    out.close();
    sc.close();
  }

  public static void main(String[] args) 
  {
    new RunningMoM().run();
  }
}

///////////////////////////////////////////////////////////////////////////////

class ElectricalOutlets 
{
  public static void main(String[] args) 
  {
    Kattio sc = new Kattio(System.in);
    int n = sc.getInt();
    while (n-- > 0)
    {
      int k = sc.getInt();
      int sum = 1 - k;
      while (k-- > 0)
      {
        sum += sc.getInt();
      }
      System.out.println(sum);
    }
    sc.close();
  }
}

///////////////////////////////////////////////////////////////////////////////

class Greetings 
{
  public static void main(String[] args) 
  {
    System.out.println(
      java.util.Arrays.toString(
        java.util.Arrays.stream(
          new java.util.Scanner(System.in)
            .nextLine().split(""))
            .map(x -> x.equals("e") ? "e" + "e" : x).toArray())
              .replaceAll("[\\s\\[\\],]", ""));
  }
}

///////////////////////////////////////////////////////////////////////////////
// Template
class Template {
    
    public static void main(String[] args) {

    }
    
}