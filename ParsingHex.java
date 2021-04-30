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
