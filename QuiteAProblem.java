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
