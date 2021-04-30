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

class Eligibility {
    
    public static void main(String[] args) throws Exception {
        Kattio sc = new Kattio(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        StringBuilder sb = new StringBuilder();
        int n = sc.getInt();
        Date first = dateFormat.parse("2009/12/31");
        Date second = dateFormat.parse("1990/12/31");
        while (n-- > 0) {
            String name = sc.getWord(), start = sc.getWord(), birth = sc.getWord();
            int courses = sc.getInt();
            Date startDate = dateFormat.parse(start);
            Date birthDate = dateFormat.parse(birth);      
            sb.append(name).append(" ");
            if (startDate.after(first) || birthDate.after(second)) {
                sb.append("eligible");
            } else if (courses > 40) {
                sb.append("ineligible");
            } else {
                sb.append("coach petitions");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }

}
