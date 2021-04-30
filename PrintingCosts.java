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
