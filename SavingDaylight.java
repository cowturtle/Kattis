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

class SavingDaylight {
    
    public static void main(String[] args) throws Exception {
        Kattio sc = new Kattio(System.in);
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        while (sc.hasMoreTokens()) {
            String month = sc.getWord(), day = sc.getWord(), year = sc.getWord();
            Calendar start = Calendar.getInstance(), end = Calendar.getInstance();;
            start.setTime(sdf.parse(sc.getWord())); 
            end.setTime(sdf.parse(sc.getWord())); 
            int hours = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
            int mins = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
            if (mins < 0) {
                hours--;
                mins += 60;
            }
            sb.append(month).append(" ");
            sb.append(day).append(" ");
            sb.append(year).append(" ");
            sb.append(hours).append(" hours ");
            sb.append(mins).append(" minutes");
            sb.append("\n");
        }       
        System.out.print(sb.toString());
        sc.close();
    }
    
}
