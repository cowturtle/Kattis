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
