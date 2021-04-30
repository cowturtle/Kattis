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
