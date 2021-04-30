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

class MixedFractions {
    
    public static void main(String[] args) {
        new MixedFractions();
    }

    MixedFractions() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        int x = 0, y = 0;
        while ((x = sc.getInt()) != 0 && (y = sc.getInt()) != 0) {
            sb.append(x/y).append(" ");
            sb.append(x % y).append(" / ");
            sb.append(y).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
