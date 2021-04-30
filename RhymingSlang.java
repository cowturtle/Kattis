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
