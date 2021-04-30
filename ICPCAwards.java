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

class ICPCAwards {
    
    public static void main(String[] args) {
        new ICPCAwards();
    }

    ICPCAwards() {
        answer();
    }

    void answer() { 
        Kattio sc = new Kattio(System.in);
        int n = sc.getInt();
        ArrayList<String> schools = new ArrayList<>();
        int x = 0;
        StringBuffer sb = new StringBuffer();
        while (n-- > 0) {
            String sch = sc.getWord(), team = sc.getWord();
            if (x < 12 && !schools.contains(sch)) {
                x++;
                sb.append(sch);
                sb.append(" ");
                sb.append(team);
                sb.append("\n");
                schools.add(sch);
            }
        }
        System.out.println(sb.toString().trim());
        // sc.close();
    }

}
