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

class PeaSoupAndPancakes {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean yeh = false;
        String straunt = "";
        while (n-- > 0) {
            int k = Integer.parseInt(br.readLine());
            straunt = br.readLine();
            ArrayList<String> al = new ArrayList<>();
            while (k-- > 0)
                al.add(br.readLine());
            if (al.contains("pea soup") && al.contains("pancakes")) {
                yeh = true;
                break;
            }
        }
        System.out.println(yeh ? straunt : "Anywhere is fine I guess");
        br.close();
    }
    
}
