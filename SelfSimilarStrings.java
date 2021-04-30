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
