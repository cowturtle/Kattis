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
