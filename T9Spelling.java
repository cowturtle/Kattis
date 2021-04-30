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
