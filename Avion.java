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

class Avion {
    
    public static void main(String[] args) {
        new Avion();
    }

    Avion() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 5; i++) {
            if (sc.getWord().contains("FBI")) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb.toString().trim());
        sc.close();   
    }

}
