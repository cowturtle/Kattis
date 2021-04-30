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
